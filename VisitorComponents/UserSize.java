package VisitorComponents;

import DesignPatterns.Visitable;
import DesignPatterns.Visitor;

/****************************************************
 * This User class is using only one Design Patterns
 * VistorPattern
****************************************************/

public class UserSize implements Visitable {
    
    private int size;
    
    public UserSize(){
        this.size = 0;
    }

    public int getSize() {
        return size;
    }
    
    public void addOne(){
        size++;
    }
    
    //Used for VistorPattern
    @Override
    public int accept(Visitor visitor) {
       return visitor.visit(this);
    }
}
