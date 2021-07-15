package com.itwill07.dao.phonebook;

public class PhoneBookDaoTestMain {

	public static void main(String[] args) throws Exception{
		
		PhoneBookDao phoneBookDao = new PhoneBookDao();
		//insert
		PhoneBook insertPhonebook = new PhoneBook(10, "수빈", "123-1234");
		phoneBookDao.insert(insertPhonebook);
		
		//update
		PhoneBook updatePhonebook = new PhoneBook(5, "오순근", "555-5555");
		phoneBookDao.update(updatePhonebook);
		
		//delete
		phoneBookDao.delete(3);
		
		//select
		phoneBookDao.selectByNo(5);
		phoneBookDao.selectAll();

	}

}
