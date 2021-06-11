
public class ForStar {

	public static void main(String[] args) {
		System.out.println("1.------------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("★[%d,%d]",i,j);
			}
			System.out.print("\n");
			System.out.println();
		}
		/*
		★★★★★
		★★★★★
		★★★★★
		★★★★★
		★★★★★
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("★");
			}System.out.println();
		}System.out.println();
		
		/*
		☆★★★★
		★☆★★★
		★★☆★★
		★★★☆★
		★★★★☆
		*/
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i==j) {
					System.out.print("☆");
				}else {
					System.out.print("★");
				}
			}System.out.println();
			
		}System.out.println();
		
		/*
		 ☆☆☆☆☆
		 ★☆☆☆☆
		 ★★☆☆☆
		 ★★★☆☆
		 ★★★★☆
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 6; j++) {
				if(i>=j) {
					System.out.print("★");
				}else {
					System.out.print("☆");
				}
			}System.out.println();
		}System.out.println();
		
		/*
		★
		★★
		★★★
		★★★★
		★★★★★
		*/
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%s","★");
				if(i==j) {
					break;
				}
			}System.out.println();
		}System.out.println();
		
		/*
		★★★★★
		★★★★
		★★★
		★★
		★
		*/
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i<=j) {
					System.out.printf("%s","★");
				}
		}System.out.println();
		}
		System.out.println();
		
		
		/*
		★★★★★
		  ★★★★
		    ★★★
		      ★★
		        ★
		 */
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i<=j) {
					System.out.printf("%s","★");
				}else {
					System.out.printf("%s","  ");
				}
		}System.out.println();
			
		}
		
	}

}
