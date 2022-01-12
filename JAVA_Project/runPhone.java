package prog6;

public class runPhone {

	public static void main(String[] args) {
		Iphone13pro I13 = new Iphone13pro();
		I13.sendCall("010-1111-2222");
		I13.receiveSMS("010-4444-5555");
		I13.installApp("AppleMusic");
		I13.runApp("AppleMusic");
		String music = I13.searchMusic("We Young");
		I13.playMusic(music);
	}

}
