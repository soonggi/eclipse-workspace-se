package nogeneric;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMain {

	public static void main(String[] args) {
		System.out.println("-----------------Object[]-----------------");
		Object[] anyTypeArray = new Object[5];
		System.out.println(anyTypeArray);
		
		Account acc1=new Account(1111, "KING", 33000, 0.5);
		Account acc2=new Account(2222, "KING", 35000, 0.2);
		Account acc3=new Account(3333, "CING", 22000, 1.5);
		Account acc4=new Account(4444, "CING", 12000, 2.9);
		Account acc5=new Account(5555, "RING", 99000, 9.9);
		
		ArrayList accountList=new ArrayList(); // 배열 사이즈 설정 없음
		System.out.println("# size:"+accountList.size());
		System.out.println("********************** 1.add **********************");
		accountList.add(acc1); //add() 사용하면 사이즈가 증가함
		accountList.add(acc2);
		accountList.add(acc3);
		accountList.add(acc4);
		accountList.add(acc5);
		System.out.println("# size:"+accountList.size());
		System.out.println(">>"+accountList);
		
		accountList.add(2,new Account(3334, "KIMM", 40000, 0.9)); //  add(3, ~)3번째 인덱스에 추가
		System.out.println(">>"+accountList);
		System.out.println("# size:"+accountList.size());
		
		System.out.println("********************** 2.set **********************");
		accountList.set(3, new Account(7777, "PAKA", 99770, 1.8)); // set(3, ~)3번째 인덱스 수정
		System.out.println(">>"+accountList);
		System.out.println("# size:"+accountList.size());
		
		System.out.println("********************** 3.get **********************");
		Account getAccount=(Account)accountList.get(3); // get(1) 1번째 인덱스 반환 // 반환 시 Objcet 배열 List객체를 하위 캐스팅 해서 값 확인
		getAccount.print();
		getAccount=(Account)accountList.get(accountList.size()-1);
		getAccount.print();
		
		System.out.println("********************** 4.remove **********************"); //remove(3) 3번째 인덱스 삭제
		Account removeAccount = (Account)accountList.remove(3);
		removeAccount.print(); // 삭제 된 값
		System.out.println(accountList);
		System.out.println("# size:"+accountList.size());
		
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%% 업무실행 %%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("**********************1. 계좌전체출력 **********************"); // get() 활용하여 for문
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=(Account)accountList.get(i);
			tempAccount.print();
		}
		System.out.println("**********************2. 계좌번호 3333번 계좌 한개출력 **********************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=(Account)accountList.get(i);
			if(tempAccount.getNo()==3333) {
				tempAccount.print();
				break;
			}
		}
		System.out.println("**********************3. 계좌주 이름 KING 계좌 여러개출력 *******************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=(Account)accountList.get(i);
			if(tempAccount.getOwner().equals("KING")) {
				tempAccount.print();
			}
			
		}
		System.out.println("**********************4. 계좌번호 3333번 계좌 한개삭제 **********************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=(Account)accountList.get(i);
			if(tempAccount.getNo()==3333) {
				Account removeAcc=(Account)accountList.remove(i);
				System.out.println("# remove size:"+accountList.size());
				removeAcc.print();
				break;
			}
		}
		System.out.println("**********************5. 계좌주 이름 KING 계좌 여러개삭제 *******************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			if(tempAccount.getOwner().equals("KING")) {
				Account removeAcc=(Account)accountList.remove(i);
				removeAcc.print();
				i--; // 인덱스 값 하나씩 줄여나가야 됨 하나씩 삭제되면 한칸씩 밀려서
			}
			
		}
		
		System.out.println("**********************6. 계좌전체출력 **********************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=(Account)accountList.get(i);
			tempAccount.print();
		}
		
		anyTypeArray[0]=acc1;
		anyTypeArray[1]=acc2;
		anyTypeArray[2]=acc3;
		anyTypeArray[3]=acc4;
		anyTypeArray[4]=acc5;
		
		
		for (int i = 0; i < anyTypeArray.length; i++) {
			Account tempAccount=(Account)anyTypeArray[i];
			tempAccount.print();
		}
		

		
		
		System.out.println("######################iteration[전체출력]######################");
		Iterator accountIerator = accountList.iterator();
		while (accountIerator.hasNext()) {
			Account tempAccount = (Account)accountIerator.next();
			tempAccount.print();
			
		}

	}

}
