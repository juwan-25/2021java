package prog2;

public class RunConstructorTest1 {

	public static void main(String[] args) {
		ConstructorTest1 ct1 = new ConstructorTest1(10);
		ConstructorTest1 ct2 = new ConstructorTest1(77);
		System.out.println("ct1�� �����ϴ� ��ü�� �ʵ� n = "+ct1.getN());
		System.out.println("ct2�� �����ϴ� ��ü�� �ʵ� n = "+ct2.getN());
	}

}
