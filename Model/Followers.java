package Model;

import java.util.ArrayList;
import java.util.List;

public class Followers {
    
    private List<User> followers;
    
    Followers(){
        
        this.followers = new ArrayList<>();
    }

    public List<User> getListFollowers() {
        return followers;
    }

    public void setListFollowers(List<User> followers) {
        this.followers = followers;
    }
    
    public void addNewFollower(User user){
        followers.add(user);
    }
}
