/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newui;

import javax.swing.JOptionPane;
import pharmacyStorage.medicineStorageClass;

/**
 *
 * @author villahermosa_sd2022
 */
public class Pharmacist extends javax.swing.JFrame {

    /**
     * Creates new form Pharmacist
     */
    public Pharmacist() {
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

        pharmacy1 = new newui.Pharmacy();
        pharmacy2 = new newui.Pharmacy();
        pharmacy3 = new newui.Pharmacy();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaViewCustomerOrder = new javax.swing.JTextArea();
        LoginBack_Button1 = new javax.swing.JButton();
        button1 = new java.awt.Button();
        jButton8 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        label6 = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        panel2 = new java.awt.Panel();
        Admin_BackButton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        panel4 = new java.awt.Panel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        REGISTER_BUTTON = new javax.swing.JButton();
        LOGIN_BUTTON = new javax.swing.JButton();
        panel5 = new java.awt.Panel();
        BACKHOME = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        viewCustomer = new javax.swing.JButton();
        viewCustomerOrder = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListOfInformation = new javax.swing.JTextArea();
        ADDMEDICINE = new javax.swing.JButton();
        MEDICNENAME = new javax.swing.JTextField();
        MEDICINEPRICE = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        viewMedicine = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        genericName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        brandName = new javax.swing.JTextField();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();

        jButton1.setText("jButton1");

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        jButton2.setBackground(new java.awt.Color(51, 255, 51));
        jButton2.setText("viewCustomer");

        jButton3.setBackground(new java.awt.Color(102, 255, 102));
        jButton3.setText("viewCustomeOdrer");

        jButton4.setBackground(new java.awt.Color(51, 255, 51));
        jButton4.setText("addMedicine");

        jButton5.setBackground(new java.awt.Color(51, 255, 51));
        jButton5.setText("deleteMedicine");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 326, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(352, Short.MAX_VALUE))
        );

        jTextAreaViewCustomerOrder.setColumns(20);
        jTextAreaViewCustomerOrder.setRows(5);
        jScrollPane2.setViewportView(jTextAreaViewCustomerOrder);

        LoginBack_Button1.setBackground(new java.awt.Color(102, 255, 102));
        LoginBack_Button1.setText("BACK");
        LoginBack_Button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginBack_Button1MouseClicked(evt);
            }
        });
        LoginBack_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBack_Button1ActionPerformed(evt);
            }
        });

        button1.setLabel("button1");

        jButton8.setText("jButton8");

        jButton12.setBackground(new java.awt.Color(255, 255, 0));
        jButton12.setText("medicinePrice");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("medicineId:");

        jButton10.setBackground(new java.awt.Color(255, 153, 255));
        jButton10.setText("deleteMedicine");

        label6.setText("label6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        panel2.setBackground(new java.awt.Color(51, 255, 255));

        Admin_BackButton.setBackground(new java.awt.Color(102, 255, 102));
        Admin_BackButton.setText("BACK");
        Admin_BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Admin_BackButtonMouseClicked(evt);
            }
        });
        Admin_BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_BackButtonActionPerformed(evt);
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
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 51));

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

        LOGIN_BUTTON.setBackground(new java.awt.Color(255, 51, 51));
        LOGIN_BUTTON.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LOGIN_BUTTON.setText("LOGIN");
        LOGIN_BUTTON.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGIN_BUTTONMouseClicked(evt);
            }
        });
        LOGIN_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGIN_BUTTONActionPerformed(evt);
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

        jButton11.setBackground(new java.awt.Color(102, 255, 102));
        jButton11.setText("LOGOUT");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
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
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(REGISTER_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LOGIN_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
        );

        viewCustomer.setBackground(new java.awt.Color(51, 255, 51));
        viewCustomer.setText("viewCustomer");
        viewCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewCustomerMouseClicked(evt);
            }
        });

        viewCustomerOrder.setBackground(new java.awt.Color(51, 153, 255));
        viewCustomerOrder.setText("viewCustomeOdrer");
        viewCustomerOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewCustomerOrderMouseClicked(evt);
            }
        });

        ListOfInformation.setColumns(20);
        ListOfInformation.setRows(5);
        jScrollPane1.setViewportView(ListOfInformation);

        ADDMEDICINE.setBackground(new java.awt.Color(255, 255, 0));
        ADDMEDICINE.setText("addMedicine");
        ADDMEDICINE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADDMEDICINEMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Type Of Medicine:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("MedicinePrice:");

        viewMedicine.setBackground(new java.awt.Color(255, 0, 255));
        viewMedicine.setText("viewMedicine");
        viewMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewMedicineMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("GenericName:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("BrandName:");

        label4.setText("Type Of Medicine      GenericName     BrandName     Price    ");

        label5.setText("label5");

        label6.setText("label6");

        label7.setText("label7");

        label8.setText("label8");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Admin_BackButton)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(viewCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel2Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(viewCustomerOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(viewMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ADDMEDICINE, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(MEDICNENAME, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                                    .addComponent(MEDICINEPRICE))
                                                .addGap(18, 18, 18)
                                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(panel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel4)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(genericName, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(panel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel5)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(brandName))))))))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewCustomerOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MEDICNENAME, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(genericName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MEDICINEPRICE, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(brandName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(ADDMEDICINE, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(Admin_BackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBack_Button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBack_Button1MouseClicked
        // TODO add your handling code here:
        homePharmacy home = new homePharmacy();
        dispose();
        home.setVisible(true);
    }//GEN-LAST:event_LoginBack_Button1MouseClicked

    private void LoginBack_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBack_Button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginBack_Button1ActionPerformed

    private void Admin_BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Admin_BackButtonMouseClicked
        // TODO add your handling code here:
        homePharmacy home = new homePharmacy();
        dispose();
        home.setVisible(true);
    }//GEN-LAST:event_Admin_BackButtonMouseClicked

    private void Admin_BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_BackButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Admin_BackButtonActionPerformed

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

    private void LOGIN_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGIN_BUTTONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LOGIN_BUTTONActionPerformed

    private void BACKHOMEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKHOMEMouseClicked
        // TODO add your handling code here:
        homePharmacy home = new homePharmacy();
        dispose();
        home.setVisible(true);
    }//GEN-LAST:event_BACKHOMEMouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton11MouseClicked

    private void viewCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCustomerMouseClicked
        // TODO add your handling code here:
        System.out.println("You viewed a lot of customer!");
    }//GEN-LAST:event_viewCustomerMouseClicked

    private void viewCustomerOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCustomerOrderMouseClicked
        // TODO add your handling code here:
        System.out.println("You view a to the customerOrder");
    }//GEN-LAST:event_viewCustomerOrderMouseClicked

    private void viewMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMedicineMouseClicked
        // TODO add your handling code here:
        medicineStorageClass view = new medicineStorageClass();
        view.MedicineInformation();
        view.getMedicines();
        for (String i : view.getMedicines()) {
            if( view.getMedicines().contains(i)){
                continue;
            }
            else{
              ListOfInformation.append(i+"\n");  
            }        
        }
    }//GEN-LAST:event_viewMedicineMouseClicked

    private void ADDMEDICINEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDMEDICINEMouseClicked
        // TODO add your handling code here:
        medicineStorageClass store = new medicineStorageClass(MEDICNENAME.getText(), brandName.getText(), genericName.getText(), Integer.parseInt(MEDICINEPRICE.getText()));
        MEDICNENAME.setText("");
        brandName.setText("");
        genericName.setText("");
        MEDICINEPRICE.setText("");
        JOptionPane.showMessageDialog(null, "Successfully Stored To Database!");
    }//GEN-LAST:event_ADDMEDICINEMouseClicked

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
            java.util.logging.Logger.getLogger(Pharmacist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pharmacist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pharmacist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pharmacist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Pharmacist().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDMEDICINE;
    private javax.swing.JButton Admin_BackButton;
    private javax.swing.JLabel BACKHOME;
    private javax.swing.JButton LOGIN_BUTTON;
    private javax.swing.JTextArea ListOfInformation;
    private javax.swing.JButton LoginBack_Button1;
    private javax.swing.JTextField MEDICINEPRICE;
    private javax.swing.JTextField MEDICNENAME;
    private javax.swing.JButton REGISTER_BUTTON;
    private javax.swing.JTextField brandName;
    private java.awt.Button button1;
    private javax.swing.JTextField genericName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaViewCustomerOrder;
    private javax.swing.JTextField jTextField2;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Panel panel2;
    private java.awt.Panel panel4;
    private java.awt.Panel panel5;
    private newui.Pharmacy pharmacy1;
    private newui.Pharmacy pharmacy2;
    private newui.Pharmacy pharmacy3;
    private javax.swing.JButton viewCustomer;
    private javax.swing.JButton viewCustomerOrder;
    private javax.swing.JButton viewMedicine;
    // End of variables declaration//GEN-END:variables
}