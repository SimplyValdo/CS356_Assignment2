package Model;

import DesignPatterns.CompositePattern;
import java.util.ArrayList;
import java.util.List;

public class User implements CompositePattern { 
    
    private String uniqueID;
    private List<User> followers;
    private List<User> followings;
    private List<String> newsFeed;
    
    public User(String id){
        
        this.uniqueID = id;
        this.followers = new ArrayList<>();
        this.followings = new ArrayList<>();
        this.newsFeed = new ArrayList<>();
    }

    @Override
    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }
    
    public String toString(){
        return this.uniqueID;
    }
}
