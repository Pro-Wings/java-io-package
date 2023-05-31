package com.prowings.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteFileByDiffWays {

	public static void main(String[] args) throws IOException {

		String data = "India is most powerful country";
		String data1 = " with 28 states";

		writeFileUsingFileWriter(data, data1);
		
		writeFileUsingBufferedWriter(data);

		writeFileUsingFileOutputStream(data);

		writeFileUsingFiles(data);
		
	}

	private static void writeFileUsingFiles(String data) throws IOException {
		
		Files.write(Paths.get("E:/JAVA_NOTES/Map/myPractice/collection-practice/src/qqq.txt"), data.getBytes());
	}

	private static void writeFileUsingFileOutputStream(String data) throws IOException {
		
		File file = new File("E:/JAVA_NOTES/Map/myPractice/collection-practice/src/zzz.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		
		fos.write(data.getBytes(), 0, data.length());
		
		fos.close();
		
	}

	private static void writeFileUsingBufferedWriter(String data) throws IOException {
		
		File file = new File("E:/JAVA_NOTES/Map/myPractice/collection-practice/src/yyy.txt");
		FileWriter fr = new FileWriter(file);
		BufferedWriter br = new BufferedWriter(fr);
		
		br.write(data);
		
		br.close();
		fr.close();
		
	}

	private static void writeFileUsingFileWriter(String data, String data1) throws IOException {

		File file = new File("E:/JAVA_NOTES/Map/myPractice/collection-practice/src/xxx.txt");
		FileWriter fr = null;
		try {
			fr = new FileWriter(file);
			fr.write(data);
			fr.append(data1);
			
		} catch (Exception e) {
			System.out.println("exception while writing file!!");
			e.printStackTrace();
		} finally {
			fr.close();
		}

		System.out.println("data written successfully!!");
	}

}
