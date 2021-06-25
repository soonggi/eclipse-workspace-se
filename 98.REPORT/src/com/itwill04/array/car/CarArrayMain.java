package com.itwill04.array.car;
/*
 * 주차관리프로그램
 */
public class CarArrayMain {

	public static void main(String[] args) {
		Car[] carArray= {
				null,null,new Car("5654", 8),null,null,
				new Car("3422", 12),null,null,null,null,
				null,null,null,null,new Car("7789", 11),
				new Car("1120", 10),null,null,null,null,
				null,new Car("2389", 9),null,null,null,
				null,null,null,null,new Car("5555", 6)
		};
		System.out.println("1.전체 차량출력");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null) // car배열 객체값이 null이 아닌 객체들로만 비교
			carArray[i].print();
		}
		System.out.println("2.전체주차구획수");
		int a = 0;
		a = carArray.length; // car배열 객체의 범위 호출
		System.out.println(a);
		
		System.out.println("3.주차가능주차구획수");
		int count = 0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]==null) { // car배열 객체의 값이 null인 카운트
				count++;
			}
		}System.out.println(count);
		
		
		System.out.println("4.입차");
		/*
		 * 1.차량객체생성
		 * 2.빈자리(null)찾아서대입
		 */
		Car c1 = new Car("1234", 13); // c1객체 생성 후 초기화
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]==null) { // car배열 객체 값이 null인 곳에 c1 값을 대입하고 브레이크
				carArray[i]=c1;
				break;
			}
		}
		
		System.out.println("5.차량번호 7789번  차한대 정보출력"); // String 비교
		
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null) {
				if(carArray[i].getNo().equals("7789")) { // equals 사용하여 String 타입 비교
					carArray[i].print();
				}
			}
		}
		System.out.println("6.입차시간 10시이후 차량여러대 찾아서 정보출력");
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null) {
				if(carArray[i].getInTime()>=10) { // 입차 시간 10시 이후 차량 조회
					carArray[i].print();
				}
			}
		}
		
		System.out.println("7.2389번차량 12시 출차");
		/*
		 * 1. 2389번차량찾기
		 * 2. 출차
		 * 3. 영수증출력
		 * 4. 주차에서 차량삭제
		 */
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null) {
				if(carArray[i].getNo().equals("2389")) { // 2389 차량 조회
					carArray[i].setOutTime(12);			 // 출차 시간 설정 
					carArray[i].calculateFee();			 // 주차요금 계산
					Car.headerPrint();
					carArray[i].print();
				}
			}
		}
		
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null) {
				if(carArray[i].getFee()>0) {			  // 주차요금이 있다면 null로 변경하여 출차 액션
					carArray[i]=null;
				}
			}
		}
		
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null)
			carArray[i].print();
		}
		
	}

}