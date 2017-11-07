package minitwitter;

import DesignPatterns.ObserverPattern;
import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    
    private List<ObserverPattern> observers = new ArrayList<ObserverPattern>();
	
	public void attach(ObserverPattern observer) {
		observers.add(observer);
	}
	
	public void detach(ObserverPattern observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		for(ObserverPattern ob : observers) {
			ob.update(this);
		}
	}
}
