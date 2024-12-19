package java_study_1219;
interface MusicPlayer {
	void play();     //인터페이스에는 '메소드 구현' 만 가능
	public void pause();
	public void stop();
	public void next();
	void previous();
}
interface XX{
	
}
class SmartphonePlayer implements MusicPlayer, XX{   //interface 는 콤마로 구분해서 여러 개 구현 가능
	/*
	 * 인터페이스의 주요 특징
	 * 1. 계약 : 인터페이스는 클래스가 특정 메소드를 반드시 구현하도록 강제합니다.
	 * 2. 다중구현 : Java 클래스는 여러 인터페이스를 동시에 구현할 수 있습니다.
	 * 3. 추상화 : 인터페이스는 메소드의 선언만을 포함하며, 구현은 포함하지 않습니다.
	 */

	@Override
	public void play() {
		System.out.println("Smartphone : Playing Music");
	}

	@Override
	public void pause() {
		System.out.println("Smartphone : Pausing Music");
	}

	@Override
	public void stop() {
		System.out.println("Smartphone : Stopping Music");
	}

	@Override
	public void next() {
		System.out.println("Smartphone : Playing Next track");
	}

	@Override
	public void previous() {
		System.out.println("Smartphone : Playing Previous track");
	}
	
}
class DD extends Object{   //자바의 모든 클래스는 기본으로 'Object' 라는 최상위 클래스를 상속받는다.
	
}
public class 수업2 {

	public static void main(String[] args) {
		SmartphonePlayer phone = new SmartphonePlayer();
		phone.play();
		phone.pause();
		phone.previous();

	}

}
