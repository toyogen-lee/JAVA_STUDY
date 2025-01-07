package Game;

import java.util.ArrayList;

class Emp{
	private String ename;
	private int sal;
	public Emp(String ename, int sal) {
		this.ename = ename;
		this.sal = sal;
	}
	public String getEname() {
		return ename;
	}
	public int getSal() {
		return sal;
	}
}
public class 복습 {

	public static void main(String[] args) {
		ArrayList<Emp> empList = new ArrayList<>();
		
		//사원 추가
		empList.add(new Emp("홍길동", 4000));
		empList.add(new Emp("박길동", 1000));
		empList.add(new Emp("김길동", 2000));
		empList.add(new Emp("이길동", 6000));
		//퀴즈1) 사원 전체 조회 - 실패
//		for(int i = 0; i < empList.size(); i++) {
//			 System.out.println(empList.get(i));
//		}
		for(Emp e : empList) System.out.println("이름 : " + e.getEname() + ", 급여 : " + e.getSal());
		//퀴즈2) 사원 급여 총합 - 실패
		int sum = 0;
		for(Emp e : empList) sum += e.getSal();
		System.out.println(sum);
		//for-each 와 get 함수를 더 연습하자.

	}

}
