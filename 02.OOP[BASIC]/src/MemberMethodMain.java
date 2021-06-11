/*
 * 멤버메쏘드 선언
 *			접근 제한자 리턴 타입 메쏘드이름(매개변수){
 *				- 매개변수 : 나를 호출한 클래스(객체)이 데이타를 넣어줄 통로
 *				- 리턴타입 : 나를 호출한 클래스(객체)에게 반환할 데이터 타입
 *					void --> 줄 데이터가 없는 경우
 *			} 
 *			ex) public int test(int a){
 *
 *				}
 */
class MemberMethod {
	public int member1=88;
	public int member2=99;
	
	public void method1() {
		System.out.println("------method1()------");
		System.out.println("void method1()실행1");
		System.out.println("void method1()실행2");
		/*
		 * - 모든 메쏘드의 마지막에는 항상 실행흐름을 호출한 곳(클래스, 객체)으로 반환
		 * - return문을 만나면 호출한곳으로 반환된다
		 * - return type이 void인 경우에는 생략이 가능하다.
		 * - return문이 생략된 경우에는 자동 return 된다
		 */
		return;
	}
	public void method2() {
		System.out.println("------method2()------");
		System.out.println("void method2()실행1");
		System.out.println("void method2()실행2");
		System.out.println("void method2()실행3");
		return;
	}
	public void method3(int count) { // << int 데이터를 외부로부터 데이터를 받겠다는 뜻
		int localVar = 1111;
		System.out.println("---------------void method3(int count)---------------");
		System.out.println("method3 블록 안에서 선언된 변수 -->"+localVar);
		for(int i=0;i<count;i++) {
			
			System.out.println("void method3(int count)실행 파라메타(매개변수) count 값-->"+count);
		}
		return;
	}
	public void method4(String msg,int count) {
		System.out.println("---------------void method4(String msg,int count)---------------");
		System.out.println("msg:"+msg);
		System.out.println("count:"+count);
		for (int i = 0; i < count; i++) {
			System.out.println(msg);
			
		}
		return;
	}
	
	public void method5(String name, String msg, int count) {
		System.out.println("---------------void method5(String name, String msg, int count)---------------");
		for (int i = 0; i < count; i++) {
			System.out.printf("%s님 %s%n",name,msg);
		}
		return;
	}
	
	
	/*
	 * 멤버 변수 출력하는 기능
	 */
	public void print() {
		/*
		 * this // 셀프참조변수
		 * 	- self 참조 변수
		 * 	- print 메쏘드를 가지고 있는 객체의 주소값
		 */
		System.out.println(this.member1);
		System.out.println(this.member2);
	}

}

public class MemberMethodMain {
	public static void main(String[] args) {
		MemberMethod mm1=new MemberMethod();
		
		System.out.println(mm1.member1);
		System.out.println(mm1.member2);
		mm1.member1=2147483647;
		mm1.member2=-2147483648;
		System.out.println("main stmt1");
		
		/*
		 * 멤버메쏘드 실행(호출)
		 * 	- 형식: 참조변수.메쏘드이름();
		 * 	- mm객체의 method1 메쏘드 블록을 실행하기 위해
		 * 	  main 실행 흐름을 method1 블록으로 보낸다.
		 */
		mm1.method1();
		System.out.println("main stmt2");
		mm1.method2();
		System.out.println("main stmt3"); 
		/*
		 MemberMethod 클래스
		  	public void method3(int count)
		 */
		System.out.println("----------------매개변수(파라메타)를 사용한 호출----------------");
		mm1.method3(1);
		mm1.method3(2);
		/*
		 MemberMethod 클래스
		  	public void method4(String msg,int count)
		 */
		mm1.method4("메세지1",3);
		mm1.method4("메세지2",2);
		/*
		 MemberMethod 클래스
		  	public void method5(String name, String msg, int count)
		 */
		mm1.method5("김경호", "안녕하세요", 2);
		mm1.method5("김순근", "뭐하세요", 3);
		mm1.method5("박순근", "잘가세요", 1);
		
		
		
		
		
		
		return;
	}

}