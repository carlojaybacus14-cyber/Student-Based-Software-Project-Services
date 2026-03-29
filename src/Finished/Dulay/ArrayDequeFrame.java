package Finished.Dulay;

import java.awt.Color;
import java.util.ArrayDeque;
import javax.swing.JOptionPane;

public class ArrayDequeFrame extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ArrayDequeFrame.class.getName());

    private String strTexts = "";
    
    private final ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
    
    public ArrayDequeFrame() {
        initComponents();
        getContentPane().setBackground(new Color(36, 17, 37));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtInputData = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaOutput = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btnOffer = new javax.swing.JButton();
        btnPeek = new javax.swing.JButton();
        btnPoll = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(232, 112, 151));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ARRAY DEQUE");

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

        btnOffer.setBackground(new java.awt.Color(138, 11, 50));
        btnOffer.setForeground(new java.awt.Color(255, 255, 255));
        btnOffer.setText("Offer");
        btnOffer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOfferActionPerformed(evt);
            }
        });

        btnPeek.setBackground(new java.awt.Color(138, 11, 50));
        btnPeek.setForeground(new java.awt.Color(255, 255, 255));
        btnPeek.setText("Peek");
        btnPeek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeekActionPerformed(evt);
            }
        });

        btnPoll.setBackground(new java.awt.Color(138, 11, 50));
        btnPoll.setForeground(new java.awt.Color(255, 255, 255));
        btnPoll.setText("Poll");
        btnPoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPollActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(138, 11, 50));
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
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
                    .addComponent(btnPoll, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(btnPeek, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOffer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(btnOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPeek, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPoll, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOfferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOfferActionPerformed
        
        String str = txtInputData.getText();

        if (str.isBlank()) {
            JOptionPane.showMessageDialog(this, "Please enter something");
            return;
        }

        int data;

        try {
            data = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input");
            return;
        }

        arrayDeque.offer(data);

        txtInputData.setText("");
        strTexts += arrayDeque + "\n";
        txtAreaOutput.setText(strTexts);
    }//GEN-LAST:event_btnOfferActionPerformed

    private void btnPeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeekActionPerformed
        
        if (arrayDeque.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Deque is empty");
            return;
        }

        strTexts += "Top Element: " + arrayDeque.peek() + "\n";
        txtAreaOutput.setText(strTexts);
    }//GEN-LAST:event_btnPeekActionPerformed

    private void btnPollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPollActionPerformed
        
        if (arrayDeque.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Deque is empty");
            return;
        }

        arrayDeque.poll();

        strTexts += arrayDeque + "\n";
        txtAreaOutput.setText(strTexts);
    }//GEN-LAST:event_btnPollActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        arrayDeque.clear();
        strTexts += "Deque cleared\n";
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
        java.awt.EventQueue.invokeLater(() -> new ArrayDequeFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnOffer;
    private javax.swing.JButton btnPeek;
    private javax.swing.JButton btnPoll;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaOutput;
    private javax.swing.JTextField txtInputData;
    // End of variables declaration//GEN-END:variables
}
