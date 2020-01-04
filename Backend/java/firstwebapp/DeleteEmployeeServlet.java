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
@WebServlet("/deleteEmployee1")
public class DeleteEmployeeServlet extends HttpServlet {
	private EmployeeService service= new EmployeeServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		HttpSession session =req.getSession(false);
		if(session != null) {
			//Valid Session
			int empId =Integer.parseInt(req.getParameter("empId"));
			boolean isDeleted =service.deleteEmployee(empId);
			if(isDeleted) {
				req.setAttribute("msg"," Record of employee" + empId +"Deleted!");
				
			}else {
				req.setAttribute("msg"," Employee Id" + empId +"not found");
				}
			
			req.getRequestDispatcher("./deleteEmpJsp.jsp").forward(req, resp);
			
		}else {
			//Invalid Session
			req.setAttribute("msg","Please Login First");
			req.getRequestDispatcher("./loginForm").forward(req, resp);
		}
		
		
	}

}//end of class
