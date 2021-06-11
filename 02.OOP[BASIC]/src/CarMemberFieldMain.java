
public class CarMemberFieldMain {

	public static void main(String[] args) {

		/*
		 * 1. 차량 입차 1234번 차량 12시
		 */
		
		//차 객체 주소를 저장할 "참조 변수" 선언(8byte)
		Car car;
		
		//Car 클래스를 사용해서 객체를 생성한 후 car 참조변수에 주소 대입
		car = new Car(); // 힙메모리에 만들어짐
		
		//차 객체의 no멤버필드 값 대입
		car.no="1234";
		car.inTime=12;
		
		/*
		 * 2. 16시 1234번 차량 출차
		 */
		
		//차 객체의 outTime 멤버필드(변수)에 16대입
		car.outTime=16;
		//주차요금계산
		//차 객체의 fee멤버필드(변수)에 계산 후 대입
		car.fee=(car.outTime-car.inTime)*1000;
		
		//영수증 출력
		System.out.println("-----------------------------------");
		System.out.printf("%s %s %s %s%n", "차량번호", "입차시간", "출차시간", "주차요금");
		System.out.println("-----------------------------------");
		System.out.printf("%7s %7d %9d %8d",car.no,car.inTime,car.outTime,car.fee);
		
		
		
		
	}

}
