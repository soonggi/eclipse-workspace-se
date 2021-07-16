package dao.address.fourth;

import java.util.ArrayList;

public class AddressDaoTestMain {

	public static void main(String[] args) throws Exception{
		AddressDao addressDao3 = new AddressDao();
		
		//addressDao3.insert("zzz","김수로","888-7799","서울시민");
		
		System.out.println(">> delete");
		addressDao3.deleteByNo(22);
		
		/*******************select**************************/
		System.out.println(">> selectByNo");
		Address findAddress = addressDao3.selectByNo(10);
		System.out.println(findAddress);
				
		System.out.println(">> selectAll");
		ArrayList<Address> addressList = addressDao3.selectAll();
		for(Address address : addressList) {
			System.out.println(address);
		}
		addressDao3.selectAll();
		
		/************************* case 1 ********************************/
		//System.out.println(">> insert");
		//addressDao3.insert("zzz","김수로","888-7799","서울시민");
		//System.out.println(">> update");
		//addressDao3.updateByNo(8, "eight", "팔팔팔", "888-8888","팔도시");

		/******************** case 2 (DTO Address)************************/
		//System.out.println(">> insert");
		Address insertAddress = new Address(1300, "zzz", "순그니", "486-9544", "강원도");
		int rowCount = addressDao3.insert(insertAddress);
		System.out.println(rowCount);
		//addressDao3.insert(insertAddress);
		//System.out.println(">> update");
		
		Address updateAddress = new Address(1200, "hhh", "혜이니","222-2222","포천시민");
		rowCount = addressDao3.updateByNo(updateAddress);
		
	}

}
