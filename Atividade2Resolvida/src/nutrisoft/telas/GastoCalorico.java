/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nutrisoft.telas;

import javax.swing.JOptionPane;

/**
 *
 * @author larak
 */
public class GastoCalorico extends javax.swing.JFrame {

    /**
     * Creates new form GastoCalorico
     */
    public GastoCalorico() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfPeso = new javax.swing.JTextField();
        jtfAltura = new javax.swing.JTextField();
        jtfIdade = new javax.swing.JTextField();
        jbCalc = new javax.swing.JButton();
        jcbNAtiv = new javax.swing.JComboBox<>();
        jrbMulher = new javax.swing.JRadioButton();
        jrbHomem = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfcalTotal = new javax.swing.JTextField();
        jtfcalBasal = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NutriSoft");
        setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        setForeground(new java.awt.Color(51, 51, 255));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 0, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Gasto Calórico");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Cálculo de Gasto Calórico");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 42, 284, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Peso (kg):");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 57, -1, -1));

        jLabel4.setText("Altura (cm):");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 97, -1, -1));

        jLabel5.setText("Idade:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 137, -1, -1));

        jLabel6.setText("Nível de Atividade:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 180, -1, -1));
        jPanel2.add(jtfPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 255, -1));
        jPanel2.add(jtfAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 94, 255, -1));
        jPanel2.add(jtfIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 134, 255, -1));

        jbCalc.setText("Calcular");
        jbCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcActionPerformed(evt);
            }
        });
        jPanel2.add(jbCalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 208, 137, 27));

        jcbNAtiv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedentário", "Leve (exercício leve 1 a 3 dias/semana)", "Moderado (exercício moderado 3 a 5 dias/semana)", "Ativo (exercício pesado 5 a 6 dias/semana)", "Extremamente ativo (exercício pesado diário)", " ", " " }));
        jcbNAtiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbNAtivActionPerformed(evt);
            }
        });
        jPanel2.add(jcbNAtiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 172, 137, 24));

        buttonGroup1.add(jrbMulher);
        jrbMulher.setText("Mulher");
        jPanel2.add(jrbMulher, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 16, -1, -1));

        buttonGroup1.add(jrbHomem);
        jrbHomem.setText("Homem");
        jrbHomem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbHomemActionPerformed(evt);
            }
        });
        jPanel2.add(jrbHomem, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 16, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 430, 250));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel7.setText("Gasto Basal:");

        jLabel8.setText("Gasto Total:");

        jtfcalTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfcalTotalActionPerformed(evt);
            }
        });

        jtfcalBasal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfcalBasalActionPerformed(evt);
            }
        });

        jButton2.setText("<Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfcalTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(jtfcalBasal)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfcalBasal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtfcalTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 430, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcActionPerformed
     try{
           double calBasal = 0;
    
       if (!jrbHomem.isSelected() && !jrbMulher.isSelected()) {
           JOptionPane.showMessageDialog(null,"Obrigatório selecionar o sexo!!!");
       }else if(jtfPeso.getText().isEmpty() || jtfAltura.getText().isEmpty() || jtfIdade.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Todos os campos são obrigatórios:!"); 
       }else if ( Double.parseDouble(jtfPeso.getText())<=0 || Double.parseDouble(jtfAltura.getText())<=0 || Double.parseDouble(jtfIdade.getText())<=0){
           JOptionPane.showMessageDialog(null,"Apenas números acima de 0: ");
       }else {
            if (jrbHomem.isSelected()){
           double peso = Double.parseDouble(jtfPeso.getText());
           double altura = Double.parseDouble(jtfAltura.getText());
           double idade = Double.parseDouble(jtfIdade.getText());                   
           calBasal= 66 + (13.8 * peso) + (5 * altura)- (6.8 * idade);
           
           }else if (jrbMulher.isSelected()){
            double peso = Double.parseDouble(jtfPeso.getText());
            double altura = Double.parseDouble(jtfAltura.getText());
            double idade = Double.parseDouble(jtfIdade.getText());   
            calBasal = (655 + (9.6 * peso) + (1.9 * altura) - 4.7 * idade); 
            
    }//GEN-LAST:event_jbCalcActionPerformed
      String resultado = String.valueOf(String.format("%.1f", calBasal));
      jtfcalBasal.setText(resultado);
      
     
      double calTotal= 0;
      
      if (jcbNAtiv.getSelectedIndex()==0){
          JOptionPane.showMessageDialog(null,"Sedentário");
          calTotal = calBasal * 1.2;
      }else if(jcbNAtiv.getSelectedIndex()==1){
          JOptionPane.showMessageDialog(null,"Leve (exercício leve 1 a 3 dias/semana)");
          calTotal = calBasal * 1.375;
      }else if(jcbNAtiv.getSelectedIndex()==2){
          JOptionPane.showMessageDialog(rootPane, "Moderado (exercício moderado 3 a 5 dias/semana)");
          calTotal = calBasal * 1.55;
      }else if(jcbNAtiv.getSelectedIndex()==3){
          JOptionPane.showMessageDialog(rootPane, "Ativo (exercício pesado 5 a 6 dias/semana)");
          calTotal = calBasal * 1.725;
      }else if(jcbNAtiv.getSelectedIndex()==4){
          JOptionPane.showMessageDialog(rootPane, "Extremamente ativo (exercício pesado diário)");
          calTotal = calBasal * 1.9;
      }
             
      String resultadoTotal = String.valueOf(String.format("%.1f", calTotal));
      jtfcalTotal.setText(resultadoTotal);
     }
     }catch (NumberFormatException e){
             JOptionPane.showMessageDialog(null, "Digite apenas números:");
             }
    }
    private void jrbHomemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbHomemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbHomemActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jtfcalBasalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfcalBasalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfcalBasalActionPerformed

    private void jtfcalTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfcalTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfcalTotalActionPerformed

    private void jcbNAtivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNAtivActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbNAtivActionPerformed

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
            java.util.logging.Logger.getLogger(GastoCalorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GastoCalorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GastoCalorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GastoCalorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GastoCalorico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbCalc;
    private javax.swing.JComboBox<String> jcbNAtiv;
    private javax.swing.JRadioButton jrbHomem;
    private javax.swing.JRadioButton jrbMulher;
    private javax.swing.JTextField jtfAltura;
    private javax.swing.JTextField jtfIdade;
    private javax.swing.JTextField jtfPeso;
    private javax.swing.JTextField jtfcalBasal;
    private javax.swing.JTextField jtfcalTotal;
    // End of variables declaration//GEN-END:variables
}
