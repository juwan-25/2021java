package Class;
class Test{
	void show(String str) {
		System.out.println("�Ű������� ���޵� : "+str);
	}
	void show() {
		System.out.println("������ �̸��� �޼��尡 �־ ������ �ƴմϴ�. �Ű������� �ٸ� �������̵� �� �޼����Դϴ�.");
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
