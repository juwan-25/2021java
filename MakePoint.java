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
		System.out.println("점의 위치 : ( " +x+","+y+" )");
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
		
		System.out.print("현재 x,y좌표 >> ");
		Point p1=new Point(sc.nextInt(),sc.nextInt());
		p1.location();
		
		System.out.print("x,y좌표 이동 값 >> ");
		p1.move(sc.nextInt(), sc.nextInt());
		p1.location();
		
		

	}
}

