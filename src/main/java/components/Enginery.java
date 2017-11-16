package components;

import org.springframework.stereotype.Component;

@Component
public interface Enginery {
		public void setSpeed(int speed);
		public int getSpeed();
		public int getHyperdriveCount();
		public void setHyperdriveCount(int hyperdriveCount);
		public boolean isHyperdriveOnCooldown();
		public void setHyperdriveOnCooldown(boolean isHyperdriveOnCooldown);
}
