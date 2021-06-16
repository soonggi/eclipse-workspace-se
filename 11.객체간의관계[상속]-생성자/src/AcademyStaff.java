public class AcademyStaff extends AcademyMember {
	public String depart; // 부서
	public AcademyStaff() {
	}
	
	public AcademyStaff(int no, String name, String depart) {
		super(no, name); // 캡슐화 되어있는 변수 호출
		this.depart = depart;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	 
	public void print() {
		super.print();
		System.out.println(this.depart);
	}

}
