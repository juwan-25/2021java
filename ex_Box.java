package Class;
class Box1{
	int width;
	int height;
	int depth;
}
public class ex_Box {

	public static void main(String[] args) {
		int my_count1 = 100;
		int my_count2 = my_count1;
		Box1 mybox1= new Box1();
		Box1 mybox2= mybox1;
		
		mybox1.width =10;
		mybox1.height=20;
		mybox1.depth=30;
		
		System.out.println(mybox2.width+" "+mybox2.height+" "+mybox2.depth);

	}

}
/*
 * 공간이 2개 생기는 것이 아니라 하나의 공간을 가르키기 때문에
 * mybox1과 mybox2 출력 값이  동일함
 */