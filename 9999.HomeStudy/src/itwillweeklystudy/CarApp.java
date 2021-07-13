package itwillweeklystudy;

public class CarApp {
	public static void main(String[] args) {
		//인스턴스를 생성하면 인스턴스 필드에는 기본값으로 자동 초기화
		// => 숫자형 : 0, 논리형 : false, 참조형 : null
		Car sonata = new Car();
		System.out.println("sonata = "+sonata);
		
		Car santafe = new Car();
		System.out.println("sonata = "+santafe);
		
		System.out.println("=========================================");
		//은닉화 선언된 필드에 접근할 경우 에러가 발생한다.
		//인스턴스의 필드값을 변경하기 위해서는 Setter메소드 호출
		
		//sonata.modelName = "쏘나타";
		sonata.setModelName("소나타");
		//sonata.engineState = false;
		sonata.setEngineState(false);
		//sonata.currentSpeed = 0;
		sonata.setCurrentSpeed(0);
		
		//인스턴스의 필드값을 사용하기 위해서는 Getter메소드 호출
		//System.out.println("모델명 = "+sonata.modelName);
		System.out.println("모델명 = "+sonata.getModelName());
		//System.out.println("시동유무 = "+sonata.engineState);
		System.out.println("시동유무 = "+sonata.isEngineState());
		//System.out.println("현재속도 = "+sonata.currentSpeed);
		System.out.println("현재속도 = "+sonata.getCurrentSpeed());
		System.out.println("=========================================");
	
		//santafe.modelName = "싼타페";
		santafe.setModelName("싼타페");
		System.out.println("모델명 = "+santafe.getModelName());
		System.out.println("시동유무 = "+santafe.isEngineState());
		System.out.println("현재속도 = "+santafe.getCurrentSpeed());
		System.out.println("=========================================");
		santafe.startEngine();
		santafe.speedUp(500);
		santafe.speedDown(30);
		santafe.speedDown(20);
		santafe.speedZero();
		santafe.stopEngine();
		
	}

}
