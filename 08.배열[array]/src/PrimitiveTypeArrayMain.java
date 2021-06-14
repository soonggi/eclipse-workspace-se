 /*
 배열(타입):  
      - 같은데이타형을 가진 변수 여러개의 모음타입 
      - 배열변수의 선언형식
           데이타타입[] 변수이름;
           배열데이타타입 변수이름; 
	  - 사용: 
	       1.배열객체의생성	
		   2.배열객체 멤버들의 초기화 
      -특징   
		  1.모든 배열타입의 변수는 참조변수이다.
		    (배열은 객체다.)
		  2.같은타입만 정의가가능하다 
		  3.길이가 고정되어있다. 
		 
 */

public class PrimitiveTypeArrayMain {

	public static void main(String[] args) {
		
		int intType=0;
		intType=99;
		
		int[] intArray; // 배열변수의 선언
		intArray=null;
		intArray=new int[5]; // int형 멤버 변수를 5개 가지는 배열 참조 변수(객체)의 생성
		//intArray.0 = 11;
		intArray[0] = 11; // intArray = 참조타입 / intArray[0] = 기본형 int 타입
		intArray[1] = 22;
		intArray[2] = 33;
		intArray[3] = 44;
		intArray[4] = 55;
		
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);
		
		System.out.println("--------for loop----------");
		for(int i=0;i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
		System.out.println();
		//System.out.println("배열의 길이:"+intArray.length);
		
		System.out.println("--------기본형 int배열----------");
		int[] korArray=new int[10];
		korArray[0] = 80;
		korArray[1] = 56;
		korArray[2] = 78;
		korArray[3] = 44;
		korArray[4] = 55;
		korArray[5] = 99;
		korArray[6] = 77;
		korArray[7] = 88;
		korArray[8] = 68;
		korArray[9] = 45;
		int korTot=0;
		for (int i = 0; i < korArray.length; i++) {
			korTot=korTot+korArray[i];
		}
		System.out.println("우리반 국어 총점: "+korTot);
		System.out.println("우리반 국어 평균: "+korTot/korArray.length);
		
		System.out.println("--------기본형 char배열----------");
		char[] charArray=new char[6];
		charArray[0]='H';
		charArray[1]='E';
		charArray[2]='L';
		charArray[3]='L';
		charArray[4]='O';
		charArray[5]='!';
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
		System.out.println();
		System.out.println("--------String[]----------");
		String[] strArray = new String[5];
		strArray[0] = "KIM";
		strArray[1] = "LIM";
		strArray[2] = "GIM";
		strArray[3] = "QIM";
		strArray[4] = "WIM";
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		

	}

}
