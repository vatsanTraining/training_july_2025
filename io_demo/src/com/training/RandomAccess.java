package com.training;
import java.io.*;
import java.io.RandomAccessFile;
public class RandomAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			
			System.out.println(new String(readCharsFromFile("Example.txt", 1, 5)));

			writeData("Example.txt", "Data", 5);
			
			appendData("Examle.txt", "Appended");

		} catch (Exception e) {
e.printStackTrace();		}
	}

	private static void appendData(String string, String data) throws Exception {

		RandomAccessFile randomFile = new RandomAccessFile("Example.txt", "rw");
		randomFile.seek(randomFile.length());
		System.out.println("current pointer = "+randomFile.getFilePointer());
		randomFile.write(data.getBytes());
		randomFile.close();
		
	}

	private static void writeData(String string, String data, int seek) throws Exception {

		RandomAccessFile file = new RandomAccessFile("Example.txt", "rw");
		file.seek(seek);
		file.write(data.getBytes());
		file.close();

	}

	private static byte[] readCharsFromFile(String filePath, int seek, int chars) throws IOException {
		RandomAccessFile file = new RandomAccessFile(filePath, "r");
		file.seek(seek);
		byte[] bytes = new byte[chars];
		file.read(bytes);
		file.close();
		return bytes;
	}

}
