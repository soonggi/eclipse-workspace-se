
public class Car2Main {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2();
		
		c1.setIpCahDate("1212", 12);
		c2.setIpCahDate("2222", 14);
		
		c1.ouTime(18);
		c2.ouTime(22);
		
		c1.calculateFee();
		c2.calculateFee();
		
		c1.print();
		c2.print();

	}

}
