package com.itwill04.array.account;

public class AccountArrayMain {
	
	public static void main(String[] args) {
		System.out.println("------------참조형 객체의 초기화-----------");
		Account acc1 = new Account(1111, "KIM", 56000, 0.9);
		
		Account[] accounts = {
				acc1,
				new Account(2222, "PRQ", 10000, 0.9),
				new Account(1255, "WRQ", 20000, 0.7),
				new Account(8675, "KIM", 30000, 2.9),
				new Account(2321, "KIM", 40000, 5.9),
				new Account(6666, "KIM", 50000, 1.9),
				new Account(1124, "YRQ", 60000, 8.9),
				new Account(3232, "URQ", 70000, 6.7),
				new Account(7897, "IRQ", 80000, 5.8),
		
		};
		
		System.out.println("1. 은행 총 계좌수 :" + accounts.length);
		System.out.println("2. 은행 계좌 전체 출력");
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
			
		}
		System.out.println("3. 은행 계좌들 총 잔고");
		int totBalance=0;
		for (int i = 0; i < accounts.length; i++) {
			totBalance+=accounts[i].getBalance();
		}
		System.out.println(">>"+totBalance);
		
		/*
		 * 계좌번호중복안됨
		 */
		
		System.out.println("4. 은행 계좌들 중에서 계좌번호 3333번 계좌 한개 찾아서 출력");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==3333) {
				accounts[i].print();
				break;
			}
			
		}
		
		System.out.println("5. 은행 계좌들 중에서 계좌잔고 50000원 이상인 VIP계좌 여러개 찾아서 출력");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getBalance()>=50000) {
				accounts[i].print();
			}
		}
		
		
		System.out.println("6. 은행 계좌들 중에서 계좌이율 2.0 이상인 계좌 여러개 찾아서 출력");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getIyul()>=2.0) {
				accounts[i].print();
			}
		}
		System.out.println("6. 은행 계좌들 중에서 이름이 KIM인 계좌 여러개 찾아서 출력");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getOwner().equals("KIM")) {
				accounts[i].print();
			}
		}
		
		System.out.println("7. 6666번 계좌 3000원 입금");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==6666) {
				accounts[i].deposit(3000);
				accounts[i].print();
			}
		}
		
		System.out.println("8. 9999번 계좌 3000원 출금");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==9999) {
				accounts[i].withDraw(3000);
				accounts[i].print();
				break;
			}
			
		}
		
		System.out.println("9. 계좌잔고순으로 오름(내림)차순정렬");
		for (int i = 0; i < accounts.length-1; i++) {
			
				//1회
				for(int j=0;j<accounts.length-1;j++) {
					if(accounts[j].getBalance() > accounts[j+1].getBalance()) {
						Account temAccount = accounts[j+1];
						accounts[j+1]=accounts[j];
						accounts[j]=temAccount;
					}
					
				}
		}
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		
		
		System.out.println("10. 계좌번호순으로 오름(내림)차순정렬");

		for (int i = 0; i < accounts.length; i++) {
			for (int j = 0; j < accounts.length-1; j++) {
				if(accounts[j].getNo() > accounts[j+1].getNo()) {
					Account temGetno = accounts[j];
					accounts[j] = accounts[j+1];
					accounts[j+1] = temGetno;
				}
				
			}
		}for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		
		System.out.println("10. 이름순으로 오름(내림)차순정렬");
		for (int i = 0; i < accounts.length-1; i++) {
			boolean isSwap=false; // 정렬 횟수 줄이는 방법
			for (int j = 0; j < accounts.length-1-i; j++) {
				if(accounts[j].getOwner().compareTo(accounts[j+1].getOwner())>0) {
					Account tempAccount = accounts[j+1];
					accounts[j+1]=accounts[j];
					accounts[j]=tempAccount;
					isSwap=true;
				}
			}
			if(!isSwap) {
				break;
			}
		}
			
		
		
		System.out.println("11. 5555계좌 한개 이율을 3.6으로 변경");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==5555) {
				accounts[i].print();
				accounts[i].setIyul(3.6);
				accounts[i].print();
				break;
			}
			
		}
		
		System.out.println("12. VIP(50000원 이상)계좌잔고 50원 증가");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getBalance()>=50000) {
				accounts[i].deposit(50);
				accounts[i].print();
			}
			
		}
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
	}

}
