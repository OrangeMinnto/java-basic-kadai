package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18{
	

	
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
	}
	
	public void setGivenName() {
		this.givenName = "花子";
	}
	
	public void execIntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
		eachIntroduce();
	}

}
