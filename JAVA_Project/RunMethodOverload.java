package prog2;

import java.util.Scanner;

public class RunMethodOverload {

	public static void main(String[] args) {
		MethodOverloadTest ot=new MethodOverloadTest();
		Scanner sc = new Scanner(System.in);
		System.out.print("����1 �Է� >> ");
		int n1 = sc.nextInt();
		System.out.print("����2 �Է� >> ");
		int n2 = sc.nextInt();
		System.out.printf("%d + %d = %d\n", n1, n2, ot.calc(n1, n2));

		System.out.print("�Ǽ�1 �Է� >> ");
		double n3 = sc.nextDouble();
		System.out.print("�Ǽ�2 �Է� >> ");
		double n4 = sc.nextDouble();
		System.out.printf("%.1f * %.1f = %.3f\n", n3, n4, ot.calc(n3, n4));
	}

}
