package prog3;

public class TV {
	
	private String producer, color;
	private int size;
	
	public String getProducer() {
		return producer;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getSize() {
		return size;
	}
	
	public TV(int size) {
		this.size = size;
		System.out.println("TV( "+size+" ) »£√‚µ ");
	}
	
	public TV(int size, String color) {
		this(size);
		this.color = color;
		System.out.println("TV( "+size+", "+color+" ) »£√‚µ ");
	}
	
	public TV(int size, String color, String producer) {
		this(size, color);
		this.producer = producer;
		System.out.println("TV( "+size+", "+color+", "+size+" ) »£√‚µ ");
	}
	
}
