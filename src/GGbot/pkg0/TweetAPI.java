/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.*/
 

package GGbot.pkg0;

import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;


public class TweetAPI {

   /**
     * @param 
     * @throws twitter4j.TwitterException
     */
        // TODO Auto-generated method stub
    
 public static void main(String[] args) throws TwitterException {
    
             String consumerKey ="uivD3opXOo7ThdWIJO5v6Bbdl";
             String consumerSecret="llNKoEkl5wN9Le36W6VwX5Z7qpK2zf2aUEqMqTBAUGjnPjVeCv";
             String accessToken="896548082-E2TCi0pm3eYRFvJC97NcZ2fuHsAWy3PlOfGMo6AX";
             String accessTokenSecret="ZHr1Kn9Ijro46fQ8gy9N5hlC4DMaiu1tXljofTGVMvQh8";
            
             Twitter twitter = new TwitterFactory().getInstance();
 
             twitter.setOAuthConsumer(consumerKey, consumerSecret);
             AccessToken AccessToken = new AccessToken(accessToken, accessTokenSecret);
             
             twitter.setOAuthAccessToken(AccessToken);

             
            
                ResponseList<Status> statusList = twitter.getUserTimeline("sacarra");
        
                for (Status status : statusList) {
            System.out.println(status.getText());
        }

}
}