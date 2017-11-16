package components;

import org.springframework.stereotype.Component;

@Component
public abstract class Module {
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract String toString();
}
