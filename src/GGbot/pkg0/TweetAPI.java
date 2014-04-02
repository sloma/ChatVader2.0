/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 

package GGbot.pkg0;

import java.util.List;
import twitter4j.Paging;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;



public class TweetAPI {


     public static void main(String[] args) {
         
        
        try {
            Twitter latestTweetChecker = new TwitterFactory.getInstance();
    Paging page = Page(1,1);
    List<Status> statusList = latestTweetChecker.getUserTimeline("rye761",page);

        } catch (TwitterException te) {
            System.out.println("Failed to show status: " + te.getMessage());
            System.exit(-1);
        }
    }
}*/