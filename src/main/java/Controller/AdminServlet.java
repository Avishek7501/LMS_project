package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.admindao;
import dao.bookdao;
import dao.issuedao;
import dao.memberdao;
import model.admin;
import model.book;
import model.issuebook;
import model.member;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/admincontroller")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd =null;
		String URI=request.getRequestURI();
		String contextpath = request.getContextPath();
		System.out.println(URI);
		System.out.println(contextpath);
		
		
	 
		
		
		if (URI.equals(contextpath+"/admin/dashboard")) {
			 
			
			
			
		rd = request.getRequestDispatcher("/admin/dashboard.jsp");
			
		}
		else if (URI.equals(contextpath+"/admin/member_register")) {
			rd=request.getRequestDispatcher("/admin/member_register.jsp");
		}
		
		else if (URI.equals(contextpath+"/admin/book_register")) {
			rd=request.getRequestDispatcher("/admin/book_register.jsp");
		}
		
		else if (URI.equals(contextpath+"/admin/e-book_upload")) {
			rd=request.getRequestDispatcher("/admin/e-book_upload.jsp");
		}
		
		else if (URI.equals(contextpath+"/admin/issue_book")) {
			
			ArrayList<book> booklist = new bookdao().selectall();
			request.setAttribute("booklists", booklist);
			
			rd=request.getRequestDispatcher("/admin/issue_book.jsp");
		}
		
		else if (URI.equals(contextpath+"/admin/return_book")) {
			rd=request.getRequestDispatcher("/admin/return_book.jsp");
		}
		
		else if (URI.equals(contextpath+"/admin/lost_book")) {
			rd=request.getRequestDispatcher("/admin/lost_book.jsp");
		}
		
		else if (URI.equals(contextpath+"/admin/admin_register")) {
			rd=request.getRequestDispatcher("/admin/admin_register.jsp");
		}
		
		else if (URI.equals(contextpath+"/admin/logout")) {
			response.sendRedirect(contextpath+"/admin/adminlogin");
		}
		
		else if (URI.equals(contextpath+"/admin/memberlist")) {
			ArrayList<member> memberlist = new memberdao().selectall();
			request.setAttribute("memberlists", memberlist);
			rd = request.getRequestDispatcher("/admin/memberlist.jsp");
			
		}
		
		else if (URI.equals(contextpath+"/admin/booklist")) {
			 
			
			ArrayList<book> booklist = new bookdao().selectall();
			request.setAttribute("booklists", booklist);
			rd = request.getRequestDispatcher("/admin/booklist.jsp");
			
		}
		
		else if (URI.equals(contextpath+"/admin/adminlist")) {
			ArrayList<admin> adminlist = new admindao().selectall();
			request.setAttribute("adminlists", adminlist);
			rd = request.getRequestDispatcher("/admin/adminlist.jsp");
			
		}
		
		else if (URI.equals(contextpath+"/admin/issuelist")) {
			ArrayList<issuebook> issuelist = new issuedao().selectall();
			request.setAttribute("issuelists", issuelist);
			
			rd = request.getRequestDispatcher("/admin/issuelist.jsp");
			
		}
		
		if (URI.equals(contextpath+"/admin/bookfilter")) {
			String category = request.getParameter("category");
			System.out.println(category);
			ArrayList<book> booklists =new bookdao().filterbooks(category);
			
			request.setAttribute("booklists", booklists);
			request.setAttribute("filter", true);
			rd = request.getRequestDispatcher("/admin/booklist.jsp");
			
		}
		
		if (URI.equals(contextpath+"/admin/booksearch")) {
			String booksearch = request.getParameter("booksearch");
			System.out.println(booksearch);
			ArrayList<book> booklists = new bookdao().searchbook(booksearch);
			
			request.setAttribute("booklists", booklists);
			request.setAttribute("search", true);
			rd = request.getRequestDispatcher("/admin/booklist.jsp");
			
		}
		
		if (URI.equals(contextpath+"/admin/edit_book")) {
			request.setAttribute("update", true);
			int id =Integer.parseInt(request.getParameter("id"));
			book books = new bookdao().selectbyid(id);
			request.setAttribute("upbook", books);
			
			rd = request.getRequestDispatcher("/admin/book_register");
			
		}
		
		if (URI.equals(contextpath+"/admin/delete_book")) {
			int id = Integer.parseInt(request.getParameter("id"));
			new bookdao().deletebyid(id);
			
			rd = request.getRequestDispatcher("/admin/booklist");
			
		}
		
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String URI=request.getRequestURI();
		String contextpath = request.getContextPath();
		
		 if (URI.equals(contextpath+"/admin/member_register")) {
			 String action= request.getParameter("action");
			 if(action.equals("add")){
				 String name = request.getParameter("name");
				 String address =request.getParameter("address");
				 String dob =request.getParameter("dob");
				 String gender =request.getParameter("gender");
				 String contact =request.getParameter("phone");
				 String email =request.getParameter("email");
				 String username =request.getParameter("username");
				 String passsword =request.getParameter("password");
				
				 
				 member mem = new member();
				 mem.setName(name);
				 mem.setAddress(address);
				 mem.setDob(dob);
				 mem.setEmail(email);
				 mem.setGender(gender);
				 mem.setContact(contact);
				 mem.setUsername(username);
				 mem.setPassword(passsword);
				 
				 
				 new memberdao().addmember(mem);
				 response.sendRedirect(contextpath+"/admin/memberlist");
			 }
			}
		 
		 else if (URI.equals(contextpath+"/admin/book_register")) {
			 String action=request.getParameter("action");
			 if (action.equals("add")) {
				 String title = request.getParameter("booktitle");
				 String author = request.getParameter("author");
				 String publication = request.getParameter("publication");
				 String category = request.getParameter("category");
				 String edition = request.getParameter("edition");
				 Double price = Double.parseDouble(request.getParameter("price"));
				 int quantity = Integer.parseInt(request.getParameter("quantity"));
				 int racknum = Integer.parseInt(request.getParameter("racknumber"));
				 
				 
				 
				 book b = new book();
				 b.setTitle(title);
				 b.setAuthor(author);
				 b.setPublication(publication);
				 b.setCategory(category);
				 b.setEdition(edition);
				 b.setPrice(price);
				 b.setQuantity(quantity);
				 b.setRacknum(racknum);
				 
				 
				 new bookdao().addbooks(b);
				 
				 response.sendRedirect(contextpath+"/admin/booklist");
				 
				 
				 
				
			}
			 
			 else if (action.equals("update")) {
				 int bookid =Integer.parseInt(request.getParameter("bookid"));
				 String title = request.getParameter("booktitle");
				 String author = request.getParameter("author");
				 String publication = request.getParameter("publication");
				 String category = request.getParameter("category");
				 String edition = request.getParameter("edition");
				 Double price = Double.parseDouble(request.getParameter("price"));
				 int quantity = Integer.parseInt(request.getParameter("quantity"));
				 int racknum = Integer.parseInt(request.getParameter("racknumber"));
				 int remainquantity = Integer.parseInt(request.getParameter("remainquantity"));
				 
				 
				 
				 book b = new book();
				 b.setBookid(bookid);
				 b.setTitle(title);
				 b.setAuthor(author);
				 b.setPublication(publication);
				 b.setCategory(category);
				 b.setEdition(edition);
				 b.setPrice(price);
				 b.setQuantity(quantity);
				 b.setRacknum(racknum);
				 b.setRemainquantity(remainquantity);
				 
				 new bookdao().updatebook(b);
				 response.sendRedirect(contextpath+"/admin/booklist");
				
			}
			
		}
		 
		 if (URI.equals(contextpath+"/admin/admin_register")) {
			 String action= request.getParameter("action");
			 if(action.equals("add")){
				 String name = request.getParameter("name");
				 String address =request.getParameter("address");
				 String dob =request.getParameter("dob");
				 String gender =request.getParameter("gender");
				 String contact =request.getParameter("phone");
				 String email =request.getParameter("email");
				 String username =request.getParameter("username");
				 String passsword =request.getParameter("password");
				 
				 admin adm = new admin();
				 adm.setName(name);
				 adm.setAddress(address);
				 adm.setDob(dob);
				 adm.setEmail(email);
				 adm.setGender(gender);
				 adm.setContact(contact);
				 adm.setUsername(username);
				 adm.setPassword(passsword);
				 
				 new admindao().addadmin(adm);
				 response.sendRedirect(contextpath+"/admin/adminlist");
			 }
			 
			}
		 
		 
		 if (URI.equals(contextpath+"/admin/issue_book")) {
			 String action= request.getParameter("action");
			 if(action.equals("add")){
				 int bookid =Integer.parseInt(request.getParameter("bookid"));   
				 String title = request.getParameter("booktitle");
				 String membername =request.getParameter("membername");
				 int memberid =Integer.parseInt(request.getParameter("memberid"));
				 String contact =request.getParameter("phoneno");
				 String dateofissue =request.getParameter("date");
				
				 System.out.println(bookid);
				 System.out.println(memberid);
				 System.out.println(membername);
				 
				 issuebook ib = new issuebook();
				 ib.setBookid(bookid);
				 ib.setTitle(title);
				 ib.setMembername(membername);
				 ib.setMemberid(memberid);
				 ib.setContact(contact);
				 ib.setIssuedate(dateofissue);
				 
				 
				member m = new memberdao().selectbyid(memberid);
				System.out.println(m.getName());
				
				System.out.println(m);
				
				 
				if (!(new bookdao().isbookavailable(bookid))) {
					System.out.println("entered1");
					response.sendRedirect(contextpath+"/admin/issue_book?bookavailable=false");
					
					
				}
				else if (m==null || !(m.getName().equals(membername)))  {
					System.out.println("entered2");
					response.sendRedirect(contextpath+"/admin/issue_book?memberavailable=false");
					
				}
				else  {
					System.out.println("entered3");
					new issuedao().addissue(ib);
					new bookdao().updatebookquantity(bookid);
					
					response.sendRedirect(contextpath+"/admin/issuelist.jsp");
					
				}
				
				 
				 
			 }
			}
		 
		 
		
	}

}
