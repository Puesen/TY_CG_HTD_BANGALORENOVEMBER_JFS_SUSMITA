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

@WebServlet("/updateEmployee2")
public class UpdateEmployeeServlet extends HttpServlet {

	private EmployeeService service= new EmployeeServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session =req.getSession(false);
		if(session != null) {
			//Valid Session
			//Get the form data

			int empId=Integer.parseInt(req.getParameter("empId"));
			String name=req.getParameter("name");
			String age=req.getParameter("age");
			String salary =req.getParameter("salary");
			String designation =req.getParameter("designation");
			String password=req.getParameter("password");

			EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
			employeeInfoBean.setEmpId(empId);
			employeeInfoBean.setName(name);
			if(age !=null && age.isEmpty()) {
				int age1 =Integer.parseInt(age);
				employeeInfoBean.setAge(age1);
			}
			if(salary !=null && salary.isEmpty()) {
				int salary1 =Integer.parseInt(salary);
				employeeInfoBean.setAge(salary1);
			}
			employeeInfoBean.setDesignation(designation);
			employeeInfoBean.setPassword(password);

			boolean isUpdate = service.addEmployee(employeeInfoBean);

			if(isUpdate) {
				req.setAttribute("msg", "Employee Record Updated Successfully");
			}else {
				req.setAttribute("msg", "Unable to Update Employee Employee Details.....!!!");
			}
			req.getRequestDispatcher("./updateEmpJsp").forward(req, resp);//url name or file name


		}
		else {
			//Invalid Session
			req.setAttribute("msg", "Please Login First");
			req.getRequestDispatcher("./loginForm").forward(req, resp);
		}

	}

}
