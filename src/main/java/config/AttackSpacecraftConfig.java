package config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import components.*;

@Configuration
@ComponentScan(basePackages="components")
public class AttackSpacecraftConfig {

	@Bean
	public SpeedEngineModule speedEngineModule() {
		SpeedEngineModule module = new SpeedEngineModule("Twin Cylinder Engine");
		module.setSpeed(2);
		module.setHyperdriveCount(3);
		return module;
	}
	
	@Bean
	public TurretModule turretModule() {
		TurretModule module = new TurretModule("Plasma Turret");
		module.setMinBaseDamage(6);
		module.setMaxBaseDamage(12);
		module.setAmmoCount(18);
		module.setMaxAmmoCount(18);
		module.setDamageModifier(1);
		return module;
	}
	
	@Bean
	public AttackSpacecraft attackSpacecraft() {
		AttackSpacecraft spacecraft = new AttackSpacecraft();
		spacecraft.setName("Spring Wing Fighter");
		spacecraft.setEngineModule(speedEngineModule());
		spacecraft.setWeaponModule(turretModule());
		spacecraft.setCurrentHP(100);
		spacecraft.setMaxHP(100);
		return spacecraft;
	}
}
