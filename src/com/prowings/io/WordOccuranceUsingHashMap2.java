package com.prowings.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class WordOccuranceUsingHashMap2 {

	public static void main(String[] args) throws IOException {

		List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\Shree\\web-app-workspace\\java-io-package\\resource\\india2.txt"));
		StringBuffer sb = new StringBuffer();

		for (String line : lines) {
			sb.append(line);
			sb.append(" ");
		}
		
		String input = new String(sb);
		

		// OP should be occurance of each word from input string

		String[] words = input.split(" ");

		System.out.println(Arrays.toString(words));

		HashMap<String, Integer> wordCountMap = new HashMap<>();

		for (String word : words) {

			if (wordCountMap.containsKey(word))
				wordCountMap.put(word, wordCountMap.get(word) + 1);
			else
				wordCountMap.put(word, 1);
		}

		System.out.println(wordCountMap);

	}

}
