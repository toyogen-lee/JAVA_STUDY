package library;

import java.util.ArrayList;

//보통 인터페이스 뒤에 Service 라는 단어를 붙입니다.
public interface LibraryService {
	void addBook(Book book);
	void searchBook(String keyword);
	void removeBook(String isbn);
	ArrayList<Book> getAllBooks(); //도서 전체 조회

}
