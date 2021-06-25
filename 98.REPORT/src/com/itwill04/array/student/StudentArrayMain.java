package com.itwill04.array.student;

import java.util.Iterator;

public class StudentArrayMain {

	public static void main(String[] args) {
		/*
		 * 0.학생배열객체초기화
		 */
		Student[] students = { 
				new Student(1, "KIM", 89, 93, 94),
				new Student(2, "HIM", 88, 77, 98),
				new Student(3, "AIM", 65, 87, 99), 
				new Student(4, "BIM", 75, 97, 60), 
				new Student(5, "XIM", 85, 98, 90),
				new Student(6, "TIM", 95, 88, 77), 
				new Student(7, "ZIM", 99, 93, 95), 
				new Student(8, "LIM", 83, 80, 99),
				new Student(9, "QIM", 73, 90, 80),
		};

		/*
		 * 1. 전체학생총점,평균,평점계산
		 */
		System.out.println("1. 전체학생총점,평균,평점계산");
		for (int i = 0; i < students.length; i++) {
			students[i].sumData();
			students[i].avgData();
			students[i].grade();
		}
		int totSum = 0;
		for (int i = 0; i < students.length; i++) {
			totSum+=students[i].getSum();
			
		}System.out.println("전체학생총점 : " + totSum);
		

		double avgSum = 0;
		for (int i = 0; i < students.length; i++) {
			avgSum+=students[i].getAvg();
		}
		avgSum=(int)avgSum/students.length;
		System.out.println("전체학생평균 : " + avgSum);
			
		/*
		 * 
		 * 2. 전체학생 총점으로 석차계산
		 */
		System.out.println("2. 전체학생 총점으로 석차계산");
		
		for (int i = 0; i < students.length; i++) {
			students[i].setRank(1);
			for (int j = 0; j < students.length; j++) {
				if(students[i].getSum() < students[j].getSum()) {
					students[i].setRank(students[i].getRank()+1);
				}
			}
		}
		
		/*
		 * 	for(int i=0; i<noArray.length; i++) {
			for(int j=0; j<noArray.length; j++) {
				if(totArray[i]<totArray[j]) {
					rankArray[i]++;
				}
			}	
		}
		 */
		
		
		
		/*
		 * 3. 전체학생출력
		 */
		System.out.println("3. 전체학생출력 ");
		Student.headerPrint();
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
		
		
		/*
		 * 4. 번호3번 학생한명 출력
		 */
		System.out.println("4.번호3번 학생한명 출력  ");
		Student.headerPrint();
		
		for (int i = 0; i < students.length; i++) {
			if(students[i].getNumber()==3) {
				students[i].print();
				break;
			}
		}
		

		/*
		 * 5. 학점A인 학생들 출력
		 */

		System.out.println("5. 학점A인 학생들 출력");
		Student.headerPrint();
		
		for (int i = 0; i < students.length; i++) {
			if(students[i].getGrade()=='A') {
				students[i].print();
			}
		}

		/*
		 * 6. 학생총점으로 오름차순정렬
		 */
		System.out.println("6. 학생총점으로 내림(오름)차순정렬");
		Student.headerPrint();
		
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length-1; j++) {
				if(students[j].getSum() > students[j+1].getSum()) {
					Student sumA = students[j+1];
					students[j+1] = students[j];
					students[j] = sumA;
					
				}
			}
		}
		for (int i = 0; i < students.length; i++) {
			students[i].print();
			
		}
		
		
		
		/*
		 * 7. 학생학점순으로 오름차순정렬
		 */
		System.out.println("6. 학생학점순으로 오름차순정렬");

		Student.headerPrint();
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length-1; j++) {
				if(students[j].getGrade() < students[j+1].getGrade() ) {
					Student grd = students[j+1];
					students[j+1] = students[j];
					students[j] = grd;
				}
			}
		}
		for (int i = 0; i < students.length; i++) {
			students[i].print();
			
		}
		
		

		/*
		 8.이름이 KIM인학생들 출력
		 */
		System.out.println(" 8.이름이 KIM인학생들 출력");
		
		
		
		
		/*
		 9. 학생이름순으로 오름차순정렬
		 */
		
		
		System.out.println(" 9.학생이름순으로 오름차순정렬");
		for (int i = 0; i < students.length-1; i++) {
			for (int j = 0; j < students.length-1; j++) {
				if(students[j].getName().compareTo(students[j+1].getName())>0) {
					Student tempStudent = students[j+1];
					students[j+1] = students[j];
					students[j] = tempStudent;
				}
			}
		}
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}

	
}
}

