package java_study_1224;

public class 테스트3 {

	public static void main(String[] args) {
		Bank bank = new Bank();
		String 계좌번호1 = "123123";
		bank.createAccount(계좌번호1); 
		String 계좌번호2 = "777777";
		bank.createAccount(계좌번호2);
		BasicAccount basicAccount = bank.findAccount(계좌번호2);
		basicAccount.deposit(50000);
		System.out.println("계좌번호 : " + basicAccount.getAccountNumber());
		System.out.println("잔액 : " + basicAccount.getBalance());
		/*
		 * 퀴즈
		 * 계좌번호가 9999인 계좌번호3 생성
		 * 10만원 입금 5만원 출금
		 * 최종 잔액 출력하기
		 */
		String 계좌번호3 = "9999";
		bank.createAccount(계좌번호3);
		BasicAccount ba = bank.findAccount(계좌번호3);
		ba.deposit(100000);
		ba.withdraw(50000);
		System.out.println("최종잔액 : " + ba.getBalance());

	}

}
