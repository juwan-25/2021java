package prog3;

public class RunCircle {

	public static void showPrint(Circle c) {
		System.out.println("반지름이 "+c.getR()+"㎝인 원의 둘레는 "+c.getCircum()+"㎝");
		System.out.println("반지름이 "+c.getR()+"㎝인 원의 넓이는 "+c.getArea()+"㎠");
	}
	
	public static void main(String[] args) {
		Circle c1 = new Circle(15);
		c1.showInfo();
		Circle c2 = new Circle(6);
		c2.showInfo();
	}

}
