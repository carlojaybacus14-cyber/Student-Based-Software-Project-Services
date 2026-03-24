package Jayong;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class SinglyUI extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SinglyUI.class.getName());

    private final SinglyLinkedList singlyList = new SinglyLinkedList();

    private String strContainer = "";

    public SinglyUI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblInput = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        btnInsertAfter = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        lblOutput = new javax.swing.JLabel();
        InsertAt = new javax.swing.JComboBox<>();
        Delete = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SINGLY LINKED LIST");
        jLabel1.setMaximumSize(new java.awt.Dimension(174, 22));
        jLabel1.setMinimumSize(new java.awt.Dimension(174, 22));
        jLabel1.setPreferredSize(new java.awt.Dimension(174, 22));

        lblInput.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        lblInput.setText("ENTER ELEMENT:");
        lblInput.setMaximumSize(new java.awt.Dimension(138, 18));
        lblInput.setMinimumSize(new java.awt.Dimension(138, 18));
        lblInput.setPreferredSize(new java.awt.Dimension(138, 18));

        txtInput.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        txtInput.setPreferredSize(new java.awt.Dimension(68, 26));

        btnInsertAfter.setFont(new java.awt.Font("Rockwell", 1, 13)); // NOI18N
        btnInsertAfter.setText("INSERT AFTER");
        btnInsertAfter.setMaximumSize(new java.awt.Dimension(76, 29));
        btnInsertAfter.setMinimumSize(new java.awt.Dimension(76, 29));
        btnInsertAfter.setPreferredSize(new java.awt.Dimension(76, 29));
        btnInsertAfter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertAfterActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Rockwell", 1, 13)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.setMaximumSize(new java.awt.Dimension(76, 29));
        btnClear.setMinimumSize(new java.awt.Dimension(76, 29));
        btnClear.setPreferredSize(new java.awt.Dimension(76, 29));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        txtArea.setEditable(false);
        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        lblOutput.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        lblOutput.setText("OUTPUT:");
        lblOutput.setMaximumSize(new java.awt.Dimension(138, 18));
        lblOutput.setMinimumSize(new java.awt.Dimension(138, 18));
        lblOutput.setPreferredSize(new java.awt.Dimension(138, 18));

        InsertAt.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        InsertAt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INSERT AT BEGINNING", "INSERT AT END" }));
        InsertAt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertAtActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Rockwell", 1, 13)); // NOI18N
        Delete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DELETE BY VALUE", "DELETE BY POSITION" }));
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(InsertAt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInsertAfter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(Delete, 0, 0, Short.MAX_VALUE)))
                    .addComponent(lblOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(txtInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addComponent(lblInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(InsertAt)
                    .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertAfter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void InsertAtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertAtActionPerformed
            String s = txtInput.getText();
            if (s.isBlank()) {
                JOptionPane.showMessageDialog(this, "Please enter a data/index to delete");
                return;
            }
            
            int data;

            try {
                data = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid input");
                return;
            }
            
            switch (InsertAt.getSelectedItem().toString()) {
                case "INSERT AT BEGINNING" -> {
                    singlyList.insertAtBeginning(data);
                }
                case "INSERT AT END" -> {
                    singlyList.insertAtEnd(data);
                }
            }

            strContainer += singlyList.printList() + "\n";
            txtArea.setText(strContainer);
        }//GEN-LAST:event_InsertAtActionPerformed

        private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
            String s = txtInput.getText();
            if (s.isBlank()) {
                JOptionPane.showMessageDialog(this, "Please enter a data/index to delete");
                return;
            }

            int data;

            try {
                data = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid input");
                return;
            }

            switch (Delete.getSelectedItem().toString()) {
                case "DELETE BY VALUE" -> {
                    singlyList.deleteByValue(data);
                }
                case "DELETE BY POSITION" -> {
                    singlyList.deleteAtIndex(data);
                }
            }

            strContainer += singlyList.printList() + "\n";
            txtArea.setText(strContainer);
        }//GEN-LAST:event_DeleteActionPerformed

        private void btnInsertAfterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertAfterActionPerformed
            int data, prevData;

            try {
                prevData = Integer.parseInt(JOptionPane.showInputDialog("Enter a previous data"));
                data = Integer.parseInt(JOptionPane.showInputDialog("Enter a data"));
                
                singlyList.insertAfter(prevData, data);
                
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid input");
                return;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(this, "Previous data is not found");
                return;
            }

            strContainer += singlyList.printList() + ".\n";
            txtArea.setText(strContainer);
        }//GEN-LAST:event_btnInsertAfterActionPerformed

        private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
            singlyList.clear();
            strContainer += "List is cleared.\n";
            txtArea.setText(strContainer);
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
        java.awt.EventQueue.invokeLater(() -> new SinglyUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Delete;
    private javax.swing.JComboBox<String> InsertAt;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnInsertAfter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInput;
    private javax.swing.JLabel lblOutput;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}
