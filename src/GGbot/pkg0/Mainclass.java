/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GGbot.pkg0;

import com.dropbox.core.DbxException;
import java.io.IOException;
import java.util.Scanner;
import org.apache.commons.lang.WordUtils;
import twitter4j.TwitterException;
/**
 *
 * @author salimbouassida
 */
public class Mainclass {
  
        
    public static void main(String[] args) throws InterruptedException, TwitterException, DbxException, IOException, Exception{
        
   String input="";
        
   System.out.println("Welcomet to GGbot\nFor more information please take a look at the Read Me\n");
   
   System.out.println("- Twitter: PlayerName   (flex, returns the latest tweets from a player)\n"+
   "- Facebook: PlayerName  (flex, returns all the information available about a player)\n"+
   "- Note to self: Input   (notflex, create a new text document with your input, and put it in a drop box)\n"+
   "- Translate: Input      (notflex, detects the language of your input and translate it to english)\n"+
   "- Wiki                  (flex, returns the definition of league of legends from wikipedia\n"+
   "- !Players:             (returns the list of the players available in the library (only players from the teams: Cloud9, CLG, and TSM are available at the moment))\n"+
   "- !dropbox:             (returns the link to the dropbox)\n\n"+
   "Start to chat now!\n");
   while(!input.contains("bye")){
       System.out.print("<User>");
       Scanner scanner = new Scanner(System.in);
         input = scanner.nextLine();
         
        String output= bot.Bot(input.toLowerCase().trim());
       System.out.println("<GGbot>"+ WordUtils.wrap(output, 75));
   }
   

    }
}
