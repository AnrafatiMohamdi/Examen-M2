
package gestion_ISSTM;
import BDD.Parameter;
import BDD.ResultSetTableModel;
import BDD.db_connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public final class Informatique extends javax.swing.JFrame {

    ResultSet rs;
    db_connection db;
    public Informatique() {
            db = new db_connection(Parameter.HOST_DB, Parameter.USERNAME_DB, new Parameter().PASSWORD_DB, new Parameter().IPHOST, new Parameter().PORT);
        initComponents();
        table();
    }
    
    public void table() {
        String t[] = {"id","Matricule","PC", "processeur", "ram", "disqueDur", "graphique","Generation","Nombre"};
        rs = db.querySelect(t, "labo");
        tbl_prod.setModel(new ResultSetTableModel(rs));
    }
     void actualiser() {
        txtid.setText("");
        nomO.setSelectedItem("Marque");
        txtdes.setText("");
        txtran.setText("");txtfou.setText("");txtrem.setText("");txtpri.setText("");
        txtsto.setText("");}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_prod = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtdes = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtran = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtrem = new javax.swing.JTextField();
        txtpri = new javax.swing.JTextField();
        txtsto = new javax.swing.JTextField();
        txtfou = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        nomO = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        comrech = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        txtrech = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(231, 248, 251));
        jPanel1.setPreferredSize(new java.awt.Dimension(840, 900));
        jPanel1.setLayout(null);

        tbl_prod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "matricule", "PC", "processeur", "ram", "disqueDur", "graphique", "generation", "nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_prod.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbl_prodAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tbl_prod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_prodMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_prod);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 220, 840, 150);

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(850, 500));
        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Matricule   :");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 110, 80, 27);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("disqueDur  :");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(430, 110, 90, 20);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("graphique:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(450, 150, 70, 27);

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("processeur    :");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(210, 110, 70, 27);
        jPanel2.add(txtdes);
        txtdes.setBounds(290, 110, 100, 30);

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Generation   :");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(660, 100, 70, 27);

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("  Nombre   :");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(660, 150, 70, 27);
        jPanel2.add(txtran);
        txtran.setBounds(290, 150, 100, 30);

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("ram   :");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(210, 150, 70, 27);
        jPanel2.add(txtid);
        txtid.setBounds(80, 110, 100, 30);
        jPanel2.add(txtrem);
        txtrem.setBounds(510, 150, 100, 30);
        jPanel2.add(txtpri);
        txtpri.setBounds(730, 100, 100, 30);
        jPanel2.add(txtsto);
        txtsto.setBounds(730, 150, 100, 30);
        jPanel2.add(txtfou);
        txtfou.setBounds(510, 110, 100, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new.jpg"))); // NOI18N
        jButton2.setText("ajouter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(10, 20, 150, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modifier.gif"))); // NOI18N
        jButton3.setText("modifier");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(200, 20, 160, 40);

        jButton4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/supprimer.gif"))); // NOI18N
        jButton4.setText("supprimer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(400, 20, 160, 40);

        jButton5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reboot_48px.png"))); // NOI18N
        jButton5.setText("actualiser");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(620, 20, 180, 40);

        nomO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Marque", "ASUS", "ACER", "DELL", "TOCHIBA", "FIJUTSI", "MacBook", "LENOVO", "HP" }));
        nomO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomOActionPerformed(evt);
            }
        });
        jPanel2.add(nomO);
        nomO.setBounds(80, 150, 68, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PC  :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 150, 60, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 370, 840, 200);

        jPanel3.setBackground(new java.awt.Color(0, 102, 51));
        jPanel3.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("recherche par catégorie :");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(160, 0, 250, 30);

        comrech.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "id", "matricule", "PC", "processeur", "ram", "disqueDur", "graphique", "generation", "nombre" }));
        comrech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comrechActionPerformed(evt);
            }
        });
        jPanel3.add(comrech);
        comrech.setBounds(160, 40, 240, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/recherche.gif"))); // NOI18N
        jButton1.setText("recherche ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(630, 40, 200, 40);
        jPanel3.add(txtrech);
        txtrech.setBounds(420, 40, 180, 40);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 120, 840, 100);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel6.setText("Gestion des ordinateurs  ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(170, 0, 460, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("         Labo du Genie Informatique ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 60, 430, 29);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_prodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_prodMouseClicked
        txtid.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 1)));
        nomO.setSelectedItem(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 2)));
        txtdes.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 3)));
        txtran.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 4)));
        txtfou.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 5)));
        txtrem.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 6)));
        txtpri.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 7)));
        txtsto.setText(String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 8)));
    }//GEN-LAST:event_tbl_prodMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (txtid.getText().equals("") || nomO.getSelectedItem().equals("Marque") || txtdes.getText().equals("")
            || txtfou.getText().equals("") || txtran.getText().equals("") || txtrem.getText().equals("")
            || txtpri.getText().equals("") || txtsto.getText().equals("")
        ) {
            JOptionPane.showMessageDialog(this, "SVP entrer les informations complete");
        } else {
            String[] colon = {"Matricule","PC", "processeur", "ram", "disqueDur", "graphique","Generation","Nombre"};
            String[] inf = {txtid.getText(), nomO.getSelectedItem().toString() , txtdes.getText(),txtran.getText(),txtfou.getText()
                ,txtrem.getText(),txtpri.getText(),txtsto.getText()};
            System.out.println(db.queryInsert("labo", colon, inf));
            table();
            actualiser();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (txtid.getText().equals("") ||nomO.getSelectedItem().equals("Marque") || txtdes.getText().equals("")
            || txtfou.getText().equals("") || txtran.getText().equals("") || txtrem.getText().equals("")
            || txtpri.getText().equals("") || txtsto.getText().equals("")
        ) {
            JOptionPane.showMessageDialog(this, "SVP entrer les informations complete");
        } else {
            String[] colon = {"Matricule","PC", "processeur", "ram", "disqueDur", "graphique","Generation","Nombre"};
            String[] inf = {txtid.getText(),nomO.getSelectedItem().toString(), txtdes.getText(),txtran.getText(),txtfou.getText()
                ,txtrem.getText(),txtpri.getText(),txtsto.getText()};
            String id = String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 0));
            System.out.println(db.queryUpdate("labo", colon, inf, "id='" + id + "'"));
            table();
            actualiser();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String id = String.valueOf(tbl_prod.getValueAt(tbl_prod.getSelectedRow(), 0));
        if (JOptionPane.showConfirmDialog(this, "est ce que tu es sure que tu veux suuprimer", "attention!!!", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            db.queryDelete("labo", "id=" + id);
        } else {
            return;
        }
        table();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtrech.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP entrer quelque chose");
        } else {
            if (comrech.getSelectedItem().equals("id")) {
                rs = db.querySelectAll("labo", "id LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("matricule")) {
                rs = db.querySelectAll("labo", "Matricule LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("PC")) {
                rs = db.querySelectAll("labo", "PC LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("processeur")) {
                rs = db.querySelectAll("labo", "Processeur LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("ram")) {
                rs = db.querySelectAll("labo", "Ram LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("disqueDur")) {
                rs = db.querySelectAll("labo", "DisqueDur LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("graphique")) {
                rs = db.querySelectAll("labo", "Graphique LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("generation")) {
                rs = db.querySelectAll("labo", "Generation LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("nombre")) {
                rs = db.querySelectAll("labo", "Nombre LIKE '%" + txtrech.getText() + "%' ");
                tbl_prod.setModel(new ResultSetTableModel(rs));

            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        actualiser(); table();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tbl_prodAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbl_prodAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_prodAncestorAdded

    private void comrechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comrechActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comrechActionPerformed

    private void nomOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomOActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informatique().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comrech;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox nomO;
    private javax.swing.JTable tbl_prod;
    private javax.swing.JTextField txtdes;
    private javax.swing.JTextField txtfou;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtpri;
    private javax.swing.JTextField txtran;
    private javax.swing.JTextField txtrech;
    private javax.swing.JTextField txtrem;
    private javax.swing.JTextField txtsto;
    // End of variables declaration//GEN-END:variables

}
