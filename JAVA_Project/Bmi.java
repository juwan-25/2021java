import java.util.Scanner;
public class Bmi{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
/*
		정적인 프로그램
		String name = "NCT";	//변수를 선언과 동시에 초기화
		System.out.println("지금"+name+"V앱 한다");

		동적인 프로그램 - Scanner
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("지금 "+name+" V앱 한다");

		float height = 1.65f;
		float weight = 41.0f;
		float result = weight / (height * height);
		System.out.println("당신의 BMI 지수는 "+result+" 입니다.");
*/
		String name, bmi;
		float height, weight, result;

		System.out.print("이름 : ");
		name = sc.next();

		System.out.print("키 : ");
		height = sc.nextFloat();

		System.out.print("몸무게 : ");
		weight = sc.nextFloat();

		//System.out.println("당신의 이름은 "+name+" 키는 "+height+" 몸무게는 "+weight+" 입니다.");

		result = weight / (height * height);
		System.out.println(name+"님의 BMI 지수는 "+result+" 입니다.");
	}
}