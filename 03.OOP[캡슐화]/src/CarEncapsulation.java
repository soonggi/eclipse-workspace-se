
public class CarEncapsulation {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setIpChaDate("1244", 12);
		Car car2 = new Car();
		car2.setIpChaDate("4124", 14);
		//4시간 후
		
		car1.setOutTime(20);
		car2.setOutTime(20);
		
		car1.calculateFee();
		car2.calculateFee();
		
		car1.print();
		car2.print();
		System.out.println();
		
		/*
		 * car1 주차 요금 반환
		 */
		int car1fee = car1.getFee();
		System.out.println("car1fee:"+car1fee);
		
		

	}

}
