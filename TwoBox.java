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
		System.out.println("�غ��� ���� : "+width);
		System.out.println("�غ��� ���� : "+height);
		System.out.println("���� : "+depth);
		System.out.println("���� : "+volume());
		System.out.println(times+"�� ���� : "+volume(times));
		System.out.println();
	}
}
//����������� �Ű������� �켱��
//��������� �Ű������� �̸��� ���� �� ������� �տ� this�� ����
//������ - ������� �ʱ�ȭ, �ʱⰪ�� �ִ� ���� ��

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

