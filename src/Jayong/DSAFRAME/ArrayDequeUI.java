/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Jayong.DSAFRAME;

import java.util.ArrayDeque;

/**
 *
 * @author Jay Aguirre Alfeche
 */
public class ArrayDequeUI extends javax.swing.JFrame {

        private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ArrayDequeUI.class.getName());

        private ArrayDeque<String> AD;
        

        public ArrayDequeUI() {
                AD = new ArrayDeque<>();
                setTitle("ARRAY DEQUE FRAME");
                initComponents();
                this.setLocationRelativeTo(null);
        }

        private void displayArrayDeque() {
                txtArea.setText("Current ArrayDeque:\n");
                for (String element : AD) {
                        txtArea.append(element + "\n");

                }

        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                lbltxt = new javax.swing.JLabel();
                txtInput = new javax.swing.JTextField();
                btnClear = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                txtArea = new javax.swing.JTextArea();
                lbltxt2 = new javax.swing.JLabel();
                Peek = new javax.swing.JComboBox<>();
                Poll = new javax.swing.JComboBox<>();
                jButton1 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("ARRAY DEQUE DEMO");
                jLabel1.setMaximumSize(new java.awt.Dimension(174, 22));
                jLabel1.setMinimumSize(new java.awt.Dimension(174, 22));
                jLabel1.setPreferredSize(new java.awt.Dimension(174, 22));

                lbltxt.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
                lbltxt.setText("ENTER ELEMENT:");
                lbltxt.setMaximumSize(new java.awt.Dimension(138, 18));
                lbltxt.setMinimumSize(new java.awt.Dimension(138, 18));
                lbltxt.setPreferredSize(new java.awt.Dimension(138, 18));

                txtInput.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
                txtInput.setPreferredSize(new java.awt.Dimension(68, 26));

                btnClear.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
                btnClear.setText("CLEAR");
                btnClear.setMaximumSize(new java.awt.Dimension(76, 29));
                btnClear.setMinimumSize(new java.awt.Dimension(76, 29));
                btnClear.setPreferredSize(new java.awt.Dimension(76, 29));
                btnClear.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnClearActionPerformed(evt);
                        }
                });

                txtArea.setColumns(20);
                txtArea.setRows(5);
                jScrollPane1.setViewportView(txtArea);

                lbltxt2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
                lbltxt2.setText("OUTPUT:");
                lbltxt2.setMaximumSize(new java.awt.Dimension(138, 18));
                lbltxt2.setMinimumSize(new java.awt.Dimension(138, 18));
                lbltxt2.setPreferredSize(new java.awt.Dimension(138, 18));

                Peek.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
                Peek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PEEK FIRST", "PEEK LAST" }));
                Peek.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                PeekActionPerformed(evt);
                        }
                });

                Poll.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
                Poll.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "POLL FIRST", "POLL LAST" }));
                Poll.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                PollActionPerformed(evt);
                        }
                });

                jButton1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
                jButton1.setText("OFFER");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lbltxt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbltxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(Peek, 0, 174, Short.MAX_VALUE)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                                        .addComponent(Poll, 0, 174, Short.MAX_VALUE))))
                                .addContainerGap(23, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Peek, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                                        .addComponent(Poll, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbltxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
                );

                getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
                AD.clear();
                displayArrayDeque();
        }//GEN-LAST:event_btnClearActionPerformed

        private void PeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeekActionPerformed
                if (Peek.getSelectedItem() == null) {
                        txtArea.append("ArrayDeque is empty, nothing to peek.\n");
                }

                if (Peek.getSelectedItem().equals("PEEK FIRST")) {
                        String peekFIRST = AD.peekFirst();
                        txtArea.append("First Element: " + peekFIRST + "\n");
                } else {
                        String peekLAST = AD.peekLast();
                        txtArea.append("Last Element: " + peekLAST + "\n");
                }
        }//GEN-LAST:event_PeekActionPerformed

        private void PollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PollActionPerformed
                if (Poll.getSelectedItem() == null) {
                        txtArea.append("ArrayDeque is empty, nothing to remove.\n");
                }

                if (Poll.getSelectedItem().equals("POLL FIRST")) {
                        String pollFIRST = AD.pollFirst();
                        txtArea.append("Remove First Element: " + pollFIRST + "\n");
                        displayArrayDeque();
                } else {
                        String pollLAST = AD.pollLast();
                        txtArea.append("Remove Last Element: " + pollLAST + "\n");
                        displayArrayDeque();
                }
        }//GEN-LAST:event_PollActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                String data = txtInput.getText();
                if (!data.isEmpty()) {
                        AD.offer(data);
                        txtArea.setText("");
                        displayArrayDeque();
                }
                txtInput.setText("");
        }//GEN-LAST:event_jButton1ActionPerformed
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
                java.awt.EventQueue.invokeLater(() -> new ArrayDequeUI().setVisible(true));
        }
        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JComboBox<String> Peek;
        private javax.swing.JComboBox<String> Poll;
        private javax.swing.JButton btnClear;
        private javax.swing.JButton jButton1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JLabel lbltxt;
        private javax.swing.JLabel lbltxt2;
        private javax.swing.JTextArea txtArea;
        private javax.swing.JTextField txtInput;
        // End of variables declaration//GEN-END:variables
}
