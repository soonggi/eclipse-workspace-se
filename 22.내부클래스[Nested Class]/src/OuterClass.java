public class OuterClass {
	/*
	 * 인스턴스 멤버필드
	 */
	public int outer_member_field;
	/*
	 * 인스턴스멤버 메쏘드
	 */
	public void outer_member_method() {
		System.out.println("OuterClass.outer_member_method()");
	}
	/*********외부클래스에서 내부클래스 사용**********/
	public void outer_inner_class_use() {
		/*
		 * 1. InnerClass 객체 생성
		 */
		
		//OuterClass.InnerClass innerClassObject= this.new InnerClass(); Outer 생략 가능
		InnerClass innerClassObject= new InnerClass();
		innerClassObject.inner_member_field=99999;
		innerClassObject.inner_member_method();
		
	}
	
	/*
	 * 인스턴스멤버 클래스[Nested class, Inner Class, 내부 클래스]
	 */
	/***********************************************************************/
	public class InnerClass{
		public int inner_member_field;
		public void inner_member_method() {
			System.out.println("InnerClass.inner_member_method()");
		}
		/*
		 * 내부 클래스의 사용 이유
		 *  - 내부 클래스(객체)에서 외부클래스(객체)의 멤버필드, 멤버메쏘드 접근을 손쉽게 하기 위해서
		 */
		
		public void inner_outer_member_accdess() {
			//OuterClass.this.outer_member_field=7878;
			outer_member_field=7878;
			//OuterClass.this.outer_member_method();
			outer_member_method();
		}
	}//inner class end
	/***********************************************************************/
	
}//end class end