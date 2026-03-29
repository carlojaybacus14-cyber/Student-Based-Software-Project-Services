package Finished.Dulay;

import java.awt.Color;
import javax.swing.JOptionPane;

public class DoublyFrame extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DoublyFrame.class.getName());

    private String strTexts = "";
    
    private final DoublyLinkedList doublyList = new DoublyLinkedList();
    
    public DoublyFrame() {
        initComponents();
        getContentPane().setBackground(new Color(36, 17, 37));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        btnDisplay = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtInputData = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaOutput = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnLength = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDisplay.setBackground(new java.awt.Color(138, 11, 50));
        btnDisplay.setForeground(new java.awt.Color(255, 255, 255));
        btnDisplay.setText("Display");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(232, 112, 151));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DOUBLY LINKED LIST");

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

        btnInsert.setBackground(new java.awt.Color(138, 11, 50));
        btnInsert.setForeground(new java.awt.Color(255, 255, 255));
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(138, 11, 50));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnLength.setBackground(new java.awt.Color(138, 11, 50));
        btnLength.setForeground(new java.awt.Color(255, 255, 255));
        btnLength.setText("Length");
        btnLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLengthActionPerformed(evt);
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
                    .addComponent(btnDisplay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLength, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInsert, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLength, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
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
        strTexts += data + " is inserted\n";
        txtAreaOutput.setText(strTexts);
    }//GEN-LAST:event_btnInsertActionPerformed

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
        strTexts += data + " has been deleted\n";
        txtAreaOutput.setText(strTexts);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLengthActionPerformed
        strTexts += "Length: " + doublyList.size() + "\n";
        txtAreaOutput.setText(strTexts);
    }//GEN-LAST:event_btnLengthActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        strTexts += doublyList.printList() + "\n";
        txtAreaOutput.setText(strTexts);
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
        java.awt.EventQueue.invokeLater(() -> new DoublyFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLength;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
