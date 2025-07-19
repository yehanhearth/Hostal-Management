/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package lk.hms.dialog;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import connection.MySQL;
import javax.swing.DefaultComboBoxModel;
import raven.toast.Notifications;
import java.sql.ResultSet;
import java.util.Vector;

/**
 *
 * @author yehanherath
 */
public class HostalDialog extends javax.swing.JDialog {

    public HostalDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadHostalDetails();
    }

    public void loadHostalDetails() {
        Vector<String> v = new Vector();
        v.add("Selecrt");
        Vector<String> genderItems = new Vector();
        genderItems.add("select Gender");
        
        try {
            ResultSet rs = MySQL.executeSearch("SELECT * FROM  `city` ");
             ResultSet grs=MySQL.executeSearch("SELECT  * FROM `gender`");
            //Read data using while
            while (rs.next()) {
                int id = rs.getInt("city_id");
                String location = rs.getString("city");
                v.add(id, location);
            }
            while (grs.next()) {
                int Gid =grs.getInt("g_id");
                String gender=grs.getString("gender");
                genderItems.add(Gid ,gender);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
          DefaultComboBoxModel<String> dcm = new DefaultComboBoxModel(v);
         getLocation.setModel(dcm);
         DefaultComboBoxModel<String> gitm =new DefaultComboBoxModel(genderItems);
         Getgender.setModel(gitm);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        getLocation = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        HName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Getgender = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 155, 210));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Kannada MN", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 43, 58));
        jLabel2.setText("New Hostal Room Registration");

        jPanel2.setBackground(new java.awt.Color(255, 155, 210));
        jPanel2.setLayout(new java.awt.GridLayout(4, 2, 5, 10));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(64, 43, 58));
        jLabel3.setText("Location");
        jPanel2.add(jLabel3);

        getLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(getLocation);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(64, 43, 58));
        jLabel7.setText("Hostal Name");
        jPanel2.add(jLabel7);

        HName.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        HName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HNameActionPerformed(evt);
            }
        });
        jPanel2.add(HName);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 43, 58));
        jLabel5.setText("owner id");
        jPanel2.add(jLabel5);

        Price.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        jPanel2.add(Price);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(64, 43, 58));
        jLabel6.setText("select Gender for Hostal");
        jPanel2.add(jLabel6);

        Getgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(Getgender);

        jButton1.setBackground(new java.awt.Color(64, 43, 58));
        jButton1.setFont(new java.awt.Font("PingFang TC", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(248, 244, 236));
        jButton1.setText("Register New Hostal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(377, 377, 377))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(125, 125, 125)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(141, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(177, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HNameActionPerformed


    }//GEN-LAST:event_HNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String varname = String.valueOf(getLocation.getSelectedIndex());
        String HostalName = HName.getText();
        String ownerId = Price.getText();
        int cityid = Integer.parseInt(varname);

        try {
            //  Insert into Rooms
            MySQL.executeIUD("INSERT INTO `Hostel` ( `name`,`owner_id`,`city_city_id`) VALUES ('" + HostalName + "','" + ownerId + "','" + cityid + "' )");

            //  Clear fields
            getLocation.setSelectedIndex(0);
            Price.setText("");
            HName.setText("");

            // Show success notification
            Notifications.getInstance().show(Notifications.Type.SUCCESS,
                    Notifications.Location.TOP_CENTER,
                    1000,
                    "User Successfully Registered");

        } catch (Exception e) {
            e.printStackTrace();
            Notifications.getInstance().show(Notifications.Type.ERROR,
                    Notifications.Location.TOP_CENTER,
                    2000,
                    "Registration failed: " + e.getMessage());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatMacDarkLaf.setup();

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HostalDialog dialog = new HostalDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> Getgender;
    private javax.swing.JTextField HName;
    private javax.swing.JTextField Price;
    private javax.swing.JComboBox<String> getLocation;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
