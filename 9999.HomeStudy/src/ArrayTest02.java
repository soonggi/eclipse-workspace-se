
public class ArrayTest02 {
   public static void main(String[] args) {
      
      char[] ch= new char[26];
      
      //0.배열에 데이터 입력(a~z)
        for (int i = 0; i<26; i++) {
               ch[i]=(char)((int)'a'+i);
            }
      
      
      //1.a~z 일차원 배열 출력
      ArrayTest02.prn(ch);//매개변수 이용 매개변수를 prn에 넘겨줌
      
      //2.배열을 거꾸로 출력(z~a)
      ArrayTest02.reverse(ch);
//      
//      //3.대문자로 바꾸어 출력
      ArrayTest02.upper(ch);
   }
   
   public static void prn(char[]ch) {
      for(int i =0; i<ch.length;i++) {
         System.out.print(ch[i]+"");
      }
      System.out.println();
   }
   
   public static void reverse(char[]ch) {
      for(int i=ch.length-1;i>=0;i--) {
         System.out.print(ch[i]+"");
      }
      System.out.println();
   }

   public static void upper(char[]ch) {
      for(int i=0; i<ch.length; i++) {
//         ch[i] = (char)((int)ch[i]-32); //대문자랑 소문자 차이 32 
         ch[i]=Character.toUpperCase(ch[i]);
         //System.out.print(ch[i]+"");
      }
      prn(ch);
      reverse(ch);
   }
   
   
   
   
}