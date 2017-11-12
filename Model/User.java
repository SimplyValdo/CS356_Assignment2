package Model;

import DesignPatterns.CompositePattern;
import DesignPatterns.ObserverPattern;
import DesignPatterns.Visitable;
import DesignPatterns.Visitor;
import DesignPatterns.Subject;
import java.util.ArrayList;
import java.util.List;

/************************************************
 * This class is using two Design Patterns
 * CompositePattern, ObserverPattern
************************************************/

public class User extends Subject implements CompositePattern, ObserverPattern  { 
    
    private String uniqueID;
    
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
        this.followers = new Followers();
        this.followings = new Followings();
        this.newsfeed = new NewsFeed();
    }

    //Used for CompositePattern
    @Override
    public String getUniqueID() {
        return uniqueID;
    }

    public String toString(){
        return this.uniqueID;
    }

    public Followers getFollowers() {
        return followers;
    }

    public Followings getFollowings() {
        return followings;
    }

    public NewsFeed getNewsfeed() {
        return newsfeed;
    }

    public boolean Follow(User user){
        user.attach(this);
        return followings.addNewFollowings(user);
    }
    
    public void beFollowed(User user){
        followers.addNewFollower(user);
    }
    
    public void tweet(String message){
        newsfeed.addNews(message);
        notifyObservers();
    }
    
    public String getLastTweet(){
        return newsfeed.getLastNews();
    }

    //Used for ObserverPattern
    @Override
    public void update(Subject subject) {
        if (subject instanceof User) {
            this.newsfeed.addNews(((User)subject).getLastTweet());        
        }
    }
}
