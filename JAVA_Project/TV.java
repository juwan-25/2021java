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
		System.out.println(producer+" TV ������ ����");
	}
	
	public void powerOff() {
		System.out.println(producer+" TV ������ ����");
	}
	
	public void upCh() {
		ch++;
		System.out.println("���� ä���� "+ch+"��");
	}
	
	public void downCh() {
		ch--;
		System.out.println("���� ä���� "+ch+"��");
	}
	
	public void upVol() {
		vol++;
		System.out.println("���� ������ "+vol);
	}
	
	public void downVol() {
		vol--;
		System.out.println("���� ������ "+vol);
	}
}
