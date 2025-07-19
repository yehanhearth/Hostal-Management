/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package lk.hms.dialog;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;

import raven.toast.Notifications;
import connection.MySQL;
import java.sql.ResultSet;

/**
 *
 * @author yehanherath
 */
public class UserRegDilog extends javax.swing.JDialog {

    public UserRegDilog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New member ");
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 155, 210));

        jPanel2.setBackground(new java.awt.Color(255, 155, 210));
        jPanel2.setLayout(new java.awt.GridLayout(5, 3, 10, 5));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Lao MN", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 43, 58));
        jLabel2.setText("Member Full Name :-");
        jPanel2.add(jLabel2);

        jTextField2.setBackground(new java.awt.Color(64, 43, 58));
        jTextField2.setForeground(new java.awt.Color(248, 244, 236));
        jPanel2.add(jTextField2);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Lao MN", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(64, 43, 58));
        jLabel3.setText("age:-");
        jPanel2.add(jLabel3);

        jTextField3.setBackground(new java.awt.Color(64, 43, 58));
        jTextField3.setForeground(new java.awt.Color(248, 244, 236));
        jPanel2.add(jTextField3);

        jLabel5.setBackground(new java.awt.Color(64, 43, 58));
        jLabel5.setFont(new java.awt.Font("Lao MN", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 43, 58));
        jLabel5.setText("Mobile:-");
        jPanel2.add(jLabel5);

        jTextField1.setBackground(new java.awt.Color(64, 43, 58));
        jTextField1.setForeground(new java.awt.Color(248, 244, 236));
        jPanel2.add(jTextField1);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Lao MN", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(64, 43, 58));
        jLabel6.setText("NIC:-");
        jPanel2.add(jLabel6);

        jTextField4.setBackground(new java.awt.Color(64, 43, 58));
        jTextField4.setForeground(new java.awt.Color(248, 244, 236));
        jPanel2.add(jTextField4);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Lao MN", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(64, 43, 58));
        jLabel4.setText("User Email:-");
        jPanel2.add(jLabel4);

        jTextField5.setBackground(new java.awt.Color(64, 43, 58));
        jTextField5.setForeground(new java.awt.Color(248, 244, 236));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField5);

        jButton1.setBackground(new java.awt.Color(51, 0, 51));
        jButton1.setFont(new java.awt.Font("Kefa", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(248, 244, 236));
        jButton1.setText("Submit User Details");
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 155, 210));
        jPanel3.setForeground(new java.awt.Color(248, 244, 236));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Kannada MN", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(64, 43, 58));
        jLabel1.setText("New Member Registration");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 907, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String Fname = jTextField2.getText();
        String age = jTextField3.getText();
        String Mobile = jTextField1.getText();
        String nic = jTextField4.getText();
        String Email = jTextField5.getText();

        try {
            MySQL.executeIUD("INSERT INTO `Customer` (`nic`,`full_name`,`email`,`phone`,`age`) VALUES ('" + nic + "','" + Fname + "','" + Email + "','" + Mobile + "','" + age + "') ");
            jTextField1.setText(" ");
            jTextField2.setText(" ");
            jTextField3.setText(" ");
            jTextField4.setText(" ");
            jTextField5.setText(" ");
            Notifications.getInstance().show(Notifications.Type.SUCCESS,//message type
                    Notifications.Location.TOP_CENTER,
                    1000,
                    "User Sucessfully Registerd");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UserRegDilog dialog = new UserRegDilog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
