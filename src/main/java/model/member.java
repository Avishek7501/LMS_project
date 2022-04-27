package model;

import java.io.Serializable;

public class member implements Serializable {

private static final long serialVersionUID=5484516545L;

	private int memberid;
	private String name;
	private String address;
	private String dob;
	private String gender;
	private String contact;
	private String email;
	private String username;
	private String password;
	
	public member() {
		super();
	}
		public member(int memberid, String name, String address, String dob, String gender, String contact, String email, String username,
			String password) {
		super();
		this.memberid=memberid;
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.gender = gender;
		this.contact = contact;
		this.email = email;
		this.username = username;
		this.password = password;
	}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public int getMemberid() {
			return memberid;
		}
		public void setMemberid(int memberid) {
			this.memberid = memberid;
		}
		

		
	
	
	
	
}
