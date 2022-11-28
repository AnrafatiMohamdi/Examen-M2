package  gestion_ISSTM;

import BDD.Parameter;
import BDD.ResultSetTableModel;
import BDD.db_connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Panne extends javax.swing.JFrame {

    ResultSet rs;
    db_connection db;
    int old, dec, now;
    public Panne() {
        db = new db_connection(new Parameter().HOST_DB, new Parameter().USERNAME_DB, new Parameter().PASSWORD_DB, new Parameter().IPHOST, new Parameter().PORT);
        
        initComponents();
        table();
        jam();
    }
//pour acces au table
    public void table() {
        String colon[] = { "Matricule", "PC", "processeur", "ram", "disqueDur", "graphique", "Generation", "Nombre"};
        rs = db.querySelect(colon, "labo");
        tbl_res.setModel(new ResultSetTableModel(rs));
    }
    
    
    public void table2() {
        String colon2[] = { "Num_panne","Matricule", "PC","Panne","Nbn_panne"};
        rs = db.querySelect(colon2, "t_panne");
        //rs = db.querySelectAll("t_panne");
        tbl_pann.setModel(new ResultSetTableModel(rs));
    }

    public void importer() {
        String colon[] = {"Num_panne","Matricule", "PC","Panne","Nbn_panne"};
        rs = db.fcSelectCommand(colon, "t_panne", "num_panne='" + txtnumpan.getText() + "'");
        tbl_pann.setModel(new ResultSetTableModel(rs));
    }
     public void jam() {
        Date s = new Date();
        SimpleDateFormat tgl = new SimpleDateFormat("EEEE-dd-MMM-yyyy");
        SimpleDateFormat jam = new SimpleDateFormat("HH:mm");
        lbl1.setText(jam.format(s));
        lbl2.setText(tgl.format(s));}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_res = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtnumpan = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtmat = new javax.swing.JTextField();
        txtpc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtpan = new javax.swing.JTextField();
        txtnbnPan = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_pann = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtrech = new javax.swing.JTextField();
        comrech = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        jLabel12.setText("jLabel12");

        jLabel15.setText("jLabel15");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(248, 249, 250));
        jPanel1.setLayout(null);

        tbl_res.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "matricule", "PC", "processeur", "ram", "disqueDur", "graphique", "generation", "nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_res.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_resMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_res);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 40, 1000, 90);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("resultat");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(450, 0, 100, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 170, 1010, 140);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Num de panne :");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(830, 90, 100, 17);

        txtnumpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumpanActionPerformed(evt);
            }
        });
        jPanel3.add(txtnumpan);
        txtnumpan.setBounds(780, 120, 190, 40);

        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton3.setText("recherche par num de panne");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(770, 20, 200, 40);

        jButton4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton4.setText("annuler");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(610, 20, 140, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setText("imprimer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(20, 20, 180, 40);

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton2.setText("Ajouter au Panne");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(400, 20, 190, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("matricule :");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(20, 90, 120, 20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("PC     :");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(220, 90, 120, 20);

        txtmat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmatActionPerformed(evt);
            }
        });
        jPanel3.add(txtmat);
        txtmat.setBounds(0, 120, 160, 40);

        txtpc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpcActionPerformed(evt);
            }
        });
        jPanel3.add(txtpc);
        txtpc.setBounds(180, 120, 180, 40);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("panne :");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(430, 90, 100, 17);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("nombre de panne  :");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(610, 90, 110, 17);

        txtpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpanActionPerformed(evt);
            }
        });
        jPanel3.add(txtpan);
        txtpan.setBounds(400, 120, 160, 40);

        txtnbnPan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnbnPanActionPerformed(evt);
            }
        });
        txtnbnPan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnbnPanKeyReleased(evt);
            }
        });
        jPanel3.add(txtnbnPan);
        txtnbnPan.setBounds(590, 120, 160, 40);

        tbl_pann.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "num_panne", "matricule", "PC", "panne", "nbn_panne"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_pann.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_pannMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_pann);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(210, 200, 630, 110);

        jButton6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton6.setText("supprimer");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(220, 20, 170, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 310, 1010, 440);

        jPanel4.setBackground(new java.awt.Color(253, 230, 250));

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel16.setText("PANNE");
        jLabel16.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        lbl1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl1.setText("jLabel12");

        lbl2.setText("jLabel17");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(178, 178, 178))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lbl2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(10, 10, 460, 70);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sortie.gif"))); // NOI18N
        jButton8.setText("sortire");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(860, 20, 110, 50);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(null);
        jPanel2.add(txtrech);
        txtrech.setBounds(490, 30, 180, 30);

        comrech.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "matricule", "PC", "processeur", "ram", "disqueDur", "graphique", "generation", "nombre" }));
        jPanel2.add(comrech);
        comrech.setBounds(240, 30, 240, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setText("recherche par catégorie :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(230, 0, 250, 20);

        jButton5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton5.setText("recherche ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(680, 30, 131, 30);

        jButton7.setText("actualiser");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(850, 30, 120, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 80, 1000, 130);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_resMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_resMouseClicked
        txtmat.setText(String.valueOf(tbl_res.getValueAt(tbl_res.getSelectedRow(), 0)));
        txtpc.setText(String.valueOf(tbl_res.getValueAt(tbl_res.getSelectedRow(), 1)));
        
       
    }//GEN-LAST:event_tbl_resMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtmatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmatActionPerformed

    private void txtpcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpcActionPerformed

    private void txtpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpanActionPerformed

    private void txtnbnPanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnbnPanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnbnPanActionPerformed

    private void txtnumpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumpanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumpanActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (txtrech.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP complete le champ de recherche");
        } else {
            if (comrech.getSelectedItem().equals("matricule")) {
                String colon[] = {"matricule","PC","processeur","ram","disqueDur","graphique","generation","nombre"};
                rs = db.fcSelectCommand(colon, "labo", "Matricule LIKE '" + txtrech.getText() + "' ");
                tbl_res.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("PC")) {
                String colon[] = {"matricule","PC","processeur","ram","disqueDur","graphique","generation","nombre"};
                rs = db.fcSelectCommand(colon, "labo", "PC LIKE '" + txtrech.getText() + "' ");
                tbl_res.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("processeur")) {
                String colon[] = {"matricule","PC","processeur","ram","disqueDur","graphique","generation","nombre"};
                rs = db.fcSelectCommand(colon, "labo", "processeur LIKE '" + txtrech.getText() + "' ");
                tbl_res.setModel(new ResultSetTableModel(rs));
                } else if (comrech.getSelectedItem().equals("ram")) {
                String colon[] = {"matricule","PC","processeur","ram","disqueDur","graphique","generation","nombre"};
                rs = db.fcSelectCommand(colon, "labo", "ram LIKE '" + txtrech.getText() + "' ");
                tbl_res.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("disqueDur")) {
                String colon[] = {"matricule","PC","processeur","ram","disqueDur","graphique","generation","nombre"};
                rs = db.fcSelectCommand(colon, "labo", "disqueDur LIKE '" + txtrech.getText() + "' ");
                tbl_res.setModel(new ResultSetTableModel(rs));
                } else if (comrech.getSelectedItem().equals("graphique")) {
                String colon[] = {"matricule","PC","processeur","ram","disqueDur","graphique","generation","nombre"};
                rs = db.fcSelectCommand(colon, "labo", "graphique LIKE '" + txtrech.getText() + "' ");
                tbl_res.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("generation")) {
                String colon[] = {"matricule","PC","processeur","ram","disqueDur","graphique","generation","nombre"};
                rs = db.fcSelectCommand(colon, "labo", "generation LIKE '" + txtrech.getText() + "' ");
                tbl_res.setModel(new ResultSetTableModel(rs));
                } else if (comrech.getSelectedItem().equals("nombre")) {
                String colon[] = {"matricule","PC","processeur","ram","disqueDur","graphique","generation","nombre"};
                rs = db.fcSelectCommand(colon, "labo", "nombre LIKE '" + txtrech.getText() + "' ");
                tbl_res.setModel(new ResultSetTableModel(rs));
            
            
            
                
            
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (txtmat.getText().equals("") || txtpc.getText().equals("") || txtpan.getText().equals("")|| txtnbnPan.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP entrer vos donneé");
        } else if (txtnumpan.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP entrer le num de Panne");
        } else {
            String[] colon = {"num_panne","Matricule", "PC", "panne", "nbn_panne"};
            String[] isi = {txtnumpan.getText(), txtmat.getText(), txtpc.getText(), txtpan.getText(), txtnbnPan.getText()};
            System.out.println(db.queryInsert("t_panne", colon, isi));
            try {
                if (!test_nombre()) { 
                    JOptionPane.showMessageDialog(this, "le nombre est Limiter");
                } else {
                    def(); //true
                    table();
                    table2();//true
                }
            } catch (SQLException ex) {
                Logger.getLogger(Panne.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println("\n"+ex);
            }
            total();
            importer();
            total();
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        importer();
        total();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String id = String.valueOf(tbl_pann.getValueAt(tbl_pann.getSelectedRow(), 0));
        if (JOptionPane.showConfirmDialog(this, "est ce que tu es sure que tu veux supprimer ", "Attention", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            db.queryDelete("t_panne", "id=" + id);
        } else {
            return;
        }
        importer();
        total();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String invoice = txtnumpan.getText();
        if (JOptionPane.showConfirmDialog(this,"est ce que tu es sure que tu veux supprimer ","attention", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            db.queryDelete("t_panne", "num_panne=" + invoice);
        } else {
            return;
        }
        importer();
        total();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtnbnPanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnbnPanKeyReleased
 total();        // TODO add your handling code here:
    }//GEN-LAST:event_txtnbnPanKeyReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     table();   // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
 Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void tbl_pannMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_pannMouseClicked
       txtmat.setText(String.valueOf(tbl_pann.getValueAt(tbl_pann.getSelectedRow(), 1)));
        txtpc.setText(String.valueOf(tbl_pann.getValueAt(tbl_pann.getSelectedRow(), 2)));
        txtpan.setText(String.valueOf(tbl_pann.getValueAt(tbl_pann.getSelectedRow(), 3)));
        txtnbnPan.setText(String.valueOf(tbl_pann.getValueAt(tbl_pann.getSelectedRow(), 4)));
        txtnumpan.setText(String.valueOf(tbl_pann.getValueAt(tbl_pann.getSelectedRow(), 5)));
       
    }//GEN-LAST:event_tbl_pannMouseClicked

    
       public boolean test_nombre() throws SQLException {
        boolean testnombre;
        rs = db.querySelectAll("labo","matricule='" + txtmat.getText() + "'");
        while (rs.next()) {
            old = rs.getInt("nombre");
        }
        dec = Integer.parseInt(txtnbnPan.getText());
        if (old < dec) {
            testnombre = false;
        } else {
            testnombre = true;
        }
        return testnombre;
    }

    public void def() throws SQLException {
        rs = db.querySelectAll("labo", "matricule='" + txtmat.getText() + "'");
        while (rs.next()) {
            old = rs.getInt("nombre");
        }
        dec = Integer.parseInt(txtnbnPan.getText());
        now = old - dec;
         String nvnombre = Integer.toString(now);

        String a = String.valueOf(nvnombre);
        String[] colon = {"nombre"};
        String[] isi = {a};
        System.out.println(db.queryUpdate("labo", colon, isi, "matricule='" + txtmat.getText() + "'"));
    }

    
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
            java.util.logging.Logger.getLogger(Panne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panne().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox comrech;
    public static javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton2;
    public static javax.swing.JButton jButton3;
    public static javax.swing.JButton jButton4;
    public static javax.swing.JButton jButton5;
    public static javax.swing.JButton jButton6;
    public static javax.swing.JButton jButton7;
    public static javax.swing.JButton jButton8;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JLabel lbl1;
    public static javax.swing.JLabel lbl2;
    public static javax.swing.JTable tbl_pann;
    public static javax.swing.JTable tbl_res;
    public static javax.swing.JTextField txtmat;
    public static javax.swing.JTextField txtnbnPan;
    public static javax.swing.JTextField txtnumpan;
    public static javax.swing.JTextField txtpan;
    public static javax.swing.JTextField txtpc;
    public static javax.swing.JTextField txtrech;
    // End of variables declaration//GEN-END:variables

    private void total() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
