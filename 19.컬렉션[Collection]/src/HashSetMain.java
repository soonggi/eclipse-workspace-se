import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain {

	public static void main(String[] args) {
		HashSet accountSet=new HashSet();
		System.out.println("# set size:"+accountSet.size());
		
		Account acc1=new Account(1111, "KING", 33000, 0.5);
		Account acc2=new Account(2222, "KING", 35000, 0.2);
		Account acc3=new Account(3333, "CING", 22000, 1.5);
		Account acc4=new Account(4444, "BING", 12000, 2.9);
		Account acc5=new Account(5555, "RING", 99000, 9.9);
		
		System.out.println("-------------1. add--------------");
		accountSet.add(acc1);
		accountSet.add(acc2);
		accountSet.add(acc3);
		accountSet.add(acc4);
		accountSet.add(acc5);
		System.out.println("# set size:"+accountSet.size());
		System.out.println(accountSet);
		
		System.out.println("-------------add[같은객체]--------------");
		/*
		 * equals메쏘드를 사용해서 중복체크를 한다.
		 */
		
		boolean isAdd=accountSet.add(acc2); // 같은 객체 넣으면 체크 안됨
		System.out.println("isAdd:"+isAdd);
		isAdd=accountSet.add(acc3);
		System.out.println("isAdd:"+isAdd);
		System.out.println("# set size:"+accountSet.size());
		
		System.out.println("-------------2. remove--------------");
		boolean isRemove=accountSet.remove(acc1);
		System.out.println("isRemove:"+isRemove);
		System.out.println("# set size:"+accountSet.size());
		System.out.println(accountSet);

		
		System.out.println("######################iteration[전체출력]######################");
		Iterator accountIter = accountSet.iterator();
		System.out.println(accountIter);
		
		while(accountIter.hasNext()){
			Account tempAccount = (Account)accountIter.next();
			tempAccount.print();
		}
		//System.out.println(accountIter.hasNext());
		//accountIter.next();
		
	}

}
