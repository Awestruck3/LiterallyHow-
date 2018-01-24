
import javax.swing.*;


public class Menu extends javax.swing.JFrame {

    int num = 0;
    boolean burg = false, fry = false, cheeseb = false, baconb = false, chilic = false, cheesef = false, canc = true;
    double cur = 0;
    DefaultListModel menuItems;

    public Menu() {
        initComponents();
        lstord.setModel(new DefaultListModel());
        menuItems = (DefaultListModel) lstord.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnbur = new javax.swing.JButton();
        btnfry = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnchebur = new javax.swing.JButton();
        btnbacchebur = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnchefry = new javax.swing.JButton();
        btnchichefry = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtpri = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtnum = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstord = new javax.swing.JList<>();
        btnadd = new javax.swing.JButton();
        btnout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnbur.setText("Burger");
        btnbur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnburActionPerformed(evt);
            }
        });

        btnfry.setText("Fries");
        btnfry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnbur)
                .addGap(18, 18, 18)
                .addComponent(btnfry)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbur)
                    .addComponent(btnfry))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnchebur.setText("Add Cheese");
        btnchebur.setEnabled(false);
        btnchebur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncheburActionPerformed(evt);
            }
        });

        btnbacchebur.setText("Add Bacon");
        btnbacchebur.setEnabled(false);
        btnbacchebur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbaccheburActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Burger");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnchebur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnbacchebur)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(83, 83, 83))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnbacchebur)
                    .addComponent(btnchebur, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnchefry.setText("Add Cheese");
        btnchefry.setEnabled(false);
        btnchefry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchefryActionPerformed(evt);
            }
        });

        btnchichefry.setText("Add Chili");
        btnchichefry.setEnabled(false);
        btnchichefry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchichefryActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Fries");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnchefry)
                .addGap(18, 18, 18)
                .addComponent(btnchichefry)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(84, 84, 84))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnchefry)
                    .addComponent(btnchichefry))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Current Price:");

        txtpri.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtpri.setText("$");
        txtpri.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Number of Items:");

        txtnum.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtnum.setText("0");
        txtnum.setEnabled(false);

        jScrollPane1.setViewportView(lstord);

        btnadd.setText("Add Item");
        btnadd.setEnabled(false);
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnout.setText("Cash Out");
        btnout.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnout)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(1, 1, 1)
                                    .addComponent(txtpri, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnadd)
                            .addGap(114, 114, 114)
                            .addComponent(jLabel2)
                            .addGap(4, 4, 4)
                            .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtpri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnadd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnout)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnburActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnburActionPerformed
        if (canc) {
            num += 1;
        } else {
            num = num;
        }
        
        fry = false; //Set fry to false incase customer changes their mind and chooses burger after hitting fry
        canc = false;
        txtnum.setText("" + num);
        burg = true;
        btnchebur.setEnabled(true);
        btnbacchebur.setEnabled(true);
        btnadd.setEnabled(true);
        btnchefry.setEnabled(false);
        btnchichefry.setEnabled(false);
    }//GEN-LAST:event_btnburActionPerformed

    private void btnfryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfryActionPerformed
        if (canc) {
            num += 1;
        } else {
            num = num;
        }
        burg = false;
        canc = false;
        txtnum.setText("" + num);
        fry = true;
        btnchefry.setEnabled(true);
        btnchichefry.setEnabled(true);
        btnchebur.setEnabled(false);
        btnbacchebur.setEnabled(false);
        btnadd.setEnabled(true);
    }//GEN-LAST:event_btnfryActionPerformed

    private void btncheburActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncheburActionPerformed
        cheeseb = true;
    }//GEN-LAST:event_btncheburActionPerformed

    private void btnbaccheburActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbaccheburActionPerformed
        baconb = true;
    }//GEN-LAST:event_btnbaccheburActionPerformed

    private void btnchefryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchefryActionPerformed
        cheesef = true;
    }//GEN-LAST:event_btnchefryActionPerformed

    private void btnchichefryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchichefryActionPerformed
        chilic = true;
    }//GEN-LAST:event_btnchichefryActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        canc = true;
        if (burg) {
            if (cheeseb && baconb) {
                BaconCheeseBurg fi = new BaconCheeseBurg();
                txtpri.setText("$" + (cur += fi.getPrice()));
                menuItems.add((num - 1), fi.getBurgerInformation());
            } else if (cheeseb && baconb == false) {
                Cheeseburg fi = new Cheeseburg();
                txtpri.setText("$" + (cur += fi.getPrice()));
                menuItems.add((num - 1), fi.getBurgerInformation());
            } else if (baconb && cheeseb == false) {
                BaconBurg fi = new BaconBurg();
                txtpri.setText("$" + (cur += fi.getPrice()));
                menuItems.add((num - 1), fi.getBurgerInformation());
            } else {
                Burger fi = new Burger();
                txtpri.setText("$" + (cur += fi.getPrice()));
                menuItems.add((num - 1), fi.getBurgerInformation());
            }
        }
        else{
            if (cheesef && chilic) {
                ChiliCheeseFry fi = new ChiliCheeseFry();
                txtpri.setText("$" + (cur += fi.getPrice()));
                menuItems.add((num - 1), fi.getFryInformation());
            } else if (cheesef && chilic == false) {
                CheeseFry fi = new CheeseFry();
                txtpri.setText("$" + (cur += fi.getPrice()));
                menuItems.add((num - 1), fi.getFryInformation());
            } else if (chilic && cheesef == false) {
                ChiliFry fi = new ChiliFry();
                txtpri.setText("$" + (cur += fi.getPrice()));
                menuItems.add((num - 1), fi.getFryInformation());
            } else {
                Fry fi = new Fry();
                txtpri.setText("$" + (cur += fi.getPrice()));
                menuItems.add((num - 1), fi.getFryInformation());
            }
        }

        burg = false;
        cheeseb = false;
        baconb = false;
        btnbacchebur.setEnabled(false);
        btnchebur.setEnabled(false);
        btnadd.setEnabled(false);
        btnout.setEnabled(true);
    }//GEN-LAST:event_btnaddActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnbacchebur;
    private javax.swing.JButton btnbur;
    private javax.swing.JButton btnchebur;
    private javax.swing.JButton btnchefry;
    private javax.swing.JButton btnchichefry;
    private javax.swing.JButton btnfry;
    private javax.swing.JButton btnout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstord;
    private javax.swing.JTextField txtnum;
    private javax.swing.JTextField txtpri;
    // End of variables declaration//GEN-END:variables
}
