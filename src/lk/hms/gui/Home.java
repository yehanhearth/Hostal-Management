package lk.hms.gui;

import com.formdev.flatlaf.FlatClientProperties;
import static com.formdev.flatlaf.FlatClientProperties.STYLE;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import lk.hms.pannel.RoomDashboard;
import lk.hms.pannel.RoomInvoice;
import lk.hms.pannel.RoomManagement;
import lk.hms.pannel.feeManagement;
import lk.hms.pannel.visitorManagement;
import lk.hms.utill.appIconUtill;

public class Home extends javax.swing.JFrame {

    private RoomDashboard roomDashboard;
    private RoomInvoice roomInvoice;
    private RoomManagement roomManagement;
    private feeManagement feeManagement;
    private visitorManagement vManagement;
    private CardLayout contentPanelLayout;
    

    public Home() {
        initComponents();
        init();
        LoadPanel();

    }

    private void init() {
        appIconUtill.applyIcon(this);
        homeJp.putClientProperty(FlatClientProperties.STYLE, "arc:20");
        contentPanel.putClientProperty(STYLE, "arc:20");
        dashboardBtn.setIcon(new FlatSVGIcon("lk/hms/img/home.svg", 20, 20));
        invoiceBtn.setIcon(new FlatSVGIcon("lk/hms/img/invoice.svg", 20, 20));

    }

    private void LoadPanel() {
        if (contentPanelLayout == null && contentPanel.getLayout() instanceof CardLayout) {
            this.contentPanelLayout = (CardLayout) contentPanel.getLayout();
        }
        this.roomDashboard = new RoomDashboard();
        this.roomInvoice = new RoomInvoice();
        this.roomManagement = new RoomManagement();
        this.feeManagement =new feeManagement();
        this.vManagement=new visitorManagement();

        this.roomDashboard.putClientProperty(FlatClientProperties.STYLE, "arc:20");
        this.roomInvoice.putClientProperty(FlatClientProperties.STYLE, "arc:20");
        this.roomManagement.putClientProperty(FlatClientProperties.STYLE, "arc:20");    
        this.feeManagement.putClientProperty(FlatClientProperties.STYLE, "arc:20");
        this.vManagement.putClientProperty(FlatClientProperties.STYLE, "arc:20");


        this.contentPanel.add(roomDashboard, "Dashboard_panel");
        this.contentPanel.add(roomInvoice, "Invoice_panel");
        this.contentPanel.add(roomManagement, "Room_ManagementPanel");
        this.contentPanel.add(feeManagement,"fee_management");
        this.contentPanel.add(vManagement,"visitor_Management");
        SwingUtilities.updateComponentTreeUI(contentPanel);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        homeJp = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contentPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        invoiceBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dashboardBtn = new javax.swing.JButton();
        invoiceBtn1 = new javax.swing.JButton();
        invoiceBtn2 = new javax.swing.JButton();
        invoiceBtn3 = new javax.swing.JButton();
        invoiceBtn4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(50, 50, 50));

        homeJp.setBackground(new java.awt.Color(255, 242, 249));
        homeJp.setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        contentPanel.setLayout(new java.awt.CardLayout());
        jScrollPane1.setViewportView(contentPanel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1007;
        gridBagConstraints.ipady = 422;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        homeJp.add(jScrollPane1, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Krungthep", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(214, 52, 132));
        jLabel3.setText("Main Panel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        homeJp.add(jLabel3, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(64, 43, 58));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 115, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 124;
        gridBagConstraints.ipady = 115;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 40, 0, 0);
        homeJp.add(jPanel4, gridBagConstraints);

        jPanel5.setBackground(new java.awt.Color(64, 43, 58));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 112;
        gridBagConstraints.ipady = 115;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 129, 0, 0);
        homeJp.add(jPanel5, gridBagConstraints);

        jPanel6.setBackground(new java.awt.Color(64, 43, 58));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipady = 103;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        homeJp.add(jPanel6, gridBagConstraints);

        jPanel7.setBackground(new java.awt.Color(64, 43, 58));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 112;
        gridBagConstraints.ipady = 115;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 153, 0, 0);
        homeJp.add(jPanel7, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(50, 50, 50));

        invoiceBtn.setBackground(new java.awt.Color(254, 131, 198));
        invoiceBtn.setFont(new java.awt.Font("Noto Sans Oriya", 1, 14)); // NOI18N
        invoiceBtn.setForeground(new java.awt.Color(50, 50, 50));
        invoiceBtn.setText("Invoice");
        invoiceBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        invoiceBtn.setMargin(new java.awt.Insets(10, 14, 2, 14));
        invoiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceBtnActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(50, 50, 50));
        jLabel1.setForeground(new java.awt.Color(50, 50, 50));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/hms/img/hostel.png"))); // NOI18N
        jLabel1.setOpaque(true);

        dashboardBtn.setBackground(new java.awt.Color(254, 131, 198));
        dashboardBtn.setFont(new java.awt.Font("Noto Sans Oriya", 1, 14)); // NOI18N
        dashboardBtn.setForeground(new java.awt.Color(50, 50, 50));
        dashboardBtn.setText("Home");
        dashboardBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dashboardBtn.setMargin(new java.awt.Insets(10, 14, 2, 14));
        dashboardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardBtnActionPerformed(evt);
            }
        });

        invoiceBtn1.setBackground(new java.awt.Color(254, 131, 198));
        invoiceBtn1.setFont(new java.awt.Font("Noto Sans Oriya", 1, 14)); // NOI18N
        invoiceBtn1.setForeground(new java.awt.Color(50, 50, 50));
        invoiceBtn1.setText("Fee Management");
        invoiceBtn1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        invoiceBtn1.setMargin(new java.awt.Insets(10, 14, 2, 14));
        invoiceBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceBtn1ActionPerformed(evt);
            }
        });

        invoiceBtn2.setBackground(new java.awt.Color(254, 131, 198));
        invoiceBtn2.setFont(new java.awt.Font("Noto Sans Oriya", 1, 14)); // NOI18N
        invoiceBtn2.setForeground(new java.awt.Color(50, 50, 50));
        invoiceBtn2.setText("Room Management");
        invoiceBtn2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        invoiceBtn2.setMargin(new java.awt.Insets(10, 14, 2, 14));
        invoiceBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceBtn2ActionPerformed(evt);
            }
        });

        invoiceBtn3.setBackground(new java.awt.Color(254, 131, 198));
        invoiceBtn3.setFont(new java.awt.Font("Noto Sans Oriya", 1, 14)); // NOI18N
        invoiceBtn3.setForeground(new java.awt.Color(50, 50, 50));
        invoiceBtn3.setText("Visitor Management");
        invoiceBtn3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        invoiceBtn3.setMargin(new java.awt.Insets(10, 14, 2, 14));
        invoiceBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceBtn3ActionPerformed(evt);
            }
        });

        invoiceBtn4.setBackground(new java.awt.Color(254, 131, 198));
        invoiceBtn4.setFont(new java.awt.Font("Noto Sans Oriya", 1, 14)); // NOI18N
        invoiceBtn4.setForeground(new java.awt.Color(50, 50, 50));
        invoiceBtn4.setText("New User Register");
        invoiceBtn4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        invoiceBtn4.setMargin(new java.awt.Insets(10, 14, 2, 14));
        invoiceBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceBtn4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashboardBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(invoiceBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(invoiceBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(invoiceBtn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(invoiceBtn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(invoiceBtn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(dashboardBtn)
                .addGap(18, 18, 18)
                .addComponent(invoiceBtn)
                .addGap(18, 18, 18)
                .addComponent(invoiceBtn2)
                .addGap(18, 18, 18)
                .addComponent(invoiceBtn1)
                .addGap(18, 18, 18)
                .addComponent(invoiceBtn3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(invoiceBtn4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(50, 50, 50));

        jLabel2.setFont(new java.awt.Font("Skia", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(250, 78, 171));
        jLabel2.setText("Welcome to HostalBook");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeJp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(homeJp, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void dashboardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardBtnActionPerformed
        this.contentPanelLayout.show(contentPanel, "Dashboard_panel");
    }//GEN-LAST:event_dashboardBtnActionPerformed

    private void invoiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceBtnActionPerformed
        this.contentPanelLayout.show(contentPanel, "Invoice_panel");
    }//GEN-LAST:event_invoiceBtnActionPerformed

    private void invoiceBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceBtn1ActionPerformed
                this.contentPanelLayout.show(contentPanel, "fee_management");

    }//GEN-LAST:event_invoiceBtn1ActionPerformed

    private void invoiceBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceBtn2ActionPerformed
        this.contentPanelLayout.show(contentPanel, "Room_ManagementPanel");
    }//GEN-LAST:event_invoiceBtn2ActionPerformed

    private void invoiceBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceBtn3ActionPerformed
              this.contentPanelLayout.show(contentPanel, "visitor_Management");
    }//GEN-LAST:event_invoiceBtn3ActionPerformed

    private void invoiceBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceBtn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invoiceBtn4ActionPerformed

    public static void main(String args[]) {
        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton dashboardBtn;
    private javax.swing.JPanel homeJp;
    private javax.swing.JButton invoiceBtn;
    private javax.swing.JButton invoiceBtn1;
    private javax.swing.JButton invoiceBtn2;
    private javax.swing.JButton invoiceBtn3;
    private javax.swing.JButton invoiceBtn4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
