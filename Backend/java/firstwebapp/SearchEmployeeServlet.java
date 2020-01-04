package com.capgimini.firstwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgimini.firstwebapp.beans.EmployeeInfoBean;
import com.capgimini.firstwebapp.service.EmployeeService;
import com.capgimini.firstwebapp.service.EmployeeServiceImpl;

@WebServlet("/searchEmployee3")
public class SearchEmployeeServlet extends HttpServlet {
	
	private EmployeeService employeeService= new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//Get the form data+
		String empIdVal = req.getParameter("empId");
		int empId =Integer.parseInt(empIdVal);
		EmployeeInfoBean employeeInfoBean = employeeService.searchEmployee(empId);
		
		resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();
		out.println("<html>");
		out.println("<body>");

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
		System.out.println("</body>");
	}

}//End of class

