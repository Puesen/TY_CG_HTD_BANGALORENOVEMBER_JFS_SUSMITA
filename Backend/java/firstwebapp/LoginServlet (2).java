package com.caggimini.firstwebapp.servletsforjsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgimini.firstwebapp.beans.EmployeeInfoBean;
import com.capgimini.firstwebapp.service.EmployeeService;
import com.capgimini.firstwebapp.service.EmployeeServiceImpl;
@WebServlet("/login2")
public class LoginServlet extends HttpServlet {
	private EmployeeService service= new EmployeeServiceImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//get the form data
		int empId=Integer.parseInt(req.getParameter("empId"));
		String password= req.getParameter("password");
		EmployeeInfoBean employeeInfoBean= service.authenticate(empId,password);
		
		if(employeeInfoBean !=null) {
			//valid Credentials
			
			HttpSession session =req.getSession(true);
			session.setAttribute("employeeInfoBean", employeeInfoBean);
			session.setMaxInactiveInterval(100);

			req.getRequestDispatcher("./loginFormJsp.jsp").forward(req, resp);
		

		}else {
			//Invalid Credentials
			req.setAttribute("msg", "Invalid Credentials!");
			req.getRequestDispatcher("./loginForm").forward(req, resp);
			
		}
		
	}

}//end of class
