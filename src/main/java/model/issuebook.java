package model;

import java.io.Serializable;

public class issuebook implements Serializable{
	
	private static final long serialVersionUID=584544L;
	
	private int issueid;
	private int bookid;
	private String title;
	private String membername;
	private int memberid;
	private String contact;
	private String issuedate;
	
	
	public issuebook() {
		super();
	}

	public issuebook(int bookid, String title, String membername, int memberid, String contact, String issuedate,int issueid) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.membername = membername;
		this.memberid = memberid;
		this.contact = contact;
		this.issuedate = issuedate;
		this.issueid =issueid;
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

	public String getIssuedate() {
		return issuedate;
	}

	public void setIssuedate(String issuedate) {
		this.issuedate = issuedate;
	}

	public int getIssueid() {
		return issueid;
	}

	public void setIssueid(int issueid) {
		this.issueid = issueid;
	}
	
	

}
