/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staff;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Adib Zaini
 */
public class RemoveStaff extends javax.swing.JFrame {

    final String PATH = "C:\\Users\\Adib Zaini\\Desktop\\CS230 PART 3\\CSC483\\Project\\New Folder\\project\\src\\main\\java\\database\\staff.csv";
    final String TEMP_PATH = "C:\\Users\\Adib Zaini\\Desktop\\CS230 PART 3\\CSC483\\Project\\New Folder\\project\\src\\main\\java\\database\\temp.csv";

    private String username;

    private ArrayList<javax.swing.JCheckBox> checkBoxList = new ArrayList<>();

    /**
     * Creates new form RemoveStaff
     */
    public RemoveStaff(String username) {
        this.username = username;
        initComponents();
        setSize(400, 350);
        setLocationRelativeTo(null); // Frame appear on Center of screen
        staffList();
    }

    private void staffList() {
        // Searching for staffs details
        try {
            Scanner reader = new Scanner(new File(PATH));

            while (reader.hasNextLine()) {
                String[] line = reader.nextLine().split(";;;");
                if (line[1].equals("staff_name")) {
                    continue;
                }

                // Add checkbox into ArrayList
                javax.swing.JCheckBox box = new javax.swing.JCheckBox(line[0] + "  |  " + line[1] + "  |  " + line[2]);
                if (line[2].equals("Admin")) box.setEnabled(false);
                checkBoxList.add(box);
            }
            reader.close();
            addBoxes();
        } catch (IOException e) {
            System.out.println("Database cannot be read");
            e.printStackTrace();
        }
    }

    private void addBoxes() {
        for (javax.swing.JCheckBox box : checkBoxList) {
            panel.add(box);
        }
    }

    private void removeStaff() {

        String str = "";

        for (int i = 0; i < checkBoxList.size(); i++) {

            javax.swing.JCheckBox box = checkBoxList.get(i);

            if (box.isSelected()) {
                // Remove Staff in UI
                checkBoxList.remove(i);
                panel.remove(box);
                i -= 1;
            }
        }
        repaint();
        revalidate();
        removeStaffFromFile();
    }

    private void removeStaffFromFile() {

        String str = "staff_id;;;staff_name;;;staff_position;;;username;;;password\n";

        for (javax.swing.JCheckBox box : checkBoxList) {

            // Remove Staff in file
            try {
                Scanner reader = new Scanner(new File(PATH));
                FileWriter writer = new FileWriter(TEMP_PATH);

                while (reader.hasNextLine()) {

                    // Get id from file
                    String line = reader.nextLine();
                    System.out.println(line);
                    String[] values = line.split(";;;");

                    // Get id from checkbox
                    String id = box.getText().substring(0, box.getText().indexOf(" "));

                    if (!id.equals(values[0])) {
                        continue;
                    }
                    str += line + "\n";
                }
                System.out.println(str);
                writer.write(str);
                reader.close();
                writer.close();
            } catch (IOException e) {
                System.out.println("Database cannot be read");
                e.printStackTrace();
            }
        }

        // All Staffs removed
        if (checkBoxList.isEmpty()) {
            try {
                FileWriter writer = new FileWriter(TEMP_PATH);
                writer.write(str);
                writer.close();
            } catch (IOException e) {
                System.out.println("Database cannot be read");
                e.printStackTrace();
            }
        }

        // Update Original file
        try {
            File file = new File(TEMP_PATH);
            Scanner reader = new Scanner(file);
            FileWriter writer = new FileWriter(PATH);
            String string = "";
            
            while (reader.hasNextLine()) {
                string += reader.nextLine() + "\n";
            }
            writer.write(string);
            
            reader.close();
            writer.close();
            file.delete();
        } catch (IOException e) {
            System.out.println("Database cannot be read");
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        title.setText("Remove Staff");

        panel.setLayout(new javax.swing.BoxLayout(panel, javax.swing.BoxLayout.Y_AXIS));
        scrollPane.setViewportView(panel);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollPane))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(title)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        Staff obj = new Staff(username);
        dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        
        for (javax.swing.JCheckBox box : checkBoxList) {
            if (box.isSelected()) {
                removeStaff();
                return;
            }
        }
        javax.swing.JOptionPane.showMessageDialog(null, "No Item Selected", "Notice", javax.swing.JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_removeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RemoveStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel panel;
    private javax.swing.JButton removeButton;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
