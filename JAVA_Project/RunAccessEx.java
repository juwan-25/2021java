package prog3;

public class RunAccessEx {

	public static void main(String[] args) {
		AccessBaseSample a1 = new AccessBaseSample();

		a1.n1 = 100;
		a1.setN2(50);
		
		System.out.println("a1.n1 = "+a1.n1+", a1�� �����ϴ� ��ü�� n2 = "+a1.getN2());
	}

}
