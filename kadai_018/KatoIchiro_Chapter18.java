package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18{
	

	
	public void eachIntroduce() {
		System.out.println("Kato_Chapter18");
	}
	
	public void setGivenName() {
		this.givenName = "一郎";
	}
	
	public void execIntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
		eachIntroduce();
	}

}
