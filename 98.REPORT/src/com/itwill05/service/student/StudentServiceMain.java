package com.itwill05.service.student;

public class StudentServiceMain {

	public static void main(String[] args) {
		StudentService studentService=new StudentService();
		/*
		 * 1. 전체학생총점,평균,평점계산
		 */
		System.out.println("1. 전체학생총점,평균,평점계산");
		studentService.calculate();
		/*
		 * 2. 전체학생 총점으로 석차계산
		 */
		System.out.println("2. 전체학생 총점으로 석차계산");
		studentService.calculateRank();
		/*
		 * 3-1. 전체학생반환
		 */
		System.out.println("3. 전체학생반환 ");
		Student[] students = studentService.getStudents();
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
		
		/*
		 * 3-2. 전체학생출력
		 */
		System.out.println("3. 전체학생출력 ");
		studentService.print();
		/*
		 * 4. 번호3번 학생한명 반환
		 */
		System.out.println("4.번호3번 학생한명 반환  ");
		Student findByNo=studentService.findByNo(3);
		findByNo.print();
		
		/*
		 * 5. 학점A인 학생들 반환
		 */
		System.out.println("5. 학점A인 학생들 반환");
		Student[] findBygrade=studentService.findBygrade('A');
		for (int i = 0; i < findBygrade.length; i++) {
			findBygrade[i].print();
		}
		
		/*
		 * 5. 이름KIM 인 학생들 반환
		 */
		System.out.println("5.  이름KIM 인 학생들 반환");
		Student[] findByName = studentService.findByName("KIM");
		for (int i = 0; i < findByName.length; i++) {
			findByName[i].print();
		}
		
		/*
		 * 6. 학생석차로 오름차순정렬
		 */
		System.out.println("6. 학생석차로 오름차순정렬");
		studentService.sort();
		studentService.print();

	}

}
