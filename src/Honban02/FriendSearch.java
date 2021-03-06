package Honban02;

import java.awt.List;
import java.io.*;
import java.util.*;

public class FriendSearch {

	public static void main(String[] args) throws Exception {
		HashMap<String, String> userData = new HashMap<String, String>();
		String fileName = args[0];
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String inputData = br.readLine();
		while (inputData != null) {
			String[] addingData = inputData.split(",");
			userData.put(addingData[0], addingData[1]);
			inputData = br.readLine();
		}
		ArrayList<String> userMailList = new ArrayList<String>(userData.keySet());
		while (true) {
			System.out.println("メールアドレス");
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			String mailAdress = is.readLine();
			ArrayList<String> result = new ArrayList<String>();
			for (int i = 0; i < userMailList.size(); i++) {
				String test = userMailList.get(i);
				if (test.matches(".*" + mailAdress + ".*")) {
					result.add(userData.get(test));
				}
			}
			if (result.size() == 0) {
				System.out.println("見つかりません");
			} else {
				for (int i = 0; i < result.size(); i++) {
					System.out.println("友達ですか？" + result.get(i) + "さん");
				}
			}
		}
	}
}
