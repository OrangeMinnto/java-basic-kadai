package kadai_015;

public class Car_Chapter15 {
	private int gear = 1;		//1速から5速のギアを表す
	private int speed = 10;		//ギアチェンジ後の速度を表す
	
	
	public void changeGear(int afterGear) {
		int tempGear = this.gear;
		this.gear = afterGear;
		System.out.println("ギア" + tempGear +"から" + this.gear + "に切り替えました");
	}
	
	
	public void run() {
		System.out.println("速度は時速" + this.gear * 10 +"kmです");
	}


}
