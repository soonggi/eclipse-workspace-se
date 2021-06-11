
public class WhileUse {

	public static void main(String[] args) {
		System.out.println("10회 반복");
		
		int i = 0;
		while (i<10) {
			System.out.println("stmt:"+i);
			i++;
		}
		System.out.println(">> 1~10사이의 정수 출력");
		i=0;
		while(i<10) {
			int no = i+1;
			System.out.print(no+" ");
			i++;
		}
		System.out.println();
		System.out.println(">> 1~10사이의 정수 출력");
		i=1;
		while(i<=10) {
			System.out.print(i+",");
			i++;
			System.out.println();
		}
	
		System.out.println(">> 1~10사이의 정수중 홀수");
		i=1;
		while(i<=10) {
			if(i%2==1) {
				System.out.print(i+",");
			}
			i++;
		}
		System.out.println();
		System.out.println(">> 1~10사이의 4의 배수");
		i=1;
		while(i<=10) {
			if(i%4==0) {
				System.out.print(i+",");
			}
			i++;
		}
		
		System.out.println();
		System.out.println(">> 1~100사이의 정수 출력");
		i=1;
		while(i <= 100) {
			if(i%10==0) {
				System.out.print(i+"\t");
				System.out.println();
			}
			i++;
		}
		System.out.println(">> 1~100사이의 정수중 3의 배수이면서 4의 배수");
		i=1;
		while(i <= 100) {
			if(i%3==0 && i%4==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println();
		/*
		 * 1~100 사이의 정수합
		 * 1~100 사이의 홀수합
		 * 1~100 사이의 짝수합
		 */
		i=1;
		int tot=0;
		int evenTot=0;
		int oddTot=0;
		while(i<=100) {
			if(i%2==0) {
				evenTot=evenTot+i;
				//evenTot+=i;
			}else {
				oddTot=oddTot+i;
				//oddTot+=i;
			}
			//tot = tot+i;
			tot+=i;
			i++;
		}
		System.out.println("1~100 사이의 정수합:"+tot);
		System.out.println("1~100 사이의 짝수합:"+evenTot);
		System.out.println("1~100 사이의 홀수합:"+oddTot);
		
		/*
		 * 문자출력
		
		char c1 = 0;
		while(c1 < 65535) {
			System.out.print(c1);
			if(c1%200==0) {
				System.out.println();
			}
			c1++;
			
		}
		 */
		System.out.println();
		/*
		 * 영문 소문자 출력
		 */
		char c2 ='a';
		while(c2<='z') {
			System.out.print(c2);
			c2++;
		}
		System.out.println();
		/*
		 * Quiz
		 * 1. 한글출력
		 * 2. 영문대문자
		 * 3. 숫자형문자(0 ~ 9)
		 */
		char k1 ='가';
		while(k1<='힣') {
			System.out.print(k1);
			k1++;
		}
		System.out.println();
		char e1 ='A';
		while(e1<='Z') {
			System.out.println(e1);
			e1++;
		}
		System.out.println();
		char c ='0';
			
		
	}
}
