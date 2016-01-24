package company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static company.dao.DAOUtility.initializePreparedStatement;
import static company.dao.DAOUtility.silentClosings;

import org.joda.time.DateTime;

import company.beans.Internship;

public class InternshipDaoImpl implements InternshipDao {
	private DAOFactory daoFactory;
	private String SQL_SELECT_ALL_INTERNSHIPS="SELECT * FROM Internships";
	private String SQL_SELECT_INTERNSHIPS_FROM_DATE="SELECT * FROM Internships WHERE startDate > ? AND endDate < ?";
	private String SQL_SELECT_INTERNSHIP_FROM_ID="SELECT * FROM Internships WHERE ID=?";
	
	public InternshipDaoImpl(DAOFactory dao){
		this.daoFactory=dao;
	}
	
	@Override
	public List<Internship> retrieveAllInterships() throws DAOException{
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		List<Internship> internshipsList=new ArrayList<Internship>();
		try{
			connection=this.daoFactory.getConnection();
			preparedStatement=connection.prepareStatement(SQL_SELECT_ALL_INTERNSHIPS);
			resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				internshipsList.add(map(resultSet));
			}
		}catch(SQLException e){
			throw new DAOException(e);
		}finally{
			silentClosings(resultSet, preparedStatement, connection);
		}
		return internshipsList;
	}
	@Override
	public List<Internship> retrieveInternshipFromDateToDate(DateTime start,DateTime end){
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		List<Internship> internshipsList=new ArrayList<Internship>();
		try{
			connection=this.daoFactory.getConnection();
			preparedStatement=initializePreparedStatement(connection, SQL_SELECT_INTERNSHIPS_FROM_DATE, false, start,end);
			resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				internshipsList.add(map(resultSet));
			}
		}catch(SQLException e){
			throw new DAOException(e);
		}finally{
			silentClosings(resultSet, preparedStatement, connection);
		}
		return internshipsList;
	}
	@Override
	public Internship retrieveInternship(long ID) throws DAOException{
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		Internship internship=null;
		
		try{
			connection=this.daoFactory.getConnection();
			preparedStatement=initializePreparedStatement(connection, SQL_SELECT_INTERNSHIP_FROM_ID, false, ID);
			resultSet=preparedStatement.executeQuery();
			if(resultSet.next()){
				internship=map(resultSet);
			}
		}catch(SQLException e){
			throw new DAOException(e);
		}finally{
			silentClosings(resultSet, preparedStatement, connection);
		}
		return internship;
	}
	
	private static Internship map(ResultSet resultSet) throws SQLException{
		Internship internship=new Internship();
		internship.setID(resultSet.getLong("ID"));
		internship.setShortDescription(resultSet.getString("shortDescription"));
		internship.setCompleteDescription("completeDescription");
		internship.setStartDate(new DateTime(resultSet.getDate("startDate")));
		internship.setEndDate(new DateTime(resultSet.getDate("endDate")));
		internship.setResponsibleMail(resultSet.getString("responsibleMail"));
		return internship;
	}
}
