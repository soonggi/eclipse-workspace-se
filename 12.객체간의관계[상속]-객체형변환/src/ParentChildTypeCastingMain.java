/*
 객체의 형변환
   1. 부모자식관계에있는 클래스 틀에서만 가능하다.
   		ex) 자식 타입 객체의 주소를 부모 타입 객체의 주소로 형변환(주소 변경 안됨, 타입만 변경 가능)
   		ex) 부모 타입 객체의 주소를 자식 타입 객체의 주소로 형변환(주소 변경 안됨, 타입만 변경 가능)
   
   2. 자식객체 타입의 주소를 부모 클래스 타입으로 형변환
       - 자동으로 이루어진다(묵시적)
       Child c = new Child();
       Parent pppp = c; 
   3. 부모 객체를 자식클래스타입으로 형변환
       - 원칙적으로는 불가능하다
       - 부모의 탈을쓴 자식객체 는 가능하다.
       Parent p=new Parent();
       Child cccc = p;(X)
    public class Parent{}
    public class Child extends Parent{}
 */
class Parent{
	public void method1() {
		System.out.println("Parent.method1()");
	}
	public void method2() {
		System.out.println("Parent.method2()");
	}
	public void method3() {
		System.out.println("Parent.method3()");
	}
	public void method4() {
		
	}
	public void method5() {
		
	}
	
}
class Child extends Parent{
	
	public void method4() {
		System.out.println("Child.method4()");
	}
	public void method5() {
		System.out.println("Child.method5()");
	}
	
}

public class ParentChildTypeCastingMain {

	public static void main(String[] args) {
		System.out.println("-------------Child-->Parent--------------");
		Child c1 = new Child();
		
		c1.method1();
		c1.method2();
		c1.method3();
		c1.method4();
		c1.method5();
		
		//2. 자식객체 타입의 주소를 부모 클래스 타입으로 형변환
		Parent p1 = c1;
		
		p1.method1();
		p1.method2();
		p1.method3();
		/*
		p1.method4();
		p1.method5();
		*/
		
		System.out.println("-------------Parent-->Child--------------");
		/*
		3. 부모 객체를 자식클래스타입으로 형변환
	       - 원칙적으로는 불가능하다
	       - 부모의 탈을쓴 자식객체 는 가능하다.
	    */
		Parent p2 = new Parent();
		/*
		 * << compile error >>
		 * Type mismatch: cannot convert from Parent to Child
		 * Child c2 = p2;
		 */
		
		/*
		 * 강제형변환 시 compile은 가능하나 실행 시 예외 발생
		 * - java.lang.ClassCastException: class Parent cannot be cast to class Child
		 * Child c2 = (Child)p2;
		 */
		
		/*
		 * 부모의 탈을 쓴 자식객체는 생성 가능
		 */
		
		Parent p3 = new Child(); // p3는 child type 객체로 생성됨
		Child c3 = (Child)p3;
		
		
		System.out.println("-------------재정의--------------");
		Parent p4 = new Child();
		p4.method1();
		p4.method2();
		p4.method3(); 
		p4.method4(); // 재정의된 메쏘드는 호출 가능 Child.method4()
		p4.method5();

	}

}
