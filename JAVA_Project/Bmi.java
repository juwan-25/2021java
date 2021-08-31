import java.util.Scanner;
public class Bmi{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);

		String name, bmi;
		float height, weight, result;

		System.out.print("이름 : ");
		name = sc.next();

		System.out.print("키 : ");
		height = sc.nextFloat();

		System.out.print("몸무게 : ");
		weight = sc.nextFloat();

		result = weight / (height * height);
/*
		if(result>30.0)
			bmi="비만";
		else if(result>25.0)
			bmi="과체중";
		else if(result>18.5)
			bmi="정상";
		else
			bmi="저체중";


		System.out.println(name+"님의 BMI 수치는 "+result+"이고, "+bmi+"입니다.);
*/

		int su=(int)result;
		switch(su) {
			case 18: case 17: case 16: case 15: 
				bmi="저체중";
				break;
			case 19: case 20: case 21: case 22: case 23: case 24: case 25:
				bmi="정상";
				break; 
			case 26: case 27: case 28: case 29: case 30:
				bmi="과체중";
				break;
			default:
				bmi="비만";
				break;
		}		
		System.out.println(name+"님의 BMI 수치는 "+result+"이고, "+bmi+"입니다.");
	}
}