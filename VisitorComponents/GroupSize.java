package VisitorComponents;

import DesignPatterns.Visitable;
import DesignPatterns.Visitor;

/****************************************************
 * This User class is using only one Design Patterns
 * VistorPattern
****************************************************/

public class GroupSize implements Visitable {
    
    private int size;
    
    public GroupSize(){
        
        this.size = 0;
    }

    public int getSize() {
        return size;
    }
    
    public void AddOne(){
        size++;
    }
    
    //Used for VistorPattern
    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    } 
}
