package VisitorComponents;

import DesignPatterns.Visitable;
import DesignPatterns.Visitor;
import java.util.ArrayList;
import java.util.List;

/****************************************************
 * This User class is using only one Design Patterns
 * VistorPattern
****************************************************/

public class PositiveSize implements Visitable{
    
    private int positiveCounter;
    private List<String> positiveWords;
    
    public PositiveSize(){
        this.positiveCounter = 0;
        positiveWords = new ArrayList<String>(){{
            add("good");
            add("great");
            add("awesome");
            add("happy");
            add("perfect");
            add("excited");   
        }};
    }
    
    public int getPositiveCounter() {
        return positiveCounter;
    }
    
    public void checkPositiveTweet(String message){
        
        String[] split = message.toLowerCase().split("\\W");
        
        for(int index = 0; index < split.length; index++){
            
            if(positiveWords.contains(split[index])){
                positiveCounter++;
            }
        }
    }
    
    //Used for VistorPattern
    @Override
    public int accept(Visitor visitor) {
       return visitor.visit(this);
    } 
}
