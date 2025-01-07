package java_study_0107;

import javax.swing.JFrame;

public class Game extends JFrame{
	Game() throws Exception {
		setTitle("게임 만들기");
		setSize(500, 550);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GamePanel gamePanel = new GamePanel();
		add(gamePanel);
		setVisible(true);
	}

	public static void main(String[] args) throws Exception {
		new Game(); //게임 시작

	}

}
