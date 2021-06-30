
public class ControlSleepThreadMain {

	public static void main(String[] args) throws Exception{
		System.out.println("1.main");
		System.out.println("2.main 쓰레드 3초간 sleep");
		/*
		 * Causes the currently executing thread 
		 * to sleep (temporarily ceaseexecution) for the specified number of milliseconds, 
		 * subject tothe precision and accuracy of system timers and schedulers.
		 */
		Thread.sleep(3000);
		System.out.println("3.main 쓰레드 3초 후 sleep 깨어난 후 실행");
		
		ControlSleepThread cst = new ControlSleepThread();
		cst.start();
		System.out.println("4.main 쓰레드 return");
	}

}
