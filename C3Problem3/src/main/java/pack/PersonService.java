package pack;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;



public class PersonService {
	
	private Map<Person, Gym> map;

	private List<Person>  theList;
	
	
	private List<String> app;
	
	public void PrintMap() {
		
	}
	
	public void PrintList() {
		for(Person i:theList) {
			System.out.println(i);
		}
	}
	
	public void printAppName() {
		System.out.println(app);
	}

	public Map<Person, Gym> getMap() {
		return map;
	}

	public void setMap(Map<Person, Gym> map) {
		this.map = map;
	}

	public List<Person> getTheList() {
		return theList;
	}

	public void setTheList(List<Person> theList) {
		this.theList = theList;
	}

	public List<String> getApp() {
		return app;
	}

	public void setApp(List<String> app) {
		this.app = app;
	}

	
	
}
