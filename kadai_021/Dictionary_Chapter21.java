package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
//	HashMap<String, String> fruitMap = new HashMap<>(Map.of(
//				"apple", "りんご",
//				"peach", "桃",
//				"banana", "バナナ",
//				"lemon", "レモン",
//				"pear", "梨",
//				"kiwi", "キウィ",
//				"strawberry", "いちご",
//				"grape", "ぶどう",
//				"muscat", "マスカット",
//				"cherry", "さくらんぼ"
//			));

	public HashMap<String, String> fruitMap = new HashMap<String, String>();
	
	Dictionary_Chapter21() {
		
		
		fruitMap.put("apple", "りんご");
		fruitMap.put("peach", "桃");
		fruitMap.put("banana", "バナナ");
		fruitMap.put("lemon", "レモン");
		fruitMap.put("pear", "梨");
		fruitMap.put("kiwi", "キウィ");
		fruitMap.put("strawberry", "いちご");
		fruitMap.put("grape", "ぶどう");
		fruitMap.put("muscat", "マスカット");
		fruitMap.put("cherry", "さくらんぼ");
	}

	
	public String refer(String fruitEng) {
		return fruitMap.get(fruitEng);
	}

}
