/*
		논리연산자
		   - 형태:   ||(Logical OR) , && (Logical AND) ( |,& )
		   - 좌우측의항이 논리형 변수(or 리티럴)이다.
           - 결과도 논리형데이타이다.
		    ex> true || false, false && false

*/

public class OperatorLogical {

	public static void main(String[] args) {
		boolean b1,b2,b3,b4;
		b1=true;
		b2=true;
		b3=false;
		b4=false;
		
		boolean result;
		
		/*
		 * 논리합(logical or) ||
		 * 
		 *  --> false||false 인 경우에만 false를 변환
		 */
		result = b3 || b4;
		System.out.println("false || false --> " +result);
		/*
		 * 논리곱(logical and) &&
		 *  
		 *  --> true||true 인 경우에만 true를 반환
		 */
		result = b1 && b2;
		System.out.println("trut && true --> " +result);
	
		System.out.println("------------------------------");
		int kor = 95;
		int math = 23;
		System.out.println("---------A대학 국어, 엉어중에서 1과목만 90점 이상 합격---------");
		boolean isPass1 = (kor>=90) || (math>=90);
		System.out.println("A대학 합격여부(||): " +isPass1);
		System.out.println("---------B대학 국어, 엉어 모두 90점 이상 합격---------");
		boolean isPass2 = (kor>=90) && (math>=90);
		System.out.println("B대학 합격여부(&&): " +isPass2);
		
		System.out.println("---------점수의 유효성체크(0~100)---------");
		int eng = 78;
		boolean isValid = eng>=0 && eng<=100;
		System.out.println("유효한 점수 여부: " +isValid);
		System.out.println("---------배수판별---------");
		int number=12;
		
		boolean bb1 = number%3==0;
		boolean bb2 = number%4==0;
		boolean bb3 = bb1 && bb2;
		System.out.println("3의 배수 여부: " +bb1);
		System.out.println("4의 배수 여부: " +bb2);
		System.out.println("3과 4의 공배수 여부: " +bb3);
		
		/*
		 * Quiz: 윤년여부판단
		 * 		- 4의 배수(4로 나누어 떨어지는 수)이면서 100의 배수가 아닌 수(100로 나누어 떨어지지 않는 수)이거나
		 * 		- 400의 배수(400로 나누어 떨어지는 수)
		 */
		
		int y=2021;
		boolean isLeapYear=true;
		System.out.println(y+"의 윤년 여부 " + isLeapYear);
		
		boolean yy1 = y%4==0;
		boolean yy2 = y%100!=0;
		boolean yy3 = y%400==0;
		boolean yy4 = yy1 && yy2 && yy3;
		System.out.println("4의 배수 여부: " +yy1);
		System.out.println("100의 배수가 아닌 여부: " +yy2);
		System.out.println("400의 배수 여부: " +yy3);
		System.out.println(y+"의 윤년 여부: " +yy4);
	}

}
