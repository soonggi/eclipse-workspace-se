class Parent extends Object{
	public int member1;
	public int member2;
	public Parent() {
		/*
		 * - 클래스 생성자 첫번째 라인에서는 반드시 부모의 
		 *   생성자(디폴트)가 반드시 호출되어야 한다.
		 * - 생략 시 부모의 디폴트 생성자가 자동호출된다.
		 */
		super(); // Object클래스 기본 생성자
		System.out.println("2. Parent()디폴트 생성자");
	}
	
	public Parent(int member1, int member2) {
		super();
		this.member1 = member1;
		this.member2 = member2;
		System.out.println("2. Parent(int member1, int member2) 생성자 호출");
	}
	public void print() {
		System.out.print(this.member1+"\t"+this.member2+"\t");
	}

	public void method1() {
		System.out.println("Parent.method1()");
	}
	
	public void method2() {
		System.out.println("Parent.method2()");
	}

	public int getMember1() {
		return member1;
	}

	public void setMember1(int member1) {
		this.member1 = member1;
	}

	public int getMember2() {
		return member2;
	}

	public void setMember2(int member2) {
		this.member2 = member2;
	}
	
}

class Child extends Parent{
	public int member3;
	public Child() {
		/*
		 * - 클래스 생성자 첫번째 라인에서는 반드시 부모의 
		 *   생성자(디폴트)가 반드시 호출되어야 한다.
		 * - 생략 시 부모의 디폴트 생성자가 자동호출된다.
		 */
		super(); // Object클래스 기본 생성자
		System.out.println("3. Child()디폴트 생성자");
	}
	public Child(int member1, int member2, int member3) {
		/**********case1******
		캡슐화 되었을 때 출력 할 수 있는 case
		
		this.setMember1(member1);
		this.setMember2(member2);
		**********************/
		/********case2********
		super(member1, member2);
		**********************/
		
		this.member1=member1;
		this.member2=member2;
		this.member3=member3;
		System.out.println("3. Child(int member1, int member2, int member3) 생성자 호출");
	}
	
	public void method3() {
		System.out.println("Child.method3()");
	}
	public void print() {
		super.print(); // Parent 클래스의 print 메소드를 super 사용해서 호출
		System.out.println(this.member3);
	}
	
}

public class ParentChildMain {

	public static void main(String[] args) {
		System.out.println("---------Child()---------");
		Child c1 = new Child();
		System.out.println("----------Child(int member1, int member2, int member3)--------");
		Child c2 = new Child(1,2,3);
		
		c2.print();

	}

}
