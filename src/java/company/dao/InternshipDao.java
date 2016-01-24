package company.dao;

import java.util.List;

import org.joda.time.DateTime;

import company.beans.Internship;


public interface InternshipDao {
	List<Internship> retrieveAllInterships() throws DAOException;
	List<Internship> retrieveInternshipFromDateToDate(DateTime start,DateTime end) throws DAOException;
	Internship retrieveInternship(long ID) throws DAOException;
}
