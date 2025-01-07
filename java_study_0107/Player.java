package java_study_0107;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.imageio.ImageIO;

public class Player { //게임 캐릭터 클래스
	private int x;
	private int y;
	private int width = 60;
	private int height = 60;
	private Image playerImage;
	
	public Player(int x, int y) throws Exception{
		this.x = x;
		this.y = y;
		//D드라이브에 저장된 이미지 불러오기 read!
		playerImage = ImageIO.read(getClass().getResource("D:\\game\\user.gif"));
	}
	
	public void draw(Graphics g) { //캐릭터를 화면에 그리기
//		g.drawImage(playerImage, x, y, width, height, null); //화면에 캐릭터 그리기
		g.setColor(Color.gray);
		g.fillOval(x, y, width, height);
	}

}
