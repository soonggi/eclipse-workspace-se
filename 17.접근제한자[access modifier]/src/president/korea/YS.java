package president.korea;

import president.america.Biden;

public class YS {
	public int member1;
	protected int member2;
	int member3;
	private int member4;
	
	public void method1() {
		System.out.println("YS.method1()");
	}
	protected void method2() {
		System.out.println("YS.method2()");
	}
	void method3() {
		System.out.println("YS.method3()");
	}
	private void method4() {
		System.out.println("YS.method4()");
	}
	
	public void access() {
		/**********************YS같은패키지********************/
		DJ dj=new DJ();
		dj.member1=1;
		dj.member2=2;
		dj.member3=3;
		//dj.member4=4; <<The field DJ.member4 is not visible>>
		dj.method1();
		dj.method2();
		dj.method3();
		//dj.method4(); <<The method method4() from the type DJ is not visible>>
		
		/**********************YS다른패키지********************/
		Biden biden=new Biden();
		biden.member1=1;
		/*
		biden.member2=2;
		biden.member3=3;
		biden.member3=4;
		*/
		biden.method1();
		/*
		biden.method2();
		biden.method3();
		biden.method4();
		*/
	}
}