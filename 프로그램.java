package library;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class myFrame extends JFrame {  //프레임 클래스 상속
	public myFrame() {
		setTitle("스윙 프로그램 만들기");  //프로그램 제목
		setSize(500,600);  //500X600 크기 프로그램
		setVisible(true);  //프로그램 화면에 보이게 하기
	}
}
public class 프로그램 {
	public static void main(String[] args) {
		myFrame f = new myFrame();
		
		Container c = f.getContentPane();
		c.setLayout(new FlowLayout());  //레이아웃 지정
		c.setBackground(Color.orange);  //배경화면 색 지정
		
		c.add(new JButton("OK"));  //버튼 생성
		c.add(new JButton("Cancel"));
		c.add(new JButton("Ignore"));
		
		f.setVisible(true);  //버튼 화면에 보이게 하기
	}

}
