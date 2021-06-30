package byte_stream.filter_stream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class AccountFileWriteMain {

	public static void main(String[] args) throws Exception{
		/*
		 * Accouont 객체 --> 파일로 저장 
		 */
		Account account1 = new Account(1111, "KIM", 79000, 1.2);
		Account account2 = new Account(2222, "LEE", 34000, 1.0);
		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("accounts.ser"));
		dos.writeInt(account1.getNo());
		dos.writeUTF(account1.getOwner());
		dos.writeInt(account1.getBalance());
		dos.writeDouble(account1.getIyul());

		dos.writeInt(account2.getNo());
		dos.writeUTF(account2.getOwner());
		dos.writeInt(account2.getBalance());
		dos.writeDouble(account2.getIyul());
		dos.close();
		
		System.out.println(">>>>Account 객체 데이타 --> accounts.dat");
	}

}
