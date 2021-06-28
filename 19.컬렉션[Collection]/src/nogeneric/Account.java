package nogeneric;

public class Account {
	/*
	 * 멤버필드
	 */
	private int no;//계좌번호
	private String owner;//계좌주
	private int balance;//잔고
	private double iyul;//이율
	
	/*
	 * 생성자
	 */
	/**
	 * 기본값으로 초기화된 계좌객체 생성
	 */
	public Account() {   //형태 접근제한자(public) 클래스 이름(Account)
		// TODO Auto-generated constructor stub
	}
	/**
	 * 매개변수값으로 초기화된 계좌 객체 생성
	 * @param no 계좌번호
	 * @param owner 계좌주
	 * @param balance 잔고
	 * @param iyul 이율
	 */
	public Account(int no, String owner, int balance, double iyul) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
	}
	
	/*
	 * 멤버메쏘드
	 */
	//계좌 데이터를 set하는 메쏘드
	public void setAccountData(int no, String owner, int balance, double iyul) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
	}
	//입금
	public void deposit(int m) {
		this.balance+=m;
	}
	
	//출금
	public void withDraw(int m) {
		//this.balance-=m;
		this.balance=this.balance-m;
	}
	public static void headerPrint() {
		System.out.printf("%s%n","--------------------------------");
		System.out.printf("%s %s %s %s%n","번호","이름","잔고","이율");
		System.out.printf("%s%n","--------------------------------");
	
	}
	public void print() {
		
		System.out.printf("%d %s %d %4.1f %n",this.no,this.owner,this.balance,this.iyul);
	}
	
	
	
	/*
	@Override
	public String toString() {
		return "("+no+" "+owner+" "+balance+" "+iyul+")";
	}
	*/
	// getter method
	public int getBalance() {
		return this.balance;
	}
	
	// setter method
	public void setIyul(double iyul) {
		this.iyul=iyul;
	}
	// getter, setter
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public double getIyul() {
		return iyul;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	
	
}
