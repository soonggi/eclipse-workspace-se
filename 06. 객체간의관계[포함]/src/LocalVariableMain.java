
public class LocalVariableMain {

	public static void main(String[] args) {
		/*
		 * 지역변수(local variable)
		 * 		- 메쏘드 블록 안에서 선언된 변수(매개변수)
		 * 		- 초기화가 반드시 이루어져야함
		 * 멤버필드(변수)
		 * 		- 클래스 블록 안에 선언된 변수
		 */
		int a = 9;
		int b = 13;
		
		int t=a;
		a=b;
		b=t;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		/*
		 * << The local variable tot may not have been initialized >>
		 * 로컬변수 초기화 안하고 사용 불가
		 
		int tot;
		boolean condition = true;
		if(condition) {
			tot=0;
		}
		System.out.println(tot);
		*/
		
		
		//The local variable m may not have been initialized
		
		Member m=null;
		
		if(m==null) {
			m=new Member(100, "백");
			
		}
		m.print();
		m.method(11);
		
	}

}
