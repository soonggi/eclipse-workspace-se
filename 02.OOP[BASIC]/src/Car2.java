
public class Car2 {

	
	// 멤버 필드(변수) 선언
	public String no;
	public int inTime;
	public int ouTime;
	public int fee;
	
	// 멤버 메쏘드
	
	public void setIpCahDate(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
		
	}
	public void ouTime(int ouTime) {
		this.ouTime = ouTime;
	}
	
	public void calculateFee() {
		this.fee = (this.ouTime-this.inTime)*1000;
	}
	public void print() {
		System.out.println(this.no+this.inTime+this.ouTime+this.fee);
	}
}
