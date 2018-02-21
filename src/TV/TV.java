package TV;

public class TV {
	private int channel;
	private int volume;
	private boolean power;

	public TV() {
	}

	public TV(int channel, int volume, boolean power) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public void power(boolean on) {
		if (on) {
			power = true;
			return;
		}
		power = false;
	}

	public void channel(int channel) {
		if (channel <= 0 && channel > 255) {
			System.out.println("채널 범위를 벗어납니다.");
			return;
		}
		this.channel = channel;
	}

	public void channel(boolean up) {
		if (up) {
			channel++;
			if (channel > 255) {
				channel = 1;
			}
			return;
		} else {
			channel--;
			if (channel < 1) {
				channel = 255;
			}

		}
	}

	public void volume(int volume) {
		if (volume < 0 && volume > 100) {
			System.out.println("볼륨 범위를 벗어납니다.");
			return;
		}

		this.volume = volume;
	}

	public void volume(boolean up) {
		if (up) {
			volume++;
			if (volume > 100) {
				volume = 0;
			}
			return;
		} else {
			volume--;
			if (volume < 0) {
				volume = 100;
			}
		}

	}

	public void status() {
		System.out.println("TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]");
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}

}
