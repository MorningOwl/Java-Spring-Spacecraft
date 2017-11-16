package components;

import org.springframework.stereotype.Component;

@Component
public interface Weaponry {
	public void setMaxBaseDamage(double maxBaseDamage);
	public double getMaxBaseDamage();
	public void setMinBaseDamage(double minBaseDamage);
	public double getMinBaseDamage();
	public void setDamageModifier(double damageModifier);
	public double getDamageModifier();
	public void setAmmoCount(int ammoCount);
	public int getAmmoCount();
	public void setMaxAmmoCount(int maxAmmoCount);
	public int getMaxAmmoCount();
	public void reload();
	public double fireGun();
}
