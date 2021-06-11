
public class CarConstructorMain {

	public static void main(String[] args) {
		System.out.println("-------------차량입차출차--------------");
		Car c1 = new Car("1234", 12);
		c1.setOutTime(14);
		c1.calculateFee();
		c1.headerPrint();
		c1.print();
		
		Car c2 = new Car();
		c2.setIpChaDate("3344", 15);
		c2.setOutTime(20);
		c2.calculateFee();
		c2.headerPrint();
		c2.print();
		
		System.out.println("--------오늘주차장이용차량출력---------");
		Car ca=new Car("1455", 1, 2, 2000);
		Car cb=new Car("3344", 3, 5, 2000);
		Car cc=new Car("4455", 5, 7, 2000);
		Car cd=new Car("5566", 7, 9, 2000);
		Car ce=new Car("6677", 9, 11, 2000);
		Car cf=new Car("7788", 11, 13, 2000);
		ca.headerPrint();
		ca.print();
		cb.print();
		cc.print();
		cd.print();
		ce.print();
		cf.print();
		

	}

}
