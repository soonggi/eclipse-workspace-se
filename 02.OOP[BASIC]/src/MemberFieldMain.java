
public class MemberFieldMain {

	public static void main(String[] args) {

		/*
		 * 객체 생성 후 주소값이 반환되고 참조변수가 생성된 후 주소값 100이 대입
		 */
		MemberField mf1=new MemberField();
		/*
		 * 객체의 참조변수 mf1의 주소값을 100을 사용해서 멤버필드에 데이타 대입
		 * 멤버필드 접근 방법 --> 참조변수(주소).필드이름=값;
		 * ex) mf1.member1 = 12;
		 */
		mf1.member1=12;
		mf1.member2=89.890;
		mf1.member3='꿈';
		mf1.member4="문자열1";
		
		MemberField mf2=new MemberField();
		mf2.member1=123123;
		mf2.member2=232.222;
		mf2.member3='끝';
		mf2.member4="슈트링";
		/*
		 * 객체의 필드값 출력
		 */
		System.out.println("--------------mf1(!00)---------------");
		System.out.println(mf1);
		System.out.println(mf1.member1);
		System.out.println(mf1.member2);
		System.out.println(mf1.member3);
		System.out.println(mf1.member4);
		System.out.println("--------------mf2(!00)---------------");
		System.out.println(mf2);
		System.out.println(mf2.member1);
		System.out.println(mf2.member2);
		System.out.println(mf2.member3);
		System.out.println(mf2.member4);
		
		
	}

}
