package components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class Spacecraft {
	
	protected String name;
	protected int currentHP;
	protected int maxHP;
	@Autowired
	protected Journal journal;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCurrentHP() {
		return currentHP;
	}
	
	public void setCurrentHP(int currentHP) {
		this.currentHP = currentHP;
	}
	
	public int getMaxHP() {
		return maxHP;
	}
	
	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}
	
	public Journal getJournal() {
		return journal;
	}
	
	public abstract String toString();


}
