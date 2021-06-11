
public class CarFactoryMain {

	public static void main(String[] args) {
		
		/*
		Engine x6Engine = new Engine();
		x6Engine.type="A";
		x6Engine.cc=5000;
		
		Car car1 = new Car();
		car1.no=1;
		car1.model="X6";
		car1.engine = x6Engine;
		*/
		
		
		Engine sm7Engine = new Engine("C", 3000);
		Car sm7Car = new Car(2, "SM7",sm7Engine);
		
		//sm7Car.setNo(2);
		//sm7Car.setModel("sm7");
		//sm7Car.setEngine(sm7Engine);
		sm7Car.print();
		
	}

}
