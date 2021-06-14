package com.itwill03.포함;

public class BookMember {
	/*
	- 캡슐화
	
	<<속성>>
	 회원번호
	 회원이름
	 전화번호
	 빌린책
	 
	<<기능>>
	  회원정보출력 
	 */
	
	private int memberNo; // 캡슐화 진행
	private String memberName;
	private int telNo;
	
	private Book book;
	
	public BookMember() { // 생성자 생성
		
	}

	public BookMember(int memberNo, String memberName, int telNo, Book book) { // 매소드 생성
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.telNo = telNo;
		this.book = book;
	}
	
	public static void headerPrint() {
		System.out.print("학번 \t"+"이름 \t"+"전화번호");
		
		
	}
	
	public void print() {
		System.out.print(this.memberNo+"\t"+this.memberName+"\t"+this.telNo+"\t");
		this.book.print();
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getTelNo() {
		return telNo;
	}

	public void setTelNo(int telNo) {
		this.telNo = telNo;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	
	
}
