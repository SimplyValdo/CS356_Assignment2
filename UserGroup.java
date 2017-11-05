package minitwitter;

import java.util.ArrayList;
import java.util.List;

public class UserGroup {
    
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
}
