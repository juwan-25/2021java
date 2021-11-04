package Class;
class Tri{
	int bottom;
	int height;
//	double area2;
	double area(){
		return (double)bottom*height/2;
	}
}

public class Tri_Test {

	public static void main(String[] args) {
		Tri t1=new Tri();
		t1.bottom=3;
		t1.height=5;
		System.out.println(t1.area());
	}
}