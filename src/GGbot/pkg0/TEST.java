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
public class TEST {
	
	public static void main(String[]args){
		FacebookClient fbClient = new DefaultFacebookClient("CAACEdEose0cBALFtlPD0W8DPBNFoClnnr8bWSclmIvsCSTHAuUxrCwhOlegAA7UPxO8AWwMFOurjYddlAneVyZCPVgtvJ4vgjjc02IZA7GZC1FZB4f56G7Lhj1y6xylOfs0cbcptPrlPfSTr0aMY09GpI0EJjbRxTyx03hrE3MYSXZCprvItg4XlJT7twi1qZCoDlL8miRvAZDZD");
		String toPrint="Info on this player:";
                
		Page me = fbClient.fetchObject("digscarra",Page.class);
               
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