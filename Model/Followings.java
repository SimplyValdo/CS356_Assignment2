package Model;

import java.util.ArrayList;
import java.util.List;

public class Followings {
    
    private List<User> followings;
    
    Followings(){
        
        this.followings = new ArrayList<>();
    }

    public List<User> getFollowings() {
        return followings;
    }

    public void setFollowings(List<User> followings) {
        this.followings = followings;
    }
}
