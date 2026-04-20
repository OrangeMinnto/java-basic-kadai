package kadai_028;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
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
		String resu = "";
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			String temp = scanner.nextLine();
			if (temp.equals("r") || temp.equals("s") || temp.equals("p")) {
				resu = temp;
				break;
			}
			else {
				throw new NoSuchElementException("再入力してください");
			}
		}

		scanner.close();
		return resu;
		
	}
	
	public String getRandom() {
		int temp = (int) (Math.floor(Math.random() * 3));
		String resu = "";
		switch(temp) {
		case 0:
			resu = "r";
			break;
		case 1:
			resu = "s";
			break;
		case 2:
			resu = "p";
			break;
		}
		
		return resu;
	}
	
	public void playGame(String myChoice, String random) {
		System.out.println("自分の手は" + map.get(myChoice) + ",対戦相手の手は" + map.get(random));
		
		if (myChoice.equals(random)) {
			System.out.println("あいこです");
		}
		else if ((myChoice.equals("r") && random.equals("s")) ||
				(myChoice.equals("s") && random.equals("p")) ||
				(myChoice.equals("p") && random.equals("r"))) {
			System.out.println("自分の勝ちです");
		}
		else {
			System.out.println("自分の負けです");
		}
	}

}
