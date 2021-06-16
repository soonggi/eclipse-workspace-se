/*
 * 오버라이딩(재정의)
 *   1. 상속관계에서 발생하는 메쏘드의 재정의 기법이다
 *   2. 자바의 다형성 기법중의하나이다.
 *   
 *   -형태 : 부모클래스에정의 된 메쏘드의 이름,리턴타입,인자가
 *          동일한 메쏘드를 자식클래스에 정의(재정의)하는것
 * 
 *   - ex> public class Super{
 *   			public void print(){
 *   			}		
 *   		}
 *        
 *        public class Sub extends Super{
 *        		public void print(){
 *        		}
 *        }
 * 
 */

class OverringParent {
	public void method1() {
		System.out.println("OverridingParent.method1()");
	}
	public void method2() {
		System.out.println("OverridingParent.method2()");
	}

}

class OverridingChild extends OverringParent{
	/*
	public void method1() {
		System.out.println("OverridingParent.method1()");
	}
	public void method2() {
		System.out.println("OverridingParent.method2()");
	}
	*/
	public void method2() {
		
		System.out.println("------------OverridingChild에서 재정의된 method2 start-------------");
		/*
		 * super(self 참조 변수)
		 * 		- this와 같은 self 참조 변수
		 * 		- this와 같은 주소를 가리킨다.
		 * 		- 재정의에 의해 은폐된 메쏘드를 호출할 때 사용
		 */
		super.method2();
		
		System.out.println("OverridingChild.method2() 2% 추가");
		System.out.println("------------OverridingChild에서 재정의된 method2 end---------------");
		/*
		 * 재정의하면
		 * 		- 상속받은 method2()는 은폐(호출안됨)
		 * 		- 자식에서 재정의한 method2() 만 호출된다.
		 */
	}
	public void method3() {
		System.out.println("OverridingChild.method3()");
	}
}



public class OverridingMain {

	public static void main(String[] args) {
		OverridingChild oc = new OverridingChild();
		oc.method1();
		oc.method2();
		oc.method3();

	}

}
