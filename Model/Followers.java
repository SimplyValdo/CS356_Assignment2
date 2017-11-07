package Model;

import java.util.ArrayList;
import java.util.List;

public class Followers {
    
    private List<User> followers;
    
    Followers(){
        
        this.followers = new ArrayList<>();
    }

    public List<User> getFollowers() {
        return followers;
    }

    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }
}
