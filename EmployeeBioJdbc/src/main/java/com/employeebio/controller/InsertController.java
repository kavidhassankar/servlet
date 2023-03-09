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
 * Servlet implementation class InsertController
 */
@WebServlet("/InsertController")
public class InsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public InsertController() {
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
		// TODO Auto-generated method stub
	/*	
		 try {
	            Class.forName(EmployeeeDb.dbdriver);
	        } catch (ClassNotFoundException e) {
	            System.out.println("Class not found " + e);
	        }
	        try {
	            Connection conn = DriverManager.getConnection(EmployeeeDb.dburl,EmployeeeDb.dbuname,EmployeeeDb.dbpassword);
	            System.out.println("connection successful");
	              
	              // Query/statement to insert the values
	            PreparedStatement st = conn.prepareStatement("insert into studentdetails values(?, ?, ?, ?)");
	  
	            // set values into the query
	            st.setInt(1, Integer.valueOf(request.getParameter("employeeId")));
	            st.setString(2, request.getParameter("employeeName"));
	            st.setString(3, request.getParameter("employeeFather"));
	            st.setString(4, request.getParameter("emailId"));
	            st.setString(5, request.getParameter("phone"));
	            st.setString(6, request.getParameter("city"));
	      	  
	  
	            // Execute the query
	            st.executeUpdate();
	  
	            st.close();
	            conn.close();
	  
	            // Redirect the response to success page
	            response.sendRedirect("Success.jsp?msg=Insert");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	          
	/*
		try {
			Class.forName(EmployeeeDb.dbdriver);
			System.out.println("load driver");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		try {
			
			Connection con=DriverManager.getConnection(EmployeeeDb.dburl,EmployeeeDb.dbuname,EmployeeeDb.dbpassword);
		
			PreparedStatement pppp=con.prepareStatement("insert into tb_kavidhas_employee_details values(?,?,?,?,?,?)");
			
			pppp.setString(1,request.getParameter("employeeId"));
			pppp.setString(2, request.getParameter("employeeName"));
			pppp.setString(3, request.getParameter("employeeFather"));
			pppp.setString(4, request.getParameter("emailId"));
			pppp.setString(5,request.getParameter("phone"));
			pppp.setString(6, request.getParameter("city"));
			
			pppp.executeUpdate();
			con.close();
			pppp.close();
			
			} catch (SQLException e) {
				
				
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	*/	
			
			String a=request.getParameter("employeeId");
			String b=request.getParameter("employeeName");
			String c=request.getParameter("employeeFather");
			String d=request.getParameter("emailId");
			String e=request.getParameter("phone");
			String f=request.getParameter("city");
			
			EmployeeDto obj=new EmployeeDto(); 
			obj.setEmployeeId(a);
			obj.setEmployeeName(b);
			obj.setEmployeeFather(c);
			obj.setEmailId(d);
			obj.setPhone(e);
			obj.setCity(f);
			
			EmployeeeDb pp=new EmployeeeDb();
			String result=pp.save(obj);
			response.getWriter().print(result);
			
			
	}
}
