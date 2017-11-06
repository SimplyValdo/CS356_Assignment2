package Model;

import Model.User;
import DesignPatterns.CompositePattern;
import java.util.ArrayList;
import java.util.List;

public class UserGroup implements CompositePattern{
    
    private String uniqueID;
    private List<User> users;
    private List<UserGroup> groups;
    
    public UserGroup(String id){
        
        this.uniqueID = id;
        this.users = new ArrayList<>();
        this.groups = new ArrayList<>();
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
    
    @Override
    public String  getUniqueID() {
        return this.uniqueID;
    }
}
