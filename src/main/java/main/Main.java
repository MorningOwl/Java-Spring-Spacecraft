package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import components.*;

public class Main {	
	
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(config.AttackSpacecraftConfig.class);
		Spacecraft craft = (AttackSpacecraft) context.getBean("attackSpacecraft");
		System.out.println(craft);
	}
}
