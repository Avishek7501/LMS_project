package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.tomcat.util.security.MD5Encoder;

import model.book;
import model.issuebook;
import model.member;


public class memberdao {
	
	

	public void addmember(member members) {
		
		Connection conn = null;
		PreparedStatement ps=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/lms_project_iv","root","");
			String query = "insert into member_info(name,address,dob,gender,contact,email,username,password)values(?,?,?,?,?,?,?,?)";
			
			ps = conn.prepareStatement(query);
			ps.setString(1, members.getName());
			ps.setString(2, members.getAddress());
			ps.setString(3, members.getDob());
			ps.setString(4, members.getGender());
			ps.setString(5, members.getContact());
			ps.setString(6, members.getEmail());
			ps.setString(7, members.getUsername());
			ps.setString(8, members.getPassword());
			
			
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

	public ArrayList<member> selectall() {
		Connection conn=null;
		PreparedStatement ps=null;
		
		ArrayList<member> memberlist  = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms_project_iv","root","");
			
			String query = "SELECT * FROM member_info";
			ps=conn.prepareStatement(query);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				member m = new member();
				m.setMemberid(rs.getInt("memberid"));
				m.setName(rs.getString("name"));
				m.setAddress(rs.getString("address"));
				m.setDob(rs.getString("dob"));
				m.setContact(rs.getString("contact"));
				m.setEmail(rs.getString("email"));
				m.setUsername(rs.getString("username"));
				memberlist.add(m);
				
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
		return memberlist;
	}
	
	
public member selectbyid(int id) {
		
	Connection conn=null;
	PreparedStatement ps=null;
	
	member m = new member();
	
	try {
		
		conn=DBConnect.makeDbConnection();
		String query ="select * from member_info where memberid = ?";

		
		ps=conn.prepareStatement(query);
		ps.setInt(1, id);
		
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
		
			m.setMemberid(rs.getInt("memberid"));
			m.setName(rs.getString("name"));
			m.setAddress(rs.getString("address"));
			m.setDob(rs.getString("dob"));
			m.setContact(rs.getString("contact"));
			m.setEmail(rs.getString("email"));
			m.setUsername(rs.getString("username"));
			m.setPassword(rs.getString("password"));
			
			
		}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (conn!=null) {
					conn.close();
					
				}
				if (ps!=null) {
					ps.close();
					
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return m ;
	}
	
	
}
