package com.capgimini.firstwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployeeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Get the Query String
		String idVal = req.getParameter("id");
		

		//Get The context param
		ServletContext context =getServletContext();
		String contextParamVal = context.getInitParameter("myContextParam");
		
		//Get Config Param
		ServletConfig config =getServletConfig();
		String configParamVal = config.getInitParameter("myConfingParam");
		
		
		resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();

		out.println("<html>");
		out.println("<body>");
		out.println("Employee Id = " +idVal);
		out.println("<br>Name = Susmita");
		out.println("<br>Salary = 8956475 ");
		
		//display context-param value & Config Param value
		out.println("<br><br> Context Param Value = " + contextParamVal);
		out.println("<br><br> Config Param Value = " + configParamVal);
		out.print("</html>");
		out.println("</body>");
		out.println("</html>");

	}//End of doGet
}//End of class
