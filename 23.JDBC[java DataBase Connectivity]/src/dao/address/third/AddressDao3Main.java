package dao.address.third;

public class AddressDao3Main {

	public static void main(String[] args) throws Exception{
		AddressDao3 addressDao3 = new AddressDao3();
		
		System.out.println(">> delete");
		addressDao3.deleteByNo(5);
		System.out.println(">> selectByNo");
		addressDao3.selectByNo(6);
		System.out.println(">> selectAll");
		addressDao3.selectAll();
		
		/************************* case 1 ********************************/
		System.out.println(">> insert");
		addressDao3.insert("zzz","김수로","888-7799","서울시민");
		System.out.println(">> update");
		addressDao3.updateByNo(8, "eight", "팔팔팔", "888-8888","팔도시");

		/******************** case 2 (DTO Address)************************/
		System.out.println(">> insert");
		Address insertAddress = new Address(0, "vvv", "김부이", "111-9044", "제주시민");
		addressDao3.insert(insertAddress);
		System.out.println(">> update");
		
		Address updateAddress = new Address(11, "twotwo", "투투투","222-2222","광주시민");
		addressDao3.updateByNo(updateAddress);
		
	}

}
