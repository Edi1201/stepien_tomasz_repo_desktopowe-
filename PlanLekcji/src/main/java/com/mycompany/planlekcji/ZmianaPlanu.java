/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planlekcji;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *  
 * @author tomaszstepien
 */
public class ZmianaPlanu {
    /**
     * Zmienia plan lekcji
     * @param table - tabela która, ma być wypełniona
     * @param planType - typ planu
     * @param planTypeValue - wartośc typu planu
     */
    public void changePlan(JTable table, String planType, String planTypeValue) {
        // planType = ""
        File f = new File("data/"+planType+"/"+planTypeValue+".csv");
        String data = "";
      
        // clears table before inserting values in case there would be some in blank spots
        clearTableValues(table);
        
        try {
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()) {
                data += sc.nextLine();
                if(sc.hasNextLine()) data += "\n";
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PlanLekcji.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String[] days = data.split("\n");
        
        for(int i = 0; i < days.length; i++) {
            String[] lessons = days[i].split(";");
            for(int j = 0; j < lessons.length; j++) {
                String[] lessonsSpecifics = lessons[j].split(":");

                String val1 = lessonsSpecifics[0];
                String val2 = lessonsSpecifics[1];
                String val3 = lessonsSpecifics[2];
                
                DefaultTableModel model = new DefaultTableModel();
                table.setValueAt(val1+" "+val2+" "+val3, j, i+2);
//                jTable1.setVa
                //todo wszytkso
                
//                System.out.println(""+lessonName);

            }
        }
    }
    
    /**
     * Czysci tabele
     * @param table - tabela ktora ma byc wyczyszczona 
     */
    private void clearTableValues(JTable table) {
        for(int i = 1; i < 9; i++) {
            for(int j = 2; j < 7; j++) {
                table.setValueAt("", i, j);
            }
        }
    }
}
