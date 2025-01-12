/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.planlekcji;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tomaszstepien
 */
public class PlanLekcji extends javax.swing.JFrame {

    /**
     * Creates new form PlanLekcji
     */
    public PlanLekcji() {
        initComponents();
        loadAllComboBoxes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP_main = new javax.swing.JPanel();
        jTP_main = new javax.swing.JTabbedPane();
        jP_classes = new javax.swing.JPanel();
        jCB_classes = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jT_classes = new javax.swing.JTable();
        jP_teachers = new javax.swing.JPanel();
        jCB_teachers = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jT_teachers = new javax.swing.JTable();
        jP_rooms = new javax.swing.JPanel();
        jCB_rooms = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jT_rooms = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Plan lekcji");
        setResizable(false);

        jP_main.setBackground(new java.awt.Color(153, 153, 153));

        jP_classes.setBackground(new java.awt.Color(153, 153, 153));

        jCB_classes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Klasy" }));
        jCB_classes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_classesActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(0, 51, 255));

        jT_classes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "8:00-8:45", null, null, null, null, null},
                {"2", "8:50-9:35", null, null, null, null, null},
                {"3", "9:45-10:30", null, null, null, null, null},
                {"4", "10:50-11:35", null, null, null, null, null},
                {"5", "11:45-12:30", null, null, null, null, null},
                {"6", "12:40-13:25", null, null, null, null, null},
                {"7", "13:35-14:20", null, null, null, null, null},
                {"8", "14:25-15:10", null, null, null, null, null},
                {"9", "15:15-16:00", null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nr", "Godzina", "Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jT_classes);
        if (jT_classes.getColumnModel().getColumnCount() > 0) {
            jT_classes.getColumnModel().getColumn(0).setResizable(false);
            jT_classes.getColumnModel().getColumn(0).setPreferredWidth(1);
            jT_classes.getColumnModel().getColumn(1).setResizable(false);
            jT_classes.getColumnModel().getColumn(1).setPreferredWidth(80);
        }

        javax.swing.GroupLayout jP_classesLayout = new javax.swing.GroupLayout(jP_classes);
        jP_classes.setLayout(jP_classesLayout);
        jP_classesLayout.setHorizontalGroup(
            jP_classesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_classesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_classesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                    .addGroup(jP_classesLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jCB_classes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jP_classesLayout.setVerticalGroup(
            jP_classesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_classesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCB_classes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224))
        );

        jTP_main.addTab("Klasy", jP_classes);

        jP_teachers.setBackground(new java.awt.Color(153, 153, 153));

        jCB_teachers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nauczyciele" }));
        jCB_teachers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_teachersActionPerformed(evt);
            }
        });

        jT_teachers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "8:00-8:45", null, null, null, null, null},
                {"2", "8:50-9:35", null, null, null, null, null},
                {"3", "9:45-10:30", null, null, null, null, null},
                {"4", "10:50-11:35", null, null, null, null, null},
                {"5", "11:45-12:30", null, null, null, null, null},
                {"6", "12:40-13:25", null, null, null, null, null},
                {"7", "13:35-14:20", null, null, null, null, null},
                {"8", "14:25-15:10", null, null, null, null, null},
                {"9", "15:15-16:00", null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nr", "Godzina", "Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jT_teachers);
        if (jT_teachers.getColumnModel().getColumnCount() > 0) {
            jT_teachers.getColumnModel().getColumn(0).setResizable(false);
            jT_teachers.getColumnModel().getColumn(0).setPreferredWidth(1);
            jT_teachers.getColumnModel().getColumn(1).setResizable(false);
            jT_teachers.getColumnModel().getColumn(1).setPreferredWidth(80);
        }

        javax.swing.GroupLayout jP_teachersLayout = new javax.swing.GroupLayout(jP_teachers);
        jP_teachers.setLayout(jP_teachersLayout);
        jP_teachersLayout.setHorizontalGroup(
            jP_teachersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_teachersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_teachersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                    .addGroup(jP_teachersLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jCB_teachers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jP_teachersLayout.setVerticalGroup(
            jP_teachersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_teachersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCB_teachers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );

        jTP_main.addTab("Nauczyciele", jP_teachers);

        jP_rooms.setBackground(new java.awt.Color(153, 153, 153));

        jCB_rooms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sale" }));
        jCB_rooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_roomsActionPerformed(evt);
            }
        });

        jT_rooms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "8:00-8:45", null, null, null, null, null},
                {"2", "8:50-9:35", null, null, null, null, null},
                {"3", "9:45-10:30", null, null, null, null, null},
                {"4", "10:50-11:35", null, null, null, null, null},
                {"5", "11:45-12:30", null, null, null, null, null},
                {"6", "12:40-13:25", null, null, null, null, null},
                {"7", "13:35-14:20", null, null, null, null, null},
                {"8", "14:25-15:10", null, null, null, null, null},
                {"9", "15:15-16:00", null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nr", "Godzina", "Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jT_rooms);
        if (jT_rooms.getColumnModel().getColumnCount() > 0) {
            jT_rooms.getColumnModel().getColumn(0).setResizable(false);
            jT_rooms.getColumnModel().getColumn(0).setPreferredWidth(1);
            jT_rooms.getColumnModel().getColumn(1).setResizable(false);
            jT_rooms.getColumnModel().getColumn(1).setPreferredWidth(80);
        }

        javax.swing.GroupLayout jP_roomsLayout = new javax.swing.GroupLayout(jP_rooms);
        jP_rooms.setLayout(jP_roomsLayout);
        jP_roomsLayout.setHorizontalGroup(
            jP_roomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_roomsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_roomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                    .addGroup(jP_roomsLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jCB_rooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jP_roomsLayout.setVerticalGroup(
            jP_roomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_roomsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCB_rooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );

        jTP_main.addTab("Sale", jP_rooms);

        javax.swing.GroupLayout jP_mainLayout = new javax.swing.GroupLayout(jP_main);
        jP_main.setLayout(jP_mainLayout);
        jP_mainLayout.setHorizontalGroup(
            jP_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTP_main, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jP_mainLayout.setVerticalGroup(
            jP_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_mainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTP_main, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jP_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_main, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCB_classesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_classesActionPerformed
       comboBoxOnChange("classes", jT_classes, jCB_classes, "Klasy");
    }//GEN-LAST:event_jCB_classesActionPerformed

    private void jCB_teachersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_teachersActionPerformed
       comboBoxOnChange("teachers", jT_teachers, jCB_teachers, "Nauczyciele");
    }//GEN-LAST:event_jCB_teachersActionPerformed

    private void jCB_roomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_roomsActionPerformed
       comboBoxOnChange("rooms", jT_rooms, jCB_rooms, "Sale");
    }//GEN-LAST:event_jCB_roomsActionPerformed
         
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlanLekcji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlanLekcji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlanLekcji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlanLekcji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlanLekcji().setVisible(true);
            }
        });
    }
    
    // wczytuje wszystkie dane do ComboBoxów
    private void loadAllComboBoxes() {
        // klasa z wczytywaniem comboboxów
        LoadComboBox loader = new LoadComboBox();
        loader.load("classes", jCB_classes);
        loader.load("teachers", jCB_teachers);
        loader.load("rooms", jCB_rooms);
    }
    //zmienia plan po kliknieciu combobox jakiejs wartosci tego typu
    private void comboBoxOnChange(String name, JTable table, JComboBox comboBox, String defaultComboBoxValue) {
        String selected = comboBox.getSelectedItem().toString();
        if(selected != defaultComboBoxValue) {
            ZmianaPlanu zmiana = new ZmianaPlanu();
            zmiana.changePlan(table, name, selected);
        }
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCB_classes;
    private javax.swing.JComboBox<String> jCB_rooms;
    private javax.swing.JComboBox<String> jCB_teachers;
    private javax.swing.JPanel jP_classes;
    private javax.swing.JPanel jP_main;
    private javax.swing.JPanel jP_rooms;
    private javax.swing.JPanel jP_teachers;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTP_main;
    private javax.swing.JTable jT_classes;
    private javax.swing.JTable jT_rooms;
    private javax.swing.JTable jT_teachers;
    // End of variables declaration//GEN-END:variables
}
