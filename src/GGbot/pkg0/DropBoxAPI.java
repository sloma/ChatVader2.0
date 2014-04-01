/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GGbot.pkg0;

/**
 *
 * @author salimbouassida
 */
public class DropBoxAPI {
import com.dropbox.core.*;
import java.io.*;
import java.util.Locale;

public class Main {
  
        // Get your app key and secret from the Dropbox developers website.
        final String APP_KEY = "INSERT_APP_KEY";
        final String APP_SECRET = "INSERT_APP_SECRET";

        DbxAppInfo appInfo = new DbxAppInfo(APP_KEY, APP_SECRET);

        DbxRequestConfig config = new DbxRequestConfig(
            "JavaTutorial/1.0", Locale.getDefault().toString());
        DbxWebAuthNoRedirect webAuth = new DbxWebAuthNoRedirect(config, appInfo);
    
}
