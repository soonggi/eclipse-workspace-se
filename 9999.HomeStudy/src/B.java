/*
1.A 라는 이름의 클래스작성
	1-1. A 클래스안에 멤버변수 x,y  2개선언(정의) 
        1-2. A 클래스안에 멤버메쏘드 m1,m2 2개선언(정의)
	       - 멤버메쏘드내용은 System.out.println("m1호출");	 
			      System.out.println("m2호출");	 
			      
2.AMain 이라는 이름의 클래스작성
	2-1.AMain 클래스에 메인메쏘드 작성(생성)
		2-1-1.메인메쏘드에 코드작성
              - A객체생성
	      - A객체멤버변수2개에 값대입
              - A객체멤버변수2개의 값출력
	      -	A객체멤버메쏘드2개호출(m1,m2)	


3.객체그래프를 그리고 주실행흐름을 표시하세요
*/

public class B {
	public int x,y;
	public void m1() {
		System.out.println("m1호출");
	}
	public void m2() {
		System.out.println("m2호출");
	}

}
