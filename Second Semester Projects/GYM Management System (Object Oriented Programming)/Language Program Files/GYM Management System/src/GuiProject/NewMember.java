package GuiProject;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ESHOP
 */
public class NewMember extends javax.swing.JFrame {

    public static Connection getCon() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/GMS", "root", "abdullah01");
            return con;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Creates new form NewMember
     */
    public NewMember() {
        initComponents();
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        try {
            int id = 01;
            String str = String.valueOf(id);
            idLbl.setText(str);
            Connection con = getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select max(id) from newMember");
            while (rs.next()) {
                id = rs.getInt(01);
                id = id + 1;
                String str2 = String.valueOf(id);
                idLbl.setText(str2);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

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

        jPanel1 = new javax.swing.JPanel();
        closeBtn = new javax.swing.JButton();
        mainLbl = new javax.swing.JLabel();
        Lbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        idLbl = new javax.swing.JLabel();
        numberLbl = new javax.swing.JLabel();
        numberTxt = new javax.swing.JTextField();
        emailLbl = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        genderLbl = new javax.swing.JLabel();
        genderCbox = new javax.swing.JComboBox<>();
        fNameLbl = new javax.swing.JLabel();
        fNameTxt = new javax.swing.JTextField();
        ageLbl = new javax.swing.JLabel();
        ageTxt = new javax.swing.JTextField();
        cnicLbl = new javax.swing.JLabel();
        cnicTxt = new javax.swing.JTextField();
        clearBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        addressLbl = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        timingLbl = new javax.swing.JLabel();
        amountLbl = new javax.swing.JLabel();
        amountTxt = new javax.swing.JTextField();
        shiftCbox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        mainLbl.setFont(new java.awt.Font("Britannic Bold", 1, 30)); // NOI18N
        mainLbl.setForeground(new java.awt.Color(0, 118, 221));
        mainLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new member.png"))); // NOI18N
        mainLbl.setText("New Member");

        Lbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Lbl.setForeground(new java.awt.Color(0, 118, 221));
        Lbl.setText("Member ID:");

        nameLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nameLbl.setForeground(new java.awt.Color(0, 118, 221));
        nameLbl.setText("Name");

        nameTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nameTxt.setForeground(new java.awt.Color(0, 118, 221));
        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });

        idLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idLbl.setForeground(new java.awt.Color(255, 0, 0));
        idLbl.setText("00");

        numberLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        numberLbl.setForeground(new java.awt.Color(0, 118, 221));
        numberLbl.setText("Mobile Number");

        numberTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        numberTxt.setForeground(new java.awt.Color(0, 118, 221));
        numberTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberTxtActionPerformed(evt);
            }
        });

        emailLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        emailLbl.setForeground(new java.awt.Color(0, 118, 221));
        emailLbl.setText("Email");

        emailTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        emailTxt.setForeground(new java.awt.Color(0, 118, 221));
        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });

        genderLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        genderLbl.setForeground(new java.awt.Color(0, 118, 221));
        genderLbl.setText("Gender");

        genderCbox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        genderCbox.setForeground(new java.awt.Color(0, 118, 221));
        genderCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female", "Others", "Prefer not to say" }));

        fNameLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fNameLbl.setForeground(new java.awt.Color(0, 118, 221));
        fNameLbl.setText("Father Name");

        fNameTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fNameTxt.setForeground(new java.awt.Color(0, 118, 221));

        ageLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ageLbl.setForeground(new java.awt.Color(0, 118, 221));
        ageLbl.setText("Age");

        ageTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ageTxt.setForeground(new java.awt.Color(0, 118, 221));

        cnicLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cnicLbl.setForeground(new java.awt.Color(0, 118, 221));
        cnicLbl.setText("CNIC");

        cnicTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cnicTxt.setForeground(new java.awt.Color(0, 118, 221));

        clearBtn.setBackground(new java.awt.Color(0, 118, 221));
        clearBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        saveBtn.setBackground(new java.awt.Color(0, 118, 221));
        saveBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Add");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        addressLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addressLbl.setForeground(new java.awt.Color(0, 118, 221));
        addressLbl.setText("Address");

        addressTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addressTxt.setForeground(new java.awt.Color(0, 118, 221));

        timingLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        timingLbl.setForeground(new java.awt.Color(0, 118, 221));
        timingLbl.setText("Shift");

        amountLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        amountLbl.setForeground(new java.awt.Color(0, 118, 221));
        amountLbl.setText("Monthly Fee (Rs)");

        amountTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        amountTxt.setForeground(new java.awt.Color(0, 118, 221));

        shiftCbox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        shiftCbox.setForeground(new java.awt.Color(0, 118, 221));
        shiftCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "05:00 AM - 08:00 AM", "12:00 PM - 03:00 PM", "06:00 PM - 09:00 PM" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(genderLbl)
                                    .addComponent(numberLbl)
                                    .addComponent(emailLbl)
                                    .addComponent(addressLbl)
                                    .addComponent(timingLbl)
                                    .addComponent(amountLbl)
                                    .addComponent(nameLbl)
                                    .addComponent(fNameLbl)
                                    .addComponent(cnicLbl))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(numberTxt)
                                    .addComponent(emailTxt)
                                    .addComponent(addressTxt)
                                    .addComponent(amountTxt)
                                    .addComponent(shiftCbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fNameTxt)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(genderCbox, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nameTxt)
                                    .addComponent(cnicTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(clearBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(saveBtn))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Lbl)
                                .addGap(18, 18, 18)
                                .addComponent(idLbl))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(closeBtn)
                        .addGap(218, 218, 218)
                        .addComponent(mainLbl)))
                .addContainerGap(284, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(closeBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mainLbl)))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl)
                    .addComponent(idLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameLbl)
                    .addComponent(fNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLbl)
                    .addComponent(genderCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageLbl)
                    .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnicLbl)
                    .addComponent(cnicTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberLbl)
                    .addComponent(numberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailLbl)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressLbl)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timingLbl)
                    .addComponent(shiftCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amountLbl)
                    .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearBtn)
                    .addComponent(saveBtn))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numberTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberTxtActionPerformed

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Clear all?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new NewMember().setVisible(true);
        }
    }//GEN-LAST:event_clearBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
            setVisible(false);
            new Home().setVisible(true);
    }//GEN-LAST:event_closeBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Add Member?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            String id = idLbl.getText();
            String name = nameTxt.getText();
            String fatherName = fNameTxt.getText();
            String gender = (String) genderCbox.getSelectedItem();
            String age = ageTxt.getText();
            String CNIC = cnicTxt.getText();
            String mobileNumber = numberTxt.getText();
            String eMail = emailTxt.getText();
            String address = addressTxt.getText();
            String shift = (String) shiftCbox.getSelectedItem();
            String fee = amountTxt.getText();

            try {
                Connection con = getCon();
                PreparedStatement ps = con.prepareStatement("insert into newMember values (?,?,?,?,?,?,?,?,?,?,?)");
                ps.setString(1, id);
                ps.setString(2, name);
                ps.setString(3, fatherName);
                ps.setString(4, gender);
                ps.setString(5, age);
                ps.setString(6, CNIC);
                ps.setString(7, mobileNumber);
                ps.setString(8, eMail);
                ps.setString(9, address);
                ps.setString(10, shift);
                ps.setString(11, fee);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Successfully Added.");
                setVisible(false);
                new NewMember().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_saveBtnActionPerformed

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
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl;
    private javax.swing.JLabel addressLbl;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JLabel ageLbl;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JLabel amountLbl;
    private javax.swing.JTextField amountTxt;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel cnicLbl;
    private javax.swing.JTextField cnicTxt;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel fNameLbl;
    private javax.swing.JTextField fNameTxt;
    private javax.swing.JComboBox<String> genderCbox;
    private javax.swing.JLabel genderLbl;
    private javax.swing.JLabel idLbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mainLbl;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JLabel numberLbl;
    private javax.swing.JTextField numberTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JComboBox<String> shiftCbox;
    private javax.swing.JLabel timingLbl;
    // End of variables declaration//GEN-END:variables
}