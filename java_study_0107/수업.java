package java_study_0107;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class HelloSwing extends JFrame{
	public HelloSwing() {
	    setTitle("Hello Swing");
	    setSize(300, 200);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    JLabel label = new JLabel("Hello, Swing!"); //글자 생성
	    add(label); //프로그램에 글자 추가
	    
	    JLabel nameLabel = new JLabel("안녕하세요, 저는 홍길동입니다.");
	    add(nameLabel);
	    
	    setVisible(true); //화면 보이게 하기
	}
}

class GridLayoutExample extends JFrame{
	GridLayoutExample() {
		setTitle("그리드레이아웃 연습"); //setTitle() : JFrame 클래스에 있는 함수입니다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프로그램 닫기버튼 클릭 시 종료
		setSize(400, 300);
		
		JPanel panel = new JPanel(new GridLayout(3, 2)); //3행 2열 레이아웃을 만들겠다.
		
		for(int i = 0; i < 6; i++) { //반복문을 이용해서 버튼 6개만 만들기
			panel.add(new JButton("Button " + i));
		} add(panel);
		setVisible(true);
	}
}

public class 수업 {

	public static void main(String[] args) {
		/*
		 * GUI(그래픽 사용자 인터페이스)
		 * 
		 * 자바 스윙(Swing)은 자바에서 그래픽 사용자 인터페이스를 만들기 위한 순수 자바 라이브러리
		 * 1. 모든 컴포넌트(버튼, 입력창, 선택창 etc) 클래스 이름이 'J' 로 시작합니다.
		 * 2. 운영체제와 독립적인 경량 컴포넌트
		 * 3. 다양하고 풍부한 GUI 컴포넌트 제공
		 */
//		new HelloSwing();
		new GridLayoutExample();

	}

}
