
public class InterfaceSuperChildImpl implements InterfaceSuperChild{

	@Override
	public void method_super1() {
		System.out.println("InterfaceSuper.method_super1를 구현(implement)");
		
	}

	@Override
	public void method_super2() {
		System.out.println("InterfaceSuper.method_super2를 구현(implement)");
		
	}

	@Override
	public void method_child1() {
		System.out.println("InterfaceSuperChild.method_child1를 구현(implement)");
		
	}

	@Override
	public void method_child2() {
		System.out.println("InterfaceSuperChild.method_child2를 구현(implement)");
		
	}

}
