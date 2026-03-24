package Finished.Amadeo;

import java.awt.Color;
import javax.swing.JOptionPane;

public class SinglyLinkedListFrame extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SinglyLinkedListFrame.class.getName());

    private String txtContainer = "";
    
    private SinglyLinkedList singlyList;
    
    public SinglyLinkedListFrame() {
        initComponents();
        getContentPane().setBackground(new Color(13, 42, 46));
        singlyList = new SinglyLinkedList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblEnterData = new javax.swing.JLabel();
        txtInputData = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnLength = new javax.swing.JButton();
        btnDisplay = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaOutput = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Rajdhani", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 211, 238));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SINGLY LINKED LIST");

        lblEnterData.setFont(new java.awt.Font("Rajdhani SemiBold", 1, 20)); // NOI18N
        lblEnterData.setForeground(new java.awt.Color(56, 188, 212));
        lblEnterData.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEnterData.setText("Enter Data:");

        txtInputData.setBackground(new java.awt.Color(7, 26, 29));
        txtInputData.setFont(new java.awt.Font("JetBrains Mono SemiBold", 0, 14)); // NOI18N
        txtInputData.setForeground(new java.awt.Color(168, 234, 245));
        txtInputData.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        btnInsert.setBackground(new java.awt.Color(10, 56, 64));
        btnInsert.setFont(new java.awt.Font("Rajdhani Medium", 1, 16)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(34, 211, 238));
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(10, 56, 64));
        btnDelete.setFont(new java.awt.Font("Rajdhani Medium", 1, 16)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(34, 211, 238));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnLength.setBackground(new java.awt.Color(10, 56, 64));
        btnLength.setFont(new java.awt.Font("Rajdhani Medium", 1, 16)); // NOI18N
        btnLength.setForeground(new java.awt.Color(34, 211, 238));
        btnLength.setText("Length");
        btnLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLengthActionPerformed(evt);
            }
        });

        btnDisplay.setBackground(new java.awt.Color(10, 56, 64));
        btnDisplay.setFont(new java.awt.Font("Rajdhani Medium", 1, 16)); // NOI18N
        btnDisplay.setForeground(new java.awt.Color(34, 211, 238));
        btnDisplay.setText("Display");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });

        txtAreaOutput.setBackground(new java.awt.Color(7, 26, 29));
        txtAreaOutput.setColumns(20);
        txtAreaOutput.setFont(new java.awt.Font("JetBrains Mono NL", 1, 14)); // NOI18N
        txtAreaOutput.setForeground(new java.awt.Color(168, 234, 245));
        txtAreaOutput.setRows(5);
        jScrollPane1.setViewportView(txtAreaOutput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLength, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEnterData, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtInputData)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterData, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInputData, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLength, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        String s = txtInputData.getText();
        if (s.isBlank()) {
            JOptionPane.showMessageDialog(this, "Please enter a data");
            return;
        }

        int data;

        try {
            data = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input");
            return;
        }

        singlyList.insertAtEnd(data);

        txtContainer += data + " is inserted\n";
        txtAreaOutput.setText(txtContainer);
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String s = txtInputData.getText();
        if (s.isBlank()) {
            JOptionPane.showMessageDialog(this, "Please enter a data to delete");
            return;
        }

        int data;

        try {
            data = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input");
            return;
        }

        if (!singlyList.deleteByValue(data)) {
            JOptionPane.showMessageDialog(this, data + " was not found in the list");
            return;
        }

        txtContainer += data + " has been deleted\n";
        txtAreaOutput.setText(txtContainer);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLengthActionPerformed
        txtContainer += "Length: " + singlyList.size() + "\n";
        txtAreaOutput.setText(txtContainer);
    }//GEN-LAST:event_btnLengthActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        txtContainer += singlyList.printList() + "\n";
        txtAreaOutput.setText(txtContainer);
    }//GEN-LAST:event_btnDisplayActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new SinglyLinkedListFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLength;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnterData;
    private javax.swing.JTextArea txtAreaOutput;
    private javax.swing.JTextField txtInputData;
    // End of variables declaration//GEN-END:variables
}

class SinglyLinkedList {

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

    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    // --- DISPLAY VALUES ---
    public String printList() {
        if (size == 0) {
            return "List is empty.";
        }

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

        Node prevNode = head;

        while (prevNode.data != prevData) {
            prevNode = prevNode.next;
        }

        if (prevNode == null) {
            System.out.println("Previous node cannot be null");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        size++;
    }

    // --- DELETE BY VALUE ---
    public boolean deleteByValue(int value) {

        Node current = head;
        Node previous = null;

        if (current != null && current.data == value) {
            head = current.next;
            size--;
            return true;
        }

        while (current != null && current.data != value) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            return false;
        }

        previous.next = current.next;
        size--;
        return true;
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
    public int size() {
        return size;
    }
}
