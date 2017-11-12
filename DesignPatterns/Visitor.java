package DesignPatterns;

import Model.User;
import Model.UserGroup;
import VisitorComponents.GroupSize;
import VisitorComponents.PositiveSize;
import VisitorComponents.TweetSize;
import VisitorComponents.UserSize;

public interface Visitor {
    
    public int visit(UserSize userSize );
    public int visit(GroupSize groupSize);
    public int visit(TweetSize tweetSize);
    public int visit(PositiveSize positivePercentage);
}