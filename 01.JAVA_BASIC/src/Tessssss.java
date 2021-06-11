
public class Tessssss {

	public static void main(String[] args) {
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크
		 * 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.

		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */


		/*
		- 출력포맷
		  - 평균은 소수점이하 2째자리수에서 반올림하세요(%f)
		  - 석차는 구하지마세요
		--------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1   김경호   42   56   78   334  34.8  A   3  
		 2   김경수   45   53   76   334  34.8  A   2  
		-----------------------------------------------
		*/
		
		//변수 선업
		int number1, number2;
		int kor1, kor2;
		int eng1, eng2;
		int math1, math2;
		int sum1, sum2;
		double avg1, avg2;
		char grd1, grd2;
		String name1, name2;
		
		//변수 값 기입
		number1 = 1; number2 = 2;
		kor1 = 42; kor2 = 21; 
		eng1 = 56; eng2 = 34; 
		math1 = 78; math2 = 76;
		name1 = "김경호"; name2 = "김경수";
	
		//점수 유효성 검사
		if((kor1<0||kor1>100)||(eng1<0||eng1>100)||(math1<0||math1>100)) {
			System.out.printf("%s 학생의 점수가 유효하지 않습니다.", name1);
			return;
		}
				
		if((kor2<0 || kor2>100)||(eng2<0 || eng2>100)||(math2<0 || math2>100)) {
			System.out.printf("%s 학생의 점수는 유효하지 않습니다.%n",name2);
			return;
		}
		
		//평균 구하기 소수점 2번째 자리에서 반올림
		sum1 = kor1+eng1+math1;
		sum2 = kor2+eng2+math2;
		
		avg1 = ((int)(sum1/3.0*100 + 4))/100.0;
		/*
		 * sum1/3.0 = 58.6666
		 * 58.6666*100 = 5866.66
		 * 5866.66 + 4 = 5870.6666
		 * 5870.6666을 int 변환 해주고 /100.0으로 다시 나누면
		 * 58.7이 된다
		 */
		avg2 = ((int)(sum2/3.0*100 + 4))/100.0;

		//평점 구하기 점수대별 구분
		
		if(avg1>=80) {
			grd1 = 'A';
		}else if(avg1>=60) {
			grd1 = 'B';
		}else if(avg1>=40) {
			grd1 = 'C';
		}else {
			grd1 = 'D';
		}
		
		if(avg2>=80) {
			grd2 = 'A';
		}else if(avg1>=60) {
			grd2 = 'B';
		}else if(avg1>=40) {
			grd2 = 'C';
		}else {
			grd2 = 'D';
		}
		
		System.out.println("--------------학생 성적출력-------------------");
		System.out.println("학번 이름 국어 영어 수학 총점 평균 평점 석차");
		System.out.println(number1+"  "+name1+"  "+kor1+"  "+eng1+"  "+math1+"  "+sum1+"  "+avg1+"  "+grd1+"  1");
		System.out.println(number2+"  "+name2+"  "+kor2+"  "+eng2+"  "+math2+"  "+sum2+"  "+avg2+"  "+grd2+"  2");
		System.out.println("----------------------------------------------");
		
	}

}
