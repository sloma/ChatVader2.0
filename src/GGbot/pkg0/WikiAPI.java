/*
 * Wikipedia
 */

package GGbot.pkg0;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang.WordUtils;
import org.wikipedia.Wiki;

public class WikiAPI {
    
    public static String wiki() throws IOException{
        //connect to the wikipage
      Wiki  wiki = new Wiki("en.wikipedia.org"); 
      wiki.setThrottle(5000); 
   //get info on a page 
      String info=(wiki.getSectionText("League_of_Legends",1)).substring(0, 471);
     //Removes all the URL links fromt the text
      String output=info;
        String urlPattern = "((https?|ftp|gopher|telnet|file|Unsure|http):((//)|(\\\\))+[--><\\w\\d:#@%/;$()~_?\\+-=\\\\\\.&]*)";
        Pattern p = Pattern.compile(urlPattern,Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(output);
        int i=0;
        while (m.find()) {
            output=output.replaceAll(m.group(i),"").trim();
            i++;
        }
        
      
      
    String   a="Information I was able to get from wikipedia:\n"+output;
    return a;
    }
    
    } 


