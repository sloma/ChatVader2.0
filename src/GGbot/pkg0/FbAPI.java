/*
 * Facebook
 */

package GGbot.pkg0;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.Page;


public class FbAPI {
	
	public static String Fb(String Player){
                String toprint="The information found about this player:\n";
                
                //Start connection
		FacebookClient fbClient = new DefaultFacebookClient();
	
                //get information if found
		Page profile = fbClient.fetchObject(Player,Page.class);
               
               try{
            if(profile.getName()!=null)
                    toprint=toprint+"\n-Name: "+profile.getName();
            if(profile.getDescription()!=null)
                    toprint=toprint+"\n-Description: "+profile.getDescription();
            if(profile.getLikes()!=null)
                    toprint=toprint+"\n-Likes: "+profile.getLikes();
            if(profile.getAbout()!=null)
                    toprint=toprint+"\n-About: "+profile.getAbout();
            if(profile.getType()!=null)
                    toprint=toprint+"\n-Type: "+profile.getType();
            if(profile.getGeneralInfo()!=null)
                    toprint=toprint+"\n-general: "+profile.getGeneralInfo();
          
        }catch(Exception e){toprint="User not found";}
               
               return toprint;
		
	}
}