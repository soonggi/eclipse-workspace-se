package itwillweeklystudy;

//자동차를 대상으로 표현한 클래스
// => 속성 : 모델명, 시동유무, 현재속도
// => 행위 : 시동을 끄다, 시동을 켜다, 속도를 증가시키다, 속도를 감소시키다, 멈추다

//지정자(Modifier) : 클래스, 필드, 메소드에 특별한 기능을 제공하기 위한 키워드
// => private, default, protected, public, static, final, abstract

//접근지정자(Access Modifier) : 클래스, 필드, 메소드에 접근 기능 유무를 설정하기 위한 지정자
// => private, default, protected, public
// => 클래스에는 default, public 두 개의 접근지정자만 사용 가능

public class Car {
	//필드(Field) : 대상의 속성 표현
	//필드에 직접 접근할 경우 잘못한 값이 저장될 수 있으므로 은닉화 처리
	// => private 접근지정자를 이용하여 필드 선언
	// => private 클래스 내부에서만 접근 가능하며 외부에서 객체를 이용하여 접근할 경우 에러 발생
	private String modelName;
	private boolean engineState; //false : off, true : on
	private int currentSpeed;
	
	//생성자(Constructor) : 객체를 생성하기 위한 특별한 메소드
	// => 생성자 선언을 생략하면 기본 생성자(Default Constructor)가 있는것으로 처리
	
	//메소드(Method) : 대상의 행위를 표현 - 기능 => 필드 사용
	//메소드는 모든 영역에서 접근 가능하도록 public 접근 지정자를 이용하여 메소드 선언
	
	void startEngine() {
		engineState = true;
		System.out.println(modelName+"의 시동을 켰습니다.");
	}
	void stopEngine() {
		if(currentSpeed!=0) {
			
			//클래스에 작성된 메소드는 서로 호출 가능
			// => 중복된 코드를 최소화하여 프로그램의 생산성을 높이고 유지보수의 효율성 증가
			speedZero();
		}
		engineState = false;
		System.out.println(modelName+"의 시동을 껐습니다.");
	}
	void speedUp(int speed) {
		//매개변수에 전달된 값에 대한 검증
		if(currentSpeed+speed>150) {
			//speed=150-currentSpeed;
			System.out.println("매개변수에 비정상적인 값이 전달 되어씁니다.");
			return;
		}currentSpeed+=speed;
		System.out.println(modelName+"의 속도를 "+speed+"km/h 만큼 증가 하였습니다. 현재 속도는"+currentSpeed+"km/h 입니다.");
	}
	void speedDown(int speed) {
		currentSpeed-=speed;
		System.out.println(modelName+"의 속도를 "+speed+"km/h 만큼 감소 하였습니다. 현재 속도는"+currentSpeed+"km/h 입니다.");
	}
	void speedZero() {
		currentSpeed=0;
		System.out.println(modelName+"를 멈췄습니다.");
	}
	
	//은닉화 처리된 필드에 접근하기 위한 Getter 메소드와 Setter 메소드 선언
	//Getter(필드값을 반환하는 메소드)
	public String getModelName() {
		return modelName;
	}
	
	//Setter(매개변수로 전달받은 값으로 필드값을 변경하는 메소드)
	// => 매개변수로 전달된 값의 검증 가능
	public void setModelName(String modelName) {
		//this : 메소드를 호출한 인스턴스의 정보를 저장하기 위한 매개변수
		// => 메소드를 호출한 인스턴스의 정보가 자동으로 전달되어 저장
		// => 메소드에서 인스턴스를 구분하여 필드에 접근하기 위해 사용
		this.modelName = modelName;
	}
	
	//필드 자료형이 boolean인 경우 Getter 메소드 대신 is 메소드 작성
	public boolean isEngineState() {
		return engineState;
	}
	public void setEngineState(boolean engineState) {
		this.engineState = engineState;
	}
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	

}
