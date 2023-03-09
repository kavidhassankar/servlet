package com.employeebio.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.employee.db.EmployeeeDb;
import com.employeedto.EmployeeDto;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteController
 */
@WebServlet("/DeleteController")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String PreparedStatement = null;

    /**
     * Default constructor. 
     */
    public DeleteController() {
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
		
		String a=request.getParameter("Employee_Name");
		String b=request.getParameter("Employee_fathername");
		String c=request.getParameter("EmailId");
		String d=request.getParameter("City");
		String e=request.getParameter("Phone");
		
		EmployeeDto obj=new EmployeeDto();
		obj.setEmployee_Name(a);
		obj.setEmployee_fathername(b);
		obj.setEmailId(c);
		obj.setCity(d);
		obj.setPhone(e);
		EmployeeeDb rr=new EmployeeeDb();
		String result=rr.delete();
	
	
		
		
		
		
		
	}
		
						
}
