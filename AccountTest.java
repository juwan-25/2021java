package Class;

class Account{
	private int Account_num;
	private int balance;
	static int base_Acc_num=100; //공용으로 사용하는 변수
	Account(){
		Account_num=++base_Acc_num;
	}
	void deposit(int money) {
		balance+=money;
	}
	void withdraw(int money) {
		if(money>balance) System.out.println("잔액이 부족합니다.");
		else balance-=money;
	}
	public String toString() {
		 return Account_num+" "+balance;
	}

}

public class AccountTest {

	public static void main(String[] args) {

		Account Ac1 = new Account();
		
		System.out.println(Ac1.toString());
		
		Ac1.deposit(5000);		
		System.out.println(Ac1.toString());
		
		Ac1.withdraw(2000);		
		System.out.println(Ac1.toString());
		
		Ac1.withdraw(3500);		
		
		Account Ac2 = new Account();
		System.out.println(Ac2.toString());

	}

}
/*
 * public String toString();
 * 
 * static을 쓰면 클래스에 공용해서 사용하는 변수를 생성할 수 있음
 * -> static 변수, 클래스 변수
 * => C의 전역변수와 완전 동일한 것은 아님
 * 
 */
