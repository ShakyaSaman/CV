/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sxc.saman.SIS.GUI;

import com.sxc.saman.SIS.DAO.StudentDAO;
import com.sxc.saman.SIS.DTO.StudentDTO;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author Manish Newar
 */
public class AddStudent extends javax.swing.JPanel {

    ButtonGroup grp;
    String gender;
    String semester;

    public AddStudent() {
        initComponents();
        grp = new ButtonGroup();
        grp.add(maleRadio);
        grp.add(femaleRadio);
    loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        studentIdTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        studentFirstNameTxt = new javax.swing.JTextField();
        studentPerAddressTxt = new javax.swing.JTextField();
        studentEmailTxt = new javax.swing.JTextField();
        studentProgramTxt = new javax.swing.JTextField();
        studentMiddleNameTxt = new javax.swing.JTextField();
        studentTemporaryTxt = new javax.swing.JTextField();
        studentMobileTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        studentLastNameTxt = new javax.swing.JTextField();
        studentSectionTxt = new javax.swing.JTextField();
        addStudentBtn = new javax.swing.JButton();
        editStudentBtn = new javax.swing.JButton();
        deleteStudentBtn = new javax.swing.JButton();
        clearStudentBtn = new javax.swing.JButton();
        cancelStudentBtn = new javax.swing.JButton();
        maleRadio = new javax.swing.JRadioButton();
        femaleRadio = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        semesterCombo = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("StudentID");

        studentIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIdTxtActionPerformed(evt);
            }
        });

        jLabel2.setText("FirstName");

        jLabel3.setText("Gender");

        jLabel4.setText("Permanent Address");

        jLabel5.setText("Email");

        jLabel6.setText("Program");

        jLabel7.setText("MiddleName");

        jLabel8.setText("Temporary Address");

        jLabel9.setText("Mobile");

        jLabel10.setText("Semester");

        studentFirstNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentFirstNameTxtActionPerformed(evt);
            }
        });

        studentPerAddressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentPerAddressTxtActionPerformed(evt);
            }
        });

        studentProgramTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentProgramTxtActionPerformed(evt);
            }
        });

        studentMiddleNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentMiddleNameTxtActionPerformed(evt);
            }
        });

        studentTemporaryTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentTemporaryTxtActionPerformed(evt);
            }
        });

        jLabel11.setText("LastName");

        jLabel12.setText("Section");

        addStudentBtn.setText("Add");
        addStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentBtnActionPerformed(evt);
            }
        });

        editStudentBtn.setText("Edit");
        editStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editStudentBtnActionPerformed(evt);
            }
        });

        deleteStudentBtn.setText("Delete");
        deleteStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStudentBtnActionPerformed(evt);
            }
        });

        clearStudentBtn.setText("Clear");
        clearStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearStudentBtnActionPerformed(evt);
            }
        });

        cancelStudentBtn.setText("Cancel");
        cancelStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelStudentBtnActionPerformed(evt);
            }
        });

        maleRadio.setText("Male");
        maleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioActionPerformed(evt);
            }
        });

        femaleRadio.setText("Female");

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(studentTable);

        semesterCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"", "First", "Second", "Third", "Fourth","Fifth","Sixth","Seventh","Eighth" }));
        semesterCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterComboActionPerformed(evt);
            }
        });

        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5))
                                        .addGap(72, 72, 72)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(studentEmailTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(studentProgramTxt)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addStudentBtn)))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel9))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addComponent(studentMiddleNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(semesterCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(editStudentBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(deleteStudentBtn)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(clearStudentBtn)
                                        .addGap(41, 41, 41)
                                        .addComponent(cancelStudentBtn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(studentSectionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(studentLastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(279, 279, 279)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(studentFirstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(studentIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(maleRadio)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(femaleRadio))
                                                .addComponent(studentPerAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(studentMobileTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(studentTemporaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(studentIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(studentFirstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentMiddleNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(studentLastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(maleRadio)
                    .addComponent(femaleRadio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(studentPerAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentTemporaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(studentEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentMobileTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(studentProgramTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel12)
                        .addComponent(studentSectionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(semesterCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(editStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addStudentBtn)
                        .addComponent(jButton1))
                    .addComponent(clearStudentBtn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteStudentBtn)
                        .addComponent(cancelStudentBtn)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void studentFirstNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentFirstNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentFirstNameTxtActionPerformed

    private void maleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioActionPerformed
        gender = "Male";
    }//GEN-LAST:event_maleRadioActionPerformed

    private void studentPerAddressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentPerAddressTxtActionPerformed
        gender = "Female";
    }//GEN-LAST:event_studentPerAddressTxtActionPerformed

    private void studentProgramTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentProgramTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentProgramTxtActionPerformed

    private void studentMiddleNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentMiddleNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentMiddleNameTxtActionPerformed

    private void studentTemporaryTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentTemporaryTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentTemporaryTxtActionPerformed

    private void studentIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentIdTxtActionPerformed

    private void semesterComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterComboActionPerformed
        semester = semesterCombo.getSelectedItem().toString();
    }//GEN-LAST:event_semesterComboActionPerformed

    private void addStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentBtnActionPerformed
        if (validation()) {
            StudentDTO std = new StudentDTO();
            std.setStdId(Integer.parseInt(studentIdTxt.getText()));
            std.setFirstName(studentFirstNameTxt.getText());
            std.setMiddleName(studentMiddleNameTxt.getText());
            std.setLastName(studentLastNameTxt.getText());
            std.setGender(gender);
            std.setPerAddress(studentPerAddressTxt.getText());
            std.setTempAddress(studentTemporaryTxt.getText());
            std.setEmail(studentEmailTxt.getText());
            std.setMobile(studentMobileTxt.getText());
            std.setSection(studentSectionTxt.getText());
            std.setSemester(semesterCombo.getSelectedItem().toString());
            std.setProgram(studentProgramTxt.getText());

            new StudentDAO().addStudent(std);
            loadData();
            clearField();
        }
    }//GEN-LAST:event_addStudentBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loadData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void editStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editStudentBtnActionPerformed
        StudentDTO std = new StudentDTO();

        if (editStudentBtn.getText().equalsIgnoreCase("Edit")) {
            editStudentBtn.setText("Update");
            std = new StudentDAO().editStudent(studentTable);
            studentIdTxt.setText(String.valueOf(std.getStdId()));
            studentIdTxt.setEditable(false);
            studentFirstNameTxt.setText(std.getFirstName());
            studentMiddleNameTxt.setText(std.getMiddleName());
            studentLastNameTxt.setText(std.getLastName());
            studentEmailTxt.setText(std.getEmail());
            studentMobileTxt.setText(std.getMobile());
            studentProgramTxt.setText(std.getProgram());
            studentSectionTxt.setText(std.getSection());
            studentPerAddressTxt.setText(std.getPerAddress());
            studentTemporaryTxt.setText(std.getTempAddress());
            if (std.getGender().equalsIgnoreCase("Male")) {
                maleRadio.setSelected(true);
            } else {
                femaleRadio.setSelected(true);
            }
            semesterCombo.setSelectedItem(std.getSemester());

        } else {
            editStudentBtn.setText("Edit");
            std.setStdId(Integer.parseInt(studentIdTxt.getText()));
            std.setFirstName(studentFirstNameTxt.getText());
            std.setMiddleName(studentMiddleNameTxt.getText());
            std.setLastName(studentLastNameTxt.getText());
            std.setPerAddress(studentPerAddressTxt.getText());
            std.setTempAddress(studentTemporaryTxt.getText());
            std.setEmail(studentEmailTxt.getText());
            std.setMobile(studentMobileTxt.getText());
            std.setProgram(studentProgramTxt.getText());
            std.setSection(studentSectionTxt.getText());
            if (maleRadio.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            std.setGender(gender);
            semester = semesterCombo.getSelectedItem().toString();
            std.setSemester(semester);

            new StudentDAO().updateStudent(std);
            studentIdTxt.setEditable(true);

            loadData();
            clearField();

        }

    }//GEN-LAST:event_editStudentBtnActionPerformed

    private void deleteStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStudentBtnActionPerformed
        new StudentDAO().delete(String.valueOf(studentTable.getValueAt(studentTable.getSelectedRow(), 0)));
        loadData();

    }//GEN-LAST:event_deleteStudentBtnActionPerformed

    private void clearStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearStudentBtnActionPerformed
        clearField();
    }//GEN-LAST:event_clearStudentBtnActionPerformed

    private void cancelStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelStudentBtnActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancelStudentBtnActionPerformed
    private void loadData() {
        StudentDAO std = new StudentDAO();
        try {
            studentTable.setModel(std.builtTableModel(std.getQueryResult()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clearField() {
        studentIdTxt.setText("");
        studentFirstNameTxt.setText("");
        studentMiddleNameTxt.setText("");
        studentLastNameTxt.setText("");
        studentPerAddressTxt.setText("");
        studentTemporaryTxt.setText("");
        studentEmailTxt.setText("");
        studentProgramTxt.setText("");
        studentSectionTxt.setText("");
        studentMobileTxt.setText("");
        grp.clearSelection();
        semesterCombo.setSelectedItem("");
    }
    public boolean validation(){
         if (studentIdTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Student Id is missing");
            return false;
        }

        if (studentFirstNameTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Student's Firstname is missing");
            return false;
        }
        if (studentMiddleNameTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Student's Middlename field is empty");
            return false;
        }
        if (studentLastNameTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Student's Lastname shouldnot be empty");
            return false;
        }
        if (gender.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Select a gender");
            return false;
        }
        if (studentPerAddressTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Permanent Address field shouldnot be empty");
            return false;
        }
        if (studentTemporaryTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Temporary address field shouldnot be empty");
            return false;
        }
        if (studentEmailTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Email field shouldnot be empty");
            return false;
        }
        if (studentMobileTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Mobile field shouldnot be empty");
            return false;
        }
        if (studentProgramTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Program field shouldnot be empty");
            return false;
        }
        
        if(semesterCombo.getSelectedItem()==null) {
            JOptionPane.showMessageDialog(null, "Select a semester ");
            return false;
        }
        
        if (studentSectionTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter the section");
            return false;
        }
        
        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudentBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelStudentBtn;
    private javax.swing.JButton clearStudentBtn;
    private javax.swing.JButton deleteStudentBtn;
    private javax.swing.JButton editStudentBtn;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JComboBox semesterCombo;
    private javax.swing.JTextField studentEmailTxt;
    private javax.swing.JTextField studentFirstNameTxt;
    private javax.swing.JTextField studentIdTxt;
    private javax.swing.JTextField studentLastNameTxt;
    private javax.swing.JTextField studentMiddleNameTxt;
    private javax.swing.JTextField studentMobileTxt;
    private javax.swing.JTextField studentPerAddressTxt;
    private javax.swing.JTextField studentProgramTxt;
    private javax.swing.JTextField studentSectionTxt;
    private javax.swing.JTable studentTable;
    private javax.swing.JTextField studentTemporaryTxt;
    // End of variables declaration//GEN-END:variables
}
