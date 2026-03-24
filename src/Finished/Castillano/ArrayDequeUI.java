package Finished.Castillano;

import java.awt.Color;
import java.util.ArrayDeque;
import javax.swing.JOptionPane;

public class ArrayDequeUI extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ArrayDequeUI.class.getName());

    private String texts = "";

    private final ArrayDeque<Integer> arrayDeque;

    private final OfferDialog offerDialog;

    public ArrayDequeUI() {
        initComponents();
        getContentPane().setBackground(new Color(44, 15, 18));

        arrayDeque = new ArrayDeque<>();
        offerDialog = new OfferDialog(this, true);
    }

    private void displayText() {
        txtOutput.setText(texts);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnOffer = new javax.swing.JButton();
        btnPoll = new javax.swing.JButton();
        btnPeek = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(210, 140, 140));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ARRAY DEQUE");

        txtInput.setBackground(new java.awt.Color(44, 15, 18));
        txtInput.setForeground(new java.awt.Color(245, 225, 225));

        jLabel2.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(210, 140, 140));
        jLabel2.setText("Enter Data:");

        btnOffer.setBackground(new java.awt.Color(107, 30, 35));
        btnOffer.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 14)); // NOI18N
        btnOffer.setForeground(new java.awt.Color(245, 225, 225));
        btnOffer.setText("OFFER");
        btnOffer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOfferActionPerformed(evt);
            }
        });

        btnPoll.setBackground(new java.awt.Color(107, 30, 35));
        btnPoll.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 14)); // NOI18N
        btnPoll.setForeground(new java.awt.Color(245, 225, 225));
        btnPoll.setText("POLL");
        btnPoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPollActionPerformed(evt);
            }
        });

        btnPeek.setBackground(new java.awt.Color(107, 30, 35));
        btnPeek.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 14)); // NOI18N
        btnPeek.setForeground(new java.awt.Color(245, 225, 225));
        btnPeek.setText("PEEK");
        btnPeek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeekActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(114, 16, 16));
        btnClear.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(245, 225, 225));
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        txtOutput.setEditable(false);
        txtOutput.setBackground(new java.awt.Color(62, 20, 22));
        txtOutput.setColumns(20);
        txtOutput.setForeground(new java.awt.Color(255, 255, 255));
        txtOutput.setRows(5);
        jScrollPane1.setViewportView(txtOutput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPoll, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPeek, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                    .addComponent(txtInput)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOffer)
                    .addComponent(btnPoll)
                    .addComponent(btnPeek)
                    .addComponent(btnClear))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOfferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOfferActionPerformed
        String txt = txtInput.getText();

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

        offerDialog.setVisible(true);

        switch (offerDialog.getOfferType()) {
            case "FIRST" -> {
                arrayDeque.offerFirst(data);
            }
            case "LAST" -> {
                arrayDeque.offerFirst(data);
            }
            default -> {
                return;
            }
        }

        texts += arrayDeque + "\n";
        txtInput.setText("");

        displayText();
    }//GEN-LAST:event_btnOfferActionPerformed

    private void btnPollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPollActionPerformed
        if (arrayDeque.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Deque is empty.");
            return;
        }

        arrayDeque.poll();

        texts += arrayDeque + "\n";
        txtInput.setText("");

        displayText();
    }//GEN-LAST:event_btnPollActionPerformed

    private void btnPeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeekActionPerformed
        if (arrayDeque.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Deque is empty.");
            return;
        }

        int element = arrayDeque.peek();

        texts += "Top element: " + element + "\n";

        displayText();
    }//GEN-LAST:event_btnPeekActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        arrayDeque.clear();
        texts += "Deque cleared.\n";
        displayText();
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
        java.awt.EventQueue.invokeLater(() -> new ArrayDequeUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnOffer;
    private javax.swing.JButton btnPeek;
    private javax.swing.JButton btnPoll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables
}
