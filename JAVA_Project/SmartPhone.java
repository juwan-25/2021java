package prog6;

public interface SmartPhone extends MobilePhone, MP3 {
	void installApp(String appName);
	void runApp(String appName);
}
