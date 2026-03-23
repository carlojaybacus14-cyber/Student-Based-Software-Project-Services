
package jayong.DSAFRAME;

/**
 *
 * @author Jay Aguirre Alfeche
 */
public class ArrayUI extends javax.swing.JFrame {
        
        private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ArrayUI.class.getName());

        
        public ArrayUI() {
                initComponents();
        }

       
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jButton3 = new javax.swing.JButton();
                jButton4 = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTextArea1 = new javax.swing.JTextArea();
                jLabel3 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("ARRAY DEMO");
                jLabel1.setMaximumSize(new java.awt.Dimension(174, 22));
                jLabel1.setMinimumSize(new java.awt.Dimension(174, 22));
                jLabel1.setPreferredSize(new java.awt.Dimension(174, 22));

                jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
                jLabel2.setText("ENTER ELEMENT:");
                jLabel2.setMaximumSize(new java.awt.Dimension(138, 18));
                jLabel2.setMinimumSize(new java.awt.Dimension(138, 18));
                jLabel2.setPreferredSize(new java.awt.Dimension(138, 18));

                jTextField1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
                jTextField1.setPreferredSize(new java.awt.Dimension(68, 26));

                jButton1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
                jButton1.setMaximumSize(new java.awt.Dimension(76, 29));
                jButton1.setMinimumSize(new java.awt.Dimension(76, 29));
                jButton1.setPreferredSize(new java.awt.Dimension(76, 29));

                jButton2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
                jButton2.setMaximumSize(new java.awt.Dimension(76, 29));
                jButton2.setMinimumSize(new java.awt.Dimension(76, 29));
                jButton2.setPreferredSize(new java.awt.Dimension(766, 29));

                jButton3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
                jButton3.setMaximumSize(new java.awt.Dimension(76, 29));
                jButton3.setMinimumSize(new java.awt.Dimension(76, 29));
                jButton3.setPreferredSize(new java.awt.Dimension(76, 29));
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });

                jButton4.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
                jButton4.setMaximumSize(new java.awt.Dimension(76, 29));
                jButton4.setMinimumSize(new java.awt.Dimension(76, 29));
                jButton4.setPreferredSize(new java.awt.Dimension(76, 29));

                jTextArea1.setColumns(20);
                jTextArea1.setRows(5);
                jScrollPane1.setViewportView(jTextArea1);

                jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
                jLabel3.setText("OUTPUT:");
                jLabel3.setMaximumSize(new java.awt.Dimension(138, 18));
                jLabel3.setMinimumSize(new java.awt.Dimension(138, 18));
                jLabel3.setPreferredSize(new java.awt.Dimension(138, 18));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(23, 23, 23))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(23, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jButton3ActionPerformed

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
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTextArea jTextArea1;
        private javax.swing.JTextField jTextField1;
        // End of variables declaration//GEN-END:variables
}
