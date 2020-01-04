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

@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet {
	
	private EmployeeService service= new EmployeeServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   
		HttpSession session =req.getSession(false);
		if(session != null) {
			//Valid Session
			//Get the form data
			int empId=Integer.parseInt(req.getParameter("empId"));
			String name=req.getParameter("name");
			int age=Integer.parseInt(req.getParameter("age"));
			double salary =Double.parseDouble(req.getParameter("salary"));
			String designation =req.getParameter("designation");
			String password=req.getParameter("password");
			
			EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
			employeeInfoBean.setEmpId(empId);
			employeeInfoBean.setName(name);
			employeeInfoBean.setAge(age);
			employeeInfoBean.setSalary(salary);
			employeeInfoBean.setDesignation(designation);
			employeeInfoBean.setPassword(password);
			
			boolean isAdded = service.addEmployee(employeeInfoBean);
			PrintWriter out =resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			if(isAdded) {
				out.println("<h3 style= 'color: green'>Employee Add Successfully.....</h3>");
			}else {
				out.println("<h1 style= 'color: purple'>Unable to Add Employee .....</h1>");	
			}
			out.println("</body>");
			out.println("<html>");
			
			req.getRequestDispatcher("./addEmpJsp.htm").include(req, resp);
			
		}else {
			//Invalid Session
			PrintWriter out=resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h3 style ='color:red'> Please Login First!</h3>");
			out.println("</body>");
			out.println("</html>");
			req.getRequestDispatcher("./addEmpJsp.html").include(req, resp);

		}
		
	
	}

}
