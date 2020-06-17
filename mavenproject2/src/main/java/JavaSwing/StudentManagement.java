
package JavaSwing;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author by Roller
 */
public class StudentManagement extends javax.swing.JFrame {
    ArrayList<Student> list = new ArrayList<Student>(); 
    /**
     * Creates new form StudentManagement
     */
    public StudentManagement() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        addButon = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldPhone = new javax.swing.JTextField();
        jTextFieldGPA = new javax.swing.JTextField();
        jTextFieldDateOfBirth = new javax.swing.JTextField();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jRadioButtonOther = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jButtonExportFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addButon.setText("Add");
        addButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButonActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Code By Roller");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "ID", "Name", "Phone", "Email", "Date of birth", "GPA", "Gender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(jTable);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("STUDENT INFORMATION ");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setText("ID:");

        jLabel5.setText("Name:");

        jLabel6.setText("Phone:");

        jLabel7.setText("Email:");

        jLabel8.setText("Date of birth:");

        jLabel9.setText("GPA:");

        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });

        jTextFieldPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPhoneActionPerformed(evt);
            }
        });

        jTextFieldGPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGPAActionPerformed(evt);
            }
        });

        jTextFieldDateOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDateOfBirthActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonMale);
        jRadioButtonMale.setText("Male");
        jRadioButtonMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonFemale);
        jRadioButtonFemale.setText("Female");
        jRadioButtonFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFemaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonOther);
        jRadioButtonOther.setText("Other");
        jRadioButtonOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOtherActionPerformed(evt);
            }
        });

        jLabel10.setText("Gender");

        jButtonExportFile.setText("Export file");
        jButtonExportFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExportFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(addButon)
                        .addGap(45, 45, 45)
                        .addComponent(jButton2)
                        .addGap(45, 45, 45)
                        .addComponent(jButton3)
                        .addGap(46, 46, 46)
                        .addComponent(jButtonExportFile))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButtonMale)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonFemale)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonOther)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(469, 469, 469)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(554, 554, 554)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioButtonMale)
                                .addComponent(jRadioButtonFemale)
                                .addComponent(jRadioButtonOther)))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButon)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButtonExportFile))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jTextFieldPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPhoneActionPerformed
        
    }//GEN-LAST:event_jTextFieldPhoneActionPerformed

    private void jTextFieldDateOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDateOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDateOfBirthActionPerformed

    private void addButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButonActionPerformed
        Student st = new Student();
        //Kiểm tra format của dữ liệu 
        if(!jTextFieldPhone.getText().matches("^\\d{10}$")){
            JOptionPane.showMessageDialog(rootPane, "Nhập sai số điện thoại, vui lòng nhập lại! ");
        }
        if(!jTextFieldGPA.getText().matches("[+-]?([0-9]*[.])?[0-9]+")){
            JOptionPane.showMessageDialog(rootPane, "Nhập sai điểm trung bình, vui lòng nhập lại! ");
        }
        if(!jTextFieldEmail.getText().matches("^(.+)@(.+)$")){
            JOptionPane.showMessageDialog(rootPane, "Nhập sai Email, vui lòng nhập lại! ");
        }if(jTextFieldPhone.getText().matches("^\\d{10}$") && jTextFieldGPA.getText().matches("[+-]?([0-9]*[.])?[0-9]+") && jTextFieldEmail.getText().matches("^(.+)@(.+)$")){
        String ID = jTextFieldID.getText();
        String Name = jTextFieldName.getText();
        String Phone = jTextFieldPhone.getText();
        String Email = jTextFieldEmail.getText();
        String DOB = jTextFieldDateOfBirth.getText();
        Float GPA = Float.parseFloat(jTextFieldGPA.getText());
        String Gender = buttonGroup1.getSelection().getActionCommand();
        
        final DefaultTableModel modal = (DefaultTableModel)jTable.getModel();
        //Kiểm tra và show thông tin ra bảng
        if( jTextFieldID.getText().compareTo("") != 0 
                && jTextFieldName.getText().compareTo("") != 0 
                && jTextFieldPhone.getText().compareTo("") != 0
                && jTextFieldEmail.getText().compareTo("") != 0 
                && jTextFieldDateOfBirth.getText().compareTo("") != 0
                && jTextFieldGPA.getText().compareTo("") != 0
                && (jRadioButtonMale.isSelected() || jRadioButtonFemale.isSelected() || jRadioButtonOther.isSelected())) {
            modal.addRow(new Object[]{
            modal.getRowCount()+1,
            ID, 
            Name,
            Phone,
            Email,
            DOB,
            GPA,
            Gender});   
            //Thêm thông tin sinh viên vào danh sách
            st.setID(ID);
            st.setName(Name);
            st.setPhone(Phone);
            st.setEmail(Email);
            st.setDateOfBirth(DOB);
            st.setGPA(GPA);
            st.setGender(Gender);
            list.add(st);
            //Test infomation in list
            System.out.println(st.getID()+" "+st.getName()+" "+st.getPhone()+" "+st.getEmail()+" "+st.getDateOfBirth()+" "+st.getGPA()+" "+st.getGender());
            //Set null để thêm thông tin mới
            jTextFieldID.setText(null);
            jTextFieldName.setText(null);
            jTextFieldPhone.setText(null);
            jTextFieldEmail.setText(null);
            jTextFieldDateOfBirth.setText(null);
            jTextFieldGPA.setText(null);
            jRadioButtonMale.setSelected(false);
            jRadioButtonFemale.setSelected(false);
            jRadioButtonOther.setSelected(false);
            
        }
        else{
            JOptionPane.showMessageDialog(this, "Bạn phải nhập đủ các thông tin.");
        }
        }
        
    }//GEN-LAST:event_addButonActionPerformed
    
    private void jTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTableAncestorAdded
        
    }//GEN-LAST:event_jTableAncestorAdded
    // Remove một dòng
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        removeButtonActionPerformed(evt);
        //Kiểm tra xem nó ở hàng nào
        System.out.println(jTable.getSelectedRowCount());
        list.remove(jTable.getSelectedRowCount());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldGPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGPAActionPerformed
        
    }//GEN-LAST:event_jTextFieldGPAActionPerformed

    private void jRadioButtonMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMaleActionPerformed
        jRadioButtonMale.setActionCommand("Male");
    }//GEN-LAST:event_jRadioButtonMaleActionPerformed

    private void jRadioButtonFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFemaleActionPerformed
        jRadioButtonFemale.setActionCommand("Female");
    }//GEN-LAST:event_jRadioButtonFemaleActionPerformed

    private void jRadioButtonOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOtherActionPerformed
       jRadioButtonOther.setActionCommand("Other");
    }//GEN-LAST:event_jRadioButtonOtherActionPerformed

    private void jButtonExportFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportFileActionPerformed
        try{
            Writer writer = new BufferedWriter(new OutputStreamWriter(
            new FileOutputStream("D:\\CaculatorJava\\File\\studentInfomation.txt"), "UTF-8"));
            for(Student st : list){
                writer.write("ID: "+st.getID()+"\n");
                writer.write("Name: "+st.getName()+"\n");
                writer.write("Email: "+st.getEmail()+"\n");
                writer.write("Phone number: "+st.getPhone()+"\n");
                writer.write("Date of birth: "+st.getDateOfBirth()+"\n");
                writer.write("Gender: "+st.getGender()+"\n");
                writer.write("GPA: "+st.getGPA().toString()+"\n");
            }
            writer.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Lỗi!,không thể xuất file\n"+e);
        }
    }//GEN-LAST:event_jButtonExportFileActionPerformed
    
 
    private void removeButtonActionPerformed(final java.awt.event.ActionEvent evt) {                                             
        final DefaultTableModel model = (DefaultTableModel)jTable.getModel();
        if(jTable.getSelectedRow() >= 0){
            model.removeRow(jTable.getSelectedRow());
        } else{
            JOptionPane.showMessageDialog(this, "Không có dữ liệu để xóa.");
        }
        
    } 
   
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButon;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonExportFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JRadioButton jRadioButtonOther;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldDateOfBirth;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldGPA;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPhone;
    // End of variables declaration//GEN-END:variables
}
