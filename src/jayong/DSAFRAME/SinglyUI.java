package jayong.DSAFRAME;

import javax.swing.JOptionPane;

/**
 *
 * @author Jay Aguirre Alfeche
 */
public class SinglyUI extends javax.swing.JFrame {

        private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SinglyUI.class.getName());

        private void setLocationRelativeTo(Object object) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public SinglyUI() {
                initComponents();
                this.setLocationRelativeTo(null);
        }

        public class Node {

                int data;
                Node next;

                Node(int data) {
                        this.data = data;
                        this.next = null;
                }
        }
        private Node head;
        private int size;

        // --- DISPLAY VALUES ---
        public String printList() {
                Node current = head;
                String txtContainer = "";
                while (current != null) {
                        txtContainer += current.data + " -> ";
                        current = current.next;
                }
                return txtContainer += "null";
        }

        // --- INSERT AT BEGINNING ---
        public void insertAtBeginning(int data) {
                Node newNode = new Node(data);
                newNode.next = head;
                head = newNode;
                size++;
        }

        // --- INSERT AT END ---
        public void insertAtEnd(int data) {
                Node newNode = new Node(data);
                if (head == null) {
                        head = newNode;
                } else {
                        Node last = head;
                        while (last.next != null) {
                                last = last.next;
                        }
                        last.next = newNode;
                }
                size++;
        }

        // --- INSERT AFTER ---
        public void insertAfter(int prevData, int data) {
                Node current = head;

                while (current.data != prevData) {
                        current = current.next;
                        if (current == null) {
                                System.out.println("Previous data does not exist.");
                                return;
                        }
                }

                Node newNode = new Node(data);
                newNode.next = current.next;
                current.next = newNode;
        }

        // --- DELETE BY VALUE ---
        public void deleteByValue(int value) {

                Node current = head;
                Node previous = null;

                if (current != null && current.data == value) {
                        head = current.next;
                        size--;
                        return;
                }

                while (current != null && current.data != value) {
                        previous = current;
                        current = current.next;
                }

                if (current == null) {
                        return;
                }

                previous.next = current.next;
                size--;
        }

        // --- DELETE BY POSITION ---
        public void deleteAtIndex(int index) {
                if (head == null) {
                        return;
                }

                Node current = head;
                if (index == 0) {
                        head = current.next;
                        size--;
                        return;
                }

                for (int i = 0; current.next != null && i < index - 1; i++) {
                        current = current.next;
                }

                if (current == null || current.next == null) {
                        return;
                }

                Node next = current.next.next;
                current.next = next;
                size--;
        }

        // --- DELETE AT BEGINNING ---
        public void deleteAtBeginning() {
                if (head == null) {
                        return;
                }
                head = head.next;
                size--;
        }

        // --- DELETE AT END ---
        public void deleteAtEnd() {
                if (head == null) {
                        return;
                }
                Node current = head;
                while (current.next.next != null) {
                        current = current.next;
                }
                current.next = null;
                size--;
        }

        // --- GET NODE AT ---
        public Node getNodeAtIndex(int index) {
                Node current = head;
                for (int i = 0; current != null && i < index; i++) {
                        current = current.next;
                }
                return current;
        }

        public Node getNodeByValueOf(int value) {
                Node current = head;
                while (current != null && current.data != value) {
                        current = current.next;
                }
                return current;
        }

        public void clear() {
                head = null;
        }

        // --- SIZE ---
        public int length() {
                return size;
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
                txtInput.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtInputActionPerformed(evt);
                        }
                });

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

                txtArea.setColumns(20);
                txtArea.setRows(5);
                jScrollPane1.setViewportView(txtArea);

                lblOutput.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
                lblOutput.setText("OUTPUT:");
                lblOutput.setMaximumSize(new java.awt.Dimension(138, 18));
                lblOutput.setMinimumSize(new java.awt.Dimension(138, 18));
                lblOutput.setPreferredSize(new java.awt.Dimension(138, 18));

                InsertAt.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
                InsertAt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INSERT AT BEGINNING", "INSERT AT END" }));
                InsertAt.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                InsertAtMouseClicked(evt);
                        }
                });
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
                String SLL = txtInput.getText();
                if (SLL.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "No Input.", "Error",
                                JOptionPane.ERROR_MESSAGE);
                        return;

                }
                try {
                        int element = Integer.parseInt(SLL);
                        if (InsertAt.getSelectedItem().equals("Insert at Beginning")) {
                                insertAtBeginning(element);
                                txtArea.append(SLL + " is Inserted at beginning.\n");

                        } else if (InsertAt.getSelectedItem().equals("Insert at End")) {
                                insertAtEnd(element);
                                txtArea.append(SLL + " is Inserted at end.\n");
                        }
                } catch (Exception e) {
                }

        }//GEN-LAST:event_InsertAtActionPerformed

        private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_DeleteActionPerformed

        private void btnInsertAfterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertAfterActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_btnInsertAfterActionPerformed

        private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_btnClearActionPerformed

        private void txtInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_txtInputActionPerformed

        private void InsertAtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertAtMouseClicked
//        String SLL = txtInput.getText();
//                if (SLL.isEmpty()) {
//                        JOptionPane.showMessageDialog(this, "No Input.","Error",
//                        JOptionPane.ERROR_MESSAGE);
//                        return;
//                        
//                }
//                try {
//                        int element = Integer.parseInt(SLL);
//                        if (InsertAt.getSelectedItem().equals("Insert at Beginning")) {
//                                insertAtBeginning(element);
//                                txtArea.append(SLL + " is Inserted at beginning.\n");
//                                
//                        }
//                        else if(InsertAt.getSelectedItem().equals("Insert at End")){
//                                insertAtEnd(element);
//                                txtArea.append(SLL + " is Inserted at end.\n");
//                        }
//                } catch (Exception e) {
//                }        
        }//GEN-LAST:event_InsertAtMouseClicked

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
