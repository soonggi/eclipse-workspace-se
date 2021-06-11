class MemberMeth{
	public int member1=99;
	public int member2=99;
	
	public void method1() {
		System.out.println("method1실행");
	}
	
	public void method2() {
		System.out.println("method2 실행");
	}
	public void method3(int count) {
		System.out.println("method3 실행");
		for(int i=0;i<count;i++) {
			System.out.println(count);
		}
	}
	public void method4(String msg, int count) {
		System.out.println("method4 실행");
		for(int i=0;i<count;i++) {
			System.out.println(msg + count);
		}
	}
	public void method4(String name, int count, String msg) {
		System.out.println("method5 실행");
		for (int i = 0; i < count; i++) {
			System.out.println(name+msg);
			
		}
	}
}




public class MemberMethodMain2 {

	public static void main(String[] args) {
		MemberMeth mm1 = new MemberMeth();
		mm1.member1 = 22;
		System.out.println(mm1.member1);
		
		
		mm1.method1();
		mm1.method2();
		mm1.method3(1);
		mm1.method3(2);
		mm1.method4("Zz", 2);
		mm1.method4("김순근", 2, "바보");

	}

}
