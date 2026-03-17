package Danosos;

import java.awt.*;
import java.util.*;
import javax.swing.JOptionPane;

public class ArrayDequeUI1 extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ArrayDequeUI1.class.getName());

    // ArrayDeque that will store integer values entered by the user
    private final ArrayDeque<Integer> arrayDeque;

    // String container that stores the history of output displayed in the text area
    private String txtContainer = "";

    // Constructor: runs when the program starts
    public ArrayDequeUI1() {
        initComponents();
        arrayDeque = new ArrayDeque<>(); // Creates an empty ArrayDeque
        getContentPane().setBackground(new Color(26, 26, 26)); // Sets window background color
    }

    // Method used to display the stored output in the text area
    private void display() {
        txtOutput.setText(txtContainer); // Update the output text area with current content
    }

    // Method to show an error dialog when user input is invalid
    private void showErrorDialog(String message) {
        JOptionPane.showMessageDialog(this, message, "error", JOptionPane.ERROR_MESSAGE);
    }

    // Method to show a reminder dialog if the deque is empty
    private void showReminderDialog() {
        JOptionPane.showMessageDialog(this, "Array list is empty");
    }
    
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jDialog1 = new javax.swing.JDialog();
                btnPeek = new javax.swing.JButton();
                btnClear = new javax.swing.JButton();
                btnOffer = new javax.swing.JButton();
                txtInput = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jScrollPane2 = new javax.swing.JScrollPane();
                txtOutput = new javax.swing.JTextArea();
                btnPoll = new javax.swing.JButton();

                javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
                jDialog1.getContentPane().setLayout(jDialog1Layout);
                jDialog1Layout.setHorizontalGroup(
                        jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
                );
                jDialog1Layout.setVerticalGroup(
                        jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
                );

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setBackground(new java.awt.Color(26, 26, 26));

                btnPeek.setBackground(new java.awt.Color(44, 44, 44));
                btnPeek.setFont(new java.awt.Font("Mongolian Baiti", 1, 12)); // NOI18N
                btnPeek.setForeground(new java.awt.Color(224, 224, 224));
                btnPeek.setText("Peek");
                btnPeek.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnPeekActionPerformed(evt);
                        }
                });

                btnClear.setBackground(new java.awt.Color(56, 40, 40));
                btnClear.setFont(new java.awt.Font("Mongolian Baiti", 1, 12)); // NOI18N
                btnClear.setForeground(new java.awt.Color(224, 136, 136));
                btnClear.setText("Clear");
                btnClear.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnClearActionPerformed(evt);
                        }
                });

                btnOffer.setBackground(new java.awt.Color(44, 44, 44));
                btnOffer.setFont(new java.awt.Font("Mongolian Baiti", 1, 12)); // NOI18N
                btnOffer.setForeground(new java.awt.Color(224, 224, 224));
                btnOffer.setText("Offer");
                btnOffer.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnOfferActionPerformed(evt);
                        }
                });

                txtInput.setBackground(new java.awt.Color(17, 17, 17));
                txtInput.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
                txtInput.setForeground(new java.awt.Color(221, 221, 221));

                jLabel2.setBackground(new java.awt.Color(17, 17, 17));
                jLabel2.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(240, 240, 240));
                jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel2.setText("ARRAY DEQUE");

                jLabel4.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(136, 136, 136));
                jLabel4.setText("User Input");

                jLabel3.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(136, 136, 136));
                jLabel3.setText("Output");

                txtOutput.setEditable(false);
                txtOutput.setBackground(new java.awt.Color(17, 17, 17));
                txtOutput.setColumns(20);
                txtOutput.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
                txtOutput.setForeground(new java.awt.Color(255, 255, 255));
                txtOutput.setRows(5);
                jScrollPane2.setViewportView(txtOutput);

                btnPoll.setBackground(new java.awt.Color(44, 44, 44));
                btnPoll.setFont(new java.awt.Font("Mongolian Baiti", 1, 12)); // NOI18N
                btnPoll.setForeground(new java.awt.Color(224, 224, 224));
                btnPoll.setText("Poll");
                btnPoll.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnPollActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnPoll, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnPeek, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtInput, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(31, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel4)
                                .addGap(4, 4, 4)
                                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnPoll, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnPeek, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                .addGap(32, 32, 32))
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents
    
    // POLL BUTTON: Removes the first element
    private void btnPollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPollActionPerformed
        if (arrayDeque.isEmpty()) {
            showReminderDialog();    // Stop if there is nothing to remove
            return;
        }
        
        arrayDeque.poll();     // Removes the element at the front
        
        if (arrayDeque.isEmpty()) {     // Check if the deque became empty after removal
            txtContainer += "Array is now Empty.\n";
        } else {
            txtContainer += arrayDeque + "\n";
        }
        
        display();
    }//GEN-LAST:event_btnPollActionPerformed

    private void btnPeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeekActionPerformed
        if (arrayDeque.isEmpty()) {
            showReminderDialog();
            return;
        }
        
        txtContainer += "Peeked top element: " + arrayDeque.peek() + "\n";
        display();
    }//GEN-LAST:event_btnPeekActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        if (arrayDeque.isEmpty()) {
            showReminderDialog();
            return;
        }
        
        arrayDeque.clear();
        txtContainer += "Array is now Empty.\n";
        display();
    }//GEN-LAST:event_btnClearActionPerformed

    // This method runs when the "Offer" button is clicked
        private void btnOfferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOfferActionPerformed
                int data;
                try {
                        data = Integer.parseInt(txtInput.getText());     // Convert the text from txtInput into an integer
                } catch (NumberFormatException e) {
                        showErrorDialog("Invalid user input");     // If input is not a valid number, show error dialog
                        return;
                }

                arrayDeque.offer(data);     // Add the number to the ArrayDeque
                txtContainer += arrayDeque + "\n";
                display();
        }//GEN-LAST:event_btnOfferActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new ArrayDequeUI1().setVisible(true));
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnClear;
        private javax.swing.JButton btnOffer;
        private javax.swing.JButton btnPeek;
        private javax.swing.JButton btnPoll;
        private javax.swing.JDialog jDialog1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JTextField txtInput;
        private javax.swing.JTextArea txtOutput;
        // End of variables declaration//GEN-END:variables
}
