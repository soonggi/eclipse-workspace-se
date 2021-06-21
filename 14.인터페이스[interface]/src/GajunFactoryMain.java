
public class GajunFactoryMain {

	public static void main(String[] args) {
		System.out.println("------------가전제품공장-------------");
		GajunTV tv1=new GajunTV();
		GajunTV tv2=new GajunTV();
		GajunTV tv3=new GajunTV();
		GajunAudio audio1=new GajunAudio();
		GajunAudio audio2=new GajunAudio();
		
		//GajunOnOff gajun1=tv1;
		GajunOnOff[] gajunArray=new GajunOnOff[5];
		gajunArray[0]=tv1;
		gajunArray[1]=tv2;
		gajunArray[2]=tv3;
		gajunArray[3]=audio1;
		gajunArray[4]=audio2;
		
		
		System.out.println("------------가전제품 검사소(볼륨, OnOff)-------------");
		/*
		 * 자식 클래스 타입을 사용 안함
		 * 부모타입[GajunVolume, GajunOnOff]만 사용
		 * 그래야 가전제품 검사프로그램을 한번만들어서 변경없이 계속 사용 할 수 있음
		 */
		GajunOnOff[] recvGajunArray=gajunArray;
		for (int i = 0; i < recvGajunArray.length; i++) {
			recvGajunArray[i].on();
			GajunVolume tempGajun=(GajunVolume)recvGajunArray[i];
			tempGajun.up();
			tempGajun.down();
			recvGajunArray[i].off();
			System.out.println("------------검사 끝 출고-------------");
		}
		
		System.out.println("------------가전제품 검사소 객체 사용(볼륨, OnOff)-------------");
		GajunGumsa gg = new GajunGumsa();
		gg.setGajuns(gajunArray);
		gg.gajunGumsa();

	}

}
