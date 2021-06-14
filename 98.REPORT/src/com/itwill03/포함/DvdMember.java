package com.itwill03.포함;

public class DvdMember {
	
	private int memberNo;
	private int memberTel;
	private Dvd dvd;
	
	public DvdMember() {
		
	}
	
	public DvdMember(int memberNo, int memberTel, Dvd dvd) {
		super();
		this.memberNo = memberNo;
		this.memberTel = memberTel;
		this.dvd = dvd;
	}
	
	public void print2() {
		System.out.print(this.memberNo+"\t"+this.memberTel);
		this.dvd.print();
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public int getMemberTel() {
		return memberTel;
	}

	public void setMemberTel(int memberTel) {
		this.memberTel = memberTel;
	}

	public Dvd getDvd() {
		return dvd;
	}

	public void setDvd(Dvd dvd) {
		this.dvd = dvd;
	}
	
	

}
