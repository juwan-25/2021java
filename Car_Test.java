package Class;
class Car{
	String 모델명;
	String 제조사;
	void speedup() {
		System.out.println(모델명+"SpeedUp");
	}
	void stop() {
		System.out.println(모델명+"Stop");
	}
	Car(){
		System.out.println("기본생성자");
	}
	Car(String model, String comp){//생성자
		모델명=model;
		제조사=comp;
	}
}

public class Car_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car morning = new Car("모닝","현대"); //기본생성자 : 하는 일이 없으면 에러 발생X, 메서드와 비슷한 모양이지만 반환형이 없음, 매개변수는 있을 수도 있음, class 와 이름이 같아야 함
		Car sm3 = new Car("SM3","삼성");
//		morning.모델명="모닝";
//		morning.제조사="현대";
		morning.speedup();
		morning.stop();
//		sm3.모델명="SM3";
//		sm3.제조사="삼성";
		sm3.speedup();
		sm3.stop();

	}

}
