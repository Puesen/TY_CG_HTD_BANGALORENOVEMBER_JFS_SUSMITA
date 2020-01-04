package com.capgimini.firstwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//current system date and time
	Date date=new Date();
	
	//Get The context param
	//ServletContext context =getServletContext();
	ServletContext context=req.getServletContext();
	String contextParamVal = context.getInitParameter("myContextParam");
	
	//Get Config Param
	ServletConfig config =getServletConfig();
	String configParamVal = config.getInitParameter("myConfingParam");
	
	
	resp.setContentType("text/html");
	resp.setHeader("refresh", "10");
	PrintWriter out =resp.getWriter();
	out.print("<html>");
	out.print("<h2> Current System Date and Time- - " +date + "</h2> ");
	
	//display context-param value & Config Param value
	out.println("<br><br> Context Param Value = " + contextParamVal);
	out.println("<br><br> Config Param Value = " + configParamVal);
	out.print("</html>");
	
}// end of doGet()
	
}//end of Class
//step-1:Create a war file(Build)
//step-2:Put it into the server(Deploy)