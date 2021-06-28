package generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GenericHashSetMain {

	public static void main(String[] args) {
		HashSet<Account> accountSet = new HashSet<Account>();
		System.out.println("#set size: "+accountSet.size());
		Account acc1=new Account(1111, "KING", 33000, 0.5);
		Account acc2=new Account(2222, "KING", 35000, 0.2);
		Account acc3=new Account(3333, "CING", 22000, 1.5);
		Account acc4=new Account(4444, "BING", 12000, 2.9);
		Account acc5=new Account(5555, "RING", 99000, 9.9);
		
		System.out.println("----------1. add------------");
		accountSet.add(acc1);
		accountSet.add(acc2);
		accountSet.add(acc3);
		accountSet.add(acc4);
		accountSet.add(acc5);
		System.out.println("#set size: "+accountSet.size());
		System.out.println(accountSet);
		
		System.out.println("----------1. add[같은객체]------------");
		boolean isAdd=accountSet.add(acc2);
		System.out.println(isAdd);
		isAdd=accountSet.add(acc3);
		System.out.println(isAdd);
		System.out.println("#set size: "+accountSet.size());
		System.out.println(accountSet);
		
		System.out.println("----------2. remove------------");
		boolean isRemove = accountSet.remove(acc1);
		System.out.println(isRemove);
		System.out.println("#set size: "+accountSet.size());
		System.out.println(accountSet);
		
		System.out.println("######################iteration[전체출력]######################");
		Iterator<Account> accountIterator=accountSet.iterator();
		while (accountIterator.hasNext()) {
			Account account = accountIterator.next();
			account.print();
			
		}
		System.out.println("---------------String, Wrapper----------------");
		System.out.println("<<<<<<<<<<<<<<<String>>>>>>>>>>>>>>>");
		Set<String> nameSet=new HashSet<String>();
		nameSet.add(new String("KIM"));
		nameSet.add("JIM");
		nameSet.add("SIM");
		nameSet.add("DIM");
		nameSet.add("FIM");
		nameSet.add("VIM");
		System.out.println("---------1. add--------");
		System.out.println(nameSet);
		nameSet.add("KIM"); // set은 중복돼서 안들어감
		System.out.println(nameSet);
	
		System.out.println("---------2. remove--------");
		nameSet.remove("KIM");
		System.out.println(nameSet);
		System.out.println("---------3. Iteration--------");
		Iterator<String> nameIter = nameSet.iterator();
		while (nameIter.hasNext()) {
			String name = nameIter.next();
			System.out.print(name+" ");
			
		}
		
		System.out.println();
		
		System.out.println("<<<<<<<<<<<<<<<Wrapper>>>>>>>>>>>>>>>");
		Set<Integer> lottoSet = new HashSet<Integer>();
		lottoSet.add(34);
		lottoSet.add(12);
		lottoSet.add(2);
		lottoSet.add(41);
		lottoSet.add(11);
		System.out.println("------1.add-------");
		System.out.println("#size: "+lottoSet.size());
		System.out.println(lottoSet);
		isAdd = lottoSet.add(34);
		isAdd = lottoSet.add(34);
		isAdd = lottoSet.add(34);
		isAdd = lottoSet.add(34);
		isAdd = lottoSet.add(34);
		isAdd = lottoSet.add(34);
		isAdd = lottoSet.add(34);
		isAdd = lottoSet.add(34);
		System.out.println("isAdd:"+isAdd);
		System.out.println("#size"+lottoSet.size());
		System.out.println(lottoSet);
		System.out.println("------2.remove-------");
		isRemove=lottoSet.remove(new Integer(34));
		System.out.println("isRemove:"+isRemove);
		System.out.println("#size"+lottoSet.size());
		System.out.println(lottoSet);
		
		Set<Integer> lotto = new HashSet<Integer>();
		while (lotto.size() < 6) {
			lotto.add((int)(Math.random()*45)+1);
		}
		System.out.println(">>lotto:"+lotto);
		
	}

}
