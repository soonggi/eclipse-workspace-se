
public class AcademyGangsa extends AcademyMember {
	public String subject; //과목
	public AcademyGangsa() {
		
	}
	public AcademyGangsa(int no, String name, String subject) {
		super();
		this.setNo(no); // super 안쓰고 이런식으로 해도 됨
		this.setName(name);
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void print() {
		super.print();
		System.out.println(this.subject);
	}

}
