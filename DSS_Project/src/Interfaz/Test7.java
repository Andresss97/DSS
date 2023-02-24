/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;

/**
 *
 * @author andre
 */
public class Test7 extends javax.swing.JPanel {

    /**
     * Creates new form Test1
     */
    public Test7() {
        initComponents();
        if(Principal.test.getQuestion_7().equals("slight")) {
               this.buttonSlight.setSelected(true);
        }
        else if(Principal.test.getQuestion_7().equals("moderate")) {
            this.buttonModerate.setSelected(true);
        }
        else if(Principal.test.getQuestion_7().equals("severe")) {
            this.buttonSevere.setSelected(true);
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
        buttonSlight = new javax.swing.JRadioButton();
        buttonModerate = new javax.swing.JRadioButton();
        buttonSevere = new javax.swing.JRadioButton();

        setBackground(java.awt.Color.white);
        setForeground(java.awt.Color.black);

        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("How intense would you say your episodes of muscle stiffness are?");

        buttonSlight.setBackground(java.awt.Color.white);
        yesNoGroup.add(buttonSlight);
        buttonSlight.setForeground(java.awt.Color.black);
        buttonSlight.setText("Slight");
        buttonSlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSlightActionPerformed(evt);
            }
        });

        buttonModerate.setBackground(java.awt.Color.white);
        yesNoGroup.add(buttonModerate);
        buttonModerate.setForeground(java.awt.Color.black);
        buttonModerate.setText("Moderate");
        buttonModerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModerateActionPerformed(evt);
            }
        });

        buttonSevere.setBackground(java.awt.Color.white);
        yesNoGroup.add(buttonSevere);
        buttonSevere.setForeground(java.awt.Color.black);
        buttonSevere.setText("Severe");
        buttonSevere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSevereActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(buttonSlight)
                .addGap(47, 47, 47)
                .addComponent(buttonModerate)
                .addGap(45, 45, 45)
                .addComponent(buttonSevere)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSlight)
                    .addComponent(buttonModerate)
                    .addComponent(buttonSevere))
                .addContainerGap(175, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSlightActionPerformed
        // TODO add your handling code here:
        if(buttonSlight.isSelected()) {
            Principal.test.setQuestion_7("slight");
        }
    }//GEN-LAST:event_buttonSlightActionPerformed

    private void buttonModerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModerateActionPerformed
        // TODO add your handling code here:
        if(buttonModerate.isSelected()) {
            Principal.test.setQuestion_7("moderate");
        }
    }//GEN-LAST:event_buttonModerateActionPerformed

    private void buttonSevereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSevereActionPerformed
        // TODO add your handling code here:
        if(buttonSevere.isSelected()) {
            Principal.test.setQuestion_7("severe");
        }
    }//GEN-LAST:event_buttonSevereActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton buttonModerate;
    private javax.swing.JRadioButton buttonSevere;
    private javax.swing.JRadioButton buttonSlight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup yesNoGroup;
    // End of variables declaration//GEN-END:variables
}
