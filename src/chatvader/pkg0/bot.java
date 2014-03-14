package chatvader.pkg0;


import static chatvader.pkg0.bot.a;
import java.util.*;
public class bot {
    // Each variable is set at 1, then each time a method is called the variable 
    // increases by 1. When the variable reaches max, it is reset to 1;
    static int n=1;
    static int Hii=1;
    static int Mi=1;
    static int Wi=1;
    static int byei=1;
    static String part1="";
    static String part2="";
    static String a="";
    static String look="";
    
   public static String Bot(String input){
        
        // checks for which method to call first
        
		if(test(input,Synonym.hello))
			return Hi(input);
                else if(test(input,Synonym.insult))
                        return "no need to be rude..";
		else if(input.contains("where"))
			return	Where(input);
		else if(input.contains("how"))
			return How(input);
		else if(input.contains("what")|input.startsWith("wat"))
			return What(input);
		else if(input.contains("why")|input.startsWith("y "))
			return Why(input);
		else if(input.contains("when"))
			return When(input);
		else if(input.contains("?"))
			return Question(input);
                else if(test(input,Synonym.thank))
                    return Welcome();
		else if(test(input,Synonym.bye))
			return Bye();
                else if(test(input,Synonym.yes))
                        return More();
                else if(test(input,Synonym.no))
                        return Bye();
		else return generic(input);


	}
    //check if the input contains a word from the array
public static boolean test(String inputString, String[] items){
    for(int i =0; i < items.length; i++)
    {
        if(inputString.contains(items[i]))
        {
            return true;
        }
    }
    return false;
}


private static  String Hi(String input){
       
            if (Hii==3)
            Hii=1;
		
		switch (Hii) {
            case 1:  part1 = "Hello, Summoner ";
                break;
            case 2:  part1 = "Greetings, Summoner";
            break;}
       
        if(input.contains("where"))
			part2=	Where(input);
		else if(input.contains("how"))
			part2= How(input);
		else if(input.contains("what")|input.startsWith("wat"))
			part2= What(input);
		else if(input.contains("why")|input.startsWith("y "))
			part2= Why(input);
		else if(input.contains("when"))
			part2= When(input);
		else if(input.contains("?"))
			part2= Question(input);
                else if(test(input,Synonym.thank))
                    part2= Welcome();
		else if(test(input,Synonym.bye))
			part2= Bye();
                else if(test(input,Synonym.yes))
                        part2= More();
        else  part2="what brings you here?";
        String a= part1+part2;
        Hii++;
        return a;

	}

private static  String Where(String input){
    
		if(input.contains("you")&&(input.contains("liv")||input.contains("from")))
                a="Everywhere and nowhere... I am a Bot after all";
		else generic(input);

		return a;


             }

private static String How(String input){
  boolean x=true;
  
  for(int i =0; i < Library.howdef.length; i++)
  {  if(input.contains(Library.howdef[i][0]))
    { a=Library.howdef[i][1] ;
        x= false;}
        }
         
        if(x)
         return generic(input);
        else
		return a;

	}
private static String What(String input){
    boolean x=true;
                        
    for(int i =0; i < Library.whatdef.length; i++)
    {
        if(input.contains(Library.whatdef[i][0]))
        { a=Library.whatdef[i][1] ;
         x= false;}
        }
         
        if(x)
         return generic(input);
        else
		return a;

	}
private static String Why(String input){
boolean x=true;
  
  for(int i =0; i < Library.howdef.length; i++)
  {  if(input.contains(Library.howdef[i][0]))
    { a=Library.howdef[i][1] ;
        x= false;}
        }
         
        if(x)
         return generic(input);
        else
		return a;


	}
private static String When(String input){
	boolean x=true;
  
  for(int i =0; i < Library.whendef.length; i++)
  {  if(input.contains(Library.whendef[i][0]))
    { a=Library.whendef[i][1] ;
        x= false;}
        }
         
        if(x)
         return generic(input);
        else
		return a;

	}
private static String Question(String input){
		boolean x=true;
  
  for(int i =0; i < Library.howdef.length; i++)
  {  if(input.contains(Library.howdef[i][0]))
    { a=Library.howdef[i][1] ;
        x= false;}
        }
         
        if(x)
         return generic(input);
        else
		return a;
}
    

private static String generic(String input){

	if (n==10){n=1;}
        
        boolean x=true;
                        
    for(int i =0; i < Library.whatdef.length; i++)
    {
        if(input.contains(Library.whatdef[i][0]))
        { a=Library.whatdef[i][1] ;
         x= false;}
        }
         
        if(x)
         return generic(input);
        else
            
            switch (n) {
                case 1:  a = "I was not able to understand :s could you rephrase?";
                    break;
                case 2:  a = "Good question";
                    break;
                case 3:  a = "Can I help you?";
                    break;
                case 4:  a = "Brb, I'll ask my creator";
                    break;
                case 5:  a = "Do you want to hear a joke? Brand got banned for flaming";
                    break;
                case 6:  a = "I am here to teach you how to play league";
                    break;
                case 7:  a = "If you already know the basics, you can ask me questions about how to support";
                    break;
                case 8:  a = "I hope this is helpful, any questions?";
                    break;
                case 9:  a = "/all PLEASE REPORT USER FOR TOO MUCH QUESTIONS... jk :p";
                    break;
                
            }
            n++;
            
        return a;}
        
        
private static String More(){
             
             if (Mi==4)
                 Mi=1;
             
            switch(Mi){
                case 1: a="Great! what do you have on your mind?";
                    break;
                case 2: a="Ask me anything";
                    break;
                case 3: a="PLEASE REPORT FOR TOO MUCH QUESTIONS!.. jk :p  go ahead!";
            }
            
                    return a;
        } 
        

private static  String Welcome(){
           
            
             if (Wi==4)
                 Wi=1;
             
            switch(Wi){
                case 1: a="You are welcome! Do you have any more questions?";
                case 2: a="My pleasure! Do you need anything else?";
                case 3: a="Glad I could help! Do you have any other questions?";
            }
            return a;
        }
private static String Bye(){
    
            if (byei==4)
                 byei=1;
             
            switch(Wi){
                case 1: a="Bye! I hope to see you again soon.";
                case 2: a="Glad i could help, Cya";
                case 3: a="Good luck ! bye";
            }
            return a;
}

    

}