import java.util.Scanner;
public class Bmi{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);

		String name, bmi;
		float height, weight, result;

		System.out.print("�̸� : ");
		name = sc.next();

		System.out.print("Ű : ");
		height = sc.nextFloat();

		System.out.print("������ : ");
		weight = sc.nextFloat();

		result = weight / (height * height);
/*
		if(result>30.0)
			bmi="��";
		else if(result>25.0)
			bmi="��ü��";
		else if(result>18.5)
			bmi="����";
		else
			bmi="��ü��";


		System.out.println(name+"���� BMI ��ġ�� "+result+"�̰�, "+bmi+"�Դϴ�.);
*/

		int su=(int)result;
		switch(su) {
			case 18: case 17: case 16: case 15: 
				bmi="��ü��";
				break;
			case 19: case 20: case 21: case 22: case 23: case 24: case 25:
				bmi="����";
				break; 
			case 26: case 27: case 28: case 29: case 30:
				bmi="��ü��";
				break;
			default:
				bmi="��";
				break;
		}		
		System.out.println(name+"���� BMI ��ġ�� "+result+"�̰�, "+bmi+"�Դϴ�.");
	}
}