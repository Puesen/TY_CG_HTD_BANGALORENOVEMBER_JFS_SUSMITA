package com.capgimini.firstwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgimini.firstwebapp.beans.EmployeeInfoBean;
import com.capgimini.firstwebapp.service.EmployeeService;
import com.capgimini.firstwebapp.service.EmployeeServiceImpl;

@WebServlet("/searchEmployee2")
public class SearchEmployeeServlet2 extends HttpServlet {
	
	private EmployeeService service= new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession session=req.getSession(false);
	
	resp.setContentType("test/html");
	PrintWriter out =resp.getWriter();
	out.println("<html>");
	out.println("<body>");
	
	if(session!=null) {
		//valid session
	String empIdVal=req.getParameter("empId");
	int empId=Integer.parseInt(empIdVal);
	
	EmployeeInfoBean employeeInfoBean= service.searchEmployee(empId);
	if(employeeInfoBean != null)
	{
		out.println("<h3>Employee Id " + empId + "Found  </h3>");
		out.println("Name = "+  employeeInfoBean.getName());
		out.println("<br> Age = " + employeeInfoBean.getAge());
		out.println("<br> Salary = " +employeeInfoBean.getSalary());
		out.println("<br> Designation = " +employeeInfoBean.getDesignation());
	}else {
		out.println("<h3 style = 'color : red'> Employee ID " + empId + "Not Found!</h3>");
		
	}
	
	}else {
		//Invalid session
		out.println("<br><h2>Please Login First</h2>");
		req.getRequestDispatcher("./LoginPage.html").include(req, resp);
	}

	out.println("</body>");
	out.println("</html>");
	}//end of doGet

}
