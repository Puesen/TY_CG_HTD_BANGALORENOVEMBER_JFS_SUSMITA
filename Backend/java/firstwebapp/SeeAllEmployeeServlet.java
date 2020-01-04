package com.caggimini.firstwebapp.servletsforjsp;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgimini.firstwebapp.beans.EmployeeInfoBean;
import com.capgimini.firstwebapp.service.EmployeeService;
import com.capgimini.firstwebapp.service.EmployeeServiceImpl;

@WebServlet("/seeAllEmployees")
public class SeeAllEmployeeServlet extends HttpServlet {

	private EmployeeService service= new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!= null) {
			//valid Session
			List<EmployeeInfoBean> employeeList=service.getAllEmployees();
			if(employeeList != null && !employeeList.isEmpty()) {
				req.setAttribute("employeeList", employeeList);
					}else {
				req.setAttribute("msg", "There is no employee record to display");
			}
			req.getRequestDispatcher("./seeAllEmployeesJsp.jsp").forward(req, resp);
			
		}else {
			//Invalid session
			req.setAttribute("msg", "Please Login First!");
			req.getRequestDispatcher("./loginForm").forward(req, resp);
		}//End of validation
	
	}//End of doGet
}//End of Class
