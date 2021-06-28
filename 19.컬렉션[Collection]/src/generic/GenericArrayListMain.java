package generic;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericArrayListMain {

	public static void main(String[] args) {
		Account acc1=new Account(1111, "KING", 33000, 0.5);
		Account acc2=new Account(2222, "BING", 35000, 0.2);
		Account acc3=new Account(3333, "CING", 22000, 1.5);
		Account acc4=new Account(4444, "KING", 12000, 2.9);
		Account acc5=new Account(5555, "RING", 99000, 9.9);
		
		ArrayList<Account>accountList = new ArrayList<Account>();
		System.out.println("#size : "+accountList.size());
		System.out.println("-------------------1. add (추가)-------------------");
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		accountList.add(acc4);
		accountList.add(acc5);
		System.out.println("#size : "+accountList.size());
		accountList.add(3, new Account(3334, "QQWW", 50000, 3.0));
		System.out.println("#size : "+accountList.size());
		
		System.out.println("-------------------2. set (수정)-------------------");
		accountList.set(3, new Account(3335, "QWER", 99999, 0.1));
		
		
		System.out.println("-------------------3. get (반환)-------------------");
		Account getAccount=accountList.get(1);
		getAccount.print();
		getAccount=accountList.get(accountList.size()-1);
		getAccount.print();
		
		System.out.println("-------------------4. remove (삭제)-------------------");
		Account remoAccount = accountList.remove(accountList.size()-1);
		remoAccount.print();
		System.out.println("#size : "+accountList.size());
		
		System.out.println("%%%%%%%%%%%%%%%%업무실행%%%%%%%%%%%%%%%%");
		System.out.println("-------전체출력-------");
		for (int i = 0; i < accountList.size(); i++) {
			accountList.get(i).print();
		}
		
		System.out.println("**********************2. 계좌번호 3335번 계좌 한개출력 **********************");
		getAccount=accountList.get(3);
		getAccount.print();
		
		System.out.println("**********************3. 계좌주 이름 KING 계좌 여러개출력 *******************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=accountList.get(i);
			if(tempAccount.getOwner().equals("KING")) {
				tempAccount.print();
			}
		}
		
		System.out.println("**********************4. 계좌번호 3333번 계좌 한개삭제 **********************");
		for (int i = 0; i < accountList.size(); i++) {
			Account temp = accountList.get(i);
			if(temp.getNo()==3333) {
				Account remove = accountList.remove(i);
				remove.print();
			}
		}
		
		System.out.println("######################iteration[전체출력]######################");
		Iterator<Account> accountIterator= accountList.iterator();
		
		while (accountIterator.hasNext()) {
			Account account = accountIterator.next();
			account.print();
		}
		System.out.println("-----------------String,Wrapper---------------");
		System.out.println("<<<<<<<<<<<<<<<<<<<String>>>>>>>>>>>>>>>>>>>");
		ArrayList<String> nameList=new ArrayList<String>();
		System.out.println("---------------1.add----------------");
		nameList.add("KIM"); // boxing 돼서 들어가는거임
		nameList.add("SIM");
		nameList.add("QQQ");
		nameList.add(new String("KWE"));
		nameList.add("RFD");
		nameList.add("KIM");
		nameList.add("KIM");
		nameList.add("BBF");
		System.out.println("#nameList size:" + nameList.size());
		System.out.println(nameList);

		nameList.add(3, "KKK");
		System.out.println("#nameList size:" + nameList.size());
		System.out.println(nameList);
		System.out.println("---------------2.remove----------------");
		
		String removeName=nameList.remove(3);
		System.out.println("remove Name:" +removeName);
		System.out.println("#nameList size:" + nameList.size());
		System.out.println(nameList);
		boolean isRemove = nameList.remove(new String("RFD"));
		System.out.println("#nameList size:" + nameList.size());
		System.out.println(nameList);
		//<<boolean java.util.ArrayList.remove(Object o)>>
		//Removes the first occurrence of the specified element from this list,if it is present.
		nameList.remove("KIM"); // 여러개 있을 경우 첫번째꺼 하나만 지움
		System.out.println("#nameList size:" + nameList.size());
		System.out.println(nameList);
		
		System.out.println("<<<<<<<<<<<<<<<<<<<Integer>>>>>>>>>>>>>>>>>>>");
		ArrayList<Integer> scoreList=new ArrayList<Integer>();
		scoreList.add(new Integer(90));
		scoreList.add(30); // auto boxing 돼서 들어가는거임 up casting
		scoreList.add(45);
		scoreList.add(55);
		scoreList.add(65);
		scoreList.add(78);
		scoreList.add(98);
		scoreList.add(77);
		scoreList.add(56);
		System.out.println("---------------1.add---------------");
		System.out.println(scoreList);
		System.out.println("---------------2.get---------------");
		Integer score1Integer = scoreList.get(1); // generic
		int score1 = score1Integer.intValue(); // auto unboxing
		System.out.println("ScoreList.get(1) -->" +score1);
		int score3 = scoreList.get(3); // generic --> auto unboxing
		System.out.println("ScoreList.get(3) -->" + score3);
		
		System.out.println("---------------3.set---------------");
		scoreList.set(3, 100);
		System.out.println(scoreList);
		
		System.out.println("---------------4.remove(int index)---------------");
		scoreList.remove(3);
		System.out.println(scoreList);
		System.out.println("---------------4.remove(Object o)---------------");
		scoreList.remove(new Integer(90));
		System.out.println(scoreList);
	
	
	
	
	
	
	}

}
