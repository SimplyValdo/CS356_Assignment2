
package VisitorComponents;

import DesignPatterns.Visitable;
import DesignPatterns.Visitor;

/****************************************************
 * This User class is using only one Design Patterns
 * VistorPattern
****************************************************/

public class TweetSize implements Visitable {
    
    private int tweetCounter;
    
    public TweetSize(){
        
        this.tweetCounter = 0;
    }

    public int getTweetCounter() {
        return tweetCounter;
    }
    
    public void addOne(){
        tweetCounter++;
    }
    
    //Used for VistorPattern
    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }  
}
