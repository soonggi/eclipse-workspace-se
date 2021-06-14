
class ObjectChild extends Object{
	/*
	 * extends Object 생략 가능
	 */
	
}

public class ObjectchildMain {

	public static void main(String[] args) {
		ObjectChild oc = new ObjectChild();
		int hashcode = oc.hashCode();
		System.out.println(hashcode);
		System.out.println(Integer.toHexString(hashcode));
		/*
		 * 
		 */

	}

}
