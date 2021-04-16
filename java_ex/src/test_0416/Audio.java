package test_0416;

class Volume {
	
	private int volume;

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
}

public class Audio implements RemoteControl {
	
	private Volume audioVolume;
	private boolean mute;
	
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("Audio 무음 처리합니다");
		} else {
			System.out.println("Audio 무읍 해제합니다");
		}
	}
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 킵니다");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.audioVolume.setVolume(RemoteControl.MAX_VOLUME);
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.audioVolume.setVolume(RemoteControl.MIN_VOLUME);
		} else {
			this.audioVolume.setVolume(volume);
		}
		System.out.println("현재 Audio 볼륨: " + this.audioVolume.getVolume());
	}
}
