/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.walker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;

/**
 *
 * @author tomme
 */
public class GetDataFromDatabase {
    public GetDataFromDatabase(){
        
    }
    public String loadData(){
        String url = "https://my-json-server.typicode.com/Farmien/dasa_banych/db";
        InputStream is;
        try{
            is = new URL(url).openStream();
            BufferedReader bf = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            StringBuilder sb = new StringBuilder();

            int cp;
            while((cp = bf.read()) != -1){
                sb.append((char) cp);
            }
            is.close();
            return sb.toString();   
        }catch (IOException e) {
           e.printStackTrace();
        }
        return null; 
    }
}
