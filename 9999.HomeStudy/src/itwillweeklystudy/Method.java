package itwillweeklystudy;

//객체 생성이 목적인 클래스
public class Method {
	void print1() {
		System.out.println("Method 클래스의 print1() 메소드 호출");
	}
	
	void print2() {
		System.out.println("Method 클래스의 print2() 메소드 호출");
	}

	void display() {
		int tot=0;
		for (int i = 1; i <=100 ; i++) {
			tot+=i;
		}
		System.out.println("1~100 범위의 정수들의 합계:"+tot);
	}
	void display2(int num) {
		int tot=0;
		for (int i = 1; i <= num ; i++) {
			tot+=i;
		}
		System.out.println("1~"+num+"범위의 정수들의 합계:"+tot);
	}
	void display3(int num1, int num2) {
		if(num1>num2) {
			System.out.println("[에러] 첫번째 전달 값이 두번째 전달 값 보다 작아야됩니다.");
			return; // 메소드 종료
		}
		int tot=0;
		for (int i = num1; i <= num2 ; i++) {
			tot+=i;
		}
		System.out.println(num1+"~"+num2+"범위의 정수들의 합계:"+tot);
	}
	int returnTot(int num1, int num2) {
		int tot=0;
		for (int i = num1; i <= num2 ; i++) {
			tot+=i;
		}
		return tot; // 값을 반환하며 메소드 종료 - 메소드의 반환형과 자료형이 동일해야함
	}
	
	
	boolean isOddEven(int num) {
		//매개변수로 전달받은 정수값을 비교하여 홀수인 경우 false, 짝수인 경우 true 반환
		if(num%2!=0) {
			return false;
		}else {
			return true;
		}
	}
	
	void displayInt(int param) {
		System.out.println("정수값 = " +param);
	}
	
	void displayBoolean(boolean param) {
		System.out.println("논리값 = "+param);
	}
	
	void displayString(String param) {
		System.out.println("문자열 = "+param);
	}

	//메소드 오버로드(Method Overload)
	// => 메소드의 이름이 같고 매개변수의 자료형 또는 갯수를 다르게 선언하는 메소드
	// => 매개변수가 다르지만 동일한 기능을 제공하는 메소드는 오버로드 선언을 권장
	// => 메소드의 반환형은 오버로드와 아무런 상관 없다
	void display(int param) {
		System.out.println("정수값 = " +param);
	}
	
	void display(boolean param) {
		System.out.println("논리값 = "+param);
	}
	
	void display(String param) {
		System.out.println("문자열 = "+param);
	}

}
