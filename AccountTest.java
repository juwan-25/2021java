package Class;

class Account{
	private int Account_num;
	private int balance;
	static int base_Acc_num=100; //�������� ����ϴ� ����
	Account(){
		Account_num=++base_Acc_num;
	}
	void deposit(int money) {
		balance+=money;
	}
	void withdraw(int money) {
		if(money>balance) System.out.println("�ܾ��� �����մϴ�.");
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
 * static�� ���� Ŭ������ �����ؼ� ����ϴ� ������ ������ �� ����
 * -> static ����, Ŭ���� ����
 * => C�� ���������� ���� ������ ���� �ƴ�
 * 
 */
