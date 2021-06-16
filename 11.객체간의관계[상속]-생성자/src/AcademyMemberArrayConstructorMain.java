
public class AcademyMemberArrayConstructorMain {

	public static void main(String[] args) {
		AcademyStudent[] students = new AcademyStudent[3]; // AcademyStudent '배열 객체' 3개 생성
		AcademyGangsa[] gangsas = new AcademyGangsa[2];
		AcademyStaff[] staffs = new AcademyStaff[2];
		
		students[0]=new AcademyStudent(1, "KIM", "ARDUINO");
		students[1]=new AcademyStudent(2, "JIM", "ANDROID");
		students[2]=new AcademyStudent(3, "EIM", "BIGDATA");
		
		gangsas[0]=new AcademyGangsa(4, "김강사", "오피스");
		gangsas[1]=new AcademyGangsa(5, "이강사", "자바");
		
		staffs[0]=new AcademyStaff(6, "HONG", "총무부");
		staffs[1]=new AcademyStaff(7, "QONG", "홍보부");
		
		System.out.println("-------AcademyMember 전체 출력--------");
		System.out.println("-------Student--------");
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
		System.out.println("-------Gangsa--------");
		for (int i = 0; i < gangsas.length; i++) {
			gangsas[i].print();
			
		}
		System.out.println("-------Staff--------");
		for (int i = 0; i < staffs.length; i++) {
			staffs[i].print();
		}

	}

}
