package lang;

public class StringMain {

	public static void main(String[] args) {
		/*
		 * String 객체의 명시적 생성
		 * 	- 생성자호출
		 */
		String name1=new String("KIM"); // name1 = 1번지
		String name2=new String("KIM"); // name2 = 2번지
		
		if(name1 == name2) {
			System.out.println("name1과 name2의 주소가 같다");
		}else {
			System.out.println("name1과 name2의 주소가 다르다");
		}
		
		/*
		 * String 객체의 암시적 생성(생성자호출안함)
		 * 	- ""로 생성
		 */
		String name3="KIM"; // name3 = 3번지 // 생성자 없이 생성하면 주소가 같음!!
		String name4="KIM"; // name4 = 3번지
		if(name3==name4) {
			System.out.println("name3과 name4의 주소가 같다");
		}else {
			System.out.println("name3과 name4의 주소가 다르다");
		}
		
		if(name3=="KIM") {
			System.out.println("name3과 \"KIM\" 의 주소가 같다");
		}else {
			System.out.println("name3과 \"KIM\" 주소가 다르다");
		}
		
		/*
		 * <<String>>
		 * public boolean equals(Object anObject)
		 * 	- String 객체가 멤버(value)로 가지고 있는 문자열 비교
		 * 
		 * 	- 문자열 비교로 재정의
		 * 	Overrides:
		 * 		equals in class Object
		 */
		
		System.out.println("---------------equals------------------");
		if(name1.equals(name4)) {
			System.out.println("name1 name4[equals]문자열이 동일하다");
		}
		if(name1.equals(name2)) {
			System.out.println("name1 name2[equals]문자열이 동일하다");
		}
		if(name1.equals(name3)) {
			System.out.println("name1 name3[equals]문자열이 동일하다");
		}
		if(name1.equals("KIM")) {
			System.out.println("name1, KIM 문자열이 동일하다");
		}
		if("KIM".equals("KIM")) {
			System.out.println("name1, KIM 문자열이 동일하다");
		}
		
		System.out.println("----------이름 오름차순 정렬-------------");
		String irum1="홍경호";
		String irum2="김경호";
		int unicodeGap = irum1.compareTo(irum2);
		System.out.println("유니코드차이 : "+unicodeGap);
		
		int unicodeGap2 = irum2.compareTo(irum1);
		System.out.println("유니코드차이 : "+unicodeGap2);
		
		if(irum1.compareTo(irum2)>0) {
			System.out.println("irum1, irum2 교환[오름차순]");
		}

	}
}
