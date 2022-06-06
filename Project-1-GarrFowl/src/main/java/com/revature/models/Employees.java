package com.revature.models;

import java.util.Objects;

public class Employees {
	
	private int userid;
	private String username;
	private String userpassword;
	private int pastreimbursement;
	private boolean pending;
	private int requestedreimbursement;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public int getPastreimbursement() {
		return pastreimbursement;
	}
	public void setPastreimbursement(int pastreimbursement) {
		this.pastreimbursement = pastreimbursement;
	}
	public boolean isPending() {
		return pending;
	}
	public void setPending(boolean pending) {
		this.pending = pending;
	}
	public int getRequestedreimbursement() {
		return requestedreimbursement;
	}
	public void setRequestedreimbursement(int requestedreimbursement) {
		this.requestedreimbursement = requestedreimbursement;
	}
	
	@Override
	public String toString() {
		return "Employees [userid=" + userid + ", username=" + username + ", userpassword=" + userpassword
				+ ", pastreimbursement=" + pastreimbursement + ", pending=" + pending + ", requestedreimbursement="
				+ requestedreimbursement + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(pastreimbursement, pending, requestedreimbursement, userid, username, userpassword);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employees other = (Employees) obj;
		return pastreimbursement == other.pastreimbursement && pending == other.pending
				&& requestedreimbursement == other.requestedreimbursement && userid == other.userid
				&& Objects.equals(username, other.username) && Objects.equals(userpassword, other.userpassword);
	}
	public Employees(int userid, String username, String userpassword, int pastreimbursement, boolean pending,
			int requestedreimbursement) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpassword = userpassword;
		this.pastreimbursement = pastreimbursement;
		this.pending = pending;
		this.requestedreimbursement = requestedreimbursement;
	}
	
	public Employees(String username, String userpassword) {
		super();
		this.username = username;
		this.userpassword = userpassword;
	}
	
	public Employees() {
		super();
	}

}
