package com.itwill03.포함;

public class Book {
	
	/*
	 * - 캡슐화하세요
	 * - 생성자를 정의하세요
	 * 
	 * <<속성>>
	 *  책번호
	 *  책제목
	 *  책분류
	 *  책설명
	 * 
	 * <<기능>>
	 *   책정보출력
	 *   
	 */
	
	private int bookNo;
	private String bookName;
	private String bookType;
	private String bookEx;
	
	public Book() { // 생성자 정의
		
	}
	
	public Book(int bookNo, String bookName, String bookType, String bookEx) {
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.bookType = bookType;
		this.bookEx = bookEx;
	}
	public static void headprint() {
		System.out.println("==================책 정보 출력==================");
	}
	
	public void print(){
		System.out.println(this.bookNo+"\t"+this.bookName+"\t"+this.bookType+"\t"+this.bookEx);
		
	}
	public static void print2(){
		System.out.print("책 번호"+"\t"+"책 이름"+"\t"+"책 종류"+"\t"+"책 설명"+"\n");
		
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public String getBook() {
		return bookEx;
	}

	public void setBook(String book) {
		this.bookEx = book;
	}
	
	
	
	
	

}
