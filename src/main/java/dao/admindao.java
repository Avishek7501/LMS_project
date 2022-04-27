package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.admin;
import model.member;

public class admindao {

	public void addadmin(admin adm) {
		
		Connection conn = null;
		PreparedStatement ps=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/lms_project_iv","root","");
			String query = "insert into admin_info(name,address,dob,gender,contact,email,username,password)values(?,?,?,?,?,?,?,?)";
			
			ps = conn.prepareStatement(query);
			ps.setString(1, adm.getName());
			ps.setString(2, adm.getAddress());
			ps.setString(3, adm.getDob());
			ps.setString(4, adm.getGender());
			ps.setString(5, adm.getContact());
			ps.setString(6, adm.getEmail());
			ps.setString(7, adm.getUsername());
			ps.setString(8, adm.getPassword());
			
			
			ps.executeUpdate();
			
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		}catch (SQLException se) {
			se.printStackTrace();

		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if (ps!=null) {
					ps.close();
					
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

	public ArrayList<admin> selectall() {
		Connection conn=null;
		PreparedStatement ps=null;
		
		ArrayList<admin> adminlist  = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms_project_iv","root","");
			
			String query = "SELECT * FROM admin_info";
			ps=conn.prepareStatement(query);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				admin m = new admin();
				m.setAdminid(rs.getInt("adminid"));
				m.setName(rs.getString("name"));
				m.setAddress(rs.getString("address"));
				m.setDob(rs.getString("dob"));
				m.setContact(rs.getString("contact"));
				m.setEmail(rs.getString("email"));
				m.setUsername(rs.getString("username"));
				adminlist.add(m);
				
			}
			
		} catch (ClassNotFoundException ce) {
			System.out.println(ce);
		}catch (SQLException se) {
			se.printStackTrace();
		}
		finally {
			try {
				if (conn!=null) {
					conn.close();
				}
				if (ps!=null) {
					ps.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return adminlist;
	}

}
