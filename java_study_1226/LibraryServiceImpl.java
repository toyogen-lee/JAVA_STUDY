package java_study_1226;
//인터페이스를 구현할 클래스 명명규칙 맨 뒤에 implements 라고 작성한다.
//2번째 순서
public class LibraryServiceImpl implements LibraryService{
	private Book[] books;    //Book 타입을 저장하는 클래스 배열
	private int bookCount;
	public LibraryServiceImpl(int capacity) {
		books = new Book[capacity];
		bookCount = 0;
	}

	@Override
	public void addBook(Book book) {
		if(bookCount < books.length) {
			books[bookCount] = book;
			bookCount++;
			System.out.println(book.getTitle() + " 도서가 추가되었습니다.");
		} else System.out.println("도서가 가득 찼습니다.");
		
	}

	@Override
	public void searchBook(String keyword) {
		//도서 제목으로 검색하는 로직 구현해보자.
		boolean isFlag = false;    //플래그 값
		for(int i=0; i<bookCount; i++) {
			//contains : 해당 문자가 포함하는지 여부를 true or false 로 return 한다.
			if(books[i].getTitle().contains(keyword) ||
					books[i].getAuthor().contains(keyword) ||
					books[i].getIsbn().contains(keyword)) {
				System.out.println(books[i].toString());    //해당 도서 출력
				isFlag = true;
			}
		} if(!isFlag) System.out.println("검색 결과가 없습니다.");
		
	}

}
