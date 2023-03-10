/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;

import Conexion.Conector;
import Conexion.QuerysInsert;
import Drools.ExpertSystem;
import Pojos.Patient;
import Pojos.Test;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author andre
 */
public class HomePatient extends javax.swing.JPanel {

    /**
     * Creates new form HomePatient
     */
    private int i;
    private JFrame frame;
    private Test test;
    private Conector con;
    
    public HomePatient(JFrame frame, Conector con) {
        initComponents();
        this.backButton.setVisible(false);
        this.nextButton.setVisible(false);
        this.labelName.setText(Principal.patient.getName());
        this.labelSurname.setText(Principal.patient.getSurname());
        this.labelAge.setText(String.valueOf(Principal.patient.getAge()));
        this.i = 1;
        this.frame = frame;
        this.test = new Test();
        this.con = con;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        bottom = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        center = new javax.swing.JPanel();
        center2 = new javax.swing.JPanel();
        startButton = new javax.swing.JButton();
        labelName = new javax.swing.JLabel();
        labelSurname = new javax.swing.JLabel();
        labelAge = new javax.swing.JLabel();

        setBackground(java.awt.Color.white);
        setLayout(new java.awt.BorderLayout());

        container.setBackground(java.awt.Color.white);
        container.setLayout(new java.awt.BorderLayout());

        bottom.setBackground(java.awt.Color.white);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bottomLayout = new javax.swing.GroupLayout(bottom);
        bottom.setLayout(bottomLayout);
        bottomLayout.setHorizontalGroup(
            bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        bottomLayout.setVerticalGroup(
            bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton)
                    .addComponent(backButton))
                .addContainerGap())
        );

        container.add(bottom, java.awt.BorderLayout.CENTER);

        add(container, java.awt.BorderLayout.PAGE_END);

        center.setBackground(java.awt.Color.white);
        center.setLayout(new java.awt.BorderLayout());

        center2.setBackground(java.awt.Color.white);

        startButton.setText("Start Test");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        labelName.setBackground(java.awt.Color.white);
        labelName.setForeground(java.awt.Color.black);
        labelName.setText("jLabel1");

        labelSurname.setBackground(java.awt.Color.white);
        labelSurname.setForeground(java.awt.Color.black);
        labelSurname.setText("jLabel1");

        labelAge.setBackground(java.awt.Color.white);
        labelAge.setForeground(java.awt.Color.black);
        labelAge.setText("jLabel1");

        javax.swing.GroupLayout center2Layout = new javax.swing.GroupLayout(center2);
        center2.setLayout(center2Layout);
        center2Layout.setHorizontalGroup(
            center2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(center2Layout.createSequentialGroup()
                .addGroup(center2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(center2Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(center2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(center2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSurname)
                            .addComponent(labelName)
                            .addComponent(labelAge))))
                .addContainerGap(201, Short.MAX_VALUE))
        );
        center2Layout.setVerticalGroup(
            center2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, center2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(labelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSurname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAge)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(startButton)
                .addGap(148, 148, 148))
        );

        center.add(center2, java.awt.BorderLayout.CENTER);

        add(center, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // TODO add your handling code here:
        this.backButton.setVisible(true);
        this.nextButton.setVisible(true);
        this.center.removeAll();
        this.center.repaint();
        
        JPanel panel = new Test1();
        this.center.add(panel, BorderLayout.CENTER);
        this.center.setVisible(true);
    }//GEN-LAST:event_startButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        if((Principal.test.getQuestion_6().equals("no") && this.i == 8) || (Principal.test.getQuestion_8().equals("no") && this.i == 10)) {
            this.i--;
        }
        if(this.i == 1) {
            JOptionPane.showMessageDialog(this, "You are on the first question of the test");
        }
        else{
            this.i--;
            switch(this.i) {
                case 1: {
                    this.center.removeAll();
                    this.center.repaint();
        
                    JPanel panel = new Test1();
                   
                    this.center.add(panel, BorderLayout.CENTER);
                    this.center.setVisible(true);
                    this.frame.pack();
                    break;
                }
                case 2: {
                    this.center.removeAll();
                    this.center.repaint();
        
                    JPanel panel = new Test2();
                    this.center.add(panel, BorderLayout.CENTER);
                    this.center.setVisible(true);
                    this.frame.pack();
                    break;
                }
                case 3: {
                    this.center.removeAll();
                    this.center.repaint();
        
                    JPanel panel = new Test3();
                    this.center.add(panel, BorderLayout.CENTER);
                    this.center.setVisible(true);
                    this.frame.pack();
                    break;
                }
                case 4: {
                    this.center.removeAll();
                    this.center.repaint();
        
                    JPanel panel = new Test4();
                    this.center.add(panel, BorderLayout.CENTER);
                    this.center.setVisible(true);
                    this.frame.pack();
                    break;
                }
                case 5: {
                    this.center.removeAll();
                    this.center.repaint();
        
                    JPanel panel = new Test5();
                    this.center.add(panel, BorderLayout.CENTER);
                    this.center.setVisible(true);
                    this.frame.pack();
                    break;
                }
                case 6: {
                    this.center.removeAll();
                    this.center.repaint();
        
                    JPanel panel = new Test6();
                    this.center.add(panel, BorderLayout.CENTER);
                    this.center.setVisible(true);
                    this.frame.pack();
                    break;
                }
                case 7: {
                    this.center.removeAll();
                    this.center.repaint();
        
                    JPanel panel = new Test7();
                    this.center.add(panel, BorderLayout.CENTER);
                    this.center.setVisible(true);
                    this.frame.pack();
                    break;
                }
                case 8 : { 
                    this.center.removeAll();
                    this.center.repaint();
        
                    JPanel panel = new Test8();
                    this.center.add(panel, BorderLayout.CENTER);
                    this.center.setVisible(true);
                    this.frame.pack();
                            
                    break;
                }
                case 9 : {
                    this.center.removeAll();
                    this.center.repaint();
        
                    JPanel panel = new Test9();
                    this.center.add(panel, BorderLayout.CENTER);
                    this.center.setVisible(true);
                    this.frame.pack();
                    break;
                }
                case 10 : {
                    this.center.removeAll();
                    this.center.repaint();
        
                    JPanel panel = new Test10();
                    this.center.add(panel, BorderLayout.CENTER);
                    this.center.setVisible(true);
                    this.frame.pack();
                    break;
                }
                case 11 : {
                    this.center.removeAll();
                    this.center.repaint();
        
                    JPanel panel = new Test11();
                    this.center.add(panel, BorderLayout.CENTER);
                    this.center.setVisible(true);
                    this.frame.pack();
                    break;
                }
                default : {
                    
                }
            }
        }
    }//GEN-LAST:event_backButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        if((Principal.test.getQuestion_6().equals("no") && this.i == 6) || (Principal.test.getQuestion_8().equals("no") && this.i == 8)) {
            this.i++;
        }
        if(this.checkQuestionAnswered(i) == false) {
            JOptionPane.showMessageDialog(this, "You have to answer the question before you advance");
            return;
        }
        if (this.i == 12) {
            QuerysInsert qi = new QuerysInsert(this.con);
            try {
                qi.insertTest(Principal.test, Principal.patient);
            } catch (SQLException ex) {
                Logger.getLogger(HomePatient.class.getName()).log(Level.SEVERE, null, ex);
            }

            ExpertSystem es = new ExpertSystem();
            es.executeRules(Principal.test);
            JOptionPane.showMessageDialog(null, "Results: "  + Principal.test.getScore() + "\n"+ Principal.test.getDroolsAnswer(), "Results",1);
            
            Principal.patient.getTests().add(Principal.test);
            Principal.test = new Test();
            this.center.removeAll();
            this.center.repaint();
            
            this.backButton.setVisible(false);
            this.nextButton.setVisible(false);
            
            JPanel panel = new HomePatient(this.frame, this.con);
            this.center.add(panel);
            this.center.setVisible(true);
            this.frame.pack();
            
        } 
        else {
            this.i++;
            switch (this.i) {
                case 2: {
                    this.center.removeAll();
                    this.center.repaint();

                    JPanel panel2= new Test2();
                    this.center.add(panel2, BorderLayout.CENTER);
                    panel2.setVisible(true);
                    this.center.setVisible(true);
                    this.frame.pack();
                    break;
                }
                case 3: {
                    this.center.removeAll();
                    this.center.repaint();

                    JPanel panel3 = new Test3();
                    this.center.add(panel3, BorderLayout.CENTER);
                    this.center.setVisible(true);
                    this.frame.pack();
                    break;
                }
                case 4: {
                    this.center.removeAll();
                    this.center.repaint();

                    JPanel panel4 = new Test4();
                    this.center.add(panel4, BorderLayout.CENTER);
                    this.center.setVisible(true);
                    this.frame.pack();
                    break;
                }
                case 5: {
                    this.center.removeAll();
                    this.center.repaint();

                    JPanel panel5 = new Test5();
                    this.center.add(panel5, BorderLayout.CENTER);
                    this.center.setVisible(true);
                    this.frame.pack();
                    break;
                }
                case 6: {
                    this.center.removeAll();
                    this.center.repaint();

                    JPanel panel6 = new Test6();
                    this.center.add(panel6, BorderLayout.CENTER);
                    this.center.setVisible(true);
                    this.frame.pack();
                    break;
                }
                case 7: {
                    this.center.removeAll();
                    this.center.repaint();

                    JPanel panel7 = new Test7();
                    this.center.add(panel7, BorderLayout.CENTER);
                    this.center.setVisible(true);
                    this.frame.pack();
                    break;
                }
                case 8: {
                    this.center.removeAll();
                    this.center.repaint();

                    JPanel panel8 = new Test8();
                    this.center.add(panel8, BorderLayout.CENTER);
                    this.center.setVisible(true);
                    this.frame.pack();
                    break;
                }
                case 9: {
                    this.center.removeAll();
                    this.center.repaint();

                    JPanel panel9 = new Test9();
                    this.center.add(panel9, BorderLayout.CENTER);
                    this.center.setVisible(true);
                    this.frame.pack();
                    break;
                }
                case 10: {
                    this.center.removeAll();
                    this.center.repaint();

                    JPanel panel10 = new Test10();
                    this.center.add(panel10, BorderLayout.CENTER);
                    this.center.setVisible(true);
                    this.frame.pack();
                    break;
                }
                case 11: {
                    this.center.removeAll();
                    this.center.repaint();

                    JPanel panel11 = new Test11();
                    this.center.add(panel11, BorderLayout.CENTER);
                    this.center.setVisible(true);
                    this.frame.pack();
                    break;
                }
                case 12: {
                    this.center.removeAll();
                    this.center.repaint();
                    this.nextButton.setText("Finish");
                    JPanel panel12 = new Test12();
                    this.center.add(panel12, BorderLayout.CENTER);
                    this.center.setVisible(true);
                    this.frame.pack();
                    break;
                }
                default: {

                }
            }
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private boolean checkQuestionAnswered(int i) {
        switch (i) {
            case 1: {
                if (Principal.test.getQuestion_1() == 0) {
                    return false;
                } else {
                    return true;
                }
            }
            case 2: {
                if (Principal.test.getQuestion_2().isEmpty()) {
                    return false;
                } else {
                    return true;
                }
            }
            case 3: {
                if (Principal.test.getQuestion_3().isEmpty()) {
                    return false;
                } else {
                    return true;
                }
            }
            case 4: {
                if (Principal.test.getQuestion_4().isEmpty()) {
                    return false;
                } else {
                    return true;
                }
            }
            case 5: {
                if (Principal.test.getQuestion_5().isEmpty()) {
                    return false;
                } else {
                    return true;
                }
            }
            case 6: {
                if (Principal.test.getQuestion_6().isEmpty()) {
                    return false;
                } else {
                    return true;
                }
            }
            case 7: {
                if (Principal.test.getQuestion_7().isEmpty()) {
                    return false;
                } else {
                    return true;
                }
            }
            case 8: {
                if (Principal.test.getQuestion_8().isEmpty()) {
                    return false;
                } else {
                    return true;
                }
            }
            case 9: {
                if (Principal.test.getQuestion_9().isEmpty()) {
                    return false;
                } else {
                    return true;
                }
            }
            case 10: {
                if (Principal.test.getQuestion_10().isEmpty()) {
                    return false;
                } else {
                    return true;
                }
            }
            case 11: {
                if (Principal.test.getQuestion_11().isEmpty()) {
                    return false;
                } else {
                    return true;
                }
            }
            case 12: {
                if (Principal.test.getQuestion_12().isEmpty()) {
                    return false;
                } else {
                    return true;
                }
            }
            default : {
                return true;
            }
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel bottom;
    private javax.swing.JPanel center;
    private javax.swing.JPanel center2;
    private javax.swing.JPanel container;
    private javax.swing.JLabel labelAge;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelSurname;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
}
