public class SalaryEmployee extends Employee {
	private int annualSalray;//연봉
	public SalaryEmployee() {
		// TODO Auto-generated constructor stub
	}
	

	public SalaryEmployee(int no, String name, int annualSalray) {
		super(no, name);
		this.annualSalray = annualSalray;
	}


	@Override
	public void caculatePay() {
		int pay = this.annualSalray/12;
		this.setPay(pay);
		
	}

	public void print() {
		super.print();
		System.out.println(annualSalray);
	}

	public int getAnnualSalray() {
		return annualSalray;
	}


	public void setAnnualSalray(int annualSalray) {
		this.annualSalray = annualSalray;
	}
	
	

}
