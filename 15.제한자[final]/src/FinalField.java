
/*
제한자(final)
	1. 클래스앞에 붙일경우
	   상속금지 
       ex> public final class Test{}
    2. 멤버메쏘드앞에 붙일경우 
       오버라이딩 금지
       ex> public final void print(){}
    3. 멤버변수 앞에붙일경우--> 상수
       ex> public final int PORT_NUMBER=80;
       상수화된다.    
       변경금지
*/

public class FinalField {
	public final int PORT_NUMBER = 80;
	public final double INCETIVE_RATE;
	
	public final static int NOTRH = 0; // final과 static은 같이 사용한다.
	public final static int SOUTH = 1;
	public final static int EAST = 2;
	public final static int WEST = 3;
	
	
	public FinalField() {
		this.INCETIVE_RATE=0.1; // this. 생략 가능
	}

}
