package Class;
class Test{
	void show(String str) {
		System.out.println("매개변수가 전달됨 : "+str);
	}
	void show() {
		System.out.println("동일한 이름의 메서드가 있어도 오류가 아닙니다. 매개변수가 다른 오버라이딩 된 메서드입니다.");
	}
}
public class OverLoadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=new Test();
		t1.show();
		t1.show("mirim");
	}

}
