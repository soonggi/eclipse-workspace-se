
public class StudentPrint {

	public static void main(String[] args) {
		/*
		 * 1. StudentPrint 3명 데이타를 담을 변수선언
		 * 2. StudentPrint 3명 데이타를 변수에 대입
		 * 3. StudentPrint 3명 데이타를 출력
		 */
		String name1, name2, name3;
		name1 = "KIM";
		name2 = "LEE";
		name3 = "PARK";
		int kor1, kor2, kor3, eng1, eng2, eng3, math1, math2, math3, grd1, grd2, grd3, rnk1, rnk2, rnk3;
		kor1 = 10;
		kor2 = 20;
		kor3 = 30;
		eng1 = 40;
		eng2 = 50;
		eng3 = 60;
		math1 = 70;
		math2 = 80;
		math3 = 90;
		grd1 = 3;
		grd2 = 4;
		grd3 = 5;
		rnk1 = 1;
		rnk2 = 2;
		rnk3 = 3;
		
		System.out.println("---------------학생 성적 출력--------------------");
		System.out.println("학번  이름  국어  영어  수학  총점  평균  평점  석차");
		System.out.println("1" + "   " + name1 + "   " + kor1 + "   " + eng1 + "   " + math1 + "   " + (kor1+eng1+math1) + "   " + (kor1+eng1+math1)/3 + "   " + grd1 + "   " + rnk3);
		System.out.println("2" + "   " + name2 + "   " + kor2 + "   " + eng2 + "   " + math2 + "   " + (kor2+eng2+math2) + "   " + (kor2+eng2+math2)/3 + "   " + grd2 + "   " + rnk2);
		System.out.println("3" + "   " + name3 + "  " + kor3 + "   " + eng3 + "   " + math3 + "   " + (kor3+eng3+math3) + "   " + (kor3+eng3+math3)/3 + "   " + grd3 + "   " + rnk1);
		System.out.println("---------------------------------------------");
		
	}

}
