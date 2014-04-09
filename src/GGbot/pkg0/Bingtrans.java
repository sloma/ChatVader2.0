/*
 *Bing translation
 */

package GGbot.pkg0;

import com.memetix.mst.detect.Detect;
import com.memetix.mst.language.Language;
import com.memetix.mst.translate.Translate;

/*
 *
 * @author salimbouassida
 */
public class Bingtrans {
    
  public static String Trans(String input) throws Exception{
      
      
    //Get the connection  
    Translate.setClientId("sloma27");
    Translate.setClientSecret("fLqOxGkBdSFZzbzvm8bbJaEkB1BcuHT9taPWBLYDdxY=");
 
    // Detects the language
    Language from=Detect.execute(input);
    
    String language="'"+from.toString()+"'";
    //Search translation to english
    String translate = Translate.execute(input, from, Language.ENGLISH);
    //returns translated sentece
    String  a="The language is "+language+" it means: "+translate;
     return a;
   
  }
}