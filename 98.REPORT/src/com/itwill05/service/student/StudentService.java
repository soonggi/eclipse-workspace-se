package com.itwill05.service.student;

import com.itwill05.service.account.Account;

public class StudentService {
	private Student[] students = { 
			new Student(1, "KIM", 89, 93, 94), 
			new Student(2, "HIM", 88, 77, 98),
			new Student(3, "AIM", 65, 87, 99), 
			new Student(4, "KIM", 75, 97, 60), 
			new Student(5, "XIM", 85, 98, 90),
			new Student(6, "TIM", 95, 88, 77), 
			new Student(7, "KIM", 99, 93, 95), 
			new Student(8, "LIM", 83, 80, 99),
			new Student(9, "QIM", 73, 90, 80),

	};

	/*
	 * 0.전체학생출력
	 */
	public void print() {
		Student.headerPrint();
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
	}

	/*
	 * 0.학생객체받아서 추가
	 */
	public void addStudent(Student newStudent) {

		Student[] addstudents = new Student[students.length + 1];
		for (int i = 0; i < students.length; i++) {
			addstudents[i] = students[i];
		}
		addstudents[students.length] = newStudent;
		this.students = addstudents;
	}
	
	public void addStudent(int no, String name, int kor, int eng, int math) {
		Student newStudent = new Student(no, name, kor, eng, math);
		/*
		 * 1.배열크기증가 - 기존배열보다큰배열생성 - 기존데이타 옮김
		 */
		Student[] addstudents = new Student[students.length + 1];
		for (int i = 0; i < students.length; i++) {
			addstudents[i] = students[i];
		}
		addstudents[students.length] = newStudent;
		this.students = addstudents;
	}

	/*
	 * 1. 전체학생총점,평균,평점계산
	 */
	public void calculate() {
		for (int i = 0; i < students.length; i++) {
			students[i].calculateTotal();
			students[i].calculateAvg();
			students[i].calculateGrade();
		}
	}

	/*
	 * 2. 전체학생 총점으로 석차계산
	 */
	
	/*
	public void rank() {
		for (int i = 0; i < students.length - 1; i++) {
			for (int j = 0; j < students.length - 1; j++) {
				if (students[j].getTot() < students[j + 1].getTot()) {
					Student tempStudent = students[j + 1];
					students[j + 1] = students[j];
					students[j] = tempStudent;
				}
			}
		}
		for (int i = 0; i < students.length; i++) {
			students[i].setRank(i + 1);
		}
	}
	*/
	
	public void calculateRank() {
		for (int i = 0; i < students.length; i++) {
			students[i].setRank(1);
			for (int j = 0; j < students.length; j++) {
				if(students[i].getTot() < students[j].getTot()) {
					students[i].setRank(students[i].getRank()+1);
				}
			}
		}
	}
	

	/*
	 * 3. 전체학생반환
	 */
	public Student[] getStudents() {
		return this.students;
	}
	

	/*
	 * 4. 번호3번 학생한명 반환
	 */
	public Student findByNo(int no) {
		Student findStudent = null;
		for (int i = 0; i < students.length; i++) {
			if (students[i].getNo() == no) {
				findStudent = students[i];
				break;
			}
		}
		return findStudent;
	}

	/*
	 * 5. 학점A인 학생들 반환
	 */
	public Student[] findBygrade(char grade) {
		Student[] stuGrades = null;
		int count = 0;

		for (int i = 0; i < students.length; i++) {
			if (students[i].getGrade() == 'A') {
				count++;
			}
		}

		stuGrades = new Student[count];

		int index = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i].getGrade() == 'A') {
				stuGrades[index] = students[i];
				index++;
			}
		}
		return stuGrades;
	}
	
	public Student[] findByName(String no) {
		Student[] stuNames = null;
		int count = 0;

		for (int i = 0; i < students.length; i++) {
			if (students[i].getName().equals(no)) {
				count++;
			}
		}

		stuNames = new Student[count];

		int index = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i].getName().equals(no)) {
				stuNames[index] = students[i];
				index++;
			}
		}
		return stuNames;
	}

	/*
	 * 6. 학생석차로 오름차순정렬
	 */
	public void sort() {
		for (int i = 0; i < students.length - 1; i++) {
			for (int j = 0; j < students.length - 1; j++) {
				if (students[j].getNo() > students[j + 1].getNo()) {
					Student tempStudent = students[j + 1];
					students[j + 1] = students[j];
					students[j] = tempStudent;
				}
			}
		}
	}

}