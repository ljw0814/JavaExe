package ch18.fileio.bytestream01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferFileCopy {
	public static void main(String[] args) {
		
		InputStream in = new FileInputStream("cat.png");
		OutputStream out = new FileOutputStream("고양이.png");
		
		int copyByte = 0;
		int readLen;
		byte[] buf = new byte[1024];
		while(true) {
			readLen = in.read(buf);
			if(readLen == -1)
				break;
			out.write(buf, 0, readLen);
			copybyte += readLen;
		}
		long etime = System.currentTimeMillis();
		in.close();
		out.close();
		System.out.println("복사시간="+(etime-stime));
		System.out.println("복사된 바이트 크기="+ copyByte);
	}
}
