package kadai_028;

import java.util.HashMap;
import java.util.Map;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("自分のじゃんけんの手を入力しましょう\n"
				+ "グーはrockのrを入力しましょう\n"
				+ "チョキはscissorsのsを入力しましょう\n"
				+ "パーはpaperのpを入力しましょう");
		
		
		
//		Scanner scanner = new Scanner(System.in);
		
		HashMap<String, String> map = new HashMap<>(Map.of(
				"r", "グー",
				"s", "チョキ	",
				"p", "パー"
				));
		
//		System.out.println("自分のじゃんけんの手を入力しましょう");
		
		Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();
		
		String myChoice = jyanken.getMyChoice();
		String random = jyanken.getRandom();
		
		
//		System.out.println(myChoice);
//		System.out.println(random);
		jyanken.playGame(map.get(myChoice), map.get(random));

	}

}
