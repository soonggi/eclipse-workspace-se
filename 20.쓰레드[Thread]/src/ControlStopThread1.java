import javax.management.RuntimeErrorException;

public class ControlStopThread1 extends Thread{
	@Override
	public void run() {
		
		for (int i = 0; i <= 100; i++) {
			System.out.println("down loading....["+i+"%]");
			
		}
		System.out.println("ControlStopThread1 JVM return thread end");
	}

}
