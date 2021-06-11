
public class AccountEncapsulationMain {

	public static void main(String[] args) {
		Account account1 = new Account();
		
		/*The field Account.no is not visible
		account1.no=1111;
		account1.owner="KIM";
		account1.balance=50000;
		account1.iyul=0.2;
		*/
		account1.setAccountData(1111, "KIM", 50000, 0.2);
		
		account1.print();
		account1.withDraw(100);
		account1.print();
		account1.deposit(33000);
		account1.print();
		
		/*
		int account1Balance=account1.Balance;
		*/
		
		int account1Balance = account1.getBalance();
		System.out.println("account1 잔고 조회: " + account1Balance);
	//	System.out.println("account1 잔고 조회: " + account1.balance); getter 메소드가 필요한 상황 / balance 필드에 접근 못하니까
		
		
		Account account2 = new Account();
		account2.setAccountData(2222, "LEE", 90000, 0.3);
		account2.deposit(999);
		account2.print();
		//이율 변경
		/*
		 * The field Account.iyul is not visible
		account2.iyul = 0.7;
		 */
		account2.setIyul(0.7);
		account2.print();
		System.out.println("---------------모든 계좌 출력---------------");
		account1.headerPrint();
		account1.print();
		account2.print();
		
		System.out.println("account2 이율:"+account2.getIyul());


}
}