package company.testServlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import company.beans.Internship;
import company.dao.DAOFactory;
import company.dao.InternshipDao;

public class TestInternships extends HttpServlet{
	
	public static final String CONF_DAO="daofactory";
	private InternshipDao internshipDao;
	
	public void init() throws ServletException {
        this.internshipDao=((DAOFactory)getServletContext().getAttribute(CONF_DAO)).getInternshipDao();    
    }
	
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		//Test retrieveAllInternships()
		ArrayList<Internship> allInternships=(ArrayList<Internship>) this.internshipDao.retrieveAllInterships();
		request.setAttribute("allInternships", allInternships);
		
		//Test retrieveInternship(long ID)
		long testID=1;
		Internship internshipFromID=this.internshipDao.retrieveInternship(testID);
		request.setAttribute("internshipFromID", internshipFromID);
		
		//Affichage du jsp de test
		this.getServletContext().getRequestDispatcher( "/WEB-INF/TestInternships.jsp" ).forward( request, response );
	}
	
}
