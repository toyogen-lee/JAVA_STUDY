package library;

import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		LibraryServiceImpl library = new LibraryServiceImpl();
		
		while(true) {
			System.out.println("@@@@도서관리 프로그램@@@@");
			System.out.println("[1]도서 추가  [2]도서 검색  [3]도서 삭제  [4]모든 도서 조회  [5]종료");
			System.out.print("메뉴를 선택하세요 : ");
			int choice = s.nextInt();
			s.nextLine();
			if(choice == 1) {
			   System.out.print("제목 : ");
			   String title = s.nextLine();
			   System.out.print("저자 : ");
			   String author = s.nextLine();
			   System.out.print("ISBN : ");
			   String isbn = s.nextLine();
			   library.addBook(new Book(title, author, isbn));
			} else if(choice == 2) {
				System.out.print("검색어 : ");
				String keyword = s.nextLine();
				library.searchBook(keyword);
			} else if(choice == 3) {
				System.out.print("삭제할 도서의 ISBN : ");
				String removeIsbn = s.nextLine();
				library.removeBook(removeIsbn);
			} else if(choice == 4) {
				System.out.println("모든 도서 목록 : ");
				for(Book b : library.getAllBooks()) {
					System.out.println("제목 : " + b.getTitle());
				}
			} else if(choice == 5) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			} else {
				System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
			}
		}

	}

}
