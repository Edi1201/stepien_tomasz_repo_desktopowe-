/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planlekcji;

import java.io.File;
import javax.swing.JComboBox;

/**
 *
 * @author tomaszstepien
 */
public class LoadComboBox {
    /**
     * ładuje comobBoxy z pliku
     * @param name - nazwa domyślna w comboBoxie
     * @param comboBox - comobBox ktory ma byc ustaiony
     */
    public void load(String name, JComboBox comboBox) {
        
    File folder = new File("data/"+name+"/");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                String fileName = listOfFiles[i].getName();
                comboBox.addItem(fileName.substring(0, fileName.length()-4));
//                System.out.println("File " + listOfFiles[i].getName());
            } 
        } 
    }
}
