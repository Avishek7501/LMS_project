package model;

import java.io.Serializable;

public class returnbook implements Serializable{
	
private static final long serialVersionUID=44454212L;
	
	private int bookid;
	private String title;
	private String membername;
	private int memberid;
	private String contact;
	private String returndate;
	
	public returnbook() {
		super();
	}

	public returnbook(int bookid, String title, String membername, int memberid, String contact, String returndate) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.membername = membername;
		this.memberid = memberid;
		this.contact = contact;
		this.returndate = returndate;
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

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getReturndate() {
		return returndate;
	}

	public void setReturndate(String returndate) {
		this.returndate = returndate;
	}
	
	
	

}
