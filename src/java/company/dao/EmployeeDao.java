package company.dao;

import java.util.List;

import company.beans.Employee;

public interface EmployeeDao {
	Employee loginCompany(String login, String password);
	Employee retrieveEmployeeFromID(long ID) throws DAOException;
	Employee retrieveEmployeeFromMail(String mail) throws DAOException;
	List<Employee> listEmployees() throws DAOException;
}
