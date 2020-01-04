package com.capgimini.firstwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgimini.firstwebapp.service.EmployeeService;
import com.capgimini.firstwebapp.service.EmployeeServiceImpl;

@WebServlet("/deleteEmployee")
public class DeleteEmpServlet extends HttpServlet {

	private EmployeeService service=new EmployeeServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session =req.getSession(false);
		if(session != null) {
			//valid Session
			int empId=Integer.parseInt(req.getParameter("empId"));

			PrintWriter out=resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			if(service.deleteEmployee(empId)) {
				out.println("<h3 style= 'color: red'> Employee Record for"+ empId + "Deleted");
			}
			else {
				out.println("<h3 style= 'color: red'> Employee Id"+ empId + "Not Found");
			}
			out.println("</body>");
			out.println("</html>");

			req.getRequestDispatcher("./DeleteForm.html").include(req, resp);

		}
		else {
			//Invalid Session
			PrintWriter out=resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h3 style ='color:red'> Please Login First!</h3>");
			out.println("</body>");
			out.println("</html>");
			req.getRequestDispatcher("./DeleteForm.html").include(req, resp);

			
		}
	}//End of doGet
}//End of Class
