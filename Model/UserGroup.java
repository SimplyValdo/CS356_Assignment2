package Model;

import Model.User;
import DesignPatterns.CompositePattern;
import DesignPatterns.Visitable;
import DesignPatterns.Visitor;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/****************************************************
 * This class is using only one Design Patterns
 * CompositePattern
****************************************************/

public class UserGroup implements CompositePattern{
    
    private String uniqueID;
    private List<User> users;
    private List<UserGroup> groups;
    private long timeStamp;
    
    public UserGroup(String id){
        
        this.uniqueID = id;
        this.users = new ArrayList<>();
        this.groups = new ArrayList<>();
        this.timeStamp = System.currentTimeMillis();
        printCreationTime();
    }
    
    public void AddUser(User name){
        users.add(name);
    }
    
    public void AddGroup(UserGroup name){
        groups.add(name);
    }
    
    public String toString(){
        return this.uniqueID;
    }
    
    //Used for CompositePattern
    @Override
    public String  getUniqueID() {
        return this.uniqueID;
    }

    public String getTimeStamp() {
        return new Date(this.timeStamp).toString();
    } 
    
    public void printCreationTime(){
        System.out.println( this.uniqueID + ": Creation Group Time - " + getTimeStamp());
    }
}
