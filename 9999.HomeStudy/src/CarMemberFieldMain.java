
public class CarMemberFieldMain {

	public static void main(String[] args) {
		Car car1 = new Car(); // Car.class로 car1 객체 생성
		Car car2 = new Car(); // Car.class로 car2 객체 생성
		
		//car1 객체의 차량 번호, 입차시간, 출차시간, 비용 대입
		car1.carNumber = "가나1234";
		car1.inTime = 12;
		car1.ouTime = 15;
		car1.fee = (car1.ouTime-car1.inTime)*3000;
		
		//car2 객체의 차량 번호, 입차시간, 출차시간, 비용 대입
		car2.carNumber = "나가1234";
		car2.inTime = 9;
		car2.ouTime = 14;
		car2.fee = (car2.ouTime-car2.inTime)*3000;
		
		//car1, car2 결과 출력
		System.out.println("--------------주차 영수증--------------");
		System.out.printf("차량번호 "+"입차시간 "+"출차시간 "+"비용 "+"\n");
		System.out.printf("%s"+"%3d \t"+"%4d \t"+"%7d원"+"\n",car1.carNumber,car1.inTime,car1.ouTime,car1.fee); //car1
		System.out.printf("%s"+"%2d \t"+"%4d \t"+"%7d원"+"\n",car2.carNumber,car2.inTime,car2.ouTime,car2.fee); //car2
		System.out.println("---------------------------------------");

	}

}
