package components;

import org.springframework.stereotype.Component;

@Component
public class AttackSpacecraft extends Spacecraft {

	Weaponry weaponModule;
	Enginery engineModule;
	
	public Weaponry getWeaponModule() {
		return weaponModule;
	}

	public void setWeaponModule(Weaponry weaponModule) {
		this.weaponModule = weaponModule;
	}

	public Enginery getEngineModule() {
		return engineModule;
	}

	public void setEngineModule(Enginery engineModule) {
		this.engineModule = engineModule;
	}

	@Override
	public String toString() {
		return name + "\nHP: " + this.currentHP + "/" + this.maxHP +
				"\n\nModules\n==================\n" + engineModule + "\n\n" + weaponModule;
	}
}
