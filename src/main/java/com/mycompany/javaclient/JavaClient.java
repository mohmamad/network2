/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javaclient;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author manar
 */
public class JavaClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        // TODO code application logic here
        URL url = new URL ("http://localhost/snmpp_manger.php");
        URLConnection urlc = url.openConnection();
        urlc.setAllowUserInteraction(true);
        urlc.setDoInput(true);
        urlc.setDoOutput(true);
        
        String str = "name=Manar";
        OutputStream os = urlc.getOutputStream();
        byte [] data = str.getBytes();
        os.write(data);
        
        InputStream is = urlc.getInputStream();
        for (int ch=0; (ch = is.read()) != -1 ;)
            System.out.print((char)ch);
    }
    
}
