
public class IfUse {

	public static void main(String[] args) {
		/*
		 * 짝수 홀수 판별 후 출력
		 */
		int no1=56;
		
		if (no1%2==0) {
			//System.out.println(no1+" 는 짝수입니다.");
			System.out.printf("%d 는 %s 입니다.%n",no1,"짝수");
		}else {
			//System.out.println(no1+" 는 홀수입니다.");
			System.out.printf("%d는 %s 입니다.%n", no1, "홀수");
		}
		/*
		 * 4의 배수 판별 후 출력
		 */
		int no2=5684;
		if(no2%4==0) {
			System.out.printf("%d는 4의 배수%n", no2);
		}else {
			System.out.printf("%d는 4의 배수 아님%n.", no2);			
		}
		/*
		 * 점수의 유효성 체크
		 */
		int kor=-10;
		if(kor>=0 && kor<=100) {
			System.out.printf("%d는 유효한 점수입니다.%n",kor);
		}else {
			System.out.printf("%d는 유효한 점수아닙니다.%n",kor);
		}
		/*
		 * 윤년여부체크
		 */
		int year=2021;
		if((year%4==0 && year%100!=0)||year%400==0) {
			System.out.printf("%d는 윤년입니다.%n",year);
		}else {
			System.out.printf("%d는 평년입니다.%n",year);	
		}
		/*
		 * 문자 판단
		 *  1.한글
		 *  2.알파벳 대문자(소문자)
		 *  3.숫자형태문자 --> '0'
		 */
		char a='김';
		char b='A';	
		char c='c';
		
		if(a>='가' && a<='힣') {
			System.out.printf("%c는 한글입니다.%n",a);
		}
		if(b>='A' && b<='Z') {
			System.out.printf("%c는 알파벳 대문자입니다.%n",b);
		}
		if(c>='a' && c<='z') {
			System.out.printf("%c는 알파벳 소문자입니다.%n",c);
		}
		
		/*
		 Quiz:
		 다음문자는 아이디의 첫글자입니다. 
		 이문자가 아이디의 첫글자로 유효한지판단후출력하세요 
		   - 아이디의첫글자는 알파벳대문자 이거나 소문자이다
		 */
		
		
		char idFirstLetter='e';
		
		if(idFirstLetter>='A' && idFirstLetter<='Z') {
			System.out.println("아이디로적합");
		}else if(idFirstLetter>='a' && idFirstLetter<='z'){
			System.out.println("아이디로적합");
		}else {
			System.out.println("아이디 첫글자로 유효하지 않습니다.");
		}
		
		
	}

}
