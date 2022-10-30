/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.City;
import model.Hospital;
import model.Person;
import model.PersonHistory;

/**
 *
 * @author srivenkatasatyaakhilmalladi
 */
public class PersonJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PersonJFrame
     */
    PersonHistory personhistory = new PersonHistory();
    public PersonJFrame(PersonHistory phistory) {
        initComponents();
        this.personhistory = phistory;
        loadComboBoxData();
    }

    private PersonJFrame() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGroup = new javax.swing.ButtonGroup();
        lblEmail = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblHeading = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        txtAddress = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        lblPatientID = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnMale = new javax.swing.JRadioButton();
        lblCity = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnFemale = new javax.swing.JRadioButton();
        btnOther = new javax.swing.JRadioButton();
        txtPatientID = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        comboCommunity = new javax.swing.JComboBox<>();
        comboCity = new javax.swing.JComboBox<>();
        comboHospital = new javax.swing.JComboBox<>();
        comboDoctor = new javax.swing.JComboBox<>();
        lblCity1 = new javax.swing.JLabel();
        lblCity2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));

        lblEmail.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblEmail.setText("Email :");

        txtAge.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        lblHeading.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(0, 0, 204));
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("Create Patient Profile");

        txtPhoneNumber.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });
        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyReleased(evt);
            }
        });

        btnCreate.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(0, 0, 153));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        txtAddress.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
        });

        lblGender.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblGender.setText("Gender :");

        lblAddress.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblAddress.setText("Address :");

        lblCommunity.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblCommunity.setText("Community :");

        lblPatientID.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblPatientID.setText("Patient ID :");

        lblPhoneNumber.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblPhoneNumber.setText("Phone Number :");

        txtEmail.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        genderGroup.add(btnMale);
        btnMale.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnMale.setText("Male");
        btnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaleActionPerformed(evt);
            }
        });

        lblCity.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCity.setText("City :");

        txtName.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        genderGroup.add(btnFemale);
        btnFemale.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnFemale.setText("Female");
        btnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFemaleActionPerformed(evt);
            }
        });

        genderGroup.add(btnOther);
        btnOther.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnOther.setText("Other");
        btnOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtherActionPerformed(evt);
            }
        });

        txtPatientID.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtPatientID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPatientIDKeyReleased(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblName.setText("Patient Name :");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("+1");

        lblAge.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblAge.setText("Age :");

        btnBack.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 0, 153));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        comboCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        lblCity1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblCity1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCity1.setText("Hospital :");

        lblCity2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblCity2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCity2.setText("Doctor :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAge)
                                    .addComponent(lblGender)
                                    .addComponent(lblName)
                                    .addComponent(lblPatientID))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnMale)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnFemale)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnOther))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPhoneNumber)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addGap(103, 103, 103)))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCommunity)
                                .addComponent(lblCity1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCity2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail)
                            .addComponent(txtAddress)
                            .addComponent(comboCommunity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboHospital, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboDoctor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(206, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(299, 299, 299))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPatientID))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGender)
                            .addComponent(btnMale)
                            .addComponent(btnFemale)
                            .addComponent(btnOther))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhoneNumber)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAddress)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCommunity)
                            .addComponent(comboCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCity)
                            .addComponent(comboCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCity1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCity2))))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(238, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void txtPhoneNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyReleased

    }//GEN-LAST:event_txtPhoneNumberKeyReleased

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String patient_id = txtPatientID.getText();
        int age = Integer.parseInt(txtAge.getText());
        String genderValue = gender.toString();
        String phoneNumber = txtPhoneNumber.getText();
        String email = txtEmail.getText();
        String address = txtAddress.getText();
        String city=(String)comboCity.getSelectedItem();
        String community=(String)comboCommunity.getSelectedItem();
        String hospital=(String)comboHospital.getSelectedItem();
        String doctor=(String)comboDoctor.getSelectedItem();

        Person pd = new Person();
        pd.setName(name);
        pd.setPatientId(patient_id);
        pd.setAge(age);
        pd.setGender(gender);
        pd.setNumber(phoneNumber);
        pd.setEmail(email);
        pd.setAddress(address);
        pd.setCity(city);
        pd.setCommunity(community);
        pd.setHospital(hospital);
        pd.setDoctor(doctor);
        
        PersonHistory.getHistory().add(pd);
        PersonHistory.getHistory();
        System.out.println(PersonHistory.getHistory().size());
       
        //for(Person pd: PersonHistory.getHistory())
        

        JOptionPane.showMessageDialog(this ,"Patient Profile created");

        txtName.setText("");
        txtPatientID.setText("");
        txtAge.setText("");
        genderGroup.clearSelection();
        txtPhoneNumber.setText("");
        txtEmail.setText("");
        txtAddress.setText("");
        comboCity.setSelectedIndex(-1);
        comboCommunity.setSelectedIndex(-1);
        comboHospital.setSelectedIndex(-1);
        comboDoctor.setSelectedIndex(-1);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased

    }//GEN-LAST:event_txtEmailKeyReleased

    private void btnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaleActionPerformed
        gender= "Male";
    }//GEN-LAST:event_btnMaleActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased

    }//GEN-LAST:event_txtNameKeyReleased

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped

    }//GEN-LAST:event_txtNameKeyTyped

    private void btnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFemaleActionPerformed
        gender= "Female";
    }//GEN-LAST:event_btnFemaleActionPerformed

    private void btnOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtherActionPerformed
        gender= "Other";
    }//GEN-LAST:event_btnOtherActionPerformed

    private void txtPatientIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatientIDKeyReleased

    }//GEN-LAST:event_txtPatientIDKeyReleased

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        MainJFrame mf = new MainJFrame();
            //splitPane.setRightComponent(sa);
            mf.setVisible(true);
            
            dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(PersonJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PersonJFrame().setVisible(true);
            }
        });
    }
private String gender;

private void loadComboBoxData(){
        comboCity.removeAllItems();
        comboCommunity.removeAllItems();
        comboHospital.removeAllItems();
        comboDoctor.removeAllItems();
        for(City city: SystemAdminJFrame.cityList){
            comboCity.addItem(city.getCityName());
        }
        for(City city:SystemAdminJFrame.cityList){
            comboCommunity.addItem(city.getCommunity());
        }
        for(City city:SystemAdminJFrame.cityList){
            comboHospital.addItem(city.getHospital());
        }
        for(Hospital hospital:HospitalJFrame.hospitalList){
            comboDoctor.addItem(hospital.getHospital());
        }
        comboCity.setSelectedIndex(-1);
        comboCommunity.setSelectedIndex(-1);
        comboHospital.setSelectedIndex(-1); 
        comboDoctor.setSelectedIndex(-1);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JRadioButton btnFemale;
    private javax.swing.JRadioButton btnMale;
    private javax.swing.JRadioButton btnOther;
    private javax.swing.JComboBox<String> comboCity;
    private javax.swing.JComboBox<String> comboCommunity;
    private javax.swing.JComboBox<String> comboDoctor;
    private javax.swing.JComboBox<String> comboHospital;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCity1;
    private javax.swing.JLabel lblCity2;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPatientID;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
