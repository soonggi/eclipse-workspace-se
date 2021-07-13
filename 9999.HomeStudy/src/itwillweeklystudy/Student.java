package itwillweeklystudy;

//학생정보(학번,이름,주소)를 저장하기 위한 클래스 - VO(Value Object) 클래스
//VO(Value Object) 클래스 : 값 저장을 목적으로 작성된 클래스 - 필드와 Getter & Setter
public class Student {
	
	//필드의 초기값으로 설정되는 기본값 - 숫자형 = 0, 논리형 = false, 참조형 = null
	//필드 선언 시 필드에 저장된 기본값 변경 가능 - 형식) 자료형 필드형 = 값;
	// => 모든 인스턴스의 필드값이 동일하게 생성 -Setter 메소드 호출
	private int num;
	private String name;
	private String address;
	
	//생성자(Constructor) : 인스턴스를 생성하기 위한 특별한 메소드
	// => 생성자 선언을 생략하면 기본 생성자(Default Constructor)가 있는 것으로 처리
	// => 인스턴스를 생성하기 위해 new 연산자로 호출하는 메소드 - 인스턴스를 이용하여 호출 불가능
	//클래스에는 반드시 하나 이상의 생성자가 존재
	// => 인스턴스 필드에 원하는 값을 저장하기 위해 생성자 선언
	// => 생성자를 하나라도 선언하면 기본 생성자는 자동으로 소멸
	// => 반환형을 작성하지 않으며 메소드명은 반드시 클래스명으로 선언
	//형식)접근지정자 클래스명(자료형 변수명) { 초기화 명령 }
	
	
	//매개변수가 없는 생성자 선언 - 기본 생성자
	// =>매개변수가 없는 생성자를 선언하지 않을 경우 클래스 상속에 문제가 발생 가능
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	//이클립스에서 생성자 자동 생성하는 기능 제공
	//alt+shift+S >> + o
	public Student(int num, String name, String address) {
		super();
		this.num = num;
		this.name = name;
		this.address = address;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
