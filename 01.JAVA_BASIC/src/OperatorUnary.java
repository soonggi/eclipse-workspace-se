
public class OperatorUnary {

		public static void main(String[] args) {
			int a = 1;
			int b = 2;
			
			int ar = -a;
			int br = +b;
			System.out.println(a);
			System.out.println(b);
			System.out.println(ar);
			System.out.println(br);
			
			boolean isPlay=false;
			System.out.println(isPlay);
			isPlay = !isPlay;
			System.out.println(isPlay);
			boolean myTurn=true;
			System.out.println(myTurn);
			myTurn = !myTurn;
			System.out.println(myTurn);
			
			int kor=78;
			boolean isValid = !(kor<0 || kor>100);
			System.out.println(kor+"-->"+isValid);
			
			/*
			 * 증가 감소 연산자
			 * ++, --
			 * a++, ++a, --a, a--
			 */
			int i = 5;
			int j = 5;
			
			i++;
			//i = i+1;
			j--;
			//j=j-1;
			System.out.println(i);
			System.out.println(j);
			
			i=5;
			j=5;
			++i;
			--j;
			System.out.println(i);
			System.out.println(j);
			System.out.println("---------- i++, j-- ----");
			i=5;
			j=5;
			int ir = i++;
			int jr = j--;
			System.out.println(ir);
			System.out.println(jr);
			System.out.println("-------------- ++i, --i --------------");
			i=5;
			j=5;
			ir = ++i;
			jr = --j;
			System.out.println(ir);
			System.out.println(jr);
			
		}
}
