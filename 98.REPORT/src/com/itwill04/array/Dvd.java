package com.itwill04.array;

public class Dvd {
	
		private int no;//번호
		private String title;//타이틀
		private String genre;//쟝르
		public Dvd() {
			
		}
		public Dvd(int no, String title, String genre) {
		
			this.no = no;
			this.title = title;
			this.genre = genre;
		}
		
		public static void headPrint() {
			System.out.println("========================================");
			System.out.println("영화번호"+"\t"+"영화이름"+"\t"+"영화장르");
			System.out.println("========================================");
		}
		
		
		public void print() {
			System.out.println(+no+"\t\t"+title+"\t\t"+genre);
		}
		public int getNo() {
			return no;
		}
		public void setNo(int no) {
			this.no = no;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		

}
