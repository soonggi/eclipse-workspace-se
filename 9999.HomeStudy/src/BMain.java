
public class BMain {

	public static void main(String[] args) {
		B A = new B();
		A.x=10;
		A.y=20;
		
		System.out.println("B객체의 x의 값 = "+A.x+"\n"+"B객체의 y의 값 = "+A.y);
		
		A.m1();
		A.m2();
		

	}

}
