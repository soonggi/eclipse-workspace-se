
public class MemberField {
	/*
	 * 1-1. 멤버필드는 객체 생성 시 기본값으로 자동 초기화
	 */
	public int member1;
	public double member2;
	public char member3;
	public boolean member4;
	public String member5;
	
	public int member6;
	public double member7;
	public char member8;
	public boolean member9;
	public String member10;
	
	/*
	 * 1-2. 멤버필드는 객체 생성 시 초기값을 줄 수 있다.
	 */
	public int member11=123;
	public double member12=1.123213;
	public char member13='힣';
	public boolean member14=true;
	public String member15="문자열";
	
	public MemberField() {
	}

	public MemberField(int member1, double member2, char member3, boolean member4, String member5) {
		super();
		this.member1 = member1;
		this.member2 = member2;
		this.member3 = member3;
		this.member4 = member4;
		this.member5 = member5;
	}
}
