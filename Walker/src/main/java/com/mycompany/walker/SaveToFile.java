/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.walker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tomme
 */
public class SaveToFile {
    public void save(String folder, String file, String text) {
        File theDir = new File(folder);
        if (!theDir.exists()){
            theDir.mkdirs();
        }
        File f = new File(theDir+"/"+file+".txt");
        try {
            FileWriter fw = new FileWriter(f, true);
            fw.write(text);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
