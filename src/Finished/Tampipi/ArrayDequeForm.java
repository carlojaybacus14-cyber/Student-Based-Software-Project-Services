package Finished.Tampipi;

import java.awt.Color;
import java.util.ArrayDeque;
import javax.swing.JOptionPane;

public class ArrayDequeForm extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ArrayDequeForm.class.getName());

    private String txtContainer = "";

    private final ArrayDeque<Integer> arrayDeque; // Declare variable

    public ArrayDequeForm() { // Constructor
        initComponents();
        getContentPane().setBackground(new Color(255, 209, 220));
        arrayDeque = new ArrayDeque<>(); // Initialize arrayDeque
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnOffer = new javax.swing.JButton();
        btnPeek = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnPoll = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(122, 32, 64));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ARRAY DEQUE");

        btnOffer.setBackground(new java.awt.Color(255, 240, 245));
        btnOffer.setFont(new java.awt.Font("Felix Titling", 1, 15)); // NOI18N
        btnOffer.setForeground(new java.awt.Color(122, 32, 64));
        btnOffer.setText("offer");
        btnOffer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOfferActionPerformed(evt);
            }
        });

        btnPeek.setBackground(new java.awt.Color(255, 240, 245));
        btnPeek.setFont(new java.awt.Font("Felix Titling", 1, 15)); // NOI18N
        btnPeek.setForeground(new java.awt.Color(122, 32, 64));
        btnPeek.setText("PEEK");
        btnPeek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeekActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(255, 240, 245));
        btnClear.setFont(new java.awt.Font("Felix Titling", 1, 15)); // NOI18N
        btnClear.setForeground(new java.awt.Color(122, 32, 64));
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnPoll.setBackground(new java.awt.Color(255, 240, 245));
        btnPoll.setFont(new java.awt.Font("Felix Titling", 1, 15)); // NOI18N
        btnPoll.setForeground(new java.awt.Color(122, 32, 64));
        btnPoll.setText("Poll");
        btnPoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPollActionPerformed(evt);
            }
        });

        txtOutput.setBackground(new java.awt.Color(255, 240, 245));
        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        jScrollPane1.setViewportView(txtOutput);

        jLabel2.setFont(new java.awt.Font("Felix Titling", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(122, 32, 64));
        jLabel2.setText("ENTER ELEMENT:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPeek, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPoll, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPeek, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPoll, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOfferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOfferActionPerformed

        String str = txtInput.getText();

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

        txtInput.setText("");
        txtContainer += arrayDeque + "\n";
        txtOutput.setText(txtContainer);
    }//GEN-LAST:event_btnOfferActionPerformed

    private void btnPeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeekActionPerformed

        if (arrayDeque.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Deque is empty");
            return;
        }

        txtContainer += "Top Element: " + arrayDeque.peek() + "\n";
        txtOutput.setText(txtContainer);
    }//GEN-LAST:event_btnPeekActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        arrayDeque.clear();
        txtContainer += "Deque cleared\n";
        txtOutput.setText(txtContainer);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnPollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPollActionPerformed

        if (arrayDeque.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Deque is empty");
            return;
        }

        arrayDeque.poll();

        txtContainer += arrayDeque + "\n";
        txtOutput.setText(txtContainer);
    }//GEN-LAST:event_btnPollActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new ArrayDequeForm().setVisible(true));
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
