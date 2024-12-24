package java_study_1224;

public class 테스트 {

	public static void main(String[] args) {
		//1. 입금, 출금 테스트하기
		
		String 계좌번호 = "174509";     //지역변수(접근지정자를 사용할 수 없음)
		//메소드 안에 작성된 변수를 '지역변수(로컬변수)' 라고 부름.
		BasicAccount account1 = new BasicAccount(계좌번호);
//		System.out.println("계좌 번호 : " + account1.accountNumber);     private -> 접근 못함
		
		//private 필드변수를 호출하는 메소드를 'getter' 함수라고 한다.
		double 잔액 = account1.getBalance();
		String 계좌번호출력 = account1.getAccountNumber();
		System.out.println("잔액 : " + 잔액);
		System.out.println("계좌번호출력 : " + 계좌번호출력);
		
		account1.deposit(5000);
		잔액 = account1.getBalance();    //잔액 getter 메소드 재호출
		System.out.println("잔액 : " + 잔액);
		
		account1.withdraw(2000);
		잔액 = account1.getBalance();
		System.out.println("잔액 : " + 잔액);
		
		String 계좌번호2 = "123123";
		BasicAccount account2 = new BasicAccount(계좌번호2);
		//account2 에 만원 입금하고 3천원 출금해서 최종 잔액을 출력하시오.
//		double 잔액2 = account2.getBalance();
		account2.deposit(10000);
		account2.withdraw(3000);
//		잔액2 = account2.getBalance();
		System.out.println(account2.getBalance());
		/*
		 * account1 과 account2 는 동일한 BasicAccount 를 호출했지만
		 * 각각 다른 값을 가진 클래스(객체)이다.
		 */

	}

}
