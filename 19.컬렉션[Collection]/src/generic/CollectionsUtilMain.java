package generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsUtilMain {

	public static void main(String[] args) {
		ArrayList<Integer> intList1=new ArrayList<Integer>();
		intList1.add(34);
		intList1.add(45);
		intList1.add(78);
		intList1.add(90);
		intList1.add(23);
		intList1.add(10);
		intList1.add(99);
		intList1.add(20);
		
		System.out.println();
		List<Integer> intList2 = Arrays.asList(34,45,78,90,23,10,99,20);
		List<String> nameList=Arrays.asList("김태희","이소라","박재석","조세호","박세리");
		List<Account> accountList=Arrays.asList(
				new Account(1111, "KING", 33000, 0.5),
				new Account(2222, "BING", 35000, 0.2),
				new Account(3333, "CING", 22000, 1.5),
				new Account(4444, "KING", 12000, 2.9),
				new Account(5555, "RING", 99000, 9.9)
				);
		System.out.println("------------sort(오름차순)------------");
		System.out.println(intList1);
		Collections.sort(intList1); // 오름차순정렬
		System.out.println(intList1);
		
		System.out.println(nameList);
		Collections.sort(nameList); // 오름차순정렬
		System.out.println(nameList);
		
		/*
		 * enhanced for(no index)
		 */
		System.out.println("------------Account sort------------");
		for(Account account:accountList) {
			account.print();
		}
		/*
		 * 1. List의 element는 반드시 Comparable interface를 구현하여야 한다.
		 */
		System.out.println("------------Account sort------------");
		Collections.sort(accountList);
		for(Account account:accountList) {
			account.print();
		}
		
		System.out.println("------------reverse(내림차순)------------");
		Collections.reverse(intList1);
		Collections.reverse(nameList);
		Collections.reverse(accountList);
		System.out.println(intList1);
		System.out.println(nameList);
		System.out.println(accountList);

		System.out.println("------------shuffle(랜덤)------------");
		Collections.shuffle(intList1);
		Collections.shuffle(nameList);
		Collections.shuffle(accountList);
		System.out.println(intList1);
		System.out.println(nameList);
		System.out.println(accountList);
	}

}
