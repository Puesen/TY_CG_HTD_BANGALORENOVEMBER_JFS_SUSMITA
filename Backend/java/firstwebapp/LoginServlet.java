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

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	private EmployeeService service= new EmployeeServiceImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Get the form data
		String empIdVal= req.getParameter("empId");
		String password= req.getParameter("empPass");

		int empId=Integer.parseInt(empIdVal);

		EmployeeInfoBean employeeInfoBean =service.authenticate(empId, password);

		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");

		if(employeeInfoBean!=null) {
			//Valid Credentials
			HttpSession session= req.getSession(true);
			session.setAttribute("employeeInfoBean", employeeInfoBean);
			out.println("<h2> Welcome " +employeeInfoBean.getName()+ "! </h2>");
			out.println("<br><a href = './addEmployeeForm.html'> Add Employee </a>");
			out.println("<br><a href = '#'> Update Employee </a>");
			out.println("<br><a href = './searchEmpForm.html'> Search Employee </a>");
			out.println("<br><a href = './DeleteForm.html'> Delete Employee </a>");
			out.println("<br><a href = '#'> See All Employee </a>");
			out.println("<br><a href = './logout'> Logout </a>");



		}else {
			//Invalid Credentials
			out.println("<h3 style = 'color: red'> Invalid Credentials</h3> ");
			req.getRequestDispatcher("./LoginPage.html").include(req, resp);

		}

		out.println("</body>");
		out.println("</html>");

	}

}
