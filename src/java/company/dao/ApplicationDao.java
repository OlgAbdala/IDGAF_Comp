package company.dao;

import java.util.List;

import company.beans.Application;

public interface ApplicationDao {
	void createApplication(Application app) throws DAOException;
	Application retrieveApplication(int ID) throws DAOException;
	List<Application> listAllApplications() throws DAOException;
	List<Application> listApplicationsFromStudentMail(String email) throws DAOException;
}
