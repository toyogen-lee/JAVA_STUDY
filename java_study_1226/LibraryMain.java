package java_study_1226;
//마지막순서 : 메인함수 만들어서 출력
import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		LibraryService library = new LibraryServiceImpl(10);    //인터페이스 타입으로 선언
		
		while(true) {    //무한 반복
			System.out.println("~~~~도서관리 프로그램~~~~");
			System.out.println("메뉴를 선택하세요.");
			System.out.println("[1]도서 추가   [2]도서 검색   [3]시스템 종료");
			System.out.print("번호입력 : ");
			int choice = s.nextInt();
			s.nextLine();    //버퍼 지우기
			
			if(choice == 1) {
				System.out.print("제목 입력 : ");
				String title = s.nextLine();
				System.out.print("저자 : ");
				String author = s.nextLine();
				System.out.print("ISBN : ");
				String isbn = s.nextLine();
				library.addBook(new Book(title, author, isbn));    //도서 추가 로직
			} else if(choice == 2) {
				System.out.print("검색어 : ");
				String keyword = s.next();
				library.searchBook(keyword);
			} else if(choice == 3) {
				System.out.println("시스템을 종료합니다.");
				s.close();   //스캐너 종료
				System.exit(0);   //콘솔 강제종료
			} else System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
		}

	}

}
