import java.util.Scanner;
public class Bmi{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
/*
		������ ���α׷�
		String name = "NCT";	//������ ����� ���ÿ� �ʱ�ȭ
		System.out.println("����"+name+"V�� �Ѵ�");

		������ ���α׷� - Scanner
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("���� "+name+" V�� �Ѵ�");

		float height = 1.65f;
		float weight = 41.0f;
		float result = weight / (height * height);
		System.out.println("����� BMI ������ "+result+" �Դϴ�.");
*/
		String name, bmi;
		float height, weight, result;

		System.out.print("�̸� : ");
		name = sc.next();

		System.out.print("Ű : ");
		height = sc.nextFloat();

		System.out.print("������ : ");
		weight = sc.nextFloat();

		//System.out.println("����� �̸��� "+name+" Ű�� "+height+" �����Դ� "+weight+" �Դϴ�.");

		result = weight / (height * height);
		System.out.println(name+"���� BMI ������ "+result+" �Դϴ�.");
	}
}