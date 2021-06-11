
public class CarFactoryStaticMain {

	public static void main(String[] args) {
		Car.count=10; // 차량의 총 생산 대 수 시작점
		
		Car c1 = new Car(1, "GENESIS", "BLACK");
		Car c2 = new Car(2, "VOLVO", "RED");
		Car c3 = new Car(3, "BENZ", "WHITE");
		
		Car.headerPrint();
		c1.print();
		c2.print();
		c3.print();
		
		System.out.println("차량생산대수 : " +Car.count);

	}

}
