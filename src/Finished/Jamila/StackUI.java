package Finished.Jamila;

import java.awt.Color;
import java.util.Stack;
import javax.swing.JOptionPane;

public class StackUI extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(StackUI.class.getName());

    private String txtContainer = "";
    
    private Stack<Integer> stack;
    
    public StackUI() {
        initComponents();
        getContentPane().setBackground(new Color(10, 15, 30));
        stack = new Stack<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        btnPush = new javax.swing.JButton();
        btnPop = new javax.swing.JButton();
        btnPeek = new javax.swing.JButton();
        btnEmpty = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Rajdhani", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(241, 245, 249));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STACK");

        jLabel2.setFont(new java.awt.Font("Rajdhani", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(148, 163, 184));
        jLabel2.setText("Enter Data:");

        txtInput.setBackground(new java.awt.Color(20, 30, 50));
        txtInput.setFont(new java.awt.Font("JetBrains Mono SemiBold", 0, 14)); // NOI18N
        txtInput.setForeground(new java.awt.Color(241, 245, 249));
        txtInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtInput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(59, 130, 246), 1, true));

        btnPush.setBackground(new java.awt.Color(37, 99, 235));
        btnPush.setFont(new java.awt.Font("Rajdhani SemiBold", 1, 16)); // NOI18N
        btnPush.setForeground(new java.awt.Color(255, 255, 255));
        btnPush.setText("Push");
        btnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushActionPerformed(evt);
            }
        });

        btnPop.setBackground(new java.awt.Color(220, 38, 38));
        btnPop.setFont(new java.awt.Font("Rajdhani SemiBold", 1, 16)); // NOI18N
        btnPop.setForeground(new java.awt.Color(255, 255, 255));
        btnPop.setText("Pop");
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });

        btnPeek.setBackground(new java.awt.Color(37, 99, 235));
        btnPeek.setFont(new java.awt.Font("Rajdhani SemiBold", 1, 16)); // NOI18N
        btnPeek.setForeground(new java.awt.Color(255, 255, 255));
        btnPeek.setText("Peek");
        btnPeek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeekActionPerformed(evt);
            }
        });

        btnEmpty.setBackground(new java.awt.Color(37, 99, 235));
        btnEmpty.setFont(new java.awt.Font("Rajdhani SemiBold", 1, 16)); // NOI18N
        btnEmpty.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpty.setText("Empty");
        btnEmpty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmptyActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Rajdhani Medium", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(148, 163, 184));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Output:");

        txtOutput.setBackground(new java.awt.Color(20, 30, 50));
        txtOutput.setColumns(20);
        txtOutput.setFont(new java.awt.Font("JetBrains Mono NL", 0, 14)); // NOI18N
        txtOutput.setForeground(new java.awt.Color(241, 245, 249));
        txtOutput.setRows(5);
        txtOutput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(59, 130, 246), 1, true));
        jScrollPane1.setViewportView(txtOutput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPush, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPeek, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPop, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPush, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPop, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPeek, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushActionPerformed
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

        stack.push(data);

        txtInput.setText("");
        txtContainer += stack + "\n";
        txtOutput.setText(txtContainer);
    }//GEN-LAST:event_btnPushActionPerformed

    private void btnEmptyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmptyActionPerformed
        txtContainer += "is stack empty? " + stack.empty() + "\n";
        txtOutput.setText(txtContainer);
    }//GEN-LAST:event_btnEmptyActionPerformed

    private void btnPeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeekActionPerformed
        if (stack.empty()) {
            JOptionPane.showMessageDialog(this, "Deque is empty.");
            return;
        }

        txtContainer += "Top element: " + stack.peek() + "\n";
        txtOutput.setText(txtContainer);
    }//GEN-LAST:event_btnPeekActionPerformed

    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        if (stack.empty()) {
            JOptionPane.showMessageDialog(this, "Deque is empty.");
            return;
        }

        stack.pop();

        txtContainer += stack + "\n";

        txtOutput.setText(txtContainer);
    }//GEN-LAST:event_btnPopActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new StackUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmpty;
    private javax.swing.JButton btnPeek;
    private javax.swing.JButton btnPop;
    private javax.swing.JButton btnPush;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables
}
