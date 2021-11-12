package Class;

public class TwoBox {

	public static void main(String[] args) {
		Box one=new Box();
		one.width=1;
		one.height=2;
		one.depth=3;
		one.print();
		
		Box two=new Box();
		two.width=4;
		two.height=5;
		two.depth=6;
		two.print();

	}

}
class Box{
	int width;
	int height;
	int depth;
	int volume() {
		return width*height*depth;
	}
	void print() {
		System.out.println("ºÎÇÇ : "+volume());
	}
}
