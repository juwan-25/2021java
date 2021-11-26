package Class;
class Account{
	String Account_num;
	int balance;
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
		Ac1.Account_num = "101";
		
		System.out.println(Ac1.toString());
		
		Ac1.deposit(5000);		
		System.out.println(Ac1.toString());
		
		Ac1.withdraw(2000);		
		System.out.println(Ac1.toString());
		
		Ac1.withdraw(3500);		

	}

}
/*
 * 
 */
