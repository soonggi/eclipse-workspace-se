
public class IfNested {

	public static void main(String[] args) {
		
		/*
		 * 평점산출 A,B,C,D,F
		 */
		int kor = 56;
		char hankjum = ' ';
		
		if(kor<0 || kor>100) {
			System.out.println("유효한점수가아닙니다.");
			return;
		}
		
		if(kor>=90) {
			hankjum='A';
		}else {
			if(kor>=80) {
				hankjum='B';
			}else {
				if(kor>=70)
					hankjum='C';
					else {
						if(kor>=60)
							hankjum='D';
						else {
							if(kor>=50)
								hankjum='E';
						}
					}
			}
		}
		System.out.printf("1. 학점은 %c  입니다.%n",hankjum);
		hankjum=' ';
		if(kor>=90) {
			hankjum='A';
		}else if(kor>=80){
			hankjum='B';
		}else if(kor>=70) {
			hankjum='C';
		}else if(kor>=60) {
			hankjum='D';			
		}else {
			hankjum='F';			
		}
		System.out.printf("2. 학점인 %c 입니다.%n",hankjum);
		
		/*
		 * Quiz:각학점별로 메세지를 출력하세요
		 *      A(98점이상) :최우수
		 *      A		    :우수
		 *      B			:선방
		 *      C			:으이그~~
		 *      D			:재수강
		 *      F			:ㅠㅠ
		 */
		
		int score = 198;
		String msg = " ";
		if(score<0 || score>100) {
			System.out.println("유효하지 않습니다");
			return;
		}
		
		if(score>=98) {
			msg="최우수";
		}else if(score>=70) {
			msg="선방";
		}
		System.out.printf("메세지 %s", msg);
		
	}
}
