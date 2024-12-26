package java_study_1226;

public class Book {
	//Book 에 관련된 정보들만 작성합니다.
	private String title;   //제목
	private String author;   //저자
	private String isbn;   //도서고유번호
	
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
    //getter 함수
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}
	
	public String toString() {
		return "제목 : " + title + "  |  저자 : " + author + "  |  ISBN : " + isbn;
	}
	

}
