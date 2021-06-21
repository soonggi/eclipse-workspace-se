
/*
제한자(final)
	1. 클래스앞에 붙일경우
	   상속금지 
       ex> public final class Test{}
    2. 멤버메쏘드앞에 붙일경우 
       오버라이딩 금지
       ex> public final void print(){}
    3. 멤버필드 앞에붙일경우--> 상수
       ex> public final int PORT_NUMBER=80;
       상수화된다.    
       변경금지
*/

public class FinalField {
	public final int PORT_NUMBER = 80;
	public final double INCETIVE_RATE;
	
	public final static int NORTH = 0; // final과 static은 같이 사용한다.
	public final static int SOUTH = 1;
	public final static int EAST = 2;
	public final static int WEST = 3;
	
	
	public FinalField() {
		this.INCETIVE_RATE=0.1; // this. 생략 가능
		
		//The final field FinalField.PORT_NUMBER cannot be assigned
		//this.PORT_NUMBER=8080;
		//The final field INCETIVE_RATE may already have been assigned
		//this.INCETIVE_RATE=0.2;
		System.out.println(this.INCETIVE_RATE);
		System.out.println(this.PORT_NUMBER);
		
		/*
		<<The final field FinalField.NORTH cannot be assigned>> 
		FinalField.SOUTH = 2;
		FinalField.NORTH = 1;
		 */
		
		System.out.println(FinalField.EAST);
		System.out.println(FinalField.WEST);
		System.out.println(FinalField.SOUTH);
		System.out.println(FinalField.NORTH);
	}
	public void move(int direction) {
		switch (direction) {
		case FinalField.NORTH:
			System.out.println("move north");
			break;
		case FinalField.SOUTH:
			System.out.println("move south");
			break;
		case FinalField.WEST:
			System.out.println("move west");
			break;
		case FinalField.EAST:
			System.out.println("move east");
			break;
		}
	}

}
