
public class OperatorArithmatic {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int result = 0;
		double dresult = 0.0;
		
		result = a + b;
		System.out.println("a+b --> " +result);
		result = a - b;
		System.out.println("a-b --> " +result);
		result = a * b;
		System.out.println("a*b --> " +result);
		result = a / b;
		System.out.println("1.a/b --> " +result);
		dresult = a / b;
		System.out.println("2.a/b --> " +dresult);
		dresult = (double)a / b; // double로 변환
		System.out.println("3.a/b --> " +dresult);	
		/*
		 * % 나머지연산자
		 */
		result = a % b; //% = 나머지 구하는
		System.out.println("a % b --> " +result);
		
		int year = 1994;
		result = year % 4;//0,1,2,3 중에 나옴
		System.out.println("2021 % 4 --> " +result);
		result = year % 100;//0~99 중에 나옴
		System.out.println("2021 % 100 --> " +result);
		result = year % 400;//0~399 중에 나옴
		System.out.println("2021 % 400 --> " +result);
		
		int no = 16;
		result = no % 4;
		System.out.println("result의 값이 0이면 4의 배수:" +result);
		
		/*
		 * 문자연산
		 */
		System.out.println("-------------문자연산-------------");
		char ca='A';
		char cz='Z';
		int numAlp = cz-ca+1;
		System.out.println(numAlp);
		char c='A';
		System.out.println(c);
		c='A' + 1;
		System.out.println(c);
		c='A' + 2;
		System.out.println(c);	
		c='A' + 3;
		System.out.println(c);
		char d = '가';
		System.out.println(d);
		d= '가' +1;
		System.out.println(d);
		int numOfHangul = '힣'-'가'+1;
		System.out.println(numOfHangul);
		
		
		result = ca;
		System.out.println(ca);
		System.out.println("A의 십진수:" +result);
		result = ca + 1;
		System.out.println("A + 1의 십진수:" +result);
		char cresult = (char)result; //문자열로 변환
		System.out.println("cresult : " +cresult);
		int numOFAlphabet = cz-ca+1;
		System.out.println("numOFAlphabet : " +numOFAlphabet);
		int numOfHangul2 = '힣'-'가'+1;
		System.out.println("numOfHangul : " +numOfHangul2);
		char ch1 = '가'+1;
		System.out.println("가 + 1 --> " +ch1);
		
		char bb ='황';
		result = bb;
		System.out.println(result);
		result = bb+1;
		System.out.println(result);
		char bresult = (char)result;
		System.out.println(bresult);
		
		/*
		 * 비트연산
		 *  <<, >>
		 *  
		 *  int e = 1	 		==>00000000|00000000|00000000|00000001 --> e
		 *  result = e << 1; 	==>00000000|00000000|00000000|00000010 --> result
		 *  result = e << 2; 	==>00000000|00000000|00000000|00000100 --> result
		 *  result = e << 3; 	==>00000000|00000000|00000000|00001000 --> result
		 *  result = e << 4; 	==>00000000|00000000|00000000|00010000 --> result
		 *   
		 */
		int e = 1;
		result = e << 1; // 좌측으로 한 비트 민다.
		System.out.println(result);
		result = e << 2; // 좌측으로 한 비트 민다.
		System.out.println(result);
		result = e << 3; // 좌측으로 한 비트 민다.
		System.out.println(result);
		result = e << 4; // 좌측으로 한 비트 민다.
		System.out.println(result);
		
		/*
		 *  int e = 128	 		==>00000000|00000000|00000000|10000000 --> e
		 *  result = e >> 1; 	==>00000000|00000000|00000000|01000000 --> result
		 *  result = e >> 2; 	==>00000000|00000000|00000000|00100000 --> result
		 *  result = e >> 3; 	==>00000000|00000000|00000000|00010000 --> result
		 *  result = e >> 4; 	==>00000000|00000000|00000000|00001000 --> result
		 */
		e = 128;
		result = e >> 1;
		System.out.println(result);
		result = e >> 2;
		System.out.println(result);
		result = e >> 3;
		System.out.println(result);
		result = e >> 4;
		System.out.println(result);
	}

}
