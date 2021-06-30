package byte_stream.filter_stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamMain {

	public static void main(String[] args) throws Exception{
		/*
		 * 자바의 기본데이타를 출력 스트림에 쉽게 쓸 수 있도록 하는 필터 클래스
		 */
		
		FileOutputStream fos = new FileOutputStream("dataOut.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		int intData = 2147483647;
		
		/*
		 * /*
		 *      01111111|11111111|11111111|11111111
		 *         (1)     (2)       (3)      (4) 
		 * >>24 00000000|00000000|00000000|01111111
		 *                                    (1)
		 * >>16 00000000|00000000|01111111|11111111
		 *                           (1)      (2)
		 * >>8  00000000|01111111|11111111|11111111
		 *                  (1)      (2)      (3)
		 *      01111111|11111111|11111111|11111111
		 *         (1)      (2)      (3)      (4)  
		
		fos.write(intData>>24); // 24칸 밀다 
		fos.write(intData>>16);
		fos.write(intData>>8);
		fos.write(intData);
		*/
		dos.writeInt(intData);
		dos.writeByte(127);
		dos.writeBoolean(true);
		dos.writeDouble(3.141592);
		dos.writeChar('가');
		dos.writeUTF("오늘은 자바 입출력을 공부합니다.");
		dos.close();
		System.out.println("DataOutputStream.writeXXX()-->dataOut.dat");
		DataInputStream dis = new DataInputStream(new FileInputStream("dataOut.dat"));
		
		int readInt=dis.readInt();
		System.out.println("int: "+readInt);
		System.out.println("Byte: "+dis.readByte());
		System.out.println("Boolean: "+dis.readBoolean());
		System.out.println("Double: "+dis.readDouble());
		System.out.println("Char: "+dis.readChar());
		System.out.println("String: "+dis.readUTF());
		

	}

}
