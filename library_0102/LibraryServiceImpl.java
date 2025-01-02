package library;

import java.util.ArrayList;

public class LibraryServiceImpl  implements LibraryService {
	private ArrayList<Book> books;
	public LibraryServiceImpl() {
		books = new ArrayList<>();
	}

	@Override
	public void addBook(Book book) {
		books.add(book);   //ArrayList 에 book 추가
		System.out.println("도서가 추가되었습니다.");
	}

	@Override
	public void searchBook(String keyword) {
		boolean isSearch = false;
		for(Book book : books) {
			//퀴즈) 로직구현 -  베낌(실패)
			if(book.getTitle().contains(keyword) || 
					book.getAuthor().contains(keyword) 
					|| book.getIsbn().contains(keyword)) {
				System.out.println(book.getTitle() + ", " + book.getAuthor());
				isSearch = true;
			}
		} if(!isSearch) {
			System.out.println("검색 결과가 없습니다.");
		}
	}

	@Override
	public void removeBook(String isbn) {
		for(int i=0; i<books.size(); i++) {
			Book book = books.get(i);
			if(book.getIsbn().equals(isbn)) {
				books.remove(i);
				System.out.println("도서가 삭제되었습니다.");
			}
		}
	}

	@Override
	public ArrayList<Book> getAllBooks() {
		return new ArrayList<>(books);
	}

}
