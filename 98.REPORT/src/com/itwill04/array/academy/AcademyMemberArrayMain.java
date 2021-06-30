package com.itwill04.array.academy;

public class AcademyMemberArrayMain {

	public static void main(String[] args) {
		AcademyMember[] members={
				new AcademyStudent(1, "KIM", "자바"),
				new AcademyStudent(2, "LEE", "리눅스"),
				new AcademyStudent(3, "KIM", "자바"),
				new AcademyStudent(4, "LEE", "IOT"),
				new AcademyGangsa(5, "CHOI", "파이썬"),
				new AcademyGangsa(6, "KIM", "자바"),
				new AcademyGangsa(7, "DIM", "자바"),
				new AcademyStaff(8, "AIM", "영업"),
				new AcademyStaff(9, "QIM", "생산")
		};
		
		System.out.println("1.AcademyMember 전체출력");
		for (int i = 0; i < members.length; i++) {
			members[i].print();
		}
		
		
		System.out.println("2.번호 1   번 AcademyMember 한명 출력");
		for (int i = 0; i < members.length; i++) {
			if(members[i].getNo()==1) {
				members[i].print();
				break;
			}
		}
		System.out.println("2.번호 2   번 AcademyMember 한명 출력");
		for (int i = 0; i < members.length; i++) {
			if(members[i].getNo()==2) {
				members[i].print();
				break;
			}
		}
		System.out.println("2.이름 KIM 인 AcademyMember 들   출력");
		for (int i = 0; i < members.length; i++) {
			if(members[i].getName().equals("KIM")) {
				members[i].print();
			}
		}
		
		System.out.println("3.AcademyMember 중에서 AcademyStudent들 출력");
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) { // instanceof 활용하여 출력
				members[i].print();
			}
		}
		System.out.println("3.AcademyMember 중에서 AcademyGangsa들 출력");
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyGangsa) { // instanceof 활용하여 출력
				members[i].print();
			}
		}
		
		System.out.println("3.AcademyMember 중에서 AcademyStaff들 출력");
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStaff) { // instanceof 활용하여 출력
				members[i].print();
			}
		}
		
		System.out.println("4.AcademyMember 중에서 자바 반  인 AcademyStudent 들 출력");
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				AcademyStudent student = (AcademyStudent)members[i]; // AcademyMember 클래스 AcademyStudent로 형변환
				if(student.getBan().equals("자바")) {
					members[i].print();
				}
			}
		}
		
		System.out.println("4.AcademyMember 중에서 영업 부서인 AcademyStaff   들 출력");
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStaff) {
				AcademyStaff Staff = (AcademyStaff)members[i];
				if(Staff.getDepart().equals("영업")) {
					members[i].print();
				}
				
			}
		}
		
		System.out.println("4.AcademyMember 중에서 자바 과목인 AcademyGangsa  들 출력");
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyGangsa) {
				AcademyGangsa Gangsa = (AcademyGangsa)members[i];
				if(Gangsa.getSubject().equals("자바")) {
					members[i].print();
				}
				
			}
		}
		
	}

}