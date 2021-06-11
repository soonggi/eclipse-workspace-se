
public class ForNested {

	public static void main(String[] args) {
		/*
		 ★★★★★
		 ★★★★★
		 ★★★★★
		 ★★★★★
		 ★★★★★
		 */
		/*
		int i=0;
		while(i<5) {
			
			int j=0;
			while(j<5) {
				System.out.print("★");
				j++;
			}System.out.println();
			i++;
		}
		*/
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.printf("%s[%d,%d]","★",i,j);
			}
			System.out.println();	
		}
		
		System.out.println();
		
		for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.printf("[%d*%d=%d]",i,j,i*j);
			}
			System.out.println();	
		}
		
		System.out.println();
		
	//	for(int i=1;i<5;i++)
		
		
		
		

	}

}
