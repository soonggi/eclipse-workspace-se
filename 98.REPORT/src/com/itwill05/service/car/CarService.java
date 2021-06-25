package com.itwill05.service.car;

import java.util.Iterator;

import com.itwill05.service.account.Account;

public class CarService {
	
	private Car[] carArray;
	
	public CarService() {
		carArray=new Car[9];
		carArray[0]=new Car("1111", 5);
		carArray[1]=new Car("1234", 7);
		carArray[2]=new Car("3333", 4);
		carArray[3]=new Car("4444", 13);
		carArray[4]=new Car("5555", 15);
		carArray[5]=new Car("6666", 19);
		carArray[6]=new Car("4567", 20);
		carArray[7]=new Car("4567", 20);
	}
	
	public CarService(int count) {
		carArray=new Car[count];
	}
	
	
	/*
	0. 차객체인자로받아서 입차후 성공실패여부반환
	     - 주차장이 만차이면 입차실패
	     - 차량번호중복체크
	*/
	
	public static final int NOPASS1 = 1;
	public static final int NOPASS2 = 2;
	public static final int PASS = 3;
	
	
	public int ipCha(Car car) {

        int temp = 0;
        /*
         * 1.주차구역 확보(주차장 만차인지 체크)
         * 2.차량번호 중복체크
         */
        for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]==null) {
				temp=PASS;
				break;
			}
			else if(carArray[i].getNo().equals(car.getNo())){
				temp=NOPASS2;
				break;
				
			}else {
				temp=NOPASS1;
			}
		}
        
        switch (temp) {
        case NOPASS1:
            System.out.println("만차입니다.");
            break;
        case NOPASS2:
            System.out.println("차량번호가 중복됩니다.");
            break;
        case PASS:
            for (int i = 0; i < carArray.length; i++) {
                if(carArray[i]== null) {
                    carArray[i] = car;
                    break;
                }
            }
        }
        return temp;
    }
	
	
	/*
	public int ipCha(Car car) {
		switch (Car car) {
		case (NOPASS1):
			
		}

		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]==null) {
				System.out.println("주차 불가");
			}
		}
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i].getNo().equals(car.getNo())) {
				System.out.println("중복 불가");
			}
		}
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null && carArray[i].getNo().equals(car.getNo())) {
				
			}
		}
		
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i].getNo().equals(car.getNo())) {
				temp=NOPASS2;
				break;
			}
		}
        for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]==null) {
				temp=PASS;
			}
		}
		
		/*
		 * 1. 주차장 만차인지 체크
		 * 2. 차량번호 중복체크
		 */
	


	/*
	public void sort(int standard, int order) {
		switch (standard) {
		case (NUMBER):
			if (order == ASCEND) {
				for (int i = 0; i < accounts.length - 1; i++) {
					for (int j = 0; j < accounts.length - 1; j++) {
						if (accounts[j].getNo() > accounts[j + 1].getNo()) {
							Account temp = accounts[j + 1];
							accounts[j + 1] = accounts[j];
							accounts[j] = temp;
						}
					}
				}
			} else if (order == DESCEND) {
				for (int i = 0; i < accounts.length - 1; i++) {
					for (int j = 0; j < accounts.length - 1; j++) {
						if (accounts[j].getNo() < accounts[j + 1].getNo()) {
							Account temp = accounts[j + 1];
							accounts[j + 1] = accounts[j];
							accounts[j] = temp;
						}
					}
				}
			}
			break;
	
		*/
	
	
	
	/*
	1. 전체차량출력
	*/
	public void print() {
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null) {
				carArray[i].print();
			}
		}
	}
	
	/*
	2. 주차구획수반환
	 */
	public int parkNo() {
		return carArray.length;
	}

	/*
	3. 주차가능주차구획수반환
	*/
	public int parkAbleNo() {
		int parkAbleNo = 0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]==null) {
				parkAbleNo++;
			}
		}
		
		return parkAbleNo;
	}
	/*
	4. 차량번호(4567번) 인자받아서 차객체한대 참조변수반환
	*/
	public Car findByNo(String no) {
		Car tempNo = null;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i].getNo().equals(no)) {
				tempNo=carArray[i];
			}
		}
		
		return tempNo;
	}
	/*
	5. 입차시간(8시이후)인자받아서 차객체배열 참조변수반환
	*/
	public Car[] findByinTime(int inTime) {
		Car[] tempNo = null;
		int count = 0;
		
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i].getInTime()>=inTime) {
				count++;
			}
		}
		tempNo = new Car[count];
		
		
		for (int i = 0, index = 0; i < carArray.length; i++) {
			if(carArray[i].getInTime()>=inTime) {
				tempNo[index]=carArray[i];
				index++;
			}
		}
		
		return tempNo;
	}
	
	/*
	6. 차량번호(7891번),출차시간(12시)인자로 받아서 출차"
	*/
	
	public Car carOut(String no, int outTime) {
		Car temp = null;
		
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i].getNo().equals(no)) {
				carArray[i].setOutTime(outTime);
				carArray[i].calculateFee();
				temp = carArray[i];
				carArray[i]=null;
				break;
			}
		}
		return temp;
	}
	
}
