
public class Car {
	//멤버필드
	private int no;
	private String model;
	
	//엔진객체
	private Engine engine; // Car안에 Engine을 포함하는 관계로 구성
	
	public Car() {
		
	}
	public Car(int no, String model, Engine engine) {
		this.no=no;
		this.model=model;
		this.engine=engine;
	}
	
	public void print() {
		System.out.print(this.no+"\t"+this.model+"\t");
		this.engine.print();
	}
	
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}