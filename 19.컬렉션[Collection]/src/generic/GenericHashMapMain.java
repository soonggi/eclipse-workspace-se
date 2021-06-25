package generic;

import java.util.HashMap;
import java.util.Iterator;

public class GenericHashMapMain {

	public static void main(String[] args) {
		HashMap<String, Car> carMap=new HashMap<String, Car>();
		System.out.println("#Map size: " + carMap.size());
		System.out.println("----------------1.put----------------");
		carMap.put("1111", new Car("1111", 12));
		carMap.put("2222", new Car("2222", 13));
		carMap.put("3333", new Car("3333", 15));
		carMap.put("4444", new Car("4444", 17));
		carMap.put("5555", new Car("5555", 19));
		System.out.println("#Map size: " + carMap.size());
		System.out.println(carMap);
		carMap.put("3333", new Car("삼삼삼삼", 15));
		System.out.println("#Map size: " + carMap.size());
		System.out.println(carMap);
		
		System.out.println("----------------2.get----------------");
		Car getCar = carMap.get("3333");
		getCar.print();
		getCar=carMap.get("5555");
		getCar.print();
		getCar=carMap.get("9999");
		if(getCar!=null) {
			getCar.print();
		}
		
		System.out.println("----------------3.remove----------------");
		Car removeCar = carMap.remove("3333");
		removeCar.print();
		System.out.println("#Map size: " + carMap.size());
		System.out.println(carMap);
	
		System.out.println("%%%%%%%%%%%%%%%%%업무실행%%%%%%%%%%%%%%%%%");
		System.out.println("1.전체 차량출력????");
		Iterator<String> keyIterator=carMap.keySet().iterator(); // key 값이 String 이니까 <String>
		Car.headerPrint();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Car tempCar = carMap.get(key);
			tempCar.print();
			
		}
		
		System.out.println("2.입차");
		Car c1 = new Car("1234", 22);
		carMap.put(c1.getNo(), c1);
		System.out.println("#Map size: " + carMap.size());
		System.out.println(carMap);
		
		System.out.println("3.차량번호 1234번 차 한대 정보 출력");
		Car getCar2=carMap.get("1234");
		getCar2.print();
		
		System.out.println("4.입차시간 15시 이후 차량 여러대 정보 출력");
		Iterator<String> keyIterator2 = carMap.keySet().iterator();
		while (keyIterator2.hasNext()) {
			String key = keyIterator2.next();
			Car tempCar = carMap.get(key);
			if(tempCar.getInTime()>=15) {
				tempCar.print();
			}
		}
	
		System.out.println("5. 2222번 차량 12시 출차");
		Car outCar = carMap.get("2222");
		outCar.setOutTime(20);
		outCar.calculateFee();
		outCar.print();
		
		carMap.remove("2389");
		System.out.println("#Map size: " + carMap.size());
		System.out.println(carMap);
	
	}

}
