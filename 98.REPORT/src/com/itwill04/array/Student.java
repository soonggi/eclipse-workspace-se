package com.itwill04.array;
/*
 * 성적처리를위해 필요한 학생객체를 만들기위한클래스(틀,타입)
 *  - 캡슐화 (private)
 */
public class Student { // 멤버필드 선언
	/*
	 * << 속성 >> 번호 이름 국어 영어 수학 총점 평균 평점 석차 
	 * << 기능 >> 기본데이타입력,총점계산,평균계산,평점계산, 출력
	 */
	
	private int number, kor, eng, math, sum, rank; //private 캡슐화
	private double avg;
	private char grade;
	private String name;
	
	/*
	 * <<생성자메쏘드 선언[오버로딩]>>
	 *  - 인자 0개짜리 생성자(기본생성자선언) 
	 *  - 인자 5개짜리(번호 이름 국어 영어 수학) 생성자선언
	 */
	
	public Student() {
		
	}
	public Student(int number, String name, int kor, int eng, int math){
		this.number=number;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		
	}
	

	/*
	멤버메쏘드 선언
	*/
	
	public void setData(int number, String name, int kor, int eng, int math) { // setData 메소드 설정
		
		this.number=number; 
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		
	}
	public void sumData() { // 총점 데이터 메소드 설정
		this.sum=kor+eng+math;
	}
	public void avgData() { // 평균 데이터 메소드 설정
		this.avg=(int)((this.sum)/3.0*100)/100.0;
	}
	public void rankData(int rank) {
		this.rank=rank;
	}
	
	public void grade() { // 평점 데이터 메소드 설정
		
		if(this.avg>80) {
			this.grade = 'A';
		} else if(this.avg>60){
			this.grade = 'B';
		} else if(this.avg>40) {
			this.grade = 'C';
		} else if(this.avg>20) {
			this.grade = 'D';
		} else {
			this.grade = 'F';
		}
	}
	
	public void headerPrint() { // 출력 메소드 설정
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("번호"+"\t"+"이름"+"\t"+"국어"+"\t"+"영어"+"\t"+"수학"+"\t"+"총점"+"\t"+"평균"+"\t"+"평점"+"\t"+"석차");
	}
	
	public void print() {
		System.out.println(this.number+"\t"+this.name+"\t"+this.kor+"\t"+this.eng+"\t"+this.math+"\t"+this.sum+"\t"+this.avg+"\t"+this.grade+"\t"+this.rank);
	}
	
	//getter, setter 설정
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	}