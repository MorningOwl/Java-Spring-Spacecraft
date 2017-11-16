package components;

import org.springframework.stereotype.Component;

@Component
public class TurretModule extends Module implements Weaponry {
	
	private double minBaseDamage;
	private double maxBaseDamage;
	private double damageModifier;
	private int ammoCount;
	private int maxAmmoCount;
	
	public TurretModule(String name) {
		this.name = name;
	}	
	
	public void setMaxBaseDamage(double maxBaseDamage) {
		this.maxBaseDamage = maxBaseDamage;
	}

	public double getMaxBaseDamage() {
		return maxBaseDamage;
	}

	public void setMinBaseDamage(double minBaseDamage) {
		this.minBaseDamage = minBaseDamage;
	}

	public double getMinBaseDamage() {
		return minBaseDamage;
	}

	public void setDamageModifier(double damageModifier) {
		this.damageModifier = damageModifier;
	}

	public double getDamageModifier() {
		return damageModifier;
	}

	public void setAmmoCount(int ammoCount) {
		this.ammoCount = ammoCount;
	}

	public int getAmmoCount() {
		return ammoCount;
	}
	
	public void setMaxAmmoCount(int maxAmmoCount) {
		this.maxAmmoCount = maxAmmoCount;		
	}

	public int getMaxAmmoCount() {
		return maxAmmoCount;
	}
	
	public void reload() {
		ammoCount = maxAmmoCount;	
	}

	public double fireGun() {
		if(ammoCount == 0) {
			return 0;
		} else {
			ammoCount--;
			double finalDamage =  minBaseDamage + Math.random() * (maxBaseDamage - minBaseDamage);
			finalDamage = finalDamage * damageModifier;
			return finalDamage;
		}
		
	}

	@Override
	public String toString() {
		return name + "\nMinimum base damage: " + minBaseDamage 
				+"\nMaximum base damage: " + maxBaseDamage
				+"\nDamage modifier: " + damageModifier
				+"\nAmmo: " + ammoCount + "/" + maxAmmoCount;
	}


}
