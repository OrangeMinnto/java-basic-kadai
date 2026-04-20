package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Dictionary_Chapter21 dic = new Dictionary_Chapter21();
		
		String[] fruitEng = {"apple", "banana", "grape", "orange"};
		
		for (String fruit: fruitEng) {
			if (dic.refer(fruit) == null) {
				System.out.println(fruit + "は辞書に存在しません");
			}
			else {
				System.out.println(fruit + "の意味は" + dic.fruitMap.get(fruit));
			}
		}

	}

}
