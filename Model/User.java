package Model;

import DesignPatterns.CompositePattern;
import java.util.ArrayList;
import java.util.List;

public class User implements CompositePattern  { 
    
    private String uniqueID;
    //private List<User> followers; //Observer
    //private List<User> followings; //Subject
    //private List<String> newsFeed; //Updating
    
    //The User is the Observer/Subject
    //Followers are the Observer
    //Followings are the Subject
    
    //Scenerio # 1: [User ->Observer] , You are watching the [followings -> Subject]
    //Scenerio # 2: [User -> Subject], You are being watch by the [Followers -> Observer]
    
    private Followers followers;
    private Followings followings;
    private NewsFeed newsfeed;
    
    
    public User(String id){
        
        this.uniqueID = id;
        //this.followers = new ArrayList<>();
        //this.followings = new ArrayList<>();
        //this.newsFeed = new ArrayList<>();
        this.followers = new Followers();
        this.followings = new Followings();
        this.newsfeed = new NewsFeed();
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

    public Followers getFollowers() {
        return followers;
    }

    public void setFollowers(Followers followers) {
        this.followers = followers;
    }

    public Followings getFollowings() {
        return followings;
    }

    public void setFollowings(Followings followings) {
        this.followings = followings;
    }

    public NewsFeed getNewsfeed() {
        return newsfeed;
    }

    public void setNewsfeed(NewsFeed newsfeed) {
        this.newsfeed = newsfeed;
    }
}
