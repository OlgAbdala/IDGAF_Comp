package company.dao;

import static company.dao.DAOUtility.initializePreparedStatement;
import static company.dao.DAOUtility.silentClosings;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import company.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private DAOFactory daoFactory;
	
	private String SQL_SELECT_EMPLOYEE_FROM_ID="SELECT * FROM Employees WHERE ID=?";
	private String SQL_SELECT_EMPLOYEE_FROM_MAIL="SELECT * FROM Employees WHERE mail=?";
	private String SQL_SELECT_ALL="SELECT * FROM Employees";
	private String SQL_SELECT_EMPLOYEE_FROM_CREDENTIALS="SELECT * FROM Employees WHERE login=? AND password=?";
	
	public EmployeeDaoImpl(DAOFactory dao){
		this.daoFactory=dao;
	}
	
	@Override
	public Employee retrieveEmployeeFromID(long ID) throws DAOException {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		Employee employee=null;
		
		try{
			connection=this.daoFactory.getConnection();
			preparedStatement=initializePreparedStatement(connection, SQL_SELECT_EMPLOYEE_FROM_ID, false, ID);
			resultSet=preparedStatement.executeQuery();
			if(resultSet.next()){
				employee=map(resultSet);
			}
		}catch(SQLException e){
			throw new DAOException(e);
		}finally{
			silentClosings(resultSet, preparedStatement, connection);
		}
		return employee;
		
	}
	@Override
	public Employee retrieveEmployeeFromMail(String mail) throws DAOException {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		Employee employee=null;
		
		try{
			connection=this.daoFactory.getConnection();
			preparedStatement=initializePreparedStatement(connection, SQL_SELECT_EMPLOYEE_FROM_MAIL, false, mail);
			resultSet=preparedStatement.executeQuery();
			if(resultSet.next()){
				employee=map(resultSet);
			}
		}catch(SQLException e){
			throw new DAOException(e);
		}finally{
			silentClosings(resultSet, preparedStatement, connection);
		}
		return employee;
	}
	@Override
	public List<Employee> listEmployees() throws DAOException {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		List<Employee> employeesList=new ArrayList<Employee>();
		
		try{
			connection=this.daoFactory.getConnection();
			preparedStatement=connection.prepareStatement(SQL_SELECT_ALL);
			resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				employeesList.add(map(resultSet));
			}
		}catch(SQLException e){
			throw new DAOException(e);
		}finally{
			silentClosings(resultSet, preparedStatement, connection);
		}
		return employeesList;
	}
	
@Override
	public Employee loginCompany(String login, String password) {
	Employee employee=null;
	Connection connection=null;
	PreparedStatement preparedStatement=null;
	ResultSet resultSet=null;
	try{
		connection=this.daoFactory.getConnection();
		preparedStatement=initializePreparedStatement(connection, SQL_SELECT_EMPLOYEE_FROM_CREDENTIALS, false, login,password);
		resultSet=preparedStatement.executeQuery();
		if(resultSet.next()){
			employee=map(resultSet);
		}
	}catch(SQLException e){
		throw new DAOException(e);
	}finally{
		silentClosings(resultSet, preparedStatement, connection);
	}
return employee;
	}
	
	private static Employee map(ResultSet resultSet) throws SQLException{
		Employee employee=new Employee();
		employee.setID(resultSet.getLong("ID"));
		employee.setLogin(resultSet.getString("login"));
		employee.setMail(resultSet.getString("mail"));
		employee.setName(resultSet.getString("name"));
		employee.setPassword(resultSet.getString("password"));
		employee.setSurname(resultSet.getString("surname"));
		employee.setTel(resultSet.getString("tel"));
		return employee;
	}
}
