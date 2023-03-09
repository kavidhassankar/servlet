package com.employee.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.employeedto.EmployeeDto;


public class EmployeeeDb {
	/*
	public static String dburl = "jdbc:mysql://101.53.155.156:3306/mysql_demo_tnj";

	public static  String dbuname = "mysql_demo_tnj";

	public  static String dbpassword = "Ebrain@20";

	public static String dbdriver = "com.mysql.jdbc.Driver";
	
	
	private static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		System.out.println("get connection");
		
		Class.forName("com.mysql.jdbc.Driver");
		
	Connection conn=DriverManager.getConnection("jdbc:mysql://101.53.155.156:3306/mysql_demo_tnj", "mysql_demo_tnj", "Ebrain@20");
		 
	System.out.println("connetion successfully");
		
		return conn;
		
	}

	public String save(EmployeeDto obj) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection conn=getConnection();
		String insert="";
		String result="insert successfully";
		
		PreparedStatement pppp=conn.prepareStatement("insert into tb_kavidhas_employee_details values(?,?,?,?,?,?)");

		pppp.setString(1,obj.getEmailId());
		pppp.setString(2, obj.getEmployeeName());
		pppp.setString(3, obj.getEmployeeFather());
		pppp.setString(4, obj.getEmailId());
		pppp.setString(5, obj.getPhone());
		pppp.setString(6,obj.getCity());
		pppp.executeUpdate();
		conn.close();
		pppp.close();
		
		return result;
	
	
	}
	
	}*/

	
	public static String dburl = "jdbc:mysql://101.53.155.156:3306/mysql_demo_tnj";

	public static  String dbuname = "mysql_demo_tnj";
	
	public  static String dbpassword = "Ebrain@20";
	
	public static String dbdriver = "com.mysql.jdbc.Driver";
	
	
	public void loadDriver(String dbdriver ) {
		
		try {
			Class.forName("dbdriver");
			
			System.out.println("load driver");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public Connection getConnection() {
			Connection con=null;
			
			try {
				
			con=DriverManager.getConnection(dburl, dbuname,dbpassword);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return con;
		}

	public String save(EmployeeDto obj) {
		// TODO Auto-generated method stub
		
			loadDriver(dbdriver);
		
		Connection con=getConnection();
		
		String result="data enter successfully";
		
	String insert="insert into tb_kavidhas_employee_details(employee_id,Employee_Name,Employee_fathername,Email_id,City,Phone_no) values(?,?,?,?,?,?)";
			
			try {
				
				PreparedStatement pppp=con.prepareStatement(insert);
				
					pppp.setString(1,obj.getEmployeeId());
					pppp.setString(2, obj.getEmployeeName());
					pppp.setString(3, obj.getEmployeeFather());
					pppp.setString(4, obj.getEmailId());
					pppp.setString(5,obj.getCity());
					pppp.setString(6, obj.getPhone());
					
					pppp.executeUpdate();
					con.close();
					pppp.close();
					
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				result="data not entered";
			}		
			return result;
	}
	
	

	
	public String update(EmployeeDto obj) {
		// TODO Auto-generated method stub
		loadDriver(dbdriver);
		
		Connection con=getConnection();
		
		String result="data enter successfully";
		
		String sql="update tb_kavidhas_employee_details set Employee_fathername=? where employee_id=?";
		
			try {
				PreparedStatement ww=con.prepareStatement(sql);
				ww.setString(1, obj.getEmployeeId());
				ww.setString(2, obj.getEmployeeName());
				ww.setString(3, obj.getEmployeeFather());
				ww.setString(4, obj.getEmailId());
				ww.setString(5, obj.getPhone());
				ww.setString(6, obj.getCity());
			} catch (SQLException e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
				result="not entered data";
			}
			return sql ;
			
		
		
	}
	public String delete() {
		loadDriver(dbdriver);
		
		Connection con=getConnection();
		
		String result="delete successfully";
		
		String sql="delete from tb_kavidhas_employee_details where phone=? ";
		
		return null;
		// TODO Auto-generated method stub	
	}
}
 
