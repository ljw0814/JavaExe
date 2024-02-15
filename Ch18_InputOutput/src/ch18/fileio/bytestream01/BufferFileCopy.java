package ch18.fileio.bytestream01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferFileCopy {
	public static void main(String[] args) throws IOException {
		 
		InputStream in = new FileInputStream("cat.jpg");
		OutputStream out = new FileOutputStream("고양이.jpg");
		
		int copyByte = 0;
		int readLen;
		byte[] buf = new byte[1024];
		long stime = System.currentTimeMillis();
		while(true) {
			readLen = in.read(buf);
			if(readLen == -1)
				break;
			out.write(buf, 0, readLen);
			copyByte += readLen;
		}
		long etime = System.currentTimeMillis();
		in.close();
		out.close();
		System.out.println("복사시간="+(etime-stime));
		System.out.println("복사된 바이트 크기="+ copyByte);
	}
}
