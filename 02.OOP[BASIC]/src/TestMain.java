
public class TestMain {

	public static void main(String[] args) {
		
	Test t = new Test();
	t.memberField1 = 123;
	t.memberField2 = "zz";
	t.mebBerField3 = 0.124;
	t.method1();
	t.method2();
	t.method3();
		
		
		
	Test test1 = new Test();
	Test test2 = new Test();
	Test test3 = new Test();
	
	test1.setA(11);
	test2.setB(999);
	test3.setF(1, 2, 3);
	
	test1.print();
	test2.print();
	test3.print();
		
	
	
	 for (int i = 0; i < 5; i++) {
	        for (int j = 0; j < 5; j++) {
	            System.out.printf("%s","★");
	            if(i==j) {
	                break;
	            }
	        }System.out.println();
	    }System.out.println();

		
	}

}
