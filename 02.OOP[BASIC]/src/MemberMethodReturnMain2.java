class MemberMethodRe{
	
	public int method1() {
		System.out.println("method1");
		int result=1+2;
		
		return result;
	}
	
	public boolean method2() {
		System.out.println("method2");
		boolean married=true;
		
		return married;
	}
	public int add(int a, int b) {
		System.out.println("method3");
		int result = a+b;
		
		return result;
	}
}



public class MemberMethodReturnMain2 {

	public static void main(String[] args) {
		MemberMethodRe mm1 = new MemberMethodRe();
		int recv = mm1.method1();
		System.out.println(recv);
		
		boolean recv1 = mm1.method2();
		System.out.println(recv1);
		
		int result = mm1.add(100, 3000);
		System.out.println(result);

	}

}
