package java_study_1231;

import java.util.ArrayList;

class Emp{ //사원 클래스
	String ename; //이름
	int sal; //급여
	String dname; //부서
	String job; //담당업무
	
	Emp(String ename, int sal, String dname, String job) {
		this.ename = ename;
		this.sal = sal;
		this.dname = dname;
		this.job = job;
	}
}

public class 수업2 {

	public static void main(String[] args) {
		/*
		 * ***ArrayList : 동적 크기 조절이 가능한 자료구조(배열)
		 * HashSet : 중복 허용하지 않는 고유한 값만 저장되는 자료구조(배열)
		 * ***HashMap : key, value 의 쌍으로 데이터를 저장하는 자료구조(배열)
		 */
		ArrayList<Emp> emp = new ArrayList<Emp>();
		emp.add(new Emp("king",5000,"president","accounting"));
		emp.add(new Emp("jonse",2975,"salesman","sales"));
		emp.add(new Emp("allen",1250,"salesman","sales"));
		emp.add(new Emp("turner",1500,"salesman","sales"));
		Emp e1 = emp.get(1);
		System.out.println("사원 이름 : " + e1.ename);
		System.out.println("사원 급여 : " + e1.sal);
		
		int salSum = 0;
		int salAvg = 0;
		for(Emp e : emp) {
			salSum += e.sal;
		} System.out.println("사원 총 급여 : " + salSum);
		salAvg = salSum / emp.size();
	    System.out.println("사원 총 급여 평균 : " + salAvg);
	    
	    //퀴즈) "sales" 담당업무 사원 수 구하기
//	    int count = 0;
//	    if(e1.job.contains("sales") == true) {
//	    	count++;
//	    } System.out.println(count);               //나 - 오답
	    int count = 0;
	    for(Emp e : emp) {
	    	if(e.job.contains("sales")) {
	    		count++;
	    	}
	    } System.out.println("sales 사원 수 : " + count);     //선생님
	    
	    //퀴즈) 사원 이름 allen, turner 의 급여, 부서 조회 (이건 맞춤)
	    for(Emp e : emp) {
	    	if(e.ename.contains("allen") || e.ename.contains("turner")) {
	    		System.out.println(e.sal);
	    		System.out.println(e.dname);
	    	}
	    }

	}

}
