package com.itwill03.포함;

public class Dvd {
	
	private int dvdNo;
	private String dvdTitle;
	private String dvdType;
	
	
	public Dvd() {
		
	}
	public Dvd(int dvdNo, String dvdTitle, String dvdType) {
		this.dvdNo = dvdNo;
		this.dvdTitle = dvdTitle;
		this.dvdType = dvdType;
		
	}
	public void print() {
		System.out.println("\t"+this.dvdNo+"\t"+this.dvdTitle+"\t"+this.dvdType);
	}
	
	public int getDvdNo() {
		return dvdNo;
	}
	public void setDvdNo(int dvdNo) {
		this.dvdNo = dvdNo;
	}
	public String getDvdTitle() {
		return dvdTitle;
	}
	public void setDvdTitle(String dvdTitle) {
		this.dvdTitle = dvdTitle;
	}
	public String getDvdType() {
		return dvdType;
	}
	public void setDvdType(String dvdType) {
		this.dvdType = dvdType;
	}
	
	
}
