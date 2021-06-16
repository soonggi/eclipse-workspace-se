
public class AcademyMemberCastingArrayMain {

	public static void main(String[] args) {
		
		AcademyMember [] members = new AcademyMember[7];
		members[0] = new AcademyStudent(1, "KIM", "LINUX");
		members[1] = new AcademyStudent(2, "KANG", "OFFICE");
		members[2] = new AcademyStudent(3, "HONG", "JAVA");
		members[3] = new AcademyGangsa(4, "WWEQ", "ARDUINO");
		members[4] = new AcademyGangsa(5, "ZING", "DESIGN");
		members[5] = new AcademyStaff(6, "KING", "영업부");
		members[6] = new AcademyStaff(7, "AJGD", "관리부");
		
		System.out.println("------AcademyMember 전체 출력------");
		
		for (int i = 0; i < members.length; i++) {
			members[i].print();
		}
		
		System.out.println("---------------instanceof--------------------");
		/*
		 * 연산자 --> instanceof
		 *   - 형태 : 참조변수 instanceof 클래스 이름
		 *   - 연산결과 : true or false
		 */
		AcademyMember am = new AcademyStudent(1, "김", "자바");
		
		boolean isStudent = am instanceof AcademyStudent;
		if(isStudent) {
			System.out.println("학생객체 -->" + am);
			AcademyStudent tempStudent = (AcademyStudent)am;
			System.out.println("학생 반 -->" + tempStudent.getBan());
		}
		
		System.out.println("---------------AcademyMember중에서 AcademyStudent객체만 출력------------------");
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				members[i].print();
				AcademyStudent tempStudent = (AcademyStudent)members[i];
				System.out.println("  >>학생 반 :"+tempStudent.getBan());
			}
		}

	}

}
