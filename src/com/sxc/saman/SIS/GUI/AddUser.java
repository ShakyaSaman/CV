/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sxc.saman.SIS.GUI;

import com.sxc.saman.SIS.DAO.UserDAO;
import com.sxc.saman.SIS.DTO.UserDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author Manish Newar
 */
public class AddUser extends javax.swing.JPanel {

    /**
     * Creates new form AddUser
     */
    public AddUser() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        useridTxt = new javax.swing.JTextField();
        usernameTxt = new javax.swing.JTextField();
        firstnameTxt = new javax.swing.JTextField();
        middlenameTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JPasswordField();
        lastnameTxt = new javax.swing.JTextField();
        tempaddressTxt = new javax.swing.JTextField();
        peraddressTxt = new javax.swing.JTextField();
        contactTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        roleComboBox = new javax.swing.JComboBox<>();

        jLabel1.setText("User Id:");

        jLabel2.setText("Username:");

        jLabel3.setText("Password:");

        jLabel4.setText("First Name:");

        jLabel5.setText("Middle Name:");

        jLabel6.setText("Last Name:");

        jLabel7.setText("Temp Address:");

        jLabel8.setText("Per Address:");

        jLabel9.setText("Contact:");

        jLabel10.setText("Email:");

        useridTxt.setColumns(10);
        useridTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useridTxtActionPerformed(evt);
            }
        });

        usernameTxt.setColumns(10);

        firstnameTxt.setColumns(10);

        middlenameTxt.setColumns(10);
        middlenameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middlenameTxtActionPerformed(evt);
            }
        });

        passwordTxt.setColumns(10);

        lastnameTxt.setColumns(10);

        tempaddressTxt.setColumns(10);

        peraddressTxt.setColumns(10);

        contactTxt.setColumns(10);

        emailTxt.setColumns(10);

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(dataTable);

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Role:");

        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "student", "staff", "teacher" }));
        roleComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(middlenameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tempaddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(peraddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contactTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(useridTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(285, 285, 285)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(addBtn)
                                .addGap(18, 18, 18)
                                .addComponent(editBtn)
                                .addGap(18, 18, 18)
                                .addComponent(deleteBtn)
                                .addGap(18, 18, 18)
                                .addComponent(cancelBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1041, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(useridTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(firstnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(middlenameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lastnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tempaddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(peraddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(contactTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addBtn)
                        .addComponent(editBtn)
                        .addComponent(deleteBtn)
                        .addComponent(cancelBtn)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        if (validation()) {

            UserDTO user = new UserDTO();
            user.setUserId(Integer.parseInt(useridTxt.getText()));
            user.setUsername(usernameTxt.getText());
            user.setPassword(new String(passwordTxt.getPassword()));
            user.setFirstname(firstnameTxt.getText());
            user.setMiddlename(middlenameTxt.getText());
            user.setLastname(lastnameTxt.getText());
            user.setPeraddress(peraddressTxt.getText());
            user.setTempaddress(tempaddressTxt.getText());
            user.setContact(contactTxt.getText());
            user.setEmail(emailTxt.getText());
            user.setRole((String) roleComboBox.getSelectedItem());
            new UserDAO().addUser(user);
            loadData();
            clearField();
        }
    }//GEN-LAST:event_addBtnActionPerformed
    private void loadData() {   
        UserDAO user = new UserDAO();
        try {
            dataTable.setModel(user.builtTableModel(user.getQueryResult()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clearField() {
        useridTxt.setText("");
        usernameTxt.setText("");
        firstnameTxt.setText("");
        middlenameTxt.setText("");
        lastnameTxt.setText("");
        passwordTxt.setText("");
        tempaddressTxt.setText("");
        peraddressTxt.setText("");
        contactTxt.setText("");
        emailTxt.setText("");
    }

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        UserDTO user = new UserDTO();
        if (editBtn.getText().equalsIgnoreCase("Edit")) {
            editBtn.setText("Update");
            user = new UserDAO().editUser(dataTable);
            useridTxt.setText(String.valueOf(user.getUserId()));
            useridTxt.setEditable(false);
            usernameTxt.setText(user.getUsername());
            firstnameTxt.setText(user.getFirstname());
            middlenameTxt.setText(user.getMiddlename());
            lastnameTxt.setText(user.getLastname());
            peraddressTxt.setText(user.getPeraddress());
            tempaddressTxt.setText(user.getTempaddress());
            contactTxt.setText(user.getContact());
            passwordTxt.setText("********");
            passwordTxt.setEditable(false);

        } else {
            editBtn.setText("Edit");
            user.setUserId(Integer.parseInt(useridTxt.getText()));
            user.setFirstname(firstnameTxt.getText());
            user.setMiddlename(middlenameTxt.getText());
            user.setLastname(lastnameTxt.getText());
            user.setPeraddress(peraddressTxt.getText());
            user.setTempaddress(tempaddressTxt.getText());
            user.setContact(contactTxt.getText());
            user.setEmail(emailTxt.getText());
            user.setRole((String) roleComboBox.getSelectedItem());
            new UserDAO().updateUser(user);

            useridTxt.setEditable(true);
            usernameTxt.setEditable(true);
            passwordTxt.setEditable(true);

            loadData();
            clearField();

        }

    }//GEN-LAST:event_editBtnActionPerformed
    public boolean validation() {
        if (useridTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "User Id is missing");
            return false;
        }

        if (usernameTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username is missing");
            return false;
        }
        if (new String(passwordTxt.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(null, "Password field is empty");
            return false;
        }
        if (firstnameTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Firstname shouldnot be empty");
            return false;
        }
        if (middlenameTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Middlename field shouldnot be empty");
            return false;
        }
        if (lastnameTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lastname field shouldnot be empty");
            return false;
        }
        if (peraddressTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Permanent address field shouldnot be empty");
            return false;
        }
        if (tempaddressTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Temporary address field shouldnot be empty");
            return false;
        }
        if (contactTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Contact field shouldnot be empty");
            return false;
        }
        if (emailTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Email field shouldnot be empty");
            return false;
        }
        return true;
    }
    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        new UserDAO().delete(String.valueOf(dataTable.getValueAt(dataTable.getSelectedRow(), 0)));
        loadData();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loadData();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void middlenameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middlenameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middlenameTxtActionPerformed

    private void useridTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useridTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useridTxtActionPerformed

    private void roleComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField contactTxt;
    private javax.swing.JTable dataTable;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField firstnameTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastnameTxt;
    private javax.swing.JTextField middlenameTxt;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JTextField peraddressTxt;
    private javax.swing.JComboBox<String> roleComboBox;
    private javax.swing.JTextField tempaddressTxt;
    private javax.swing.JTextField useridTxt;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}