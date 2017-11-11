package Model;

import java.util.ArrayList;
import java.util.List;

public class NewsFeed {
    
    private List<String> news;
    
    public NewsFeed(){
        
        this.news = new ArrayList<>();
    }

    public List<String> getNews() {
        return news;
    }

    public void setNews(List<String> news) {
        this.news = news;
    }
    
    public void addNews(String message){
        news.add(message);
    }
    public String getLastNews(){
        return news.get(news.size()- 1); 
    }
}
