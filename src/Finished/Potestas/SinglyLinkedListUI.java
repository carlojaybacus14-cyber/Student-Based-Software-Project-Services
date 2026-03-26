package Finished.Potestas;

import java.awt.Color;
import javax.swing.JOptionPane;

public class SinglyLinkedListUI extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SinglyLinkedListUI.class.getName());

    private String txtContainer = "";
    
    private final SinglyLinkedList singlyList;
    
    public SinglyLinkedListUI() {
        initComponents();
        getContentPane().setBackground(new Color(26, 16, 46));
        singlyList = new SinglyLinkedList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        btnLength = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnDisplay = new javax.swing.JButton();
        txtInput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 193, 74));
        jLabel2.setText("Enter Element:");

        btnDelete.setBackground(new java.awt.Color(36, 23, 64));
        btnDelete.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(240, 230, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtOutput.setBackground(new java.awt.Color(18, 12, 32));
        txtOutput.setColumns(20);
        txtOutput.setForeground(new java.awt.Color(240, 230, 255));
        txtOutput.setRows(5);
        jScrollPane1.setViewportView(txtOutput);

        btnLength.setBackground(new java.awt.Color(36, 23, 64));
        btnLength.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnLength.setForeground(new java.awt.Color(240, 230, 255));
        btnLength.setText("Length");
        btnLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLengthActionPerformed(evt);
            }
        });

        btnInsert.setBackground(new java.awt.Color(36, 23, 64));
        btnInsert.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(240, 230, 255));
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 193, 74));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("SINGLY LINKED LIST");

        btnDisplay.setBackground(new java.awt.Color(36, 23, 64));
        btnDisplay.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnDisplay.setForeground(new java.awt.Color(240, 230, 255));
        btnDisplay.setText("Display");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });

        txtInput.setBackground(new java.awt.Color(136, 112, 168));
        txtInput.setForeground(new java.awt.Color(240, 230, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(btnLength, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(btnDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)))
                    .addComponent(txtInput, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLength, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
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

    private void btnLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLengthActionPerformed
        txtContainer += "Length: " + singlyList.size() + "\n";
        txtOutput.setText(txtContainer);
    }//GEN-LAST:event_btnLengthActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        txtContainer += singlyList.printList() + "\n";
        txtOutput.setText(txtContainer);
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
        java.awt.EventQueue.invokeLater(() -> new SinglyLinkedListUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLength;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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

