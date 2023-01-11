package com.kh.jdbc.openmarket.model.vo;

import java.sql.Date;

public class Member {
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberhone;
	private String memberEmail;
	private String memberAddress;
	private Date enrollDate;
	private int memberAdmin;
	
	public Member() {}

	public Member(String memberId, String memberPw) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
	}

	public Member(String memberId, String memberPw, String memberName, String memberhone, String memberEmail,
			String memberAddress) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberhone = memberhone;
		this.memberEmail = memberEmail;
		this.memberAddress = memberAddress;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberhone() {
		return memberhone;
	}

	public void setMemberhone(String memberhone) {
		this.memberhone = memberhone;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	public int getMemberAdmin() {
		return memberAdmin;
	}

	public void setMemberAdmin(int memberAdmin) {
		this.memberAdmin = memberAdmin;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberPw=" + memberPw + ", memberName=" + memberName
				+ ", memberhone=" + memberhone + ", memberEmail=" + memberEmail + ", memberAddress=" + memberAddress
				+ ", enrollDate=" + enrollDate + ", memberAdmin=" + memberAdmin + "]";
	}
	
	
	
	
}
