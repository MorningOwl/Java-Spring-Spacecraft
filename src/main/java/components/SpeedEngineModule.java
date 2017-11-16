package components;

import org.springframework.stereotype.Component;

@Component
public class SpeedEngineModule extends Module implements Enginery {

	private int speed;
	private int hyperdriveCount;
	private boolean isHyperdriveOnCooldown;
	
	public SpeedEngineModule(String name) {
		this.name = name;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getHyperdriveCount() {
		return hyperdriveCount;
	}
	
	public void setHyperdriveCount(int hyperdriveCount) {
		this.hyperdriveCount = hyperdriveCount;
	}
	
	public boolean isHyperdriveOnCooldown() {
		return isHyperdriveOnCooldown;
	}
	public void setHyperdriveOnCooldown(boolean isHyperdriveOnCooldown) {
		this.isHyperdriveOnCooldown = isHyperdriveOnCooldown;
	}
	@Override
	public String toString() {
		return name + "\nSpeed: " + speed 
				+"\nHyperdrive count left: " + hyperdriveCount;
	}

	
	

}
