package java_study_1224;
/*
 * 인터페이스를 구현한 클래스는 '재정의' 를 무조건 해야 합니다. (계약)
 * extends 보다 implements 더 많이 사용(실무에서)
 */
public class BasicAccount implements Account {      //인터페이스를 '구현(implements)' 한 기본 계좌 클래스
	//두번째 순서 - 'BasicAccount' 클래스 만들기
	
	//필드변수에는 접근지정자(public, private)를 사용할 수 있음
	private String accountNumber;   //계좌번호
	private double balance;   //잔액
	/*
	 * 계좌(기본 정보)
	 * 1. 이름(소유주)
	 * 2. 개설일
	 * 3. 어디 은행?
	 */
	
	/*
	 * 생성자 특징
	 * 1. 생성자 이름 = 클래스 이름
	 * 2. 리턴타입 x
	 */
	public BasicAccount(String accountNumber) {    //생성자(== 초기화 함수)
		this.accountNumber = accountNumber;
		this.balance = 0;
	}

	@Override
	public void deposit(double amount) {
		if(amount > 0) {
			this.balance = amount;
			System.out.println("입금 완료 : " + amount);
		} else System.out.println("유효하지 않은 금액");
		
	}

	@Override
	public boolean withdraw(double amount) {
		if(amount > 0 && this.balance >= amount) {
			this.balance -= amount;
			System.out.println("출금 완료 : " + amount);
		} else System.out.println("출금 실패 : 잔액 부족 또는 유효하지 않은 금액");
		return false;
	}

	@Override
	public double getBalance() {
		//필드변수가 private 이기 때문에 메소드로 필드변수를 호출할 수 있게 만든다.
		return this.balance;
	}

	@Override
	public String getAccountNumber() {
		//필드변수가 private 이기 때문에 메소드로 필드변수를 호출할 수 있게 만든다.
		return this.accountNumber;
	} 
}
