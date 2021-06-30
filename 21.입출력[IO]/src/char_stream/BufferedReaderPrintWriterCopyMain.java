package char_stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class BufferedReaderPrintWriterCopyMain {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader("죄와벌.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("죄와벌.LINENO.txt"));
		/*
		 * public String readLine() throws IOException
			- Reads a line of text. 
			- A line is considered to be terminated by any one of a line feed ('\n'), a carriage return ('\r'), 
			  or a carriage return followed immediately by a linefeed.
			Returns:
				A String containing the contents of the line, 
					not including any line-termination characters, 
					or null if the end of the stream has been reached
		 */
		
		String readLine = br.readLine();
		System.out.println("1.readLine:"+readLine);
		readLine=br.readLine();
		System.out.println("2.readLine:"+readLine);
		readLine=br.readLine();
		
		int lineNo=0;
		while(true) {
			readLine = br.readLine();
			if(readLine==null) {// -1 아니고 끝에 값 null
				break;
			}
			if(readLine.equals("")) {
				continue;
			}
			lineNo++;
			pw.println(lineNo+":"+readLine);
		}
		br.close();
		pw.flush();
		pw.close();
		System.out.println("----BufferedReaderPrintWriter copy----");
		
	}

}
