/*
			형변환--> 숫자형데이타간에만 가능
		    - 형식 :  (데이타타입)변수 or 리터럴;
		    - 자동형변환(작은데이타-->큰데이타타입변수):promotion
			     byte-->short-->int-->long-->float-->double
		    - 자동형변환안됨(큰데이타-->작은데이타타입변수):casting
			     double-->float-->long-->int-->short-->byte     
*/
public class TypeCasting {

	public static void main(String[] args) {
		//- 자동형변환(작은데이타-->큰데이타타입변수):promotion
		int i1 = 56;
		long l1 = i1;
		System.out.println(l1); // 정수형리터럴
		double d1 = i1;
		System.out.println(d1); // 실수형리터럴
		
		char c1 = '황';
		int i2 = c1;
		System.out.println(c1);
		System.out.println(i2);
		//- 자동형변환안됨(큰데이타-->작은데이타타입변수):casting
		double avgd = 85.665;
		int avgi = (int)avgd;
		//avgi = 56.28;
		System.out.println(avgd);
		System.out.println(avgi);
		
		/*
		 * 연산 시의 형변환
		 * 		- 연산항들 중에 가장 큰 타입으로 모든 항이 형변환된다(promotion)
		 */
		int ii=100;
		char cc='A';
		long ll=45l;
		double dd=45.26;
		long lr = ii+cc+ll;
		double dr = ii+cc+ll+dd;
		
		/*
		 * double avgd = 85.665;
		 * Quiz: 
		 * 1. 소수점이하 첫째자리를 남겨두고 casting
		 * 		--> 85.6
		 * 2. 소수점이하 둘째자리에서 반올림
		 * 		--> 85.7
		 * 
		 *  85.665 --> 8566.5 --> 8566 --> 8566+5 --> 8571 --> 857.1 --> 857 --> 85.7
		 */
		
		//1번
		double avgd1 = 85.665;
		double avgd2 = avgd1 * 100; //8566.5로 변환
		System.out.println(avgd2);
		int a = (int)avgd2; //int(정수형)으로 변환 시켜서 8566로 변환
		System.out.println(a);
		int b = a-6; //8566-6 = 8560으로 변환
		System.out.println(b);
		double avgd3 = (double)b/100; // 8560/100 = 85.6 만든 뒤 int형을 double(실수형)으로 변환
		System.out.println(avgd3);
		
		//2번
		int c = a+4; //8566 + 4 = 8570으로 변환
		System.out.println(c);
		double avgd4 = (double)c/100; // 8570/100 = 85.7 만든 뒤 int형을 double(실수형)으로 변환
		System.out.println(avgd4);
		
		double ad = 85.665;
		ad = ad*100;
		int ai = (int)ad;
		System.out.println(ai);
		ai = ai+5;
		System.out.println(ai);
		ad = ai/10.0;
		System.out.println(ad);
		ai = (int)ad;
		System.out.println(ai);
		
		
		
		
	}

}
