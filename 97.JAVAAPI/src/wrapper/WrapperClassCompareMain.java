package wrapper;

public class WrapperClassCompareMain {

	public static void main(String[] args) {
		Integer wi1=new Integer(99);
		Integer wi2=new Integer(99);
		Integer wi3=wi1;
		/*
		 * Wrapper, String 객체
		 * 	- 비교연산자( == )를 사용하면 주소비교[사용금지]
		 * 	- equals메쏘드 사용(멤버필드 기본형 값 비교)[재정의]
		 */
		
		/* 옳지 않은 예시
		if(wi1==wi2) {
			System.out.println("wi1과 wi2의 주소가 같다");
		}else {
			System.out.println("wi1과 wi2의 주소가 다르다");
		}
		if(wi1==wi3) {
			System.out.println("wi1과 wi2의 주소가 같다");
		}else {
			System.out.println("wi1과 wi2의 주소가 다르다");
		}
		*/
		if(wi1.equals(wi2)) {
			System.out.println("wi1, wi2의 값이 동일하다.");
		}else {
			System.out.println("wi1, wi2의 값이 다르다");
		}
		if(wi1.equals(wi3)) {
			System.out.println("wi1, wi3의 값이 동일하다.");
		}else {
			System.out.println("wi1, wi3의 값이 다르다");
		}
		if(wi2.equals(wi3)) {
			System.out.println("wi2, wi3의 값이 동일하다.");
		}else {
			System.out.println("wi2, wi3의 값이 다르다");
		}
		
		
		System.out.println("**************************************");
		if(wi1==99) {
			System.out.println("wi1.intValue()==99 값이 동일하다.");
		}
		if(wi1>67) {
			System.out.println("wi1.intValue() > 67");
		}
		if(wi1 >= wi2) {
			System.out.println("wi1.intValue() >= wi2.intValue()");
		}
		

	}

}
