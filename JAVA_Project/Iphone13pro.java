package prog6;

public class Iphone13pro implements SmartPhone {

	@Override
	public void sendCall(String phoneNumber) {
		System.out.println(phoneNumber+"�� ��ȭ�� �Ǵ�.");
	}

	@Override
	public void receiveCall(String phoneNumber) {
		System.out.println(phoneNumber+"���� �� ��ȭ�� �޴´�.");
	}

	@Override
	public void sendSMS(String phoneNumber) {
		System.out.println(phoneNumber+"�� ���ڸ� ������.");
	}

	@Override
	public void receiveSMS(String phoneNumber) {
		System.out.println(phoneNumber+"���� �� ���ڸ� �ވf��.");
	}

	@Override
	public String searchMusic(String searchWords) {
		System.out.println("������ ã�� ���Դϴ�.");
		return searchWords+"_music.mp3";
	}

	@Override
	public void playMusic(String musicName) {
		System.out.println(musicName+" ������ ����մϴ�.");
	}

	@Override
	public void stopMusic() {
		System.out.println("������ �����մϴ�.");
	}

	@Override
	public void installApp(String appName) {
		System.out.println(appName+" ���� �ٿ��մϴ�.");
	}

	@Override
	public void runApp(String appName) {
		System.out.println(appName+" ���� �����մϴ�.");
	}

}