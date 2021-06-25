import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapMain {

	public static void main(String[] args) {
		HashMap carMap = new HashMap();
		System.out.println("map size: "+carMap.size());
		System.out.println("-----------1. put------------");
		Car c1=new Car("1111", 12);
		carMap.put("1111", c1);
		carMap.put("2222", new Car("2222", 13));
		carMap.put("3333", new Car("3333", 14));
		carMap.put("4444", new Car("4444", 17));
		carMap.put("5555", new Car("5555", 18));
		System.out.println("map size: "+carMap.size());
		System.out.println(carMap);
		/*
		 * 동일한(equals)키값은 존재하지 않음
		 * 키 객체가 동일하면 값 객체가 바뀐다
		 */
		carMap.put(new String("5555"), new Car("오오오오", 22));
		System.out.println("map size: "+carMap.size());
		System.out.println(carMap);
		
		System.out.println("-----------2. get------------");
		Car getCar = (Car)carMap.get("3333");
		getCar.print();
		
		System.out.println("-----------3. remove------------");
		Car removeCar = (Car)carMap.remove("3333");
		removeCar.print();
		System.out.println("map size:"+carMap.size());
		
		System.out.println("%%%%%%%%%%%%%%%%%업무실행%%%%%%%%%%%%%%%%%");
		System.out.println("1.전체 차량출력????");
		Iterator keyIter = carMap.keySet().iterator();
		while(keyIter.hasNext()) {
			String key = (String)keyIter.next();
			Car temp = (Car)carMap.get(key);
			temp.print();
		}
		
		System.out.println("2.입차");
		carMap.put("1234", new Car("1234", 11));
		
		System.out.println("3.차량번호 1111번  차한대 정보출력");
		Car tempcar=(Car)carMap.get("1111");
		tempcar.print();
		System.out.println("4.입차시간 15시이후 차량여러대 찾아서 정보출력???");
		
		Iterator keyIter2 = carMap.keySet().iterator();
		while(keyIter2.hasNext()) {
			String key=(String)keyIter2.next();
			Car temp=(Car)carMap.get(key);
			if(temp.getInTime()>=15) {
				temp.print();
			}
		}
		
		
		
		System.out.println("5555번차량 12시 출차");
		Car car=(Car)carMap.get("5555");
		car.setOutTime(12);
		car.calculateFee();
		car.getFee();
		
		
		System.out.println("######################iteration[전체출력]######################");
		Set keySet=carMap.keySet(); // key값을 뽑아내서 차 객체 출력
		System.out.println(keySet);
		Iterator keyIterator=keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = (String) keyIterator.next(); 
			System.out.println(key);
			Car tempCar = (Car)carMap.get(key);
			tempCar.print();
			
		}
		
	}

}
