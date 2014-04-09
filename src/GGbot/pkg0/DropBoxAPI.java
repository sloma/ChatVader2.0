package GGbot.pkg0;

/*
 *Drop box
 */
import java.io.IOException;
import com.dropbox.core.DbxClient;
import com.dropbox.core.DbxEntry;
import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.DbxWriteMode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Locale;



public class DropBoxAPI {
    
    public static void Drop(String input) throws FileNotFoundException, UnsupportedEncodingException, DbxException, IOException{
        String a="";
        // Connecttion
        DbxRequestConfig config = new DbxRequestConfig("JavaTutorial/1.0",
            Locale.getDefault().toString());
        String accessToken = "BhCyRoZEEYEAAAAAAAAF6Ls3mOU1z1q2KpT6P8ItC1o36tyzV7S6Led4sUi5gA7z";
        DbxClient client = new DbxClient(config, accessToken);
        
       //create the file         
        PrintWriter writer = new PrintWriter("noteToSelf.txt", "UTF-8");
        writer.println(input);
        writer.close();
       File inputFile = new File("noteToSelf.txt");
     
      //sends the text file to the dropbox
        FileInputStream inputStream = new FileInputStream(inputFile);
        try {
                  DbxEntry.File uploadedFile = client.uploadFile("/noteToSelf.txt",
                     DbxWriteMode.add(), inputFile.length(), inputStream);
    
            } 
        finally {
            inputStream.close();
                     }
     
    }

}