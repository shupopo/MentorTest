package Honban02;

import java.io.*;


public class KeyakiSearch {

	public static void main(String[] args) throws Exception {
		String fileName = args[0];
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String inputData = br.readLine();
		while (inputData != null) {
			inputData = br.readLine();
		}
	}
}
