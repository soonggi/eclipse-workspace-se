package byte_stream.node_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyMain {

	public static void main(String[] args) throws Exception{
		
		FileInputStream fis = new FileInputStream("file_image.jpg");
		FileOutputStream fos = new FileOutputStream("file_image_copy.jpg");
		int count = 0;
		int starCount=0;
		long startTime=System.currentTimeMillis();
		
		while(true) {
			int readByte = fis.read();
			if(readByte==-1)break;
			fos.write(readByte);
			count++;
			
			if(count%1024==0) {
				System.out.print("★");
				starCount++;
				if(starCount%10==0) { // 별 10개씩 정렬해보기
					System.out.println();
				}
			}
		}
		
		fis.close();
		fos.close();
		long endTime=System.currentTimeMillis();
		long duration = endTime-startTime;
		System.out.println();
		System.out.println("FilterFileCopy: "+count+" bytes copy");
		System.out.println("took "+duration+" ms");
			
	}

}
