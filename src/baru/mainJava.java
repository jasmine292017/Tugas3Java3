/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baru;

/**
 *
 * @author VAIO
 */
public class mainJava extends javax.swing.JFrame {

    /**
     * Creates new form mainJava
     */
    public mainJava() {
        initComponents();
       
    }
    private void PilihanHobi (){
    StringBuffer Hobi = new StringBuffer();
    if (cbOlahraga.isSelected()){
        Hobi.append(cbOlahraga.getText() + "");
    }
    if (cbJalan.isSelected()) {
        Hobi.append(cbJalan.getText() + "");
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

        bgJenisKelamin = new javax.swing.ButtonGroup();
        bgJenisKelamin.add(jrLaki);
        bgJenisKelamin.add(jrPerempuan);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtTtl = new javax.swing.JTextField();
        jrLaki = new javax.swing.JRadioButton();
        jrPerempuan = new javax.swing.JRadioButton();
        cbOlahraga = new javax.swing.JCheckBox();
        cbJalan = new javax.swing.JCheckBox();
        cbMembaca = new javax.swing.JCheckBox();
        cbTidur = new javax.swing.JCheckBox();
        btnOk = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHasil = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setText("Nama");

        jLabel2.setText("Ttl");

        jLabel3.setText("Jenis Kelamin");

        jLabel4.setText("Hobi");

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        bgJenisKelamin.add(jrLaki);
        jrLaki.setText("Laki-Laki");
        jrLaki.setName("rd1"); // NOI18N
        jrLaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrLakiActionPerformed(evt);
            }
        });

        bgJenisKelamin.add(jrPerempuan);
        jrPerempuan.setText("Perempuan");
        jrPerempuan.setName("rd2"); // NOI18N
        jrPerempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrPerempuanActionPerformed(evt);
            }
        });

        cbOlahraga.setText("Olahraga");
        cbOlahraga.setName(""); // NOI18N
        cbOlahraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOlahragaActionPerformed(evt);
            }
        });

        cbJalan.setText("Jalan Jalan");

        cbMembaca.setText("Membaca");
        cbMembaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMembacaActionPerformed(evt);
            }
        });

        cbTidur.setText("Tidur");
        cbTidur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTidurActionPerformed(evt);
            }
        });

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        txtHasil.setColumns(20);
        txtHasil.setRows(5);
        jScrollPane1.setViewportView(txtHasil);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrLaki)
                        .addGap(28, 28, 28)
                        .addComponent(jrPerempuan))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtTtl, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                        .addComponent(txtNama))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbJalan)
                            .addComponent(cbOlahraga))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbMembaca)
                            .addComponent(cbTidur)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnOk)
                        .addGap(26, 26, 26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTtl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jrLaki)
                            .addComponent(jrPerempuan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbOlahraga)
                                .addComponent(cbMembaca)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbJalan)
                            .addComponent(cbTidur))
                        .addGap(18, 18, 18)
                        .addComponent(btnOk)))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void jrLakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrLakiActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jrLakiActionPerformed

    private void cbOlahragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOlahragaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOlahragaActionPerformed

    private void jrPerempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrPerempuanActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jrPerempuanActionPerformed

    private void cbMembacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMembacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMembacaActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
       // String nama,Ttl,Hobi,isi;
       
       String Jenkel;
       if (jrLaki.isSelected()){
           Jenkel = "Laki-Laki";
       } else{
           Jenkel = "Perempuan";
       }
      
       
      StringBuffer Hobi = new StringBuffer();
          if (cbOlahraga.isSelected()){
               Hobi.append(cbOlahraga.getText()+", ");
             } if(cbJalan.isSelected()){
               Hobi.append(cbJalan.getText()+", ");
             } if(cbMembaca.isSelected()){
               Hobi.append(cbMembaca.getText()+", ");
             } if (cbTidur.isSelected()){
               Hobi.append(cbTidur.getText()+", ");
               }
      
        txtHasil.setText("Nama\t: " + txtNama.getText()
                         + "\n Ttl \t: " + txtTtl.getText()
                         + "\n Jenis Kelamin\t : " + Jenkel
                         + "\n Hobi\t : " + Hobi.toString());
                      
              
     
      //  txtHasil.setText("Ttl : " + txtTtl.getText());
      //txtHasil.setText("Jenis kelamin : " + jrLaki.getText());
       // txtHasil.setText("Hobi : " + jrPerempuan.getText());
    }//GEN-LAST:event_btnOkActionPerformed

    private void cbTidurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTidurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTidurActionPerformed

    
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
            java.util.logging.Logger.getLogger(mainJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainJava().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgJenisKelamin;
    private javax.swing.JButton btnOk;
    private javax.swing.JCheckBox cbJalan;
    private javax.swing.JCheckBox cbMembaca;
    private javax.swing.JCheckBox cbOlahraga;
    private javax.swing.JCheckBox cbTidur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrLaki;
    private javax.swing.JRadioButton jrPerempuan;
    private javax.swing.JTextArea txtHasil;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTtl;
    // End of variables declaration//GEN-END:variables
}
