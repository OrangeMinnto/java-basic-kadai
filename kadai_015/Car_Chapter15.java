package kadai_015;

public class Car_Chapter15 {
	private int gear = 1;		//1速から5速のギアを表す
	private int speed = 10;		//ギアチェンジ後の速度を表す
	
	
	public void changeGear(int afterGear) {
		int tempGear = this.gear;
		this.gear = afterGear;
		System.out.println("ギア" + tempGear +"から" + this.gear + "に切り替えました");
		
		switch(afterGear) {
		case 1:
			this.speed = 10;
			break;
		case 2:
			this.speed = 20;
			break;
		case 3:
			this.speed = 30;
			break;
		case 4:
			this.speed = 40;
			break;
		case 5:
			this.speed = 50;
			break;
		default:
			this.speed = 10;
			break;
		}
	}
	
	
	public void run() {
		System.out.println("速度は時速" + speed +"kmです");
	}


}
