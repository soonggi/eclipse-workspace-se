
public class StudentFieldMain {

	public static void main(String[] args) {
		
		
		//학생1, 2 객체 생성
		Student student1 = new Student();
		Student student2 = new Student();
		
		//학생 1 객체 기본 데이터 대입
		student1.number = 1;
		student1.name = "김순근";
		student1.kor = 12;
		student1.eng = 23;
		student1.math = 33;
		
		//학생 2 객체 기본 데이터 대입
		student2.number = 2;
		student2.name = "이순근";
		student2.kor = 21;
		student2.eng = 31;
		student2.math = 42;
		
		//학생1 총점,평균_소숫점 두번째 자리 반올림,평점계산후 대입(2명)
		student1.sum = (student1.kor+student1.eng+student1.math);
		student1.avg = ((int)(student1.sum/3.0*100 + 4))/100.0;
		/*
		student1.avg = student1.sum/3 = 22.666666
		student1.avg = int(22.6666*100+4=2270.66)/100.0=22.7
		*/
		
		//학생1 평점 구하기
		if(student1.avg>80) {
			student1.grade = 'A';
		}else if(student1.avg>60) {
			student1.grade = 'B';
		}else if(student1.avg>40) {
			student1.grade = 'C';
		}else if(student1.avg>20) {
			student1.grade = 'D';
		}else {
			student1.grade = 'F';
		}
		
		//학생2 총점,평균_소숫점 두번째 자리 반올림,평점계산후 대입(2명)
		student2.sum = (student2.kor+student2.eng+student2.math);
		student2.avg = ((int)(student2.sum/3.0*100 - 3))/100.0;
		
		if(student2.avg>80) {
			student2.grade = 'A';
		}else if(student2.avg>60) {
			student2.grade = 'B';
		}else if(student2.avg>40) {
			student2.grade = 'C';
		}else if(student2.avg>20) {
			student2.grade = 'D';
		}else {
			student2.grade = 'F';
		}
		
		System.out.println("--------------------------------------------------------------------");
		System.out.println("번호"+"\t"+"이름"+"\t"+"국어"+"\t"+"영어"+"\t"+"수학"+"\t"+"총점"+"\t"+"평균"+"\t"+"평점"+"\t"+"석차");
		System.out.println(student1.number+"\t"+student1.name+"\t"+student1.kor+"\t"+student1.eng+"\t"+student1.math+"\t"+student1.sum+"\t"+student1.avg+"\t"+student1.grade+"\t"+0);
		System.out.println(student2.number+"\t"+student2.name+"\t"+student2.kor+"\t"+student2.eng+"\t"+student2.math+"\t"+student2.sum+"\t"+student2.avg+"\t"+student2.grade+"\t"+0);
		System.out.println("--------------------------------------------------------------------");

	}

}
