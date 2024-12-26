package java_study_1226;
class Book{
	String title;
	int price = 1000;
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	public void showBook() {
		String author = "작자미상";     //지역변수는 showBook 메소드 안에서만 사용가능
		System.out.println("title : " + title);    //메소드 안에서 전역변수 접근가능
		System.out.println("price : " + price);
	}
	public void showAuthor() {
		String author = "작자미상";
		int price = 100;
		System.out.println("author : " + author);
		System.out.println("title : " + title);     //전역변수는 어디든 사용 가능(단, 클래스 안에서)
		System.out.println("price : " + price);
		System.out.println("price : " + this.price);
	}
}
public class 복습 {

	public static void main(String[] args) {
        //자바는 클래스(객체)도 '데이터 타입' 이다.
		Book[] bookList = new Book[2];    //Book 타입을 저장하는 배열
		Book book1 = new Book("자바의 정석", 2000);
		bookList[0] = book1;
		bookList[1] = new Book("파이썬의 정석", 1000);
		
		int priceSum = 0;
		for(Book b : bookList) {
			b.showBook();
			//퀴즈) 1. 책 제목이 '자바의 정석' 인 책의 정보(showBook)를 출력하기  -  아깝게 실패
			//2. bookList 에 저장된 책의 총 price 는 얼마인지 구하기  -  성공(방법이 다름)
			if(b.title.equals("자바의 정석")) {
				b.showBook();
			}
			if("자바의 정석".equals(b.title)) {
				b.showBook();
			}
			priceSum += b.price;   //선생님
		}
		for(int i=0; i<2; i++) {
			bookList[i].showBook();
		}
		int a2 = bookList[0].price + bookList[1].price;   //나
		System.out.println(a2);
		System.out.println(priceSum);

	}

}
