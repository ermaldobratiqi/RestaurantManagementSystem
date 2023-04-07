/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.View;

import BLL.OrderMenu;
import DAL.CrudFormException;
import DAL.EntMngClass;
import DAL.OrderRepository;
import GUI.Model.OrderTableModel;
import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.view.*;
import net.sf.jasperreports.engine.*;

/**
 *
 * @author Arti
 */
public class ShowTotalSales extends javax.swing.JInternalFrame {

    OrderRepository or = new OrderRepository();
    OrderTableModel otm = new OrderTableModel();
    EntMngClass e = new EntMngClass();
  
    public ShowTotalSales() {
        initComponents();
        loadTable();
        
    }

    public void loadTable(){
        try{
        List <OrderMenu> list = or.FindALL();
        otm.addList(list);
        table.setModel(otm);
        otm.fireTableDataChanged();
        }catch(CrudFormException e){
            Logger.getLogger(ShowTotalSales.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        GenerateReport = new javax.swing.JButton();
        Filter = new javax.swing.JTextField();
        Name = new javax.swing.JButton();
        Reload = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Price = new javax.swing.JButton();
        User = new javax.swing.JButton();
        Date = new javax.swing.JButton();
        Today = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(725, 353));

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table);

        GenerateReport.setText("Generate Report");
        GenerateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateReportActionPerformed(evt);
            }
        });

        Name.setText("Name");
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        Reload.setText("Reload Table");
        Reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReloadActionPerformed(evt);
            }
        });

        jLabel1.setText("Filter By:");

        Price.setText("Price");
        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });

        User.setText("User");
        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });

        Date.setText("Date");
        Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateActionPerformed(evt);
            }
        });

        Today.setText("Filter Today's Orders");
        Today.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GenerateReport)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Price)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(User)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Date))
                    .addComponent(Filter, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Today)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Reload)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(Filter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name)
                            .addComponent(jLabel1)
                            .addComponent(Price)
                            .addComponent(User)
                            .addComponent(Date)
                            .addComponent(Today)
                            .addComponent(Reload)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(GenerateReport, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        
        try{
        List <OrderMenu> list = or.filterOrderByName(Filter.getText());
        otm.addList(list);
        table.setModel(otm);
        otm.fireTableDataChanged();
        }catch(CrudFormException e){
            Logger.getLogger(ShowTotalSales.class.getName()).log(Level.SEVERE,null,e);
        }
        
        
    }//GEN-LAST:event_NameActionPerformed

    private void ReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReloadActionPerformed
       loadTable();
    }//GEN-LAST:event_ReloadActionPerformed

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed

        try{
        BigDecimal b = new BigDecimal(Filter.getText());
        List <OrderMenu> list = or.filterOrderByPrice(b);
        otm.addList(list);
        table.setModel(otm);
        otm.fireTableDataChanged();
        }catch(CrudFormException e){
            Logger.getLogger(ShowTotalSales.class.getName()).log(Level.SEVERE,null,e);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Enter a number");
        }
        
    }//GEN-LAST:event_PriceActionPerformed

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed
        try{ 
        List <OrderMenu> list = or.filterOrderByUser(Filter.getText());
        otm.addList(list);
        table.setModel(otm);
        otm.fireTableDataChanged();
        }catch(CrudFormException e){
            Logger.getLogger(ShowTotalSales.class.getName()).log(Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_UserActionPerformed

    private void DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateActionPerformed
       try{ 
   
        List <OrderMenu> list = or.filterOrderByTime(Filter.getText());
        otm.addList(list);
        table.setModel(otm);
        otm.fireTableDataChanged();
        }catch (CrudFormException e){
            JOptionPane.showMessageDialog(this, "Enter a Valid Date:YYYY-MM-DD");
        }
    }//GEN-LAST:event_DateActionPerformed

    private void TodayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodayActionPerformed
       try{ 
        List <OrderMenu> list = or.filterOrderByToday();
        otm.addList(list);
        table.setModel(otm);
        otm.fireTableDataChanged();
        }catch(CrudFormException e){
            Logger.getLogger(ShowTotalSales.class.getName()).log(Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_TodayActionPerformed

    private void GenerateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateReportActionPerformed
       
        
        try {
            String Rep = "C:\\Users\\Admin\\Desktop\\Projekti Lab Final\\RestaurantMngSystem\\src\\Report\\Report.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(Rep);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, e.Con());
            JasperViewer.viewReport(jp);
           
        } catch (JRException ex) {
            Logger.getLogger(ShowTotalSales.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_GenerateReportActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Date;
    private javax.swing.JTextField Filter;
    private javax.swing.JButton GenerateReport;
    private javax.swing.JButton Name;
    private javax.swing.JButton Price;
    private javax.swing.JButton Reload;
    private javax.swing.JButton Today;
    private javax.swing.JButton User;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
