import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class ExceptionCatchMain {

	public static void main(String[] args) {
		System.out.println("stmt1-1");
		
		try {
			System.out.println("stme1-2");
			Class.forName("XXXX");
			System.out.println("stme1-3");
			
		} catch (ClassNotFoundException e) {
			/*
			 * catch block --> 예외 발생 시 실행되는 블록
			 * 	- 메세지 출력
			 * 	- 프로그램 정상 실행을 위한 코드
			 */
			System.out.println("stmt1-4[catch]");
			String errorMsg = e.getMessage();
			System.out.println("catch msg:"+errorMsg);
			System.out.println("stmt1-5[catch]");
			//JOptionPane.showMessageDialog(null, "호갱님 죄송합니다");
		}finally {
			/*
			 * 예외 발생과 관계 없이 항상 실행하는 블록(리소스해지)
			 * 	- 반드시 실행해야하는 코드 기술(리소스해지)
			 */
			System.out.println("stmt1-6[finally]");
		}
		System.out.println("stmt2-1");
		
		try {
			System.out.println("stmt2-2");
			Socket socket = new Socket("www.daum.com", 80);
			System.out.println(socket);
			System.out.println("stmt2-3");
			
		} catch (IOException e) {
			System.out.println("stmt2-4[catch] msg-->"+e.getMessage());
			e.printStackTrace();
			System.out.println("stmt2-4[catch]");
		}
		
		System.out.println("stmt3-1");
		First first = new First();
		
		try {
			System.out.println("stmt3-2");
			first.method1();
			System.out.println("stmt3-3");
		} catch (IOException e) {
			System.out.println("stmt3-4");
			System.out.println("catch msg:"+e.getMessage());
			
			System.out.println("stmt3-5");
		}
		System.out.println("stmt99");
	}

}
