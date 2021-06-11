
public class Test {
	
	int memberField1;
	String memberField2;
	double mebBerField3;
	
	public void method1() {
		System.out.println("method1()실행");
	}
	public void method2() {
		System.out.println("method1()실행");
	}
	public void method3() {
		System.out.println("method1()실행");
	}
	
	
	
	private int a;
	private int b;
	private int c;
	
	public void setA(int a) {
		this.a=a;
		
	}
	public void setB(int b) {
		this.b=b;
	}
	public void setF(int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public void print() {
		System.out.println(this.a + this.b + this.c);
	}
	
}
	


