/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;

/**
 *
 * @author andre
 */
public class Test11 extends javax.swing.JPanel {

    /**
     * Creates new form Test1
     */
    public Test11() {
        initComponents();
        if(Principal.test.getQuestion_11().equals("yes")) {
               this.buttonYes.setSelected(true);
        }
        else if(Principal.test.getQuestion_11().equals("no")) {
            this.buttonNo.setSelected(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        yesNoGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        buttonYes = new javax.swing.JRadioButton();
        buttonNo = new javax.swing.JRadioButton();

        setBackground(java.awt.Color.white);
        setForeground(java.awt.Color.black);

        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("Have you been exposed to intermittent lights recently?");

        buttonYes.setBackground(java.awt.Color.white);
        yesNoGroup.add(buttonYes);
        buttonYes.setForeground(java.awt.Color.black);
        buttonYes.setText("Yes");
        buttonYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonYesActionPerformed(evt);
            }
        });

        buttonNo.setBackground(java.awt.Color.white);
        yesNoGroup.add(buttonNo);
        buttonNo.setForeground(java.awt.Color.black);
        buttonNo.setText("No");
        buttonNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(buttonYes)
                .addGap(56, 56, 56)
                .addComponent(buttonNo)
                .addContainerGap(184, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonYes)
                    .addComponent(buttonNo))
                .addContainerGap(175, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonYesActionPerformed
        // TODO add your handling code here:
        if(buttonYes.isSelected()) {
            Principal.test.setQuestion_11("yes");
        }
    }//GEN-LAST:event_buttonYesActionPerformed

    private void buttonNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNoActionPerformed
        // TODO add your handling code here:
        if(buttonNo.isSelected()) {
            Principal.test.setQuestion_11("no");
        }
    }//GEN-LAST:event_buttonNoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton buttonNo;
    private javax.swing.JRadioButton buttonYes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup yesNoGroup;
    // End of variables declaration//GEN-END:variables
}
