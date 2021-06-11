public class StudentScorePrint {

	public static void main(String[] args) {
		
		//학생1 변수 선언 및 데이터 입력
		String Student1 = "황순근"; //이름 기본 데이터 입력
		int number1 = 1; //번호 기본 데이터 입력
		int kor1 = 42; //국어 기본 데이터 입력
		int eng1 = 56; //영어 기본 데이터 입력
		int math1 = 78; //수학 기본 데이터 입력
		int sum1 = kor1+eng1+math1; //총점 데이터 기본 데이터 활용
		double avg1 = (double)sum1/3; //평점 데이터 기본 데이터 활용 // 58.666666666666664
		avg1 = avg1*100;
		int iavg1 = (int)avg1;
		iavg1 = iavg1+4;
		double avg11 = (double)iavg1/100;
		char grd1 = ' ';
		
		//학생2 변수 선언 및 데이터 입력
		String Student2 = "김순근";
		int number2 = 2;
		int kor2 = 45;
		int eng2 = 53;
		int math2 = 76;
		int sum2 = kor2+eng2+math2;
		double avg2 = (double)sum2/3;
		avg2 = avg2*100;
		int iavg2 = (int)avg2;
		double avg22 = (double)iavg2/100;
		char grd2 = ' ';
		
		//학생1 국, 영, 수 유효성 검사
		if (kor1<0 || kor1>100) {
			System.out.println("국어 점수가 유효하지 않습니다.");
			return;
		}else if (eng1<0 || eng1>100) {
			System.out.println("영어 점수가 유효하지 않습니다.");
			return;
		}else if (math1<0 || math1>100) {
			System.out.println("수학 점수가 유효하지 않습니다.");
			return;
		}
		
		//학생2 국, 영, 수 유효성 검사
		if (kor2<0 || kor2>100) {
			System.out.println("국어 점수가 유효하지 않습니다.");
			return;
		}else if (eng2<0 || eng2>100) {
			System.out.println("영어 점수가 유효하지 않습니다.");
			return;
		}else if (math2<0 || math2>100) {
			System.out.println("수학 점수가 유효하지 않습니다.");
			return;
		}
		
		//학생1 평점 계산
		if (avg11>0 && avg11<50) {
			grd1 = 'B';
		}else if (avg11>=50 && avg11<100) {
			grd1 = 'A';
		}
		
		//학생2 평점 계산
		if (avg22>0 && avg11<50) {
			grd2 = 'B';
		}else if(avg22>=50 && avg22<100) {
			grd2 = 'A';
		}
		/*
		
		System.out.println("--------------학생 성적출력-------------------");
		System.out.println("학번"+" "+"이름"+" "+"국어"+" "+"영어"+" "+"수학"+" "+"총점"+" "+"평균"+" "+"평점"+" "+"석차");
		System.out.println("----------------------------------------------");
		System.out.println("  "+number1+"  "+Student1+"  "+kor1+"  "+eng1+"  "+math1+"  "+sum1+"  "+avg11+"  "+grd1+"  "+" 1" );
		System.out.println("  "+number2+"  "+Student2+"  "+kor2+"  "+eng2+"  "+math2+"  "+sum2+"  "+avg22+"  "+grd2+"  "+" 2" );
		
		*/
		System.out.printf("--------------학생 성적출력-------------------%n");
		System.out.printf("%s %3s %s %s %s %s %3s %s %s%n","학번","이름","국어","영어","수학","총점","평균","평점","석차");
		System.out.printf("%3d %4s %3d %4d %4d %4d %5.1f %4c %4d%n",1,"황순근",33,44,55,158,33.3241,'A',1);
		System.out.printf("%3d %4s %3d %4d %4d %4d %5.1f %4c %4d%n",1,"황순근",33,44,55,158,33.3241,'A',23);
	}

}
