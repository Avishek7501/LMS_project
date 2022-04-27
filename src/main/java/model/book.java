package model;
import java.io.Serializable;

public class book implements Serializable {
	
	
	
	private static final long serialVersionUID=3294165464L;
	
	private int bookid;
	private String title;
	private String author;
	private Double price;
	private int quantity;
	private int racknum;
	private String publication;
	private String category;
	private String edition;
	private int remainquantity;
	
	
	public book() {
		super();
		}
	
	


	public book(int bookid, String title, String author, Double price, int quantity, int racknum, String publication,
			String category, String edition, int remainquantity) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
		this.racknum = racknum;
		this.publication = publication;
		this.category = category;
		this.edition = edition;
		this.remainquantity= remainquantity;
	}


	public int getBookid() {
		return bookid;
	}


	public void setBookid(int bookid) {
		this.bookid = bookid;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getRacknum() {
		return racknum;
	}


	public void setRacknum(int racknum) {
		this.racknum = racknum;
	}


	public String getPublication() {
		return publication;
	}


	public void setPublication(String publication) {
		this.publication = publication;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getEdition() {
		return edition;
	}


	public void setEdition(String edition) {
		this.edition = edition;
	}




	public int getRemainquantity() {
		return remainquantity;
	}




	public void setRemainquantity(int remainquantity) {
		this.remainquantity = remainquantity;
	}


	
	
	
	
	
	
}
