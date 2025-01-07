package java_study_0107;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener { //게임 핵심 로직 구현하는 클래스
	
	private Player player;
	private ArrayList<Circle> circles;
	private Timer timer;
	private int score;
	private boolean isGameOver;
	
	public GamePanel() throws Exception {
		setBackground(new Color(0, 150, 200)); //배경화면 색깔 지정
		setFocusable(true);
		
		player = new Player(220, 400); //x 좌표 220, y 좌표 400
		circles = new ArrayList<>();
		score = 0;
		isGameOver = false;
	}
	
	@Override
	protected void paintComponent(Graphics g) { //화면에 그림을 그리는데 필요한 모든 설정값을 정하는 메소드
		super.paintComponents(g);
		player.draw(g); //플레이어 그리기
		
		//점수 표시
		g.setColor(Color.WHITE);
		g.setFont(new Font("Arial", Font.BOLD, 20)); //폰트 크기, 폰트 설정
		g.drawString("Score : " + score, 10, 25);
		
		//공 그리기
		for(Circle c : circles) {
			c.draw(g);
		}
		if(isGameOver) {
			
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//공 생성하기
		if(!isGameOver) { //게임이 끝난게 아니라면
			//공 무한 생성하기
			if(Math.random() < 0.02) { //0.02초 간격으로 공 추가
				int x = (int) Math.random() * 460; //공 x 좌표 랜덤값
				circles.add(new Circle(x, 0)); //y 좌표는 0부터 시작
			}
			
			//공 이동시키기
			for(int i = circles.size() - 1; i >= 0; i--) {
				Circle c = circles.get(i);
				c.move(); //y 좌표 움직이게 하기(위에서 아래로 공이 떨어짐)
				
				if(c.getY() > 500) { 
					circles.remove(i); //화면 밖으로 나간 공 제거
					++score;
				}
			}
		}
		repaint();
	} //메소드 끝

}
