package com.employeebio.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.employee.db.EmployeeeDb;
import com.employeedto.EmployeeDto;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateController
 */
@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UpdateController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String a=request.getParameter("employee_id");
		String b=request.getParameter("Employee_Name");
		String c=request.getParameter("Employee_fathername");
		String d=request.getParameter("EmailId");
		String e=request.getParameter("City");
		String f=request.getParameter("Phone");
		
		EmployeeDto obj=new EmployeeDto(); 
		
		obj.setEmployee_id(a);
		obj.setEmployee_Name(b);
		obj.setEmployee_fathername(c);
		obj.setEmailId(d);
		obj.setCity(e);
		obj.setPhone(f);
		EmployeeeDb pp=new EmployeeeDb();
		String result=pp.update(obj);
		response.getWriter().print(result);
					
	
			
			
	}

}
