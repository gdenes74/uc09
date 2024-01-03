
package tela;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ListaMedicao;
import modelo.Medicao;

public class Principal extends javax.swing.JFrame {

    private final String[] tableColumns = {"Data", "Hora", "Pressão sistólica", "Pressão diastólica", "Estresse"};

    DefaultTableModel tableModel = new DefaultTableModel(tableColumns, 0);

    public List<Medicao> medicaoLista = ListaMedicao.Listar();
    
    private String caminho = "C://teste.txt";

    public Principal() {
        initComponents();
        atualizarTxt();
        geraAcessbilidade();

    }

    public void geraAcessbilidade() {
        btSalvar.setMnemonic(KeyEvent.VK_D);
    }
    
    public void atualizarTxt() {
        try {
            File obj = new File(caminho);
            Scanner Reader = new Scanner(obj);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                List<String> listaTxt = Arrays.asList(data.split(";"));
                Medicao medicao = new Medicao();
                medicao.setData(listaTxt.get(0));
                medicao.setHora(listaTxt.get(1));
                medicao.setPressaoSistolica(listaTxt.get(2));
                medicao.setPressaoDiastolica(listaTxt.get(3));
                medicao.setEstresse(listaTxt.get(4));
                ListaMedicao.Adicionar(medicao);
            }
            atualizarTabela();
            Reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ocorreu um erro" + e.getMessage());
        }

    }

    public void atualizarTabela() {
        String conteudoTxt = " ";
        
        if (!medicaoLista.isEmpty()) {
            Medicao medicao;

            tableModel = new DefaultTableModel(tableColumns, 0);

            for (int i = 0; i < medicaoLista.size(); i++) {
                medicao = medicaoLista.get(i);
                String[] rowData = {medicao.getData(), medicao.getHora(), medicao.getPressaoSistolica(), medicao.getPressaoDiastolica(), medicao.getEstresse()};
                tableModel.addRow(rowData);
                conteudoTxt += medicao.getData() + ";" + medicao.getHora() + ";" + medicao.getPressaoSistolica() + ";" + medicao.getPressaoDiastolica() + ";" + medicao.getEstresse() + "\n";
            }
            tabelaMedicao.setModel(tableModel);
        } else {
            tableModel = new DefaultTableModel(tableColumns, 0);
            tabelaMedicao.setModel(tableModel);
        }
        try {
                  FileWriter Writer = new FileWriter(caminho);
                  Writer.write(conteudoTxt);
                  Writer.close();
              }
              catch (IOException e) {
                  System.out.println("Ocorreu algum erro.");
              }
    }

    private void inserirMedicao(Medicao medicao) {

        medicaoLista.add(medicao);

        atualizarTabela();
    }

    public int getPosicaoMedicao() {
        int posMedicao = tabelaMedicao.getSelectedRow();
        return posMedicao;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        interfaceApp = new javax.swing.JLayeredPane();
        lblHora = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblPressaoSistolica = new javax.swing.JLabel();
        lblPressaoDiastolica = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        txtPressaoDiastolica = new javax.swing.JTextField();
        txtPressaoSistolica = new javax.swing.JTextField();
        boxEstresse = new javax.swing.JCheckBox();
        btSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMedicao = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Acompanhamento da pressão");

        interfaceApp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Informações ")));

        lblHora.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblHora.setLabelFor(txtHora);
        lblHora.setText("Hora");

        lblData.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblData.setLabelFor(txtData);
        lblData.setText("Data");
        lblData.setToolTipText("Insira a data");

        lblPressaoSistolica.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblPressaoSistolica.setLabelFor(txtPressaoSistolica);
        lblPressaoSistolica.setText("Pressão sistólica");

        lblPressaoDiastolica.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblPressaoDiastolica.setLabelFor(txtPressaoDiastolica);
        lblPressaoDiastolica.setText("Pressão diastólica");

        txtData.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtData.setToolTipText("Preencha a data");

        txtHora.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtHora.setToolTipText("Preencha a hora");

        txtPressaoDiastolica.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtPressaoDiastolica.setToolTipText("Preencha com a pressão diastólica");
        txtPressaoDiastolica.setNextFocusableComponent(boxEstresse);

        txtPressaoSistolica.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtPressaoSistolica.setToolTipText("Preencha com a pressão sistólica");

        boxEstresse.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boxEstresse.setText("Estresse");
        boxEstresse.setToolTipText("Marque caso teve estresse");
        boxEstresse.setNextFocusableComponent(btSalvar);

        btSalvar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setToolTipText("Clique depois de preencher todos os campos");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        tabelaMedicao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Hora", "Pressão sistólica", "Pressão diastólica", "Estresse"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaMedicao);

        interfaceApp.setLayer(lblHora, javax.swing.JLayeredPane.DEFAULT_LAYER);
        interfaceApp.setLayer(lblData, javax.swing.JLayeredPane.DEFAULT_LAYER);
        interfaceApp.setLayer(lblPressaoSistolica, javax.swing.JLayeredPane.DEFAULT_LAYER);
        interfaceApp.setLayer(lblPressaoDiastolica, javax.swing.JLayeredPane.DEFAULT_LAYER);
        interfaceApp.setLayer(txtData, javax.swing.JLayeredPane.DEFAULT_LAYER);
        interfaceApp.setLayer(txtHora, javax.swing.JLayeredPane.DEFAULT_LAYER);
        interfaceApp.setLayer(txtPressaoDiastolica, javax.swing.JLayeredPane.DEFAULT_LAYER);
        interfaceApp.setLayer(txtPressaoSistolica, javax.swing.JLayeredPane.DEFAULT_LAYER);
        interfaceApp.setLayer(boxEstresse, javax.swing.JLayeredPane.DEFAULT_LAYER);
        interfaceApp.setLayer(btSalvar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        interfaceApp.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout interfaceAppLayout = new javax.swing.GroupLayout(interfaceApp);
        interfaceApp.setLayout(interfaceAppLayout);
        interfaceAppLayout.setHorizontalGroup(
            interfaceAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(interfaceAppLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(boxEstresse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, interfaceAppLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(interfaceAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(interfaceAppLayout.createSequentialGroup()
                        .addGroup(interfaceAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(interfaceAppLayout.createSequentialGroup()
                                .addComponent(lblPressaoSistolica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPressaoSistolica, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                            .addGroup(interfaceAppLayout.createSequentialGroup()
                                .addComponent(lblData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(interfaceAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(interfaceAppLayout.createSequentialGroup()
                                .addComponent(lblHora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(interfaceAppLayout.createSequentialGroup()
                                .addComponent(lblPressaoDiastolica)
                                .addGap(36, 36, 36)
                                .addComponent(txtPressaoDiastolica, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(26, 26, 26))
        );
        interfaceAppLayout.setVerticalGroup(
            interfaceAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(interfaceAppLayout.createSequentialGroup()
                .addGroup(interfaceAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(interfaceAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(interfaceAppLayout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(lblData))
                        .addComponent(txtHora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHora, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(interfaceAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(interfaceAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPressaoSistolica)
                        .addComponent(lblPressaoDiastolica))
                    .addComponent(txtPressaoDiastolica, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPressaoSistolica, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(interfaceAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxEstresse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(interfaceApp)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(interfaceApp)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        Medicao medicao = new Medicao(null, null, null, null, null);

        if (txtData.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você esqueceu de preencher a data:");
        } else {
            String d = txtData.getText();
            boolean formatod = d.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{2}");
            if (formatod == false) {
                JOptionPane.showMessageDialog(null, "Preencha a data somente números no formato DD/MM/AA:");
            } else {
                if (txtHora.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Você esqueceu de preencher a hora:");
                } else {
                    String h = txtHora.getText();
                    boolean formatoh = h.matches("[0-9]{1,2}[:][0-9]{2}");
                    if (formatoh == false) {
                        JOptionPane.showMessageDialog(null, "Preencha a hora somente números no formato HH:MM:");
                    } else {
                        if (txtPressaoSistolica.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Você esqueceu de preencher a pressão sistólica:");
                        } else {
                            String s = txtPressaoSistolica.getText();
                            boolean formatos = s.matches("[0-9]{2,3}");
                            if (formatos == false) {
                                JOptionPane.showMessageDialog(null, "Preencha a pressão sistólica somente números com máximo 3 dígitos:");
                            } else {
                                if (txtPressaoDiastolica.getText().isEmpty()) {
                                    JOptionPane.showMessageDialog(null, "Você esqueceu de preencher a pressão diastólica:");
                                } else {
                                    String p = txtPressaoDiastolica.getText();
                                    boolean formatop = p.matches("[0-9]{2,3}");
                                    if (formatop == false) {
                                        JOptionPane.showMessageDialog(null, "Preencha a pressão diastólica somente números com máximo 3 dígitos:");
                                    } else {
                                        String e = "";

                                        if (boxEstresse.isSelected()) {
                                            e = "Sim";
                                        } else {
                                            e = "Não";
                                        }
                                        medicao = new Medicao(d, h, s, p, e);
                                        ListaMedicao.Adicionar(medicao);
                                        atualizarTabela();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox boxEstresse;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLayeredPane interfaceApp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblPressaoDiastolica;
    private javax.swing.JLabel lblPressaoSistolica;
    private javax.swing.JTable tabelaMedicao;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtPressaoDiastolica;
    private javax.swing.JTextField txtPressaoSistolica;
    // End of variables declaration//GEN-END:variables
}
