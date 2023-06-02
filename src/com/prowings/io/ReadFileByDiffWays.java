package com.prowings.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFileByDiffWays {

	public static void main(String[] args) throws IOException {

		String data = "India is most powerful country";
		String data1 = " with 28 states";

		System.out.println(readFileUsingFileReader());

		System.out.println(readFileUsingBufferedReader());
		System.out.println(readFileUsingBufferedWriterLinesMethod());

//		readFileUsingFileInputStream(data);
//
		System.out.println("----------------->>>  "+readFileUsingFiles(data));

	}

	private static String readFileUsingBufferedWriterLinesMethod() throws FileNotFoundException {
		File file = new File("E:/JAVA_NOTES/Map/myPractice/collection-practice/src/yyy.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		return br.lines().collect(Collectors.joining(" "));
	}

	private static String readFileUsingFiles(String data) throws IOException {

//		return Files.readString(Paths.get("E:/JAVA_NOTES/Map/myPractice/collection-practice/src/qqq.txt"));
		
		List<String> allLines = Files.readAllLines(Paths.get("E:/JAVA_NOTES/Map/myPractice/collection-practice/src/qqq.txt"));
		
		System.out.println("****** "+allLines.toString());
		StringBuffer sb = new StringBuffer();
		
		for(String line : allLines)
		{
			sb.append(line);
			sb.append(" ");
		}
		
		return new String(sb);
	}

	private static void readFileUsingFileOutputStream(String data) throws IOException {

		File file = new File("E:/JAVA_NOTES/Map/myPractice/collection-practice/src/zzz.txt");

		FileOutputStream fos = new FileOutputStream(file);

		fos.write(data.getBytes(), 0, data.length());

		fos.close();

	}

	private static String readFileUsingBufferedReader() throws IOException {

		File file = new File("E:/JAVA_NOTES/Map/myPractice/collection-practice/src/yyy.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		StringBuffer readData = new StringBuffer();
		try {
			String line;
//		String line = br.readLine();
//		String line1 = br.readLine();
//		String line2 = br.readLine();
//		String line3 = br.readLine();

//		System.out.println("====>>>>>>"+line);
//		System.out.println("====>>>>>>"+line1);
//		System.out.println("====>>>>>>"+line2);
//		System.out.println("====>>>>>>"+line3);

			while ((line = br.readLine()) != null) {
				readData.append(line);
				readData.append(" ");
			}
		} catch (Exception e) {
			System.out.println("exception while reading file!!");
			e.printStackTrace();

		} finally {
			br.close();
			fr.close();
		}
		return new String(readData);

	}

	private static String readFileUsingFileReader() throws IOException {

		File file = new File("E:/JAVA_NOTES/Map/myPractice/collection-practice/src/xxx.txt");
		FileReader fr = null;
		String readData = "";
		try {

			fr = new FileReader(file);
			char dt[] = new char[100];

			fr.read(dt);
			readData = new String(dt);

		} catch (Exception e) {
			System.out.println("exception while reading file!!");
			e.printStackTrace();
		} finally {
			fr.close();
		}

		System.out.println("data read successfully!!");
		return readData;
	}

}
