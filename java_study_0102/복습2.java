package java_study_0102;

import java.util.ArrayList;

class Book{
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
public String getAuthor() {
		return author;
	}
}

public class 복습2 {

	public static void main(String[] args) {
		
		//Book 객체를 저장할 ArrayList 생성
		ArrayList<Book> library = new ArrayList<>();
		Book b = new Book("자바의 정석", "남궁성");
		library.add(b);  //책을 넣자.
		library.add(new Book("데이터 구조와 알고리즘", "홍길동"));
		library.add(new Book("AI", "박길동"));
		
		//퀴즈) for-each 문으로 저장된 도서를 하나씩 출력해보세요.
//		for(String s : library) {     
//			System.out.println(s);     //나 : 실패
//		}
		for(Book book : library) {   //선생님
			System.out.println("제목 : " + book.getTitle() + " ,  저자 : " + book.getAuthor());
		}
		//ArrayList 크기 확인
		System.out.println(library.size() + "권");
		//특정 인덱스의 책 정보 가져오기
		Book book = library.get(1);
		System.out.println("책 이름 : " + book.getTitle());
		
		//퀴즈) 0번째 요소 삭제 후 사이즈 출력하기
		library.remove(0);
		System.out.println(library.size() + "권이다.");    //successful!

	}

}
