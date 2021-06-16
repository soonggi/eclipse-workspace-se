
public class AcademyMemberOverridingMain {

	public static void main(String[] args) {
		AcademyStudent st1 = new AcademyStudent(1, "KIM", "LINUX");
		AcademyStudent st2 = new AcademyStudent(2, "WIM", "JAVA");
		AcademyStudent st3 = new AcademyStudent(3, "EIM", "DESIGN");
		
		AcademyGangsa gs1 = new AcademyGangsa(4, "LEE", "ANDROID");
		AcademyGangsa gs2 = new AcademyGangsa(5, "ZEE", "IOS");
		
		AcademyStaff sf1 = new AcademyStaff(6, "RRL", "MARKETING");
		AcademyStaff sf2 = new AcademyStaff(7, "JEONG", "ACCOUNTING");
		
		/*
		st1.print();
		st2.print();
		st3.print();
		 */
		
		System.out.println("--------------Student----------------");
		st1.print();
		st2.print();
		st3.print();
		System.out.println("--------------Gangsa----------------");
		gs1.Print();
		gs2.Print();
		System.out.println("--------------Staff----------------");
		sf1.Print();
		sf2.Print();

	}

}
