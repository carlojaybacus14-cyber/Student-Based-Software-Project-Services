package Finished.Amadeo;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArrayListFrame extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ArrayListFrame.class.getName());

    private final ArrayList<Integer> arrayList;

    private String txtContainer = "";
    
    public ArrayListFrame() {
        initComponents();
        getContentPane().setBackground(new Color(13, 42, 46));
        arrayList = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblEnterData = new javax.swing.JLabel();
        txtInputData = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnChange = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaOutput = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Rajdhani", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 211, 238));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ARRAYLIST");

        lblEnterData.setFont(new java.awt.Font("Rajdhani SemiBold", 1, 20)); // NOI18N
        lblEnterData.setForeground(new java.awt.Color(56, 188, 212));
        lblEnterData.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEnterData.setText("Enter Data:");

        txtInputData.setBackground(new java.awt.Color(7, 26, 29));
        txtInputData.setFont(new java.awt.Font("JetBrains Mono SemiBold", 0, 14)); // NOI18N
        txtInputData.setForeground(new java.awt.Color(168, 234, 245));
        txtInputData.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        btnAdd.setBackground(new java.awt.Color(10, 56, 64));
        btnAdd.setFont(new java.awt.Font("Rajdhani Medium", 1, 16)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(34, 211, 238));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnChange.setBackground(new java.awt.Color(10, 56, 64));
        btnChange.setFont(new java.awt.Font("Rajdhani Medium", 1, 16)); // NOI18N
        btnChange.setForeground(new java.awt.Color(34, 211, 238));
        btnChange.setText("Change");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        btnRemove.setBackground(new java.awt.Color(10, 56, 64));
        btnRemove.setFont(new java.awt.Font("Rajdhani Medium", 1, 16)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(34, 211, 238));
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(10, 56, 64));
        btnClear.setFont(new java.awt.Font("Rajdhani Medium", 1, 16)); // NOI18N
        btnClear.setForeground(new java.awt.Color(34, 211, 238));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        txtAreaOutput.setBackground(new java.awt.Color(7, 26, 29));
        txtAreaOutput.setColumns(20);
        txtAreaOutput.setFont(new java.awt.Font("JetBrains Mono NL", 1, 14)); // NOI18N
        txtAreaOutput.setForeground(new java.awt.Color(168, 234, 245));
        txtAreaOutput.setRows(5);
        jScrollPane1.setViewportView(txtAreaOutput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEnterData, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtInputData)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterData, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInputData, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String txt = txtInputData.getText();

        if (txt.isBlank()) {
            JOptionPane.showMessageDialog(this, "Please enter a data.");
            return;
        }

        int data;

        try {
            data = Integer.parseInt(txt);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input.");
            return;
        }

        arrayList.add(data);

        txtContainer += arrayList + "\n";

        txtAreaOutput.setText(txtContainer);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        String txt = txtInputData.getText();

        if (txt.isBlank()) {
            JOptionPane.showMessageDialog(this, "Please enter a data to change.");
            return;
        }

        if (arrayList.isEmpty()) {
            JOptionPane.showMessageDialog(this, "List is empty.");
            return;
        }

        int data, index;
        
        try {
            data = Integer.parseInt(txt);
            index = Integer.parseInt(JOptionPane.showInputDialog("Enter an index."));
            
            if (index < 0 || index >= arrayList.size()) {
                JOptionPane.showMessageDialog(this, "Index out of bounds");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input.");
            return;
        }
        
        arrayList.set(index, data);
        
        txtContainer += arrayList + "\n";
        
        txtAreaOutput.setText(txtContainer);
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        String txt = txtInputData.getText();

        if (txt.isBlank()) {
            JOptionPane.showMessageDialog(this, "Please enter an index.");
            return;
        }

        if (arrayList.isEmpty()) {
            JOptionPane.showMessageDialog(this, "List is empty.");
            return;
        }

        int index;

        try {
            index = Integer.parseInt(txt);
            
            if (index < 0 || index >= arrayList.size()) {
                JOptionPane.showMessageDialog(this, "Index out of bounds.");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input.");
            return;
        }

        arrayList.remove(index);
        
        txtContainer += arrayList + "\n";

        txtAreaOutput.setText(txtContainer);
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        arrayList.clear();
        txtContainer += "List cleared.";
        txtAreaOutput.setText(txtContainer);
    }//GEN-LAST:event_btnClearActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new ArrayListFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnterData;
    private javax.swing.JTextArea txtAreaOutput;
    private javax.swing.JTextField txtInputData;
    // End of variables declaration//GEN-END:variables
}
