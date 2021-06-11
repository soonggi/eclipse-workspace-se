
public class WhileNested {

	public static void main(String[] args) {
		
		System.out.println("1.-----------------------");
		/*
		 ★★★★★
		 ★★★★★
		 ★★★★★
		 ★★★★★
		 ★★★★★
		 */
		 
		int i=0;
		while(i<5) {
			int j=0;
			while(j < 5) {
				System.out.printf("%s[%d,%d]","★",i,j);
				j++;
			}
			System.out.print("\n");
			i++;
		}
		
		int z=0;
		while(z<5) {
			int j=0;
			while(j < 5) {
				System.out.printf("%s","☆",i,j);
				j++;
			}
			System.out.print("\n");
			z++;
		}
		System.out.println("2.-----------------------");
		/*
		 ☆★★★★
		 ★☆★★★
		 ★★☆★★
		 ★★★☆★
		 ★★★★☆
		 */
		i=0;
		while(i<5) {
			int j = 0;
			while(j<5) {
				if(i==j) {
					System.out.printf("%s","☆");
				}else {
					System.out.printf("%s","★");
				}
				j++;
			}
			System.out.print("\n");
			i++;
		}
		
		System.out.println("3.-----------------------");
		/*
		 ☆☆☆☆☆
		 ★☆☆☆☆
		 ★★☆☆☆
		 ★★★☆☆
		 ★★★★☆
		 */
		
		i=0;
		while(i<5) {
			int j = 0;
			while(j<5) {
				if(i<=j) {
					System.out.printf("%s","☆");
				}else {
					System.out.printf("%s","★");
				}
				j++;
			}
			System.out.print("\n");
			i++;
		}
		
		System.out.println("4.-----------------------");
		/*
		 ★
		 ★★
		 ★★★
		 ★★★★
		 ★★★★★
		 */
		
		int e = 0;
		while(e<5) {
			int f = 0;
			while(f<5) {
				if(e>=f) {
					System.out.printf("★");
				} f++;
			} 
			System.out.println();
			e++;
		}
		
		
	}

}
