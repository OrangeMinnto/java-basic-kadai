package kadai_015;

public class CarExec_Chapter15 {
	
	private int gear = 1;		//1速から5速のギアを表す
	private int speed = 10;		//ギアチェンジ後の速度を表す
	
	
	public void changeGear(int afterGear) {
		this.gear = afterGear;
	}
	public void run() {
		switch(this.gear) {
		case 1 -> {
			this.speed = 10;
			System.out.println("時速10km");
			break;
		}
		case 2 -> {
			this.speed = 20;
			System.out.println("時速20km");
			break;
		}
		case 3 -> {
			this.speed = 30;
			System.out.println("時速30km");
			break;
		}
		case 4 -> {
			this.speed = 40;
			System.out.println("時速40km");
			break;
		}
		case 5 -> {
			this.speed = 50;
			System.out.println("時速50km");
			break;
		}
		default -> {
			this.speed = 10;
			System.out.println("時速10km");
			break;
		}
		}
		System.out.println("");
	}
	

}
