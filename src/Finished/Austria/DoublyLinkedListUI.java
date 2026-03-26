package Finished.Austria;

import java.awt.Color;
import javax.swing.JOptionPane;

public class DoublyLinkedListUI extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DoublyLinkedListUI.class.getName());

    private String strContainer = "";

    private final DoublyLinkedList doublyList;

    public DoublyLinkedListUI() {
        initComponents();
        getContentPane().setBackground(new Color(40, 90, 210));
        doublyList = new DoublyLinkedList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaOutput = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txtInputData = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnInsertAfter = new javax.swing.JButton();
        btnLength = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(30, 60, 180));
        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DOUBLY LINKED LIST");

        txtAreaOutput.setBackground(new java.awt.Color(255, 255, 255));
        txtAreaOutput.setColumns(20);
        txtAreaOutput.setRows(5);
        jScrollPane1.setViewportView(txtAreaOutput);

        jLabel2.setBackground(new java.awt.Color(30, 60, 180));
        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Data:");

        txtInputData.setBackground(new java.awt.Color(255, 255, 255));

        btnInsert.setBackground(new java.awt.Color(10, 30, 120));
        btnInsert.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(255, 255, 255));
        btnInsert.setText("INSERT");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(10, 30, 120));
        btnDelete.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnInsertAfter.setBackground(new java.awt.Color(10, 30, 120));
        btnInsertAfter.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnInsertAfter.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertAfter.setText("INSERT AFTER");
        btnInsertAfter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertAfterActionPerformed(evt);
            }
        });

        btnLength.setBackground(new java.awt.Color(10, 30, 120));
        btnLength.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnLength.setForeground(new java.awt.Color(255, 255, 255));
        btnLength.setText("LENGTH");
        btnLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLengthActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnInsert, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtInputData, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                        .addComponent(btnInsertAfter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLength, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtInputData, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLength, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInsertAfter, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        String str = txtInputData.getText();

        if (str.isBlank()) {
            JOptionPane.showMessageDialog(this, "Enter a data");
            return;
        }
        
        int data;

        try {
            data = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input");
            return;
        }
        
        doublyList.insertAtEnd(data);

        txtInputData.setText("");
        strContainer += doublyList.printList() + "\n";
        txtAreaOutput.setText(strContainer);
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLengthActionPerformed
        strContainer += "Length: " + doublyList.size() + "\n";
        txtAreaOutput.setText(strContainer);
    }//GEN-LAST:event_btnLengthActionPerformed

    private void btnInsertAfterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertAfterActionPerformed
        String str1 = txtInputData.getText();

        if (str1.isBlank()) {
            JOptionPane.showMessageDialog(this, "Enter a data");
            return;
        }
        
        int data, prevData;

        try {
            
            data = Integer.parseInt(str1);
            
            String str2 = JOptionPane.showInputDialog("Insert " + data + " after: ");
            
            if (str2.isBlank()) {
                JOptionPane.showMessageDialog(this, "Enter a data");
                return;
            }
            
            prevData = Integer.parseInt(str2);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input");
            return;
        }
        
        doublyList.insertAfter(prevData, data);

        txtInputData.setText("");
        strContainer += doublyList.printList() + "\n";
        txtAreaOutput.setText(strContainer);
    }//GEN-LAST:event_btnInsertAfterActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String str = txtInputData.getText();

        if (doublyList.size() == 0) {
            JOptionPane.showMessageDialog(this, "List is empty");
            return;
        }
        
        if (str.isBlank()) {
            JOptionPane.showMessageDialog(this, "Enter a data");
            return;
        }
        
        int data;

        try {
            data = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input");
            return;
        }
        
        boolean isDeleted = doublyList.deleteData(data);
        
        if (!isDeleted) {
            JOptionPane.showMessageDialog(this, data + " is not found in the list");
            return;
        }

        txtInputData.setText("");
        strContainer += doublyList.printList() + "\n";
        txtAreaOutput.setText(strContainer);
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
        java.awt.EventQueue.invokeLater(() -> new DoublyLinkedListUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnInsertAfter;
    private javax.swing.JButton btnLength;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaOutput;
    private javax.swing.JTextField txtInputData;
    // End of variables declaration//GEN-END:variables
}

class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    private class Node {

        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // --- PRINT LIST ---
    public String printList() {
        if (head == null) {
            return "List is empty.";
        }

        Node current = head;

        String strContainer = "";
        while (current.next != null) {
            strContainer += current.data + " <-> ";
            current = current.next;
        }

        return strContainer += current.data + " <-> null";
    }

    // --- DISPLAY FORWARD ---
    public void displayForward() {

        Node current = head;

        if (current == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.println("Doubly Linked List (forward):");
        System.out.print("null <- ");
        while (current.next != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println(current.data + " -> null");
    }

    // --- DISPLAY BACKWARD ---
    public void displayBackward() {
        Node current = tail;
        if (current == null) {
            System.out.println("List is empty.");
            return;
        }

        System.out.println("Douly Linked List (backward):");
        System.out.print("null <- ");
        while (current.prev != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println(current.data + " -> null");
    }

    // --- INSERT AT BEGINNING ---
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // --- INSERT AT END ---
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        size++;

        if (tail == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // --- INSERT AFTER ---
    public void insertAfter(int prevData, int data) {
        if (head == null) {
            System.out.println("List is empty. Cannot insert.");
            return;
        }

        Node current = head;
        while (current != null) {
            if (current.data == prevData) {
                Node newNode = new Node(data);
                newNode.prev = current;
                newNode.next = current.next;

                if (current.next != null) {
                    current.next.prev = newNode;
                } else {
                    tail = newNode;
                }

                current.next = newNode;
                return;
            }
            current = current.next;
        }
        System.out.println("Node with data " + prevData + " not found.");
    }

    // --- DELETE DATA ---
    public boolean deleteData(int data) {
        Node current = head;

        if (head == null) {
            return false;
        }

        if (head.data == data) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            size--;
            return true;
        }

        while (current != null) {
            if (current.data == data) {
                if (current.next == null) {
                    tail = current.prev;
                    tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
                return true;
            }
            current = current.next;
        }

        System.out.println(data + " not found in the list.");
        return false;
    }

    // --- DELETE AT INDEX ---
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size || head == null) {
            System.out.println("Invalid position or empty list");
        }

        if (index == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            if (current.next == null) {
                tail = current.prev;
                tail.next = null;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
        }
        size--;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    // --- SIZE ---
    public int size() {
        return size;
    }
}
