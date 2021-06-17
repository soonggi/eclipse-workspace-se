package lang;

public class StringUseMain {

	public static void main(String[] args) {
		String str1 = "Have a nice day";
		String str2 = "오늘은 추상 클래스를 공부합니다.";
		System.out.println("------------length-------------");
		int length1=str1.length();
		int length2=str2.length();
		int length3="자바가 재미있네요".length();
		String emptyStr="";
		int length4=emptyStr.length();
		System.out.println(length1);
		System.out.println(length2);
		System.out.println(length3);
		System.out.println(length4);
		
		System.out.println("---------null, \"\"------------");
		String id = null;
		//String id = "";
		
		if(id==null || id.equals("")) {
			System.out.println("아이디를 입력하세요!!!");
		}
		
		System.out.println("---------String.substring----------");
		System.out.println("Have a nice day!!!".substring(7));
		System.out.println("Have a nice day!!!".substring(7,11));
		System.out.println("Have a nice day!!!".substring(7,11).length());
		System.out.println("오늘은 추상 클래스를 공부합니다.".substring(7));
		System.out.println("오늘은 추상 클래스를 공부합니다.".substring(4,10));
		
		System.out.println("---------String.charAt(index)----------");
		String userId="123test#00ABC$%";
		char firstChar=userId.charAt(0);
		System.out.println("'1' 이라는 문자--> " + firstChar);
		System.out.println("'1'의 asciicode값--> " + (int)firstChar);
		for (int i = 0; i < userId.length(); i++) {
			char tempChar = userId.charAt(i);
			System.out.print(tempChar+"("+(int)tempChar+")");
			
		}
		System.out.println();
		for (int i = 0; i < userId.length(); i++) {
			char tempChar = userId.charAt(i);
			if(tempChar>='a' && tempChar<='z') {
				System.out.println(tempChar+":영문소문자");
			}
			if(tempChar>=48 && tempChar<=57) {
				System.out.println(tempChar+":숫자형문자");
			}
		}
		
		/*
		 * Quiz: 아이디로 적합한지판단하시요
		 *    - 길이가 3~7 사이여야한다.
		 *    - 영문,숫자로만이루어져 있어야한다.
		 *    - 첫글자가 숫자여서는안된다
		 */
		String[] idArray= {"guard","7up","test"," dfdj","my id","%super%","아이디","aaaaaaaaaaaa","c"};
		
		for (int i = 0; i < idArray.length; i++) {
			if(idArray[i].length()>=4 && idArray[i].length()<=8) {
				System.out.println(idArray[i]);
			}
		}
		
		
		System.out.println("-----------String.split()-----------");
		
		String cardNo="2345-3434-243451";
		String ssn="212121-445484";
		String nameList="김경호, 신명숙, 이은희, 정봉화, 신명숙";
		
		String[] cardNoArray=cardNo.split("-");
		String[] ssnArray=ssn.split("-");
		String[] nameListArray=nameList.split(",");
		
		for (int i = 0; i < cardNoArray.length; i++) {
			System.out.println(i+"-->"+cardNoArray[i]);
		}
		for (int i = 0; i < ssnArray.length; i++) {
			System.out.println(i+"-->"+ssnArray[i]);
		}
		for (int i = 0; i < nameListArray.length; i++) {
			System.out.println(i+"-->"+nameListArray[i]);
		}
		
		System.out.println("-----------String.replace()-----------"); // 스트링 문자열 단어 바꾸기
		String str3="우리는 자바를 공부합니다. 자바는 객체지향언어입니다. 자바를 자바라!";
		System.out.println(str3);
		String result3 = str3.replace('자', '저');
		System.out.println(result3);
		System.out.println(str3.replace("자바", "파이썬"));
		System.out.println(str3.replaceFirst("자바", "파이썬"));
		
		System.out.println("-----------String.toUpperCase, toLowerCase-----------"); // 스트링 문자열 대소문자 바꾸기
		System.out.println("jaVa".toUpperCase());
		System.out.println("jaVa".toLowerCase());

		System.out.println("-----------equals, equalsIgnoreCase-----------"); // 대소문자 구분 or 무시
		System.out.println("yes".equals("Yes"));
		System.out.println("yes".equalsIgnoreCase("Yes"));
		
		System.out.println("-----------String.indexOf()-----------");
		String fileName="xxx.gif";
		int dotIndex = fileName.indexOf(".");
		System.out.println("dotIndex:"+dotIndex);
		String fileNameNoExt=fileName.substring(0, dotIndex);
		String fileExt = fileName.substring(dotIndex+1);
		System.out.println(fileNameNoExt+"  "+fileExt);
		String copyFileName=fileNameNoExt+"-복사본."+fileExt;
		System.out.println(copyFileName);
		
		System.out.println("-----------String.startWith,endWith-----------");
		String fileName2="yyy.jpg";
		if(fileName2.endsWith("gif")||fileName2.endsWith(".jpg")||fileName2.endsWith(".jpeg")) {
			System.out.println(fileName2+"는 이미지 파일 입니다.");
		}
		String[] names = {"김경호","이경호","김미선","이미숙","홍수환","김현미"};
		int count=0;
		for (int i = 0; i < names.length; i++) {
			if(names[i].startsWith("김")) {
				System.out.println(names[i]+" ");
				count++;
			}
		}
		String[] kimArray = new String[count];
		int index=0;
		for (int i = 0; i < names.length; i++) {
			if(names[i].startsWith("김")) {
				kimArray[index] = names[i];
				index++;
			}
		}
		System.out.println("-----------KIM-----------");
		for (int i = 0; i < kimArray.length; i++) {
			System.out.println(kimArray[i]);
		}
		System.out.println("-----------String.trim-----------"); // 공백 제거하고 노출
		String idStr="    guard    ";
		System.out.println(idStr.length());
		System.out.println(idStr.trim());
		System.out.println(idStr.trim().length());
		String spaceStr = "                  ";
		if(spaceStr.trim().equals("")) {
			System.out.println("아이디를 입력하세요!!![spaceStr.trim().equals(\"\")]");
		}
		if(spaceStr.trim().length()==0) {
			System.out.println("아이디를 입력하세요!!![spaceStr.trim().length()==0]");
		}
	}

}
