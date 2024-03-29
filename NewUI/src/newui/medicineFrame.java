/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import storageData.customerOrder;
//import pharmacyStorage.medicineStorageClass;
//import storageData.medicineStorageClass;
import storageData.loginClass;
import storageData.medicineStorageClass;

/**
 *
 * @author villahermosa_sd2022
 */
public class medicineFrame extends javax.swing.JFrame {

    /**
     * Creates new form medicineFrame
     */
    int TotalMedicine = 0;

    public medicineFrame() {
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

        Login_UserName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Login_Passwrd = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        Login_Button = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLE = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        label4 = new java.awt.Label();
        jScrollPane3 = new javax.swing.JScrollPane();
        MedicineListArea = new javax.swing.JTextArea();
        panel2 = new java.awt.Panel();
        medicine_BackButton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        panel4 = new java.awt.Panel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        LOGIN_BUTTON = new javax.swing.JButton();
        panel5 = new java.awt.Panel();
        BACKHOME = new javax.swing.JLabel();
        LOGOUT = new javax.swing.JButton();
        REGISTER_BUTTON = new javax.swing.JButton();
        checkbox1 = new java.awt.Checkbox();
        checkbox2 = new java.awt.Checkbox();
        BUYMEDICINE = new javax.swing.JButton();
        medicinename = new javax.swing.JTextField();
        medicineNumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        totalCostMedicine = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        moneyPayment = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        MONEYPAYMENT = new javax.swing.JButton();
        MONEYBALANCE = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        DELETE_TEXT = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        medicinelist = new javax.swing.JTable();

        Login_UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_UserNameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("UserName:");

        Login_Passwrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_PasswrdActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Password:");

        Login_Button.setBackground(new java.awt.Color(255, 0, 51));
        Login_Button.setText("LOGIN");
        Login_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Login_ButtonMouseClicked(evt);
            }
        });
        Login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_ButtonActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(102, 255, 102));
        jButton7.setText("viewCustomeOdrer");

        jButton6.setBackground(new java.awt.Color(51, 255, 51));
        jButton6.setText("viewCustomer");

        TABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TABLE.setName(""); // NOI18N
        TABLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLEMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TABLEMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TABLE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        label4.setText("Type Of Medicine      GenericName     BrandName     Price    ");

        MedicineListArea.setEditable(false);
        MedicineListArea.setColumns(20);
        MedicineListArea.setRows(5);
        MedicineListArea.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                MedicineListAreaPropertyChange(evt);
            }
        });
        jScrollPane3.setViewportView(MedicineListArea);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel2.setBackground(new java.awt.Color(51, 255, 255));

        medicine_BackButton.setBackground(new java.awt.Color(102, 255, 102));
        medicine_BackButton.setText("BACK");
        medicine_BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medicine_BackButtonMouseClicked(evt);
            }
        });
        medicine_BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicine_BackButtonActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));

        panel4.setBackground(new java.awt.Color(255, 0, 0));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("ABOUT U S");

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 51));

        LOGIN_BUTTON.setBackground(new java.awt.Color(255, 51, 51));
        LOGIN_BUTTON.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LOGIN_BUTTON.setText("LOGIN");
        LOGIN_BUTTON.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGIN_BUTTONMouseClicked(evt);
            }
        });

        panel5.setBackground(new java.awt.Color(255, 0, 255));

        BACKHOME.setBackground(new java.awt.Color(204, 204, 204));
        BACKHOME.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BACKHOME.setText("HOME");
        BACKHOME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BACKHOMEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BACKHOME)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BACKHOME, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        LOGOUT.setBackground(new java.awt.Color(102, 255, 102));
        LOGOUT.setText("LOGOUT");
        LOGOUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGOUTMouseClicked(evt);
            }
        });

        REGISTER_BUTTON.setBackground(new java.awt.Color(51, 255, 51));
        REGISTER_BUTTON.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        REGISTER_BUTTON.setText("REGISTER");
        REGISTER_BUTTON.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                REGISTER_BUTTONMouseClicked(evt);
            }
        });
        REGISTER_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTER_BUTTONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(REGISTER_BUTTON)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LOGIN_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LOGOUT)
                .addGap(2, 2, 2))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LOGIN_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(REGISTER_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
        );

        checkbox1.setLabel("checkbox1");

        checkbox2.setLabel("checkbox2");

        BUYMEDICINE.setBackground(new java.awt.Color(51, 255, 51));
        BUYMEDICINE.setText("BUY");
        BUYMEDICINE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BUYMEDICINEMouseClicked(evt);
            }
        });

        medicinename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicinenameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Enter a MedicineName:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Number of Medicine to buy:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Total Cost of Medicine:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Money Payment:");

        MONEYPAYMENT.setBackground(new java.awt.Color(51, 255, 51));
        MONEYPAYMENT.setText("Paid");
        MONEYPAYMENT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MONEYPAYMENTMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Your Money Change:");

        DELETE_TEXT.setBackground(new java.awt.Color(255, 0, 0));
        DELETE_TEXT.setText("DELETE_TEXT");
        DELETE_TEXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DELETE_TEXTMouseClicked(evt);
            }
        });

        medicinelist.setBackground(new java.awt.Color(255, 153, 255));
        medicinelist.setBorder(new javax.swing.border.MatteBorder(null));
        medicinelist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TypeOfMedicine", "GenericName", "BrandName", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        medicinelist.setSelectionBackground(new java.awt.Color(102, 153, 255));
        medicinelist.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                medicinelistPropertyChange(evt);
            }
        });
        jScrollPane4.setViewportView(medicinelist);
        if (medicinelist.getColumnModel().getColumnCount() > 0) {
            medicinelist.getColumnModel().getColumn(0).setResizable(false);
            medicinelist.getColumnModel().getColumn(1).setResizable(false);
            medicinelist.getColumnModel().getColumn(2).setResizable(false);
            medicinelist.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel2)
                    .addComponent(medicine_BackButton))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DELETE_TEXT)
                    .addComponent(medicinename, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalCostMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medicineNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moneyPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MONEYBALANCE, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BUYMEDICINE)
                    .addComponent(MONEYPAYMENT))
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medicinename, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicineNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(medicine_BackButton))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(BUYMEDICINE)
                        .addGap(20, 20, 20)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalCostMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(moneyPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MONEYPAYMENT)
                        .addGap(26, 26, 26)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MONEYBALANCE, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DELETE_TEXT)
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(487, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Login_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Login_ButtonMouseClicked

    }//GEN-LAST:event_Login_ButtonMouseClicked

    private void Login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Login_ButtonActionPerformed

    private void Login_PasswrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_PasswrdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Login_PasswrdActionPerformed

    private void Login_UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_UserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Login_UserNameActionPerformed

    private void medicine_BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicine_BackButtonMouseClicked
        // TODO add your handling code here:
        homePharmacy home = new homePharmacy();
        dispose();
        home.setVisible(true);
    }//GEN-LAST:event_medicine_BackButtonMouseClicked

    private void medicine_BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicine_BackButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicine_BackButtonActionPerformed

    private void REGISTER_BUTTONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REGISTER_BUTTONMouseClicked
        // TODO add your handling code here:
        Register reg = new Register();
        dispose();
        reg.setVisible(true);
    }//GEN-LAST:event_REGISTER_BUTTONMouseClicked

    private void REGISTER_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTER_BUTTONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_REGISTER_BUTTONActionPerformed

    private void LOGIN_BUTTONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGIN_BUTTONMouseClicked
        // TODO add your handling code here:
        Login login = new Login();
        dispose();
        login.setVisible(true);
    }//GEN-LAST:event_LOGIN_BUTTONMouseClicked

    private void BACKHOMEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKHOMEMouseClicked
        // TODO add your handling code here:
        homePharmacy home = new homePharmacy();
        dispose();
        home.setVisible(true);
    }//GEN-LAST:event_BACKHOMEMouseClicked

    private void LOGOUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUTMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_LOGOUTMouseClicked

    private void TABLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLEMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_TABLEMouseClicked

    private void TABLEMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLEMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_TABLEMouseReleased

    private void medicinenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicinenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicinenameActionPerformed

    private void BUYMEDICINEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BUYMEDICINEMouseClicked
        // TODO add your handling code here:

        //Getting for the medicine
        medicineStorageClass view = new medicineStorageClass();
        view.MedicineInformation();
        view.getMedicinePrice();
        if (view.getGenericName().contains(medicinename.getText())) {
            int medval = view.getGenericName().indexOf(medicinename.getText());
            int value = view.getMedicinePrice().get(medval);
            TotalMedicine = +Integer.parseInt(medicineNumber.getText()) * value;
            totalCostMedicine.setText(Integer.toString(TotalMedicine));
        } else {
            JOptionPane.showMessageDialog(null, "Invalid input/The medicine doesn't exist!");
            medicineFrame med = new medicineFrame();
            dispose();
            med.setVisible(true);
        }
    }//GEN-LAST:event_BUYMEDICINEMouseClicked

    private void MONEYPAYMENTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MONEYPAYMENTMouseClicked
        // TODO add your handling code here:
        loginClass log=new loginClass();
        log.getCustomerAge();
        
        if (log.getCustomerAge() < 60) {
            int balance = Integer.parseInt(moneyPayment.getText()) - TotalMedicine;
            MONEYBALANCE.setText(Integer.toString(balance));
            TotalMedicine = 0;
            JOptionPane.showMessageDialog(null, "The customer is an Adult!");
        } else {
            int discounttotal = (int) (TotalMedicine - (TotalMedicine * .20));
            int balance = Integer.parseInt(moneyPayment.getText()) - discounttotal;
            MONEYBALANCE.setText(Integer.toString(balance));
            TotalMedicine = 0;
            JOptionPane.showMessageDialog(null, "The customer is a Senior Citizen!");
        }
        
        String med = medicinename.getText();
        int numberofmed = Integer.parseInt(medicineNumber.getText());
        int totalmed = Integer.parseInt(totalCostMedicine.getText());
        int moneypayment = Integer.parseInt(moneyPayment.getText());
        int moneybalance = Integer.parseInt(MONEYBALANCE.getText());
        customerOrder order = new customerOrder(log.getCustomers().get(0),med, numberofmed, totalmed, moneypayment, moneybalance);
    }//GEN-LAST:event_MONEYPAYMENTMouseClicked

    private void MedicineListAreaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_MedicineListAreaPropertyChange

    }//GEN-LAST:event_MedicineListAreaPropertyChange

    private void DELETE_TEXTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DELETE_TEXTMouseClicked
        // TODO add your handling code here:
        medicinename.setText("");
        medicineNumber.setText("");
        totalCostMedicine.setText("");
        moneyPayment.setText("");
        MONEYBALANCE.setText("");
    }//GEN-LAST:event_DELETE_TEXTMouseClicked

    private void medicinelistPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_medicinelistPropertyChange
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) medicinelist.getModel();
        medicineStorageClass view = new medicineStorageClass();
        view.MedicineInformation();
        for (int num = 0; num < view.getGenericName().size(); num++) {
            model.addRow(new Object[]{view.getTypeofMedicine().get(num), view.getGenericName().get(num), view.getBrandName().get(num), view.getMedicinePrice().get(num)});
        }
    }//GEN-LAST:event_medicinelistPropertyChange

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
            java.util.logging.Logger.getLogger(medicineFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(medicineFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(medicineFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(medicineFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new medicineFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BACKHOME;
    private javax.swing.JButton BUYMEDICINE;
    private javax.swing.JButton DELETE_TEXT;
    private javax.swing.JButton LOGIN_BUTTON;
    private javax.swing.JButton LOGOUT;
    private javax.swing.JButton Login_Button;
    private javax.swing.JPasswordField Login_Passwrd;
    private javax.swing.JTextField Login_UserName;
    private javax.swing.JTextField MONEYBALANCE;
    private javax.swing.JButton MONEYPAYMENT;
    private javax.swing.JTextArea MedicineListArea;
    private javax.swing.JButton REGISTER_BUTTON;
    private javax.swing.JTable TABLE;
    private java.awt.Checkbox checkbox1;
    private java.awt.Checkbox checkbox2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private java.awt.Label label4;
    private javax.swing.JTextField medicineNumber;
    private javax.swing.JButton medicine_BackButton;
    public javax.swing.JTable medicinelist;
    private javax.swing.JTextField medicinename;
    private javax.swing.JTextField moneyPayment;
    private java.awt.Panel panel2;
    private java.awt.Panel panel4;
    private java.awt.Panel panel5;
    private javax.swing.JTextField totalCostMedicine;
    // End of variables declaration//GEN-END:variables
}
