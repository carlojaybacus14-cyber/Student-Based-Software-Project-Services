package Finished.Jamila;

import java.awt.Color;
import javax.swing.JOptionPane;

public class SinglyLinkedListUI extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SinglyLinkedListUI.class.getName());

    private String txtContainer = "";

    private final SinglyLinkedList singlyList;

    public SinglyLinkedListUI() {
        initComponents();
        getContentPane().setBackground(new Color(10, 15, 30));
        singlyList = new SinglyLinkedList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnLength = new javax.swing.JButton();
        btnDisplay = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Rajdhani", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(241, 245, 249));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SINGLY LINKED LIST");

        jLabel2.setFont(new java.awt.Font("Rajdhani", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(148, 163, 184));
        jLabel2.setText("Enter Data:");

        txtInput.setBackground(new java.awt.Color(30, 41, 59));
        txtInput.setFont(new java.awt.Font("JetBrains Mono SemiBold", 0, 14)); // NOI18N
        txtInput.setForeground(new java.awt.Color(241, 245, 249));
        txtInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtInput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 65, 85), 1, true));

        btnInsert.setBackground(new java.awt.Color(37, 99, 235));
        btnInsert.setFont(new java.awt.Font("Rajdhani SemiBold", 1, 16)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(255, 255, 255));
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(220, 38, 38));
        btnDelete.setFont(new java.awt.Font("Rajdhani SemiBold", 1, 16)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnLength.setBackground(new java.awt.Color(37, 99, 235));
        btnLength.setFont(new java.awt.Font("Rajdhani SemiBold", 1, 16)); // NOI18N
        btnLength.setForeground(new java.awt.Color(255, 255, 255));
        btnLength.setText("Length");
        btnLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLengthActionPerformed(evt);
            }
        });

        btnDisplay.setBackground(new java.awt.Color(37, 99, 235));
        btnDisplay.setFont(new java.awt.Font("Rajdhani SemiBold", 1, 16)); // NOI18N
        btnDisplay.setForeground(new java.awt.Color(255, 255, 255));
        btnDisplay.setText("Display");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Rajdhani Medium", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(148, 163, 184));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Output:");

        txtOutput.setBackground(new java.awt.Color(30, 41, 59));
        txtOutput.setColumns(20);
        txtOutput.setFont(new java.awt.Font("JetBrains Mono NL", 0, 14)); // NOI18N
        txtOutput.setForeground(new java.awt.Color(241, 245, 249));
        txtOutput.setRows(5);
        txtOutput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 65, 85), 1, true));
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
                        .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnLength, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLength, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        String s = txtInput.getText();
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

        txtInput.setText("");
        txtContainer += data + " is inserted\n";
        txtOutput.setText(txtContainer);
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLengthActionPerformed
        txtContainer += "Length: " + singlyList.size() + "\n";
        txtOutput.setText(txtContainer);
    }//GEN-LAST:event_btnLengthActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        txtContainer += singlyList.printList() + "\n";
        txtOutput.setText(txtContainer);
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String s = txtInput.getText();
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

        txtInput.setText("");
        txtContainer += data + " has been deleted\n";
        txtOutput.setText(txtContainer);
    }//GEN-LAST:event_btnDeleteActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new SinglyLinkedListUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLength;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextArea txtOutput;
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
