package prog3;

public class RunCircle {

	public static void showPrint(Circle c) {
		System.out.println("�������� "+c.getR()+"���� ���� �ѷ��� "+c.getCircum()+"��");
		System.out.println("�������� "+c.getR()+"���� ���� ���̴� "+c.getArea()+"��");
	}
	
	public static void main(String[] args) {
		Circle c1 = new Circle(15);
		c1.showInfo();
		Circle c2 = new Circle(6);
		c2.showInfo();
	}

}
