package wrapper;

/*
- Wrapper 클래스

	자바데이타형은 기본데이타형과 레퍼런스 데이타 형으로 구분됩니다.
	기본데이타형으로는 int,boolean,double 등이 제공됩니다.
	이런기본 데이타형을 객체로 사용할수있는 방법으로 
	Wrapper 클래스가 제공됩니다.
	Wrapper 클래스는 각종유용한 기능들을 메서드로 제공받을수있다는
	장점이있습니다.
	
	Integer,Boolean,Double,Character,Float,Long,Byte,Short
	
 */

public class WrapperClassMain {

	public static void main(String[] args) {
		/*
		 * Wrapper 객체형태
		 */
		Integer intWrapper = new Integer(123);
		System.out.println("Integer객체 멤버필드 int value:"+intWrapper.intValue());
		
		Boolean boolWrapper = new Boolean(true);
		System.out.println("Boolean객체 멤버필드 boolean value:"+boolWrapper.booleanValue());
		
		/*
		 * Wrapper 객체생성
		 */
		
		//Boxing [int(기본형)-->Integer 객체(Wrapper)]
		
		Integer wi1 = null;
		wi1 = new Integer(89);
		Integer wi2 = new Integer(89);
		Boolean wb1 = new Boolean(false);
		Boolean wb2 = new Boolean(true);
		
		Double wd1 = new Double(3.14592);
		Double wd2 = new Double(0.22221);
		
		//Unboxing [Integer 객체(Wrapper)-->int(기본형)]
		
		int i1 = wi1.intValue();
		int i2 = wi2.intValue();
		
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(wb1.booleanValue()); // 객체 변환 후 호출 메소드
		System.out.println(wb2.booleanValue());
		System.out.println(wd1.doubleValue());
		System.out.println(wd2.doubleValue());
		
		/*
		 * auto boxing(wrapping)
		 */
		Integer wi3 = 89;
		Integer wi4 = 89;
		
		Boolean wb3 = true;
		Boolean wb4 = false;
		
		Double wd3 = 3.14159;
		Double wd4 = 9.1999959;
		
		/*
		 * auto unboxing
		 */
		int i3 = wi3;
		int i4 = wi4;
		
		boolean b3=wb3;
		boolean b4=wb4;
		
		double d3=wd3;
		double d4=wd4;
		
		System.out.println("*************AUTO BOXING***************");
		Integer ia=89;
		Integer ib=45;
		Integer ic=66;
		Integer id=99;
		System.out.println("*************자동형변환(Integer-->Object)****************");
		Object oa=ia;
		Object ob=ib;
		Object oc=ic;
		Object od=id;
		System.out.println("*************AUTO BOXING && 자동형변환(Integer-->Object)****************");
		Object ooa=89;
		Object oob=31;
		Object ooc=56;
		Object ood=78;
		
		System.out.println("*************Object[]****************");
		Object[] scoreArray = new Object[4];
		scoreArray[0]=new Integer(89);
		scoreArray[1]=31;
		scoreArray[2]=56;
		scoreArray[3]=78;
		for (int i = 0; i < scoreArray.length; i++) {
			/*
			Integer tempInteger = (Integer)scoreArray[i];//scoreArray[0]는 Object 타입
			int tempScore=tempInteger.intValue();
			System.out.print(tempScore+" ");
			*/
			
			int tempScore=(Integer)scoreArray[i];
			System.out.print(tempScore+" ");
		}

	}

}
