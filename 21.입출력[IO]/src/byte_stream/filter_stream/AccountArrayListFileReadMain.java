package byte_stream.filter_stream;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AccountArrayListFileReadMain {

	public static void main(String[] args) throws Exception{
		/*
		 * 파일(accountList.ser) --> List<Account>[Quiz]
		 */
		System.out.println("파일(accountList.ser) --> List<Account>");
		
		DataInputStream dis = new DataInputStream(new FileInputStream("accountList.ser"));
		
		List<Account> accountList=new ArrayList<Account>();
		
		while(true) {
			try {
				accountList.add(new Account(dis.readInt(), dis.readUTF(), dis.readInt(), dis.readDouble()));
				
			} catch (EOFException e) {
				System.out.println("EOFException 발생");
				break;
			}
		}
		Account.headerPrint();
		for(Account account : accountList) {
			account.print();
		}

	}

}