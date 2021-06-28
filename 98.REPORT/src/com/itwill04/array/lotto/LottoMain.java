package com.itwill04.array.lotto;

public class LottoMain {

	public static void main(String[] args) {
		System.out.println("-----로또번호 6개 생성[중복불가]-----");
		int[] lottoNumber= {0,0,0,0,0,0};
		
		for(int i = 0;i<lottoNumber.length;i++) {
			lottoNumber[i]=(int)(Math.random()*45)+1;
			for(int j = 0; j<i;j++) {
				if(lottoNumber[i]==lottoNumber[j]) {
					i--;
					break;
				}
				
			}
		}
		
		for (int i = 0; i < lottoNumber.length; i++) {
			System.out.print(lottoNumber[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("--------------Lotto객체------------");
		Lotto lotto1 = new Lotto();
		lotto1.print();

		System.out.println("--------------Lotto[]객체------------");
		Lotto[] lottoArray=new Lotto[5];
		lottoArray[0] = new Lotto();
		lottoArray[1] = new Lotto();
		lottoArray[2] = new Lotto();
		lottoArray[3] = new Lotto();
		lottoArray[4] = new Lotto();
		
		for (int i = 0; i < lottoArray.length; i++) {
			lottoArray[i].print();
		}
	}

}
