package prog;

public class Quiz_01 {

	public static void main(String[] args) {
		// 100미만의 연속된 두자리수 짝수 3개를 곱했더니 4****2가 되었다.
		// 이 세 개의 수는 어떤 수인지, 그리고 그 결과는 얼마인지 구하는 프로그램을
		// for문을 이용해서 작성하시오.
		
		for(int i=10; i<96; i+=2) {
			int num=i*(i+2)*(i+4);
			if((num/100000)==4 && (num%10)==2)
						System.out.println(i+" "+(i+2)+" "+(i+4));
		}
	}

}
