package itwillweeklystudy;

//실행을 목적으로 작성된 클래스
public class MethodApp {
	public static void main(String[] args) {
		//객체 (인스턴스 - Instance)를 생성하여 참조변수에 저장
		Method method = new Method();
		
		//참조변수에 저장된 인스턴스의 메소드 호출
		method.print1();
		method.print2();
		method.print1();
		method.display();
		method.display2(80);
		
		method.display3(30, 70);
		method.display3(70, 30);
		
		//메소드 반환 값을 변수에 저장
		int su1=10; int su2=99;
		int tot = method.returnTot(su1, su2);
		System.out.println(su1+"~"+su2+" 합계 = "+tot);
		
		int su=10;
		/*
		boolean result = method.isOddEven(su);
		if(!result) {
			System.out.println(su+" = 홀수");
		}else {
			System.out.println(su+" = 짝수");
		}
		*/
		// if구문의 조건식 대신 논리값을 반환하는 메소드를 호출
		if(!method.isOddEven(su)) {
			System.out.println(su+" = 홀수");
		}else {
			System.out.println(su+" = 짝수");
		}
		
		method.displayInt(100);
		//메소드는 매개변수에 정상적인 값을 전달해야만 호출 가능
		//method.displayInt(false);
		method.displayBoolean(false);
		method.displayString("홍길동");
		
		//오버로드 선언된 메소드는 매개변수에 전달되는 값에 의해 메소드를 선택하여 호출
		// => 메소드 오버로드에 의한 다형성
		//다형성: 같은 이름의 메소드를 호출한 경우 상태에 따라 메소드를 선택하여 호출
		// => 메소드 오버로드와 메소드 오버라이드
		method.display(200);
		method.display(true);
		method.display("임꺽정");
		
		
	}

}
