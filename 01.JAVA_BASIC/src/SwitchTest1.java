
public class SwitchTest1 {

	public static void main(String[] args) {
		int level = 2;//게임레벨 1~7 사이의 정수
		String msg ="";//빈 문자열
		
		switch(level) {
		case 1:
			msg="초보";
			break;
		case 2:
			msg="중수";
			break;
		case 3:
			msg="고수";
			break;
		case 4:
		case 5:
		case 6:
		case 7:
			msg="싸부님";
		default:
			msg="레벨값은 1~5사이의 정수입니다.";
			break;
		}
		System.out.println(msg);
		
		System.out.printf("당신의 레벨은 %d이며 호칭은 %s입니다.",level, msg);
	}

}
