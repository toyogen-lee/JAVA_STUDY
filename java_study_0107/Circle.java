package java_study_0107;

import java.awt.Color;
import java.awt.Graphics;

public class Circle { //적(공) 클래스
	private int x;
	private int y;
	private int width = 60;
	private int height = 60;
	public Circle(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void move() {
		y += 3; //공은 y 축으로 움직
	}
	public void draw(Graphics g) {
		g.setColor(Color.gray);
		g.fillOval(x, y, width, height); //공 좌표와 크기 설정
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}

}
