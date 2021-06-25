package com.itwill05.service.car;

public class CarServiceMain {
	public static void main(String[] args) {
		CarService carService=new CarService();
		System.out.println("0.CarService객체야 차객체인자로줄께 입차시켜줘");
		carService.ipCha(new Car("1234", 10));
		carService.ipCha(new Car("1111", 10));
		carService.ipCha(new Car("9999", 10));
		carService.ipCha(new Car("8888", 10));
		System.out.println("1.CarService객체야 전체차량출력해줘");
		carService.print();
		System.out.println("2.CarService객체야 전체주차구획수반환해줘");
		int temp = carService.parkNo();
		System.out.println(temp);
		System.out.println("3.CarService객체야 주차가능주차구획수반환해줘");
		int temp2=carService.parkAbleNo();
		System.out.println(temp2);
		System.out.println("4.CarService객체야 차량번호(4567번) 인자로줄께  차객체한대 참조변수반환해줘");
		Car findByNo = carService.findByNo("4567");
		findByNo.print();
		System.out.println("5.CarService객체야 입차시간(8시이후) 인자로줄께 차객체배열 참조변수반환해줘");
		Car[] findByinTime=carService.findByinTime(8);
		for (int i = 0; i < findByinTime.length; i++) {
			findByinTime[i].print();
		}
		System.out.println("6.CarService객체야 차량번호(7891번) 출차시간(12시)인자로줄께 출차시켜주고 출차차량참조변수반환해줘");
		Car temp0=carService.carOut("9999", 12);
		temp0.print();
	}

}
