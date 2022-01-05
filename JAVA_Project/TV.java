//DAY3
package prog2;

public class TV {

	private String color;
	private int size;
	private String producer;
	private int ch, vol;
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setSize(int size) {
		this.size=size;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setProducer(String producer) {
		this.producer=producer;
	}
	
	public String getProducer() {
		return producer;
	}
	
	public void setCh(int ch) {
		this.ch=ch;
	}
	
	public int getCh() {
		return ch;
	}
	
	public void setVol(int vol) {
		this.vol=vol;
	}
	
	public int getVol() {
		return vol;
	}
	
	public void powerOn() {
		System.out.println(producer+" TV 전원이 켜집");
	}
	
	public void powerOff() {
		System.out.println(producer+" TV 전원이 꺼짐");
	}
	
	public void upCh() {
		ch++;
		System.out.println("현재 채널은 "+ch+"번");
	}
	
	public void downCh() {
		ch--;
		System.out.println("현재 채널은 "+ch+"번");
	}
	
	public void upVol() {
		vol++;
		System.out.println("현재 볼륨은 "+vol);
	}
	
	public void downVol() {
		vol--;
		System.out.println("현재 볼륨은 "+vol);
	}
}
