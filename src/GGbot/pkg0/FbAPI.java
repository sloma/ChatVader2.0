/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GGbot.pkg0;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.Page;
import com.restfb.types.User;

public class FbAPI {
	
	public static void main(String[]args){
		FacebookClient fbClient = new DefaultFacebookClient("CAAFVZA1bHOcsBAGfREZBOZBWhGpwpqVzrPxNJ4SLXiawbUCLZBoQhKOqpF9wXTWtsOslfHro6ZC5ZCcpZBgSpf2JDykAtQ6fCtn6mZCreMgNbccdYe9dFYoi1laUwcIM1Icj6eyPqLBr94mihPujDkxbgtsXYHHuS5mwsbeEvkZAQQ4GNDO6MejzJN2AntRq1h5PEzP7sePDTxwZDZD");
		String toPrint="Info on this player:";
                
		Page me = fbClient.fetchObject("darth.vader",Page.class);
               
               try{
            if(me.getName()!=null)
                    toPrint=toPrint+"\n-Name: "+me.getName();
            if(me.getDescription()!=null)
                    toPrint=toPrint+"\n-Description: "+me.getDescription();
            if(me.getLikes()!=null)
                    toPrint=toPrint+"\n-Likes: "+me.getLikes();
            if(me.getAbout()!=null)
                    toPrint=toPrint+"\n-About: "+me.getAbout();
            if(me.getType()!=null)
                    toPrint=toPrint+"\n-Type: "+me.getType();
            if(me.getGeneralInfo()!=null)
                    toPrint=toPrint+"\n-general: "+me.getGeneralInfo();
          
        }catch(Exception e){toPrint="User not found";}
               
               System.out.println(toPrint);
		
	}
}