
public class Member {
	private int no;
	private String name;
	
	public Member() {
		
	}
	
	/*
	 * alt+shift+s + o --> enter
	 */
	public Member(int no, String name) {
		this.no = no;
		this.name = name;
	}
	public void print() {
		System.out.println(this+"-->"+no+","+name);
	}
	public void method(int a) {
		
		System.out.println("local variable a:"+a);
		int b=a+4;
		System.out.println("local variable b:"+b);
		
	}
	
	/*
	 * alt+shift+s + r --> enter
	 */
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
