package kadai_028;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
//	private char myChoice;
//	private char random;
	
	HashMap<String, String> map = new HashMap<>(Map.of(
	"r", "グー",
	"s", "チョキ	",
	"p", "パー"
	));
	
	public String getMyChoice() {
//		Scanner scanner = new Scanner(System.in);
//		String temp = scanner.nextLine();
//		
//		return map.get(temp);
		
		try (Scanner scanner = new Scanner(System.in)) {
			return map.get(scanner.nextLine());
		}
	}
	
	public String getRandom() {
		int temp = (int) (Math.floor(Math.random() * 3));
		String resu = "";
		switch(temp) {
		case 0:
			resu = "グー";
		case 1:
			resu = "チョキ";
		case 2:
			resu = "パー";
		}
		
		return resu;
	}
	
	public void playGame(String myChoice, String random) {
		System.out.println("自分の手は" + myChoice + ",対戦相手の手は" + random);
		
		if (myChoice == random) {
			System.out.println("あいこです");
		}
		else if ((myChoice == "グー" && random == "チョキ") ||
				(myChoice == "チョキ" && random == "パー") ||
				(myChoice == "パー" && random == "グー")) {
			System.out.println("自分の勝ちです");
		}
		else {
			System.out.println("自分の負けです");
		}
	}

}
