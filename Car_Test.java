package Class;
class Car{
	String 모델명; 
	String 제조사; 
	void speedup() { //멤버 메서드
		System.out.println(모델명+"SpeedUp");
	}
	void stop() {
		System.out.println(모델명+"Stop");
	}
	Car(){
		System.out.println("기본생성자");
	}
	Car(String model, String comp){//생성자
		모델명=model; //모닝  SM3 //멤버 변수
		제조사=comp;  //현대  삼성
	}
}

public class Car_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car morning = new Car("모닝","현대"); //객체
		//기본생성자 : 하는 일이 없으면 에러 발생X, 메서드와 비슷한 모양이지만 반환형이 없음, 
		//매개변수는 있을 수도 있음, class 와 이름이 같아야 함, 객체를 만들 때 호출 됨, 1변씩만 호출 됨
		Car sm3 = new Car("SM3","삼성"); //객체
//		morning.모델명="모닝";
//		morning.제조사="현대";
		morning.speedup();
		morning.stop();
//		sm3.모델명="SM3";
//		sm3.제조사="삼성";
		sm3.speedup();
		sm3.stop();
//클래스 : 틀(아직 세부적인 것이 정해지지 X), 객체들의 공통점을 정해 놓은 것
//객체(object) : 값이 들어가 실체가 드러나는 것, 객체는 여러개 생성됨 
//인스턴스(instance): 객체를 실행, 매 순간 객체는 1개만 실행됨
	}

}
