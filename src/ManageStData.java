
import java.awt.Dimension;
import java.awt.Toolkit;
import Connection.ConnectionProvider;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ManageStData extends javax.swing.JFrame {

    /**
     * Creates new form UpdateDeleteMember
     */
    public ManageStData() {
        initComponents();
        Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelUpDlt = new javax.swing.JLabel();
        jButtonClose = new javax.swing.JButton();
        jButtonHome = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelStId = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelMN = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelGender = new javax.swing.JLabel();
        jLabelAge = new javax.swing.JLabel();
        jLabelNIC = new javax.swing.JLabel();
        jLabelRFee = new javax.swing.JLabel();
        jTextFieldStId = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldMN = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldGender = new javax.swing.JTextField();
        jTextFieldAge = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jTextFieldNIC = new javax.swing.JTextField();
        jTextFieldRFee = new javax.swing.JTextField();
        jLabelBCKG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jLabelUpDlt.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabelUpDlt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/restart_48px.png"))); // NOI18N
        jLabelUpDlt.setText("Update and Delete Students");

        jButtonClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_window_48px.png"))); // NOI18N
        jButtonClose.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });

        jButtonHome.setBackground(new java.awt.Color(255, 153, 0));
        jButtonHome.setForeground(new java.awt.Color(255, 153, 0));
        jButtonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images2/home_24px.png"))); // NOI18N
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUpDlt)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jButtonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 375, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUpDlt))
                .addGap(37, 37, 37))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabelStId.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabelStId.setText("Student ID :");
        jPanel2.add(jLabelStId);
        jLabelStId.setBounds(78, 46, 84, 21);

        jLabelName.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabelName.setText("Name");
        jPanel2.add(jLabelName);
        jLabelName.setBounds(78, 110, 49, 21);

        jLabelMN.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabelMN.setText("Mobile Number");
        jPanel2.add(jLabelMN);
        jLabelMN.setBounds(79, 210, 121, 21);

        jLabelEmail.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabelEmail.setText("Email");
        jPanel2.add(jLabelEmail);
        jLabelEmail.setBounds(79, 310, 43, 21);

        jLabelGender.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabelGender.setText("Gender");
        jPanel2.add(jLabelGender);
        jLabelGender.setBounds(79, 398, 59, 21);

        jLabelAge.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabelAge.setText("Age");
        jPanel2.add(jLabelAge);
        jLabelAge.setBounds(559, 110, 33, 21);

        jLabelNIC.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabelNIC.setText("NIC");
        jPanel2.add(jLabelNIC);
        jLabelNIC.setBounds(559, 210, 28, 21);

        jLabelRFee.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabelRFee.setText("Registration Fee");
        jPanel2.add(jLabelRFee);
        jLabelRFee.setBounds(559, 310, 140, 21);

        jTextFieldStId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(jTextFieldStId);
        jTextFieldStId.setBounds(180, 47, 104, 26);

        jTextFieldName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(jTextFieldName);
        jTextFieldName.setBounds(78, 137, 380, 26);

        jTextFieldMN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(jTextFieldMN);
        jTextFieldMN.setBounds(79, 249, 380, 26);

        jTextFieldEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldEmail);
        jTextFieldEmail.setBounds(79, 337, 380, 26);

        jTextFieldGender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(jTextFieldGender);
        jTextFieldGender.setBounds(79, 430, 380, 26);

        jTextFieldAge.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(jTextFieldAge);
        jTextFieldAge.setBounds(559, 137, 380, 26);

        jButtonSearch.setBackground(new java.awt.Color(255, 255, 51));
        jButtonSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_16px.png"))); // NOI18N
        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSearch);
        jButtonSearch.setBounds(332, 45, 127, 25);

        jButtonUpdate.setBackground(new java.awt.Color(255, 255, 51));
        jButtonUpdate.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButtonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save_26px.png"))); // NOI18N
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonUpdate);
        jButtonUpdate.setBounds(79, 498, 135, 35);

        jButtonDelete.setBackground(new java.awt.Color(255, 255, 51));
        jButtonDelete.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete_bin_24px.png"))); // NOI18N
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonDelete);
        jButtonDelete.setBounds(257, 499, 125, 33);

        jButtonReset.setBackground(new java.awt.Color(255, 255, 51));
        jButtonReset.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButtonReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh_26px.png"))); // NOI18N
        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonReset);
        jButtonReset.setBounds(428, 498, 119, 35);

        jTextFieldNIC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(jTextFieldNIC);
        jTextFieldNIC.setBounds(559, 249, 380, 26);

        jTextFieldRFee.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(jTextFieldRFee);
        jTextFieldRFee.setBounds(559, 337, 380, 26);

        jLabelBCKG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBCKG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images2/b5.jpg"))); // NOI18N
        jLabelBCKG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabelBCKG);
        jLabelBCKG.setBounds(-10, 0, 1000, 590);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 115, 980, 592));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        // TODO add your handling code here:
        setVisible(false); 
    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ManageStData().setVisible(true);
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        // TODO add your handling code here:
        int checkid=0;
        String id=jTextFieldStId.getText();
        try
        {
            Connection con=ConnectionProvider.getcon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from student where id = '"+id+"'");
            while(rs.next())
            {
                checkid = 1;
                jTextFieldStId.setEditable(false);
                jTextFieldName.setText(rs.getString(2));
                jTextFieldMN.setText(rs.getString(4));
                jTextFieldEmail.setText(rs.getString(5));
                jTextFieldGender.setText(rs.getString(6));
                jTextFieldGender.setEditable(false);
                jTextFieldAge.setText(rs.getString(7));
                jTextFieldNIC.setText(rs.getString(3));
                jTextFieldRFee.setText(rs.getString(8));
                
            }
            if(checkid == 0){
                JOptionPane.showMessageDialog(null, "Student ID does not Exist");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        String id=jTextFieldStId.getText();
        String name=jTextFieldName.getText();
        String mobilenumber=jTextFieldMN.getText();
        String email=jTextFieldEmail.getText();
        String gender=jTextFieldAge.getText();
        String age=jTextFieldAge.getText();
        String nic=jTextFieldNIC.getText();
        String fee=jTextFieldRFee.getText();
        
        try 
        {
            Connection con=ConnectionProvider.getcon();
            PreparedStatement ps=con.prepareStatement("update student set name=?,mobilenumber=?,email=?,gender=?,age=?,nic=?,fee=? where id=?");
            ps.setString(1, name);
            ps.setString(2, mobilenumber);
            ps.setString(3, email);
            ps.setString(4, gender);
            ps.setString(5, age);
            ps.setString(6, nic);
            ps.setString(7, fee);
            ps.setString(8, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Updated");
            setVisible(false);
            new ManageStData().setVisible(true);
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null, "Do you really want to Delete","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            String id=jTextFieldStId.getText();
            try
            {
                Connection con=ConnectionProvider.getcon();
                Statement st=con.createStatement();
                st.executeUpdate("delete from student where id='"+id+"'" );
                JOptionPane.showMessageDialog(null, "Successfully Deleted");
                setVisible(false);
                new ManageStData().setVisible(true);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        // TODO add your handling code here:
        Dashboard hm = new Dashboard();
        hm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

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
            java.util.logging.Logger.getLogger(ManageStData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageStData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageStData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageStData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageStData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelBCKG;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelMN;
    private javax.swing.JLabel jLabelNIC;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelRFee;
    private javax.swing.JLabel jLabelStId;
    private javax.swing.JLabel jLabelUpDlt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldGender;
    private javax.swing.JTextField jTextFieldMN;
    private javax.swing.JTextField jTextFieldNIC;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldRFee;
    private javax.swing.JTextField jTextFieldStId;
    // End of variables declaration//GEN-END:variables
}
