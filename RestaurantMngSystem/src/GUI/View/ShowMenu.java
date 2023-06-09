/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.View;

import BLL.Ushqimet;
import DAL.CrudFormException;
import DAL.UshqimiRepository;
import GUI.Model.UshqimiTableModel;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arti
 */
public class ShowMenu extends javax.swing.JInternalFrame {

     UshqimiTableModel utm = new UshqimiTableModel();
     UshqimiRepository ur = new UshqimiRepository();
     
    public ShowMenu() throws CrudFormException {
        initComponents();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabele = new javax.swing.JTable();
        MainB = new javax.swing.JButton();
        Drinks = new javax.swing.JButton();
        Alcohol = new javax.swing.JButton();
        Dessert = new javax.swing.JButton();
        All = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(725, 353));

        tabele.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabele);

        MainB.setText("Main");
        MainB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainBActionPerformed(evt);
            }
        });

        Drinks.setText("Drinks");
        Drinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrinksActionPerformed(evt);
            }
        });

        Alcohol.setText("Alcohol");
        Alcohol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlcoholActionPerformed(evt);
            }
        });

        Dessert.setText("Dessert");
        Dessert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DessertActionPerformed(evt);
            }
        });

        All.setText("All");
        All.setMaximumSize(new java.awt.Dimension(55, 23));
        All.setMinimumSize(new java.awt.Dimension(55, 23));
        All.setPreferredSize(new java.awt.Dimension(55, 23));
        All.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(205, Short.MAX_VALUE)
                .addComponent(All, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainB, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Drinks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Alcohol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Dessert)
                .addGap(171, 171, 171))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(All, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(MainB)
                        .addComponent(Drinks)
                        .addComponent(Alcohol)
                        .addComponent(Dessert)))
                .addGap(0, 41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MainBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainBActionPerformed
        
        try{
        List <Ushqimet> list = ur.FindMain();
        utm.addList(list);
        tabele.setModel(utm);
        utm.fireTableDataChanged();
        }catch(CrudFormException e){
            Logger.getLogger(ShowMenu.class.getName()).log(Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_MainBActionPerformed

    private void DrinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrinksActionPerformed
        try{
        List <Ushqimet> list = ur.FindDrinks();
        utm.addList(list);
        tabele.setModel(utm);
        utm.fireTableDataChanged();
        }catch(CrudFormException e){
            Logger.getLogger(ShowMenu.class.getName()).log(Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_DrinksActionPerformed

    private void AlcoholActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlcoholActionPerformed
       try{
        List <Ushqimet> list = ur.FindAlcohol();
        utm.addList(list);
        tabele.setModel(utm);
        utm.fireTableDataChanged();
        }catch(CrudFormException e){
            Logger.getLogger(ShowMenu.class.getName()).log(Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_AlcoholActionPerformed

    private void DessertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DessertActionPerformed
        try{
        List <Ushqimet> list = ur.FindDessert();
        utm.addList(list);
        tabele.setModel(utm);
        utm.fireTableDataChanged();
        }catch(CrudFormException e){
            Logger.getLogger(ShowMenu.class.getName()).log(Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_DessertActionPerformed

    private void AllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllActionPerformed
        try{
        List <Ushqimet> list = ur.FindALL();
        utm.addList(list);
        tabele.setModel(utm);
        utm.fireTableDataChanged();
        }catch(CrudFormException e){
            Logger.getLogger(ShowMenu.class.getName()).log(Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_AllActionPerformed
  
    public void loadTable() throws CrudFormException{
        try{
        List <Ushqimet> list = ur.FindALL();
        utm.addList(list);
        tabele.setModel(utm);
        utm.fireTableDataChanged();
        }catch(CrudFormException e){
            Logger.getLogger(ShowMenu.class.getName()).log(Level.SEVERE,null,e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alcohol;
    private javax.swing.JButton All;
    private javax.swing.JButton Dessert;
    private javax.swing.JButton Drinks;
    private javax.swing.JButton MainB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabele;
    // End of variables declaration//GEN-END:variables
}
