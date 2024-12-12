package java_study_1212;
//8.
class calculator {
	public int add(int a, int b) {return a+b;}
	public double avg(double a, double b, double c, double d) {return (a+b+c+d) / 4;} //9.
}
//14.
class book {
	String title;
	String author;
}

public class 문제 {

	public static void main(String[] args) {
		//1. b   3. b   4. b   6. b   10. b   11. d   12. c   13. b          2. a  5. a  7. c
		calculator s = new calculator();   //8.
		int r = s.add(40, 60); System.out.println(r);
		
		book b = new book();   //14.
		b.title = "사피엔스";
		b.author = "유발 하라리";
		System.out.println(b.title + " by " + b.author);
		
		double r2 = s.avg(50, 100, 70, 90); System.out.println(r2);   //9.

	}

}
