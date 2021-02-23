package javaaplikasi_v1.pkg0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PintuMasuk extends javax.swing.JFrame {

    public PintuMasuk() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtuser = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaaplikasi_v1/pkg0/icons/Silahkan Masuk Sistem Manajemen Rumah Sakit HelthPro.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaaplikasi_v1/pkg0/icons/Group 2792.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        txtuser.setBackground(new java.awt.Color(224, 220, 220));
        txtuser.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtuser.setForeground(new java.awt.Color(155, 153, 187));
        txtuser.setText("admin");
        txtuser.setBorder(null);
        txtuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtuserMouseClicked(evt);
            }
        });
        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });
        jPanel3.add(txtuser);
        txtuser.setBounds(40, 51, 200, 30);

        txtpass.setBackground(new java.awt.Color(224, 220, 220));
        txtpass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtpass.setForeground(new java.awt.Color(102, 102, 102));
        txtpass.setText("admin");
        txtpass.setBorder(null);
        txtpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpassMouseClicked(evt);
            }
        });
        jPanel3.add(txtpass);
        txtpass.setBounds(40, 130, 180, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaaplikasi_v1/pkg0/icons/username.png"))); // NOI18N
        jPanel3.add(jLabel3);
        jLabel3.setBounds(0, 40, 290, 50);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Masuk");
        jLabel6.setToolTipText("");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel6);
        jLabel6.setBounds(90, 250, 60, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaaplikasi_v1/pkg0/icons/Group 2796_1.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel5);
        jLabel5.setBounds(150, 210, 100, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaaplikasi_v1/pkg0/icons/Passwoard _.png"))); // NOI18N
        jPanel3.add(jLabel7);
        jLabel7.setBounds(0, 100, 100, 20);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaaplikasi_v1/pkg0/icons/Username _.png"))); // NOI18N
        jPanel3.add(jLabel8);
        jLabel8.setBounds(0, 20, 100, 20);

        jLabel4.setBackground(new java.awt.Color(224, 220, 220));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaaplikasi_v1/pkg0/icons/passwoard.png"))); // NOI18N
        jPanel3.add(jLabel4);
        jLabel4.setBounds(0, 110, 290, 60);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaaplikasi_v1/pkg0/icons/Lupa Sandi_.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jLabel9);
        jLabel9.setBounds(160, 180, 90, 15);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        String username = String.valueOf(txtuser.getText());
        String password = String.valueOf(txtpass.getPassword());
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kuliah", "root", "");
            String query = "SELECT * FROM login WHERE username = '" + username + "' AND password = '" + password + "' ";
            Statement st = con.createStatement();
            ResultSet rs2 = st.executeQuery(query);
            while (rs2.next()) {
                if (password.equals(rs2.getString("password")) && username.equals(rs2.getString("username"))) {
                    JOptionPane.showMessageDialog(null, "berhasil masuk");
                    new Dashboard().setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "username atau password Salah");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "TERJADI KESALAHAN" + e);
        }


    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon("logo.png");
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowActivated

    private void txtuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtuserMouseClicked
        // TODO add your handling code here:
        txtuser.setText(null);
    }//GEN-LAST:event_txtuserMouseClicked

    private void txtpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpassMouseClicked
        // TODO add your handling code here:
        txtpass.setText(null);
    }//GEN-LAST:event_txtpassMouseClicked

    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
