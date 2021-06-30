
public class CreateCustomThreadMain {

	public static void main(String[] args) {
		System.out.println("1. main thread");
		/*
		1. Thread 클래스를 상속받는다.
		2. Thread class의 run method를 overriding 한다.
	  		메쏘드원형:public void run()
		3. Thread 객체를 생성한다.
		4. Thread 객체를통해서 Thread를 시작시킨다.
		 */

		CreateCustomThread cct=new CreateCustomThread();
		cct.setName("mySuperUltraThread");
		
		
		cct.start(); // cct의 스레드를 만들고, 메인과 별개로 vm의 호출을 받음 // start의 호출은 메인스레드
		//while(true) {
			System.out.println("2. main thread end");
		//}
	}

}
