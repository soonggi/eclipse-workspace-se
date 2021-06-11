
public class SwitchUse {

	public static void main(String[] args) {
		/*
		 * 짝수 홀수 판별
		 */
		
		int number=23;
		
		switch(number%2) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
		}
		
		/*
		 * 4의 배수 판별
		 */
		
		int number2=38;
		
		switch(number2%4) {
		case 0:
			System.out.println("4의 배수");
			break;
		default:
			System.out.println("4의 배수아님");
		}
		/*
		 * 문자 비교
		 * A: left
		 * D: right
		 * W: up
		 * Z: down
		 * S: rotate
		 */
		
		char direction='D';
		
		switch (direction) {
		case 'A':
			System.out.println("left");
			break;
		case 'D':
			System.out.println("right");
			break;
		case 'W':
			System.out.println("up");
			break;
		case 'Z':
			System.out.println("down");
			break;
		case 'S':
			System.out.println("rotate");
			break;
		default:
			System.out.println("nothing");
			break;
		}
	}

}
