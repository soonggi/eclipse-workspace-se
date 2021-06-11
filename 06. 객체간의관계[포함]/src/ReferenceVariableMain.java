
public class ReferenceVariableMain {

	public static void main(String[] args) {
		
		System.out.println("---------값 swap----------");
		int score1 = 90;
		int score2 = 88;
		System.out.println("score1:"+score1);
		System.out.println("score2:"+score2);
		int tempScore = score1;
		score1 = score2;
		score2 = tempScore;
		System.out.println("score1:"+score1);
		System.out.println("score2:"+score2);
		
		System.out.println("---------주소비교----------");
		Member memberOne = new Member(1111, "일일일일");
		Member memberTwo = new Member(2222, "이이이이");

		Member memberThree=memberOne;
		if(memberOne!=memberTwo) {
			System.out.println(memberOne+"!="+memberTwo);
		}
		if(memberOne==memberThree) {
			System.out.println(memberOne+"=="+memberThree);
		}
		
		System.out.println("---------주소교환----------");
		Member m1 = new Member(1000, "김김김");
		Member m2 = new Member(2000, "리리리");
		System.out.println("---------주소교환 전----------");
		m1.print();
		m2.print();
		
		Member tempMember = m1;
		m1 = m2;
		m2 = tempMember;
		System.out.println("---------주소교환 후----------");
		m1.print();
		m2.print();
		
		System.out.println("--------기본형 변수값 초기화---------");
		int tot = 0;
		double avg=0.0;
		boolean isMarried=false;
		System.out.println("--------참조형 변수값 초기화---------");
		
		Member m3=null;
		/*
		 null : 객체주소 리터럴(값) 
		 	  - 주소 없다라는 의미의 값
		 	  - 객체 주소값 초기화의 용도로 사용
		 	  - null 값은 비교가능
		 */
		
		//null 주소 사용 시 NullPointerException 발생
		if(m3==null) {
			m3=new Member(3000, "삼삼삼");
		}
		m3.print();
		
	}

}
