/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package WIP.Jamila;

import java.awt.Color;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class ArrayUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ArrayUI.class.getName());

    private String txtContainer = "";
        
    private int[] array;
   
    public ArrayUI() {
        initComponents();
        getContentPane().setBackground(new Color(10, 15, 30));
        array = new int[0];
    }

    
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                txtInputData = new javax.swing.JTextField();
                btnAdd = new javax.swing.JButton();
                btnRemove = new javax.swing.JButton();
                btnInsert = new javax.swing.JButton();
                btnClear = new javax.swing.JButton();
                txtOutput = new javax.swing.JTextArea();
                jLabel3 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setFont(new java.awt.Font("Rajdhani", 1, 48)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(241, 245, 249));
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("ARRAY");

                jLabel2.setFont(new java.awt.Font("Rajdhani", 1, 15)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(148, 163, 184));
                jLabel2.setText("Enter Data:");

                txtInputData.setBackground(new java.awt.Color(20, 30, 50));
                txtInputData.setFont(new java.awt.Font("JetBrains Mono SemiBold", 0, 14)); // NOI18N
                txtInputData.setForeground(new java.awt.Color(241, 245, 249));
                txtInputData.setHorizontalAlignment(javax.swing.JTextField.LEFT);
                txtInputData.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(59, 130, 246), 1, true));

                btnAdd.setBackground(new java.awt.Color(37, 99, 235));
                btnAdd.setFont(new java.awt.Font("Rajdhani SemiBold", 1, 16)); // NOI18N
                btnAdd.setForeground(new java.awt.Color(255, 255, 255));
                btnAdd.setText("Add");
                btnAdd.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnAddActionPerformed(evt);
                        }
                });

                btnRemove.setBackground(new java.awt.Color(37, 99, 235));
                btnRemove.setFont(new java.awt.Font("Rajdhani SemiBold", 1, 16)); // NOI18N
                btnRemove.setForeground(new java.awt.Color(255, 255, 255));
                btnRemove.setText("Remove");
                btnRemove.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnRemoveActionPerformed(evt);
                        }
                });

                btnInsert.setBackground(new java.awt.Color(37, 99, 235));
                btnInsert.setFont(new java.awt.Font("Rajdhani SemiBold", 1, 16)); // NOI18N
                btnInsert.setForeground(new java.awt.Color(255, 255, 255));
                btnInsert.setText("Insert");
                btnInsert.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnInsertActionPerformed(evt);
                        }
                });

                btnClear.setBackground(new java.awt.Color(239, 68, 68));
                btnClear.setFont(new java.awt.Font("Rajdhani SemiBold", 1, 16)); // NOI18N
                btnClear.setForeground(new java.awt.Color(255, 255, 255));
                btnClear.setText("Clear");
                btnClear.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnClearActionPerformed(evt);
                        }
                });

                txtOutput.setBackground(new java.awt.Color(20, 30, 50));
                txtOutput.setColumns(20);
                txtOutput.setFont(new java.awt.Font("JetBrains Mono NL", 0, 14)); // NOI18N
                txtOutput.setForeground(new java.awt.Color(241, 245, 249));
                txtOutput.setRows(5);
                txtOutput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(59, 130, 246), 1, true));

                jLabel3.setFont(new java.awt.Font("Rajdhani Medium", 1, 14)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(148, 163, 184));
                jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                jLabel3.setText("Output");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtOutput)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtInputData, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtInputData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(18, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String str = txtInputData.getText();
        
        if (str.isBlank()) {
            JOptionPane.showMessageDialog(this, "Enter a data");
            return;
        }
        
        int data;
        
        try {
            data = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input");
            return;
        }
        
        // Process of adding data in an array
        int[] newArray = new int[array.length];
        
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        
        array = new int[array.length + 1];
        
        for (int i = 0; i < newArray.length; i++) {
            array[i] = newArray[i];
        }
        
        array[newArray.length] = data;
        // Ends here
        
        txtContainer += Arrays.toString(array) + "\n";
        txtOutput.setText(txtContainer);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        if (array.length == 0) {
            JOptionPane.showMessageDialog(this, "Array is empty");
            return;
        }
        
        String str = txtInputData.getText();
        
        if (str.isBlank()) {
            JOptionPane.showMessageDialog(this, "Enter an index");
            return;
        }
        
        int index;
        
        try {
            index = Integer.parseInt(str);
            
            if (index < 0 || index >= array.length) {
                JOptionPane.showMessageDialog(this, "Index out of bounds");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input");
            return;
        }
        
        // Process of removing/deleting data in an array
        int[] newArray = new int[array.length - 1];
        
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        
        for (int i = index; i < newArray.length; i++) {
            newArray[i] = array[i + 1];
        }
        
        array = new int[newArray.length];
        
        for (int i = 0; i < newArray.length; i++) {
            array[i] = newArray[i];
        }
        // Ends here
        
        txtContainer += Arrays.toString(array) + "\n";
        txtOutput.setText(txtContainer);
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        if (array.length == 0) {
            JOptionPane.showMessageDialog(this, "Array is empty");
            return;
        }
        
        String str = txtInputData.getText();
        
        if (str.isBlank()) {
            JOptionPane.showMessageDialog(this, "Enter a data");
            return;
        }
        
        int data, index;
        
        try {
            data = Integer.parseInt(str);
            
            str = JOptionPane.showInputDialog("Insert " + data + " at index:");
            
            if (str == null) {
                return;
            }
            
            index = Integer.parseInt(str);
            
            if (index < 0 || index >= array.length) {
                JOptionPane.showMessageDialog(this, "Index out of bounds");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input");
            return;
        }
        
        // Process of inserting data in an array
        int[] newArray = new int[array.length + 1];
        
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        
        newArray[index] = data;
        
        for (int i = index + 1; i < newArray.length; i++) {
            newArray[i] = array[i - 1];
        }
        
        array = new int[newArray.length];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = newArray[i];
        }
        // Ends here
        
        txtContainer += Arrays.toString(array) + "\n";
        txtOutput.setText(txtContainer);
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        array = new int[0];
        txtContainer += "Array cleared\n";
        txtOutput.setText(txtContainer);
    }//GEN-LAST:event_btnClearActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new ArrayUI().setVisible(true));
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnAdd;
        private javax.swing.JButton btnClear;
        private javax.swing.JButton btnInsert;
        private javax.swing.JButton btnRemove;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JTextField txtInputData;
        private javax.swing.JTextArea txtOutput;
        // End of variables declaration//GEN-END:variables
}
