package java_study_1220.bank;

public class BasicAccount implements account{
	//잔액, 계좌번호 필드변수
	//private : 접근지정자 중 하나, 클래스 호출 시 '직접 접근 불가능'
	private String accountNumber;
	private double balance;
	
	public BasicAccount(String accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0;
	}

	@Override
	public void deposit(double amount) {    //amount : 입금한 금액
		if(amount > 0) {    //입금 금액이 0원 이상이라면?
			balance += amount;
			System.out.println("입금 완료 : " + amount);
		} else {
			System.out.println("유효하지 않은 금액입니다.");
		}
		
	}

	@Override
	public boolean withdraw(double amount) {   //amount : 출금할 금액
		if(amount > 0 && balance >= amount) {
			balance -= amount;
			System.out.println("출금 완료 : " + amount);
			return true;
		} else System.out.println("출금 실패 : 잔액 부족 또는 유효하지 않은 금액");
		return false;
	}

	@Override
	public double getBalance() {
		return this.balance;    //잔액 리턴
	}

	@Override
	public String getAccountNumber() {
		return this.accountNumber;    //계좌번호 리턴
	}

}
