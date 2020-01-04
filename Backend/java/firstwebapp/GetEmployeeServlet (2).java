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

@WebServlet("/getEmployee2")
public class GetEmployeeServlet extends HttpServlet {
	private EmployeeService service= new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession session =req.getSession(false);
	if(session != null) {
		//valid session
		int empId=Integer.parseInt(req.getParameter("empId"));
		EmployeeInfoBean employeeInfoBean= service.searchEmployee(empId);
		
		req.setAttribute("employeeInfoBean", employeeInfoBean);
		req.getRequestDispatcher("./SearchEmpForm.jsp").forward(req, resp);
		
	}else {
		//Invalid session
		req.setAttribute("msg", "please Login First!");
		req.getRequestDispatcher("./loginForm").forward(req, resp);
	}
	}
}
