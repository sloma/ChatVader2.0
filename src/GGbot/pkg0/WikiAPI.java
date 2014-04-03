/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GGbot.pkg0;

import java.util.Scanner;

/**
 *
 * @author salimbouassida
 */
public class WikiAPI {
    
    public static void main (String[] args){
        
        
        String[] listOfTitleStrings = { "Web service" };
User user = new User("", "", "http://en.wikipedia.org/w/api.php");
user.login();
List<Page> listOfPages = user.queryContent(listOfTitleStrings);
for (Page page : listOfPages) {
  WikiModel wikiModel = new WikiModel("${image}", "${title}");
  String html = wikiModel.render(page.toString());
  System.out.println(html);
}
    }
    
    }

