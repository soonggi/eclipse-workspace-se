
public class PeferenceTypeArrayMain {

	public static void main(String[] args) {
		
		/*
		Account acc = new Account(4545, "KIM", 57000, 0.4);
		int[] ia = new int[5]; // 기본형 배열
		ia[0] = 1233;
		*/
		
		Account[] accArray = new Account[5]; //Account배열 타입 생성, 참조형 배열, accArray = 멤버변수 Account[] 타입
		accArray[0] = new Account(1111, "KIM", 84600, 0.9); 
		accArray[1] = new Account(2222, "QIM", 74600, 0.7); 
		accArray[2] = new Account(3333, "WIM", 64600, 0.6); 
		accArray[3] = new Account(4444, "EIM", 54600, 0.5); 
		accArray[4] = new Account(5555, "RIM", 44600, 0.4);
		

		Account.headerPrint();
		for(int i=0;i<accArray.length;i++) {
			accArray[i].print();
		}
		
	}

}