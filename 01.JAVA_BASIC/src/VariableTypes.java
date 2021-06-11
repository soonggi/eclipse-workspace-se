
public class VariableTypes {

	public static void main(String[] args) {
		/*
		 * 논리형(1byte)
		 *  - 논리형변수
		 *  - 논리형리터럴(값, 데이타) : true, false
		 */
		boolean bool1;
		boolean bool2;
		boolean bool3;
		boolean bool4;
		bool1 = true;
		bool2 = false;
		bool3 = true;
		bool4 = bool1;
		
		
		/* <<한 줄 복사>>
		 * ctrl + alt + down arrow 
		 */
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println(bool3);
		
		/*
		 * 문자 한개형(2byte)
		 *  - 문자형변수
		 *  - 문자형리터럴(값, 데이타) : 'A', '힣', 'C', '1'
		 */
		char munja1,munja2,munja3,munja4,munja5,munja6,munja7,munja8,munja9;
		munja1 = 'A';
		munja2 = 'B';
		munja3 = '황';
		munja4 = '순';
		munja5 = '1';
		
		//char 테이블에서 65를 찾으면 A라는 값을 노출 시킴
		munja6 = 65;
		munja7 = 'A';
		munja8 = 44608;
		munja9 = munja1;
		
		System.out.println(munja1);
		System.out.println(munja2);
		System.out.println(munja3);
		System.out.println(munja4);
		System.out.println(munja5);
		System.out.println(munja6);
		System.out.println(munja7);
		System.out.println(munja8);
		System.out.println(munja9);
		
		/*
		 * 숫자형
		 *  1. 정수형(byte(1), short(2), int(4), long(8))
		 *  	- 정수형리터럴 : 1,2,56,880,-90
		 *  2. 실수형(float(4), double(8))
		 *  	- 실수형리터럴 : 0.1, .1, 3.14159, 10000.0
		 */
		byte b1 = 3;
		byte b2 = -128;
		byte b3 = 127;
		byte b4 = 0b01111111; // 2진법형 표기 방법 = 127이랑 똑같은 것
		byte b5 = b1;
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		
		short s1 = 766;
		short s2 = -32768;
		short s3 = 32767;
		short s4 = 0b0111111111111111;
		System.out.println(s3);
		System.out.println(s4);
		
		
		int i1,i2,i3,i4,i5,i6,i7;
		i1 = 90; //정수형 변수 + 정수형 리터럴(값)
		i2 = 55;
		i3 = -9999;
		i4 = 2147483647;
		i5 = -2147483648;
		i6 = 0b01111111111111111111111111111111;
		i7 = i1;
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);		
		
		
		long l1=232;
		long l2=-2147483648;
		// The literal 2147483648 of type int is out of range
		long l3=2147483648L;
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		
		float f1,f2,f3;
		//Type mismatch: cannot convert from double to float
		f1 = 0.1f;
		f2 = 3.14f;
		f3 = 1000.0f;
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
				
		double d1,d2,d3;
		d1 = 3.141592;
		d2 = 123456789123456789.0;
		d3 = 1.23456789123456789;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		System.out.println("-------------------문자열형(String)-------------------");
		
		String str1="오늘은";
		String str2="금요일";
		String str3="변수를 공부합니다.";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(str1+" "+str2+" "+str3);
		System.out.println(str1+" 월요일 "+"연산자를 공부합니다.");
		
		String name="황순근";
		int age=28;
		String address="민락동";
		char gender='M';
		
		System.out.println("이름:" +name);
		System.out.println("나이:" +age);
		System.out.println("주소:" +address);
		System.out.println("성별:" +gender);
		
		
	}

}
