package Finished.Dulay;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArrayListFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ArrayListFrame.class.getName());

    private String strTexts = "";
    
    private final ArrayList<Integer> arrayList = new ArrayList<>();
    
    public ArrayListFrame() {
        initComponents();
        getContentPane().setBackground(new Color(36, 17, 37));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        btnClear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtInputData = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaOutput = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnChange = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnClear.setBackground(new java.awt.Color(138, 11, 50));
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(232, 112, 151));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ARRAYLIST");

        jLabel2.setBackground(new java.awt.Color(138, 11, 50));
        jLabel2.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(232, 112, 151));
        jLabel2.setText("Enter Data");

        txtInputData.setBackground(new java.awt.Color(194, 15, 71));
        txtInputData.setForeground(new java.awt.Color(255, 255, 255));
        txtInputData.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtAreaOutput.setBackground(new java.awt.Color(194, 15, 71));
        txtAreaOutput.setColumns(20);
        txtAreaOutput.setForeground(new java.awt.Color(255, 255, 255));
        txtAreaOutput.setRows(5);
        jScrollPane1.setViewportView(txtAreaOutput);

        jLabel3.setBackground(new java.awt.Color(138, 11, 50));
        jLabel3.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(232, 112, 151));
        jLabel3.setText("Output:");

        btnAdd.setBackground(new java.awt.Color(138, 11, 50));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnChange.setBackground(new java.awt.Color(138, 11, 50));
        btnChange.setForeground(new java.awt.Color(255, 255, 255));
        btnChange.setText("Change");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        btnRemove.setBackground(new java.awt.Color(138, 11, 50));
        btnRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnClear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(btnChange, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addComponent(txtInputData, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInputData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(0, 9, Short.MAX_VALUE))
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

        strTexts += arrayList + "\n";
        txtInputData.setText("");

        txtAreaOutput.setText(strTexts);
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
        
        strTexts += arrayList + "\n";
        txtInputData.setText("");
        
        txtAreaOutput.setText(strTexts);
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
        
        strTexts += arrayList + "\n";
        txtAreaOutput.setText(strTexts);
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        arrayList.clear();
        strTexts += "List cleared.\n";
        txtAreaOutput.setText(strTexts);
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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaOutput;
    private javax.swing.JTextField txtInputData;
    // End of variables declaration//GEN-END:variables
}
