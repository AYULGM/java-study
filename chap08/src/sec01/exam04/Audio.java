package sec01.exam04;

public class Audio implements RemoteControl {

	// 필드
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) { // 인터페이스명.상수명으로 명확하게 출처를 나타냄
			this.volume = RemoteControl.MAX_VOLUME; // 인터페이스명을 안써도 작동은 되긴함.
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}

}
