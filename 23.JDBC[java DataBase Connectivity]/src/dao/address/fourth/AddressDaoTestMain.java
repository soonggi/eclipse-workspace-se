package dao.address.fourth;

public class AddressDaoTestMain {

	public static void main(String[] args) throws Exception{
		AddressDao addressDao = new AddressDao();
		System.out.println("1.insert   --> "+addressDao.insert(new Address(0, "ooo", "오오오", "555-555", "오정리")));
		System.out.println("2.update   --? "+addressDao.updateByNo(new Address(1, "first", "일일일", "111-1111", "일산")));
		System.out.println("3.selectByNo  -->"+addressDao.selectByNo(6));
		System.out.println("4.deleteByNo  -->"+addressDao.deleteByNo(1300));
		System.out.println("5.selectAll -->"+addressDao.selectAll());
		
	}

}
