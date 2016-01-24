package company.testServlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import company.beans.Employee;
import company.dao.DAOFactory;
import company.dao.EmployeeDao;

public class TestEmployees extends HttpServlet{
	
	public static final String CONF_DAO="daofactory";
	private EmployeeDao employeeDao;
	
	public void init() throws ServletException {
        this.employeeDao=((DAOFactory)getServletContext().getAttribute(CONF_DAO)).getEmployeeDao();    
    }
	
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		//Test login(String login, String password)
		String login="employee";
		String password="employee";
		Employee employeeLogin=this.employeeDao.loginCompany(login, password);
		request.setAttribute("employeeLogin", employeeLogin);
		
		//Test retrieveEmployeeFromMail(String mail)
		String mail="employeeMail";
		Employee employeeFromMail=this.employeeDao.retrieveEmployeeFromMail(mail);
		request.setAttribute("employeeFromMail", employeeFromMail);
		
		//Test listEmployees()
		ArrayList<Employee> employeesList=(ArrayList<Employee>) this.employeeDao.listEmployees();
		request.setAttribute("employeesList", employeesList);
		
		//Affichage du jsp de test
		this.getServletContext().getRequestDispatcher( "/WEB-INF/TestEmployees.jsp" ).forward( request, response );
	}
	
}
