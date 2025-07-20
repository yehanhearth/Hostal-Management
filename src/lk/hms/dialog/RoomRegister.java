/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package lk.hms.dialog;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import connection.MySQL;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import lk.hms.entity.RoomTypeLoad;


public class RoomRegister extends javax.swing.JDialog {

    private final HashMap<String, Integer> LoadRooms;


    public RoomRegister(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadHostalDetails();

        this.LoadRooms = new HashMap<>();
        RoomTypeL();
 

    }

    public void loadHostalDetails() {
        Vector<String> sh = new Vector();
        sh.add("Select Hostal");
        Vector<String> RType = new Vector();
        RType.add("select Room Type");
        Vector<String> Sta = new Vector();
        Sta.add("Select Status");

        try {
            ResultSet rs = MySQL.executeSearch("SELECT `hostel_id`,`name` FROM `Hostel` ");
//            ResultSet rt = MySQL.executeSearch("SELECT  * FROM `Room_type`");

            ResultSet s = MySQL.executeSearch("SELECT * FROM `Status` ");
            //Read data using while
            while (rs.next()) {
                int id = rs.getInt("hostel_id");
                String hName = rs.getString("name");
                sh.add(id, hName);
            }
            // loading Using Db
            while (s.next()) {
                int sid = s.getInt("s_id");
                String Status = s.getString("status");
                Sta.add(sid, Status);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        DefaultComboBoxModel<String> dcm = new DefaultComboBoxModel(sh);
        getHostal.setModel(dcm);
        DefaultComboBoxModel<String> rdc = new DefaultComboBoxModel(RType);
        RoomType.setModel(rdc);
        DefaultComboBoxModel<String> sdc = new DefaultComboBoxModel(Sta);
        status.setModel(sdc);

    }

    //Load Room Types
    private void RoomTypeL() {
        RoomTypeLoad[] roomT = RoomTypeLoad.values();
        for (RoomTypeLoad rt : roomT) {
            RoomType.addItem(String.valueOf(rt));
            LoadRooms.put(String.valueOf(rt), rt.getId());
        }
    }
    public JComboBox<String> RoomType() {
        return RoomType;

    }

    public HashMap<String, Integer> LoadRooms() {
        return LoadRooms;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        getHostal = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        RoomNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        RoomType = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        capacity = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Register = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 155, 210));

        jPanel2.setBackground(new java.awt.Color(255, 155, 210));
        jPanel2.setLayout(new java.awt.GridLayout(6, 2, 5, 10));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(64, 43, 58));
        jLabel3.setText("Select Hostal ");
        jPanel2.add(jLabel3);

        getHostal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(getHostal);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(64, 43, 58));
        jLabel7.setText("Room Number");
        jPanel2.add(jLabel7);

        RoomNumber.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        RoomNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomNumberActionPerformed(evt);
            }
        });
        jPanel2.add(RoomNumber);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 43, 58));
        jLabel5.setText("Room Type");
        jPanel2.add(jLabel5);

        RoomType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(RoomType);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(64, 43, 58));
        jLabel6.setText("Capacity");
        jPanel2.add(jLabel6);
        jPanel2.add(capacity);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(64, 43, 58));
        jLabel8.setText("Price per Night");
        jPanel2.add(jLabel8);

        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        jPanel2.add(price);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(64, 43, 58));
        jLabel9.setText("Status");
        jPanel2.add(jLabel9);

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(status);

        jPanel3.setBackground(new java.awt.Color(255, 155, 210));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Kannada MN", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 43, 58));
        jLabel2.setText("New Room Register For Hostal");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 24, Short.MAX_VALUE)))
        );

        Register.setBackground(new java.awt.Color(64, 43, 58));
        Register.setFont(new java.awt.Font("PingFang TC", 1, 18)); // NOI18N
        Register.setForeground(new java.awt.Color(248, 244, 236));
        Register.setText("Register New Room For Hostal");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 982, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(319, 319, 319))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RoomNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomNumberActionPerformed

    }//GEN-LAST:event_RoomNumberActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        String Shotel =String.valueOf(getHostal.getSelectedIndex());
        String Rnumber=RoomNumber.getText();
        String Rtype=String.valueOf(RoomType.getSelectedIndex());
        String cap=capacity.getText();
        String ppNight=price.getText();
        String Stat=String.valueOf(status.getSelectedIndex());
        
        try {
            MySQL.executeIUD("INSERT INTO `Room` (`hostel_id`,`room_Type_id`,`room_number`,`capacity`,`price_per_night`,`status_id`) "
                    + "VALUES ('"+Shotel+"','"+Rtype +"','"+Rnumber+"','"+cap+"','"+ppNight+"','"+Stat+"')  ");
        } catch (Exception e) {
        }
        
        

    }//GEN-LAST:event_RegisterActionPerformed

    public static void main(String args[]) {
        FlatMacDarkLaf.setup();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RoomRegister dialog = new RoomRegister(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton Register;
    private javax.swing.JTextField RoomNumber;
    private javax.swing.JComboBox<String> RoomType;
    private javax.swing.JTextField capacity;
    private javax.swing.JComboBox<String> getHostal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField price;
    private javax.swing.JComboBox<String> status;
    // End of variables declaration//GEN-END:variables
}
