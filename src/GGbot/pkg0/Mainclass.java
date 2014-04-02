/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GGbot.pkg0;

import java.util.Scanner;
import org.apache.commons.lang.WordUtils;
/**
 *
 * @author salimbouassida
 */
public class Mainclass {
  
        
    public static void main(String[] args) throws InterruptedException{
    System.out.print("<User>");
    Scanner scanner = new Scanner(System.in);
    String username = scanner.nextLine();
    Thread.sleep(500);
    System.out.println(WordUtils.wrap("<GGbot>Information collected from Wikipedia:                     League of Legends (LoL) is a multiplayer online battle arena video game developed and published by Riot Games for Microsoft Windows[1] and Mac OS X, inspired by the mod Defense of the Ancients[2] for the video game Warcraft III: The Frozen Throne. ",61));
 
// FB info: Twitter: Scarra

    }
}
