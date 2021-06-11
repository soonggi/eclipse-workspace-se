package com.itwill01.method;

public class StudentConstructorMain {

	public static void main(String[] args) {
		
		/*
		 학생객체생성(3명)
		  - 1명은 기본생성자사용
		      학생객체데이타(번호, 이름, 국어, 영어, 수학)입력메쏘드호출
		  - 2명은 인자5개 생성자사용
		 */
		Student st1=new Student();
		st1.setData(1, "KIM", 12, 45, 56);
		
		Student st2=new Student(2, "JIM", 37, 44, 55);
		Student st3=new Student(3, "PIM", 66, 77, 88);
		
		/*
		 * 학생총점계산 메쏘드 호출(3명) 
		 * 학생평균계산 메쏘드 호출(3명) 
		 * 학생평점계산 메쏘드 호출(3명)
		 */
		st1.sumData();
		st2.sumData();
		st3.sumData();
		
		st1.avgData();
		st2.avgData();
		st3.avgData();
		
		st1.grade();
		st2.grade();
		st3.grade();
		
		/*
		 * 학생데이타3명 출력메쏘드 호출
		 */
		st1.headerPrint();
		st1.print();
		st2.print();
		st3.print();
		
		System.out.println();
		
		/*
		 * 학생 student1 의 이름변경
		 * 학생 student1 의 총점데이타 반환받은후 메인에서출력
		 * 학생 student2 의 학점데이타 반환받은후 메인에서출력
		 */
		st1.setName("BIM"); //학생 student1 의 이름변경
		
		
		System.out.println("학생 student1 의 총점데이타 반환받은후 메인에서출력");
		
		int tot = st1.getSum();
		System.out.println(tot);
		
		System.out.println("학생 student2 의 학점데이타 반환받은후 메인에서출력");
		char grd = st2.getGrade();
		System.out.println(grd);
		System.out.println();
		
		System.out.println("학생 student1 의 이름 변경 후 출력");
		st1.headerPrint();
		st1.print();
		st2.print();
		st3.print();
		

	}

}
