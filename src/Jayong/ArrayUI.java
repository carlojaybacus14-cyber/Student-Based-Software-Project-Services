package Jayong;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class ArrayUI extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ArrayUI.class.getName());

    private String strContainer;

    private int[] array;

    public ArrayUI() {
        initComponents();
        array = new int[100];
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnDeleteAll = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ARRAY DEMO");
        jLabel1.setMaximumSize(new java.awt.Dimension(174, 22));
        jLabel1.setMinimumSize(new java.awt.Dimension(174, 22));
        jLabel1.setPreferredSize(new java.awt.Dimension(174, 22));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel2.setText("ENTER ELEMENT:");
        jLabel2.setMaximumSize(new java.awt.Dimension(138, 18));
        jLabel2.setMinimumSize(new java.awt.Dimension(138, 18));
        jLabel2.setPreferredSize(new java.awt.Dimension(138, 18));

        txtInput.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        txtInput.setPreferredSize(new java.awt.Dimension(68, 26));

        btnAdd.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.setMaximumSize(new java.awt.Dimension(76, 29));
        btnDelete.setMinimumSize(new java.awt.Dimension(76, 29));
        btnDelete.setPreferredSize(new java.awt.Dimension(766, 29));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnInsert.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnInsert.setText("INSERT");
        btnInsert.setMaximumSize(new java.awt.Dimension(76, 29));
        btnInsert.setMinimumSize(new java.awt.Dimension(76, 29));
        btnInsert.setPreferredSize(new java.awt.Dimension(76, 29));
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnDeleteAll.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnDeleteAll.setText("DELETE ALL");
        btnDeleteAll.setMaximumSize(new java.awt.Dimension(76, 29));
        btnDeleteAll.setMinimumSize(new java.awt.Dimension(76, 29));
        btnDeleteAll.setPreferredSize(new java.awt.Dimension(76, 29));
        btnDeleteAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAllActionPerformed(evt);
            }
        });

        txtOutput.setEditable(false);
        txtOutput.setColumns(20);
        txtOutput.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtOutput.setRows(5);
        jScrollPane1.setViewportView(txtOutput);

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel3.setText("OUTPUT:");
        jLabel3.setMaximumSize(new java.awt.Dimension(138, 18));
        jLabel3.setMinimumSize(new java.awt.Dimension(138, 18));
        jLabel3.setPreferredSize(new java.awt.Dimension(138, 18));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                    .addComponent(txtInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(btnDeleteAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String str = txtInput.getText();

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

        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        array = new int[array.length + 1];

        for (int i = 0; i < newArray.length; i++) {
            array[i] = newArray[i];
        }

        array[newArray.length] = data;

        strContainer += Arrays.toString(array) + "\n";
        txtOutput.setText(strContainer);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (array.length == 0) {
            JOptionPane.showMessageDialog(this, "Array is empty");
            return;
        }
        
        String str = txtInput.getText();
        
        if (str.isBlank()) {
            JOptionPane.showMessageDialog(this, "Enter an index");
            return;
        }
        
        int index;
        
        try {
            index = Integer.parseInt(str);
            
            if (index < 0 || index >= array.length) {
                JOptionPane.showMessageDialog(this, "Index out of bounds");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input");
            return;
        }
        
        int[] newArray = new int[array.length - 1];
        
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        
        for (int i = index; i < newArray.length; i++) {
            newArray[i] = array[i + 1];
        }
        
        array = new int[newArray.length];
        
        for (int i = 0; i < newArray.length; i++) {
            array[i] = newArray[i];
        }
        
        strContainer += Arrays.toString(array) + "\n";
        txtOutput.setText(strContainer);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        if (array.length == 0) {
            JOptionPane.showMessageDialog(this, "Array is empty");
            return;
        }
        
        String str = txtInput.getText();
        
        if (str.isBlank()) {
            JOptionPane.showMessageDialog(this, "Enter a data");
            return;
        }
        
        int data, index;
        
        try {
            data = Integer.parseInt(str);
            
            str = JOptionPane.showInputDialog(data + " insert at index:");
            
            if (str == null) {
                return;
            }
            
            index = Integer.parseInt(str);
            
            if (index < 0 || index >= array.length) {
                JOptionPane.showMessageDialog(this, "Index out of bounds");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input");
            return;
        }
        
        int[] newArray = new int[array.length + 1];
        
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        
        newArray[index] = data;
        
        for (int i = index + 1; i < newArray.length; i++) {
            newArray[i] = array[i - 1];
        }
        
        array = new int[newArray.length];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = newArray[i];
        }
        
        strContainer += Arrays.toString(array) + "\n";
        txtOutput.setText(strContainer);
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnDeleteAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAllActionPerformed
        array = new int[0];
        strContainer += "Array cleared\n";
        txtOutput.setText(strContainer);
    }//GEN-LAST:event_btnDeleteAllActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new ArrayUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteAll;
    private javax.swing.JButton btnInsert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables
}
