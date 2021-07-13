package itwillweeklystudy;

public class StudentApp {
	public static void main(String[] args) {
		//인스턴스를 생성하면 인스턴스 필드에서 기본값으로 자동 초기화 되도록 설정
		// => 생성자가 없으면 인스턴스 생성 불가능 - 에러 발생
		Student student1=new Student();
		
		System.out.println("학번 = "+student1.getNum() + " 이름 = "+student1.getName() 
							+ " 주소 = "+student1.getAddress());
		
		student1.setNum(1000);
		student1.setName("홍길동");
		student1.setAddress("서울");
		System.out.println("학번 = "+student1.getNum() + " 이름 = "+student1.getName() 
		+ " 주소 = "+student1.getAddress());
		
		//매개변수가 선언된 생성자를 호출하여 인스턴스 생성
		Student student2 = new Student(2000, "임꺽정", "수원시");
		System.out.println("학번 = "+student2.getNum() + " 이름 = "+student2.getName() 
		+ " 주소 = "+student2.getAddress());
	
	}
}
