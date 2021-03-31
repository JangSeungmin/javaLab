package sec02.exam03_abstract_method;

public interface RemoteControl {
	// 상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상 메소드
	abstract void turnOn(); // 앞에 abstract 안써도됨
	void turnOff();
	void setVolume(int volume);
	
}
