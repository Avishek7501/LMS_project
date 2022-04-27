package dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.book;
import model.issuebook;
import dao.DBConnect;

public class bookdao {

	public void addbooks(book books) {
		Connection conn = null;
		PreparedStatement ps=null;
		
		try {
			conn=DBConnect.makeDbConnection();

//			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms_project_iv","root","");
			
			String query ="insert into booklist (title,author,price,quantity,racknum,publication,category,edition,remainquantity) values(?,?,?,?,?,?,?,?,?)";
			
			ps =conn.prepareStatement(query);
			ps.setString(1,books.getTitle());
			ps.setString(2, books.getAuthor());
			ps.setDouble(3, books.getPrice());
			ps.setInt(4, books.getQuantity());
			ps.setInt(5, books.getRacknum());
			ps.setString(6, books.getPublication());
			ps.setString(7, books.getCategory());
			ps.setString(8, books.getEdition());
			ps.setInt(9, books.getQuantity());
			
			ps.executeUpdate();
			
			
//		}catch (ClassNotFoundException ce) {
//			System.out.println(ce);
//		}
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
		
	}

	

	public ArrayList<book> selectall() {
		Connection conn=null;
		PreparedStatement ps=null;
		
		ArrayList<book> books  = new ArrayList<>();
		
		try {
			
			conn=DBConnect.makeDbConnection();
			
			String query = "SELECT * FROM booklist";
			ps=conn.prepareStatement(query);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				book b = new book();
				b.setBookid(rs.getInt("book_id"));
				b.setTitle(rs.getString("title"));
				b.setAuthor(rs.getString("author"));
				b.setPublication(rs.getString("publication"));
				b.setCategory(rs.getString("category"));
				b.setPrice(rs.getDouble("price"));
				b.setRacknum(rs.getInt("racknum"));
				b.setEdition(rs.getString("edition"));
				b.setQuantity(rs.getInt("quantity"));
				b.setRemainquantity(rs.getInt("remainquantity"));
				books.add(b);
				
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
		return books;
	}
	
public book selectbyid(int id) {
		
		
		Connection conn=null;
		PreparedStatement ps=null;
		book b = new book();
		
		
		String sql="select * from booklist where book_id = ?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms_project_iv","root","");
			ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				
				b.setBookid(rs.getInt("book_id"));
				b.setTitle(rs.getString("title"));
				b.setAuthor(rs.getString("author"));
				b.setPublication(rs.getString("publication"));
				b.setCategory(rs.getString("category"));
				b.setPrice(rs.getDouble("price"));
				b.setRacknum(rs.getInt("racknum"));
				b.setEdition(rs.getString("edition"));
				b.setQuantity(rs.getInt("quantity"));
				b.setRemainquantity(rs.getInt("remainquantity"));
				
				
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
		
		return b ;
	}


public boolean isbookavailable(int id) {
	
	boolean isavailable = false;
	Connection conn=null;
	PreparedStatement ps=null;
	
	
	
	String sql="select * from booklist where book_id = ?";
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms_project_iv","root","");
		ps=conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs= ps.executeQuery();
		if(rs.next()) {
			int qty = rs.getInt("remainquantity");
			if (qty>0) {
				isavailable = true;
				
			}
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
	
	return isavailable ;
}



public void updatebookquantity(int id) {
	
	Connection conn = null;
	PreparedStatement ps = null;
	
	try {
		conn = DBConnect.makeDbConnection();
		String sql = "UPDATE booklist SET remainquantity = remainquantity-1 WHERE book_id = ?";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ps.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
}



public ArrayList<book> filterbooks(String category) {
	Connection conn = null;
	PreparedStatement ps = null;
	ArrayList<book> fbooks = new ArrayList<book>();
	
	try {
		conn = DBConnect.makeDbConnection();
		String sql = "select * from booklist where category = ?";
		ps = conn.prepareStatement(sql);
		ps.setString(1, category);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			book b = new book();
			b.setBookid(rs.getInt("book_id"));
			b.setTitle(rs.getString("title"));
			b.setAuthor(rs.getString("author"));
			b.setPublication(rs.getString("publication"));
			b.setCategory(rs.getString("category"));
			b.setPrice(rs.getDouble("price"));
			b.setRacknum(rs.getInt("racknum"));
			b.setEdition(rs.getString("edition"));
			b.setQuantity(rs.getInt("quantity"));
			b.setRemainquantity(rs.getInt("remainquantity"));
			fbooks.add(b);
			
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
	return  fbooks;
}



public ArrayList<book> searchbook(String booksearch) {
	Connection conn = null;
	PreparedStatement ps = null;
	ArrayList<book> sbooks = new ArrayList<book>();
	
	try {
		conn = DBConnect.makeDbConnection();
		String sql = "select * from booklist where title like ?";
		ps = conn.prepareStatement(sql);
		ps.setString(1, booksearch+"%");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			book b = new book();
			b.setBookid(rs.getInt("book_id"));
			b.setTitle(rs.getString("title"));
			b.setAuthor(rs.getString("author"));
			b.setPublication(rs.getString("publication"));
			b.setCategory(rs.getString("category"));
			b.setPrice(rs.getDouble("price"));
			b.setRacknum(rs.getInt("racknum"));
			b.setEdition(rs.getString("edition"));
			b.setQuantity(rs.getInt("quantity"));
			b.setRemainquantity(rs.getInt("remainquantity"));
			sbooks.add(b);
			
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	return sbooks;
}



public void updatebook(book b) {
	
	Connection conn = null;
	PreparedStatement ps = null;
	try {
		conn = DBConnect.makeDbConnection();
		
		
		
		String query ="update booklist SET title=?,author=?,price=?,quantity=?,racknum=?,publication=?,category=?,edition=?,remainquantity=? WHERE book_id=?";
		
		ps =conn.prepareStatement(query);
		ps.setString(1,b.getTitle());
		ps.setString(2, b.getAuthor());
		ps.setDouble(3, b.getPrice());
		ps.setInt(4, b.getQuantity());
		ps.setInt(5, b.getRacknum());
		ps.setString(6, b.getPublication());
		ps.setString(7, b.getCategory());
		ps.setString(8, b.getEdition());
		ps.setInt(9, b.getRemainquantity());
		ps.setInt(10, b.getBookid());
		
		ps.executeUpdate();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
	
	
}



public void deletebyid(int id) {
	

	Connection conn = null;
	PreparedStatement ps = null;
	try {
		conn = DBConnect.makeDbConnection();
		String sql = "delete from booklist where book_id= ?";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ps.executeUpdate();
 		
	}catch (Exception e) {
		e.printStackTrace();
	}
	
}

	
}
