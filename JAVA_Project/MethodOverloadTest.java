package prog2;

public class MethodOverloadTest {
//	MethodOverload 동일한 이름을 갖는 메소드
//	메게변수 개수는 동일하나 자료형이 다른 오버로딩
	
	public int calc(int n1, int n2) {
		return n1 + n2;
	}
	
	public double calc(double n1, double n2) {
		return n1 * n2;
	}
}
