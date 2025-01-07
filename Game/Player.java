package Game;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Player {
    private int x, y;
    private final int WIDTH = 60;
    private final int HEIGHT = 60;
    private Image playerImage;
    
    public Player(int x, int y) {
        this.x = x;
        this.y = y;
        loadImage();
    }
    
    private void loadImage() {
        try {
            playerImage = null;
            // 이미지 파일은 프로젝트의 resources/images 폴더에 저장해야 합니다
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void moveLeft() {
        if (x > 0) x -= 10;
    }
    
    public void moveRight() {
        if (x < 460) x += 10;
    }
    
    public void draw(Graphics g) {
        if (playerImage != null) {
            g.drawImage(playerImage, x, y, WIDTH, HEIGHT, null);
        } else {
            // 이미지 로드 실패시 기본 도형으로 표시
            g.setColor(Color.ORANGE);
            g.fillOval(x, y, WIDTH, HEIGHT);
        }
    }
    //intersects : 캐릭터와 떨어지는 동그라미 충돌 여부 확인 메소드
    public boolean intersects(Circle mushroom) {
        Rectangle playerBounds = new Rectangle(x, y, WIDTH, HEIGHT);
        Rectangle mushroomBounds = new Rectangle(
            mushroom.getX(), mushroom.getY(), 
            mushroom.getWidth(), mushroom.getHeight()
        ); 
        return playerBounds.intersects(mushroomBounds); //intersects : 충돌되었는지 확인하는 메소드
    }
}