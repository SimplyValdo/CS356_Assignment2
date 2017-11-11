package Model;

import java.util.ArrayList;
import java.util.List;

public class Followings {
    
    private List<User> followings;
    
    Followings(){
        
        this.followings = new ArrayList<>();
    }

    public List<User> getListFollowings() {
        return followings;
    }

    public void setListFollowings(List<User> followings) {
        this.followings = followings;
    }
    
    public boolean addNewFollowings(User user){
        if(!AlreadyFollowing(user)){
            followings.add(user);
            return false;
        }
        
        return true;    
    }
    
    public boolean AlreadyFollowing(User userName){
        
       for(User eachFollowing: followings){

           if(eachFollowing.getUniqueID().equals(userName.getUniqueID())){
               return true;
           }
       }

       return false;
   }
}
