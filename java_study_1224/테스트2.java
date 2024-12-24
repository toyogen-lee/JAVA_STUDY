package java_study_1224;

//***********
class Book{
	private String title;
	private int price;
	public Book(String title, int price){
		this.title = title;
		this.price = price;
	}
	public void showBook() {
		System.out.println(this.title + "의 가격은 " + this.price + "원입니다.");
	}
	public int getPrice() {
		return this.price;
	}
	public String getTitle() {
		return this.title;
	}
}
public class 테스트2 {

	public static void main(String[] args) {
		/*
		 * 객체 배열(동일한 데이터타입을 저장하는 공간 혹은 자료구조)
		 * 자바는 객체도 데이터타입(자바는 일반 데이터타입(int, double, boolean...) + 객체(클래스)
		 */
		int [] array = new int[10];
		String [] array2 = new String[10];
		
		Book[] bookArray = new Book[10];    //저장 공간이 10개인 Book 타입 배열
		/*
		 * bookArray 에 올 수 있는 데이터는 2개입니다.
		 * Book, Object
		 */
		Book book1 = new Book("자바의 정석", 30000);
		Book book2 = new Book("파이썬 기초", 25000);
		Book book3 = new Book("알고리즘 입문", 40000);
		
		bookArray[0] = book1;
		bookArray[1] = book2;
		bookArray[2] = book3;
		
		bookArray[0].showBook();
		bookArray[1].showBook();
		bookArray[2].showBook();
		
		for(int i=0; i<3; i++) {
			bookArray[i].showBook();
		}
		System.out.println("=========================");
		for(int i=0; i<3; i++) {
			//퀴즈 : bookArray 에  있는 책 중에 가격이 3만원 이상인 책 정보 출력하기
			if(bookArray[i].getPrice() >= 30000) {
				bookArray[i].showBook();
			}
		} System.out.println("=========================");
		for(int i=0; i<3; i++) {
			//퀴즈 : 책 제목 '파이썬 기초' 책 정보 출력하기
			String ti = bookArray[i].getTitle();
			if(ti.equals("파이썬 기초")) {
				bookArray[i].showBook();
			}
		}
		
		Object[] bookArray2 = new Object[10];   //book 배열에 Object 대입 가능
		bookArray2[0] = book1;

	}

}
