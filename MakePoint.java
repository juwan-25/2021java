package Class;

import java.util.Scanner;
class Point{
	int x;
	int y;
	Point (int x, int y){
		this.x=x;
		this.y=y;
	}
	
	void location() {
		System.out.println("���� ��ġ : ( " +x+","+y+" )");
		System.out.println();
	}
	void move(int mx, int my) {
		x+=mx;
		y+=my;
	}

}
public class MakePoint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� x,y��ǥ >> ");
		Point p1=new Point(sc.nextInt(),sc.nextInt());
		p1.location();
		
		System.out.print("x,y��ǥ �̵� �� >> ");
		p1.move(sc.nextInt(), sc.nextInt());
		p1.location();
		
		

	}
}

