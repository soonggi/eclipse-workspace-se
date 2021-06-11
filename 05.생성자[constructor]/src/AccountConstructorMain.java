
public class AccountConstructorMain {

	public static void main(String[] args) {
		Account acc1=new Account(1111, "KIM", 89000, 0.5);
		Account acc2=new Account(2222, "LEE", 49000, 0.4);
		Account acc3=new Account(3333, "JIM", 11000, 0.3);
		Account acc4=new Account(4444, "FIM", 25000, 1.2);
		Account acc5=new Account(5555, "VIM", 66000, 2.1);
		Account acc6=new Account();
		acc6.setAccountData(6666, "SIX", 66000, 0.6);
		System.out.println("--------모든계좌잔고 100원 증가--------");
		acc1.deposit(100);
		acc2.deposit(100);
		acc3.deposit(100);
		acc4.deposit(100);
		acc5.deposit(100);
		acc6.deposit(100);
		
		acc1.headerPrint();
		acc1.print();
		acc2.print();
		acc3.print();
		acc4.print();
		acc5.print();
		acc6.print();
		
	}

}
