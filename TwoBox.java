package Class;

class Box{
	int width;
	int height;
	int depth;
	Box(int w, int h, int d){
		width = w;
		height = h;
		depth = d;
	}
	int volume() {
		return width*height*depth;
	}
	int volume(int t) {
		return width*height*depth*t;
	}
	void print(int times) {
		System.out.println("밑변의 가로 : "+width);
		System.out.println("밑변의 세로 : "+height);
		System.out.println("높이 : "+depth);
		System.out.println("부피 : "+volume());
		System.out.println(times+"배 부피 : "+volume(times));
		System.out.println();
	}
}
//멤버변수보다 매개변수가 우선임
//멤버변수와 매개변수가 이름이 같을 때 멤버변수 앞에 this를 붙임
//생성자 - 멤버변수 초기화, 초기값을 주는 일을 함

public class TwoBox {

	public static void main(String[] args) {
		Box one=new Box(1,2,3);
//		one.width=1;
//		one.height=2;
//		one.depth=3;
		one.print(2);
		
		Box two=new Box(4,5,6);
//		two.width=4;
//		two.height=5;
//		two.depth=6;
		two.print(4);

	}

}

