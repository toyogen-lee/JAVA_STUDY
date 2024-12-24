package java_study_1224;
/*
 * interface or class 대문자로 시작(명명규칙)
 */
public interface Account {       //계좌의 기본 기능을 정의(선언)합니다.
	//첫번째 순서 : 인터페이스 만들기
	/*
	 * 인터페이스 특징
	 * 1. 구현 불가능, 선언만 가능
	 * 2. public 만 작성할 수 있습니다.
	 */
	void deposit(double amount);   //입금
	boolean withdraw(double amount);   //출금
	double getBalance();   //잔액조회
	String getAccountNumber();    //계좌번호 조회

}
