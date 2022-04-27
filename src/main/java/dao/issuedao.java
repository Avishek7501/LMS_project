package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.book;
import model.issuebook;

public class issuedao {

	public void addissue(issuebook ib) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/lms_project_iv","root","");
			
			String query = "insert into issue_book(bookid, title, membername, memberid, contact, issuedate) VALUES (?,?,?,?,?,?)";
			
			ps = conn.prepareStatement(query);
			ps.setInt(1, ib.getBookid());
			ps.setString(2, ib.getTitle());
			ps.setString(3, ib.getMembername());
			ps.setInt(4, ib.getMemberid());
			ps.setString(5, ib.getContact());
			ps.setString(6, ib.getIssuedate());
			
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

//	public boolean checkissue(issuebook ib) {
//		
//		boolean checked = false;
//		Connection conn=null;
//		PreparedStatement ps=null;
//		PreparedStatement pp = null;
//		
//		String sql="select * from booklist where book_id = ?";
//		String query ="select * from member_info where memberid = ?";
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms_project_iv","root","");
//			ps=conn.prepareStatement(sql);
//			ps.setInt(1, ib.getBookid());
//			ResultSet rs= ps.executeQuery();
//			
//			
//			
//			pp = conn.prepareStatement(query);
//			pp.setInt(1, ib.getMemberid());
//			ResultSet rr = pp.executeQuery();
//			
//			if (rs.getString("title").equals(ib.getTitle())) {
//				if(rr.getString("name").equals(ib.getMembername())) {
//					
//					System.out.println(rs.getString("title"));
//					System.out.println(rs.getString("name"));
//			
//				checked = true;
//				
//				}
//				
//			}
//			
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				if (conn!=null) {
//					conn.close();
//					
//				}
//				if (ps!=null) {
//					ps.close();
//					
//				}
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}
//		
//		return checked ;
//	}

	
	public ArrayList<issuebook> selectall() {
		Connection conn=null;
		PreparedStatement ps=null;
		
		ArrayList<issuebook> issuebooks  = new ArrayList<>();
		
		try {
			
			conn=DBConnect.makeDbConnection();
			
			String query = "SELECT * FROM issue_book";
			ps=conn.prepareStatement(query);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				issuebook ib = new issuebook();
				
				ib.setIssueid(rs.getInt("issueid"));
				ib.setBookid(rs.getInt("bookid"));
				ib.setTitle(rs.getString("title"));
				ib.setMembername(rs.getString("membername"));
				ib.setIssuedate(rs.getString("issuedate"));
				issuebooks.add(ib);
				
			}
			
		} catch (SQLException se) {
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
		return issuebooks;
	}
	
}
