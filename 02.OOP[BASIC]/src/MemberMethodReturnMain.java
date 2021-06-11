class MemberMethodReturn{
	int member1=56; // 멤버 변수(=클래스 블록 안에 바로 있음)
	int member2=89;
	
	public int method1() {
		System.out.println("------public int method1()------");
		int result=1+2;
		/*
		 return  << 호출한 클래스(객체)에게 반환할 값(변수, 리터럴, 연산의 결과) >>
		  - 호출한곳으로 실행흐름(쓰레드) 반환
		  - 호출한곳으로 데이타반환
		  - 반환할 데이타가없는 경우(void)에는 return문 생략가능하다 
		  - 반환할 데이타가있는 경우에는       return문 반드시 기술하여야 한다 
		 */
		return result;
	}
	public boolean method2() {
		System.out.println("---------public boolean method2()---------");
		boolean married = true;
		return married;
	}
	/*
	 * 두개의 정수를 매개변수로 받아서 더한 후 결과값을 반환
	 */
	public int add(int a,int b) {
		System.out.println("---------public int add(int a,int b)---------");
		int result = a+b;
		return result;
	}

	/*
	 * 객체의 멤버 변수 2개를 더한 결과 값을 반환
	 */	
	public int addMembers() {
		int result = this.member1+this.member2;
		return result;
	}
	/*
	 * 객체의 멤버필드 데이타를 반환해줌(getter)
	 */
	public int getMember1() {
		return this.member1;
	}
	public int getMember2() {
		return this.member2;
	}
	/*
	 * 객체의 멤버필드 데이타를 set해줌(setter)
	 */
	public void setMember1(int member1) {
		this.member1=member1;
		
	}
	public void setMember2(int member2) {
		this.member2=member2;
	}
	
}
public class MemberMethodReturnMain {

	public static void main(String[] args) {
		
		MemberMethodReturn mmr = new MemberMethodReturn();
		/*
		 public int method1()
		 */
		int recvData1 = mmr.method1();
		System.out.println("main block --> "+recvData1);
		/*
		 public boolean method2()
		 */
		boolean recvData2 = mmr.method2();
		System.out.println("main block --> recvData2: "+recvData2);
		/*
		 * public int add(int a,int b)
		 */
		int addResult = mmr.add(12, 789979);
		System.out.println("main block --> addResult: "+addResult);
		addResult=mmr.add(66, 1155);
		System.out.println("main block --> addResult: "+addResult);
		/*
		 * public int addMembers()
		 */
		System.out.println("-------------this를 사용하여서 멤버필드의 데이타를 더해서 반환-------------");
		int recvAddMembers = mmr.addMembers();
		System.out.println("main --> recvMembers: "+recvAddMembers);

		
		System.out.println("-------------멤버 변수의 데이타를 반환받기(getter)-------------------------");
		mmr.setMember1(333);
		mmr.setMember2(666);
		
		System.out.println("-------------멤버 변수의 데이타를 반환받기(getter)-------------------------");
		//int recvMember1 = mmr.member1;
		int recvMember1 = mmr.getMember1();
		System.out.println("recvMember1:"+recvMember1);
		int recvMember2 = mmr.getMember2();
		System.out.println("recvMember2:"+recvMember2);
		
	}

}
