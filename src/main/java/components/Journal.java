package components;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Journal {
	private List<String> entries;
	
	public Journal() {
		entries = new LinkedList<String>();
	}
	
	public void insertEntry(String entry) {
		entries.add(entry);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for(String entry: entries) {
			sb.append("Day " + count + ": " + entry + "\n");
			count++;
		}
		return sb.toString();
	}
}
