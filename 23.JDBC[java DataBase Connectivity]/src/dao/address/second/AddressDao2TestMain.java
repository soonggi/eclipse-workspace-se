package dao.address.second;

public class AddressDao2TestMain {

	public static void main(String[] args) throws Exception{
		AddressDao2 addressDao2 = new AddressDao2();
		
		System.out.println(">> delete");
		addressDao2.deleteByNo(5);
		System.out.println(">> selectByNo");
		addressDao2.selectByNo(6);
		System.out.println(">> selectAll");
		addressDao2.selectAll();
		System.out.println(">> insert");
		addressDao2.insert("zzz","김수로","888-7799","서울시민");
		System.out.println(">> update");
		addressDao2.updateByNo(8, "eight", "팔팔팔", "888-8888","팔도시");
		
		
	}

}
