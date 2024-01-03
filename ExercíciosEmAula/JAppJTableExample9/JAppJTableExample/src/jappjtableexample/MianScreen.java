
package jappjtableexample;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MianScreen extends javax.swing.JFrame {

    private final String[] tableColumns = {"Nome", "Email", "Idade"};
    DefaultTableModel tableModel = new DefaultTableModel(tableColumns, 0);
    private List<Aluno> alunoList = new ArrayList<>();

    public MianScreen() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        pnlEntradaDedados = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        textEmail = new javax.swing.JTextField();
        textIdade = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        pnlRetornarDados = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAlunos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        pnlEntradaDedados.setBackground(new java.awt.Color(255, 255, 255));
        pnlEntradaDedados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblEmail.setBackground(new java.awt.Color(255, 255, 255));
        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 0, 0));
        lblEmail.setText("Email:");

        lblNome.setBackground(new java.awt.Color(255, 255, 255));
        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 0, 0));
        lblNome.setText("Nome:");

        lblIdade.setBackground(new java.awt.Color(255, 255, 255));
        lblIdade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIdade.setForeground(new java.awt.Color(0, 0, 0));
        lblIdade.setText("Idade:");

        textNome.setBackground(new java.awt.Color(255, 255, 255));
        textNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textNome.setForeground(new java.awt.Color(0, 0, 0));

        textEmail.setBackground(new java.awt.Color(255, 255, 255));
        textEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textEmail.setForeground(new java.awt.Color(0, 0, 0));

        textIdade.setBackground(new java.awt.Color(255, 255, 255));
        textIdade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textIdade.setForeground(new java.awt.Color(0, 0, 0));

        btnSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 0, 0));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(0, 0, 0));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEntradaDedadosLayout = new javax.swing.GroupLayout(pnlEntradaDedados);
        pnlEntradaDedados.setLayout(pnlEntradaDedadosLayout);
        pnlEntradaDedadosLayout.setHorizontalGroup(
            pnlEntradaDedadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEntradaDedadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEntradaDedadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblIdade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEntradaDedadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEntradaDedadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textIdade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(pnlEntradaDedadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlEntradaDedadosLayout.setVerticalGroup(
            pnlEntradaDedadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEntradaDedadosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlEntradaDedadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar))
                .addGap(18, 18, 18)
                .addGroup(pnlEntradaDedadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textEmail)
                    .addComponent(btnExcluir))
                .addGap(18, 18, 18)
                .addGroup(pnlEntradaDedadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textIdade))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pnlRetornarDados.setBackground(new java.awt.Color(255, 255, 255));
        pnlRetornarDados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblAlunos.setBackground(new java.awt.Color(255, 255, 255));
        tblAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Email", "Idade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblAlunos);

        javax.swing.GroupLayout pnlRetornarDadosLayout = new javax.swing.GroupLayout(pnlRetornarDados);
        pnlRetornarDados.setLayout(pnlRetornarDadosLayout);
        pnlRetornarDadosLayout.setHorizontalGroup(
            pnlRetornarDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );
        pnlRetornarDadosLayout.setVerticalGroup(
            pnlRetornarDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlEntradaDedados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRetornarDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlEntradaDedados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRetornarDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        {//GEN-FIRST:event_btnSalvarActionPerformed
   
      
      /*
      * Antes de fazermos qualquer coisa precisamos
      * saber se há algum campo vazio, como já criamos
      * um método que faz isso, é só chamá-lo. Lembre-se
      * que se algum campo estiver vazio o retorno é "true",
      * caso contrário é false. Usamos ele no if precedido pelo
      * "!" (ponto de exclamação). Desse forma lê-se "se
      * campos não vazios". Dessa maneira se o retorno for
      * "false" podemos executar a inserção do aluno. 
      */
      if(!emptyFileds()){
          /*
          * Agora basta enviar o aluno que vai retornar
          * do método getAluno para o método inserir
          * aluno. O método getAluno(), vai ser executado
          * antes do inserirAluno.
          */
          inserirAluno(getAluno());
          
          /*
          * Depois de inserir o aluno é uma boa prática 
          * limpar os campos do formulário e setar o
          * cursor no primeiro campo com o método
          * "requestFocus()";
          */
          textNome.setText("");
          textEmail.setText("");
          textIdade.setText("");
          
          textNome.requestFocus(); 
      }
      
    }                  
                        

       
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluirAluno(getPosicaoAluno());
    }//GEN-LAST:event_btnExcluirActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MianScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JPanel pnlEntradaDedados;
    private javax.swing.JPanel pnlRetornarDados;
    private javax.swing.JTable tblAlunos;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textIdade;
    private javax.swing.JTextField textNome;
    // End of variables declaration//GEN-END:variables

    // metodo para verificar se existem campos vazios  
    private boolean emptyFileds() {
        boolean empty = true;

        if (textNome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "o campo 'Nome' está vazio");
        } else if (textEmail.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "o campo 'Email' está vazio");
        } else if (textIdade.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "o campo 'Idade' está vazio");
        } else {
            empty = false;
        }
        return empty;
    }

    // metodo para criar alunos 
    private Aluno getAluno() {
        Aluno aluno = new Aluno();

        aluno.setNome(textNome.getText());
        aluno.setEmail(textEmail.getText());
        aluno.setIdade(Integer.parseInt(textIdade.getText()));

        return aluno;
    }

    // metodo para inserir o aluno na lista
    private void inserirAluno(Aluno aluno) {
        alunoList.add(aluno);
        atualizarTabela();
    }

    //metodo para atualizar a tabela
    private void atualizarTabela() {
      
        if (!alunoList.isEmpty()) {

         
            Aluno aluno;

          
            tableModel = new DefaultTableModel(tableColumns, 0);

          
            for (int i = 0; i < alunoList.size(); i++) {

              
                aluno = alunoList.get(i);

                
            
                String[] rowData = {aluno.getNome(),aluno.getEmail(),String.valueOf(aluno.getIdade())};

             
                tableModel.addRow(rowData);
            }

        
            tblAlunos.setModel(tableModel);
        } else {
            
         
            tableModel = new DefaultTableModel(tableColumns, 0);
            tblAlunos.setModel(tableModel);
        }
    }

    // pega a posição do aluno
    private int getPosicaoAluno() {
        int posicaoAluno = tblAlunos.getSelectedRow();

        if (posicaoAluno == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um aluno");
        }

        return posicaoAluno;
    }

    // exclui o aluno
    private void excluirAluno(int posicaoAluno) {
        if (posicaoAluno == 0) {
            String[] options = {"Sim", "Não"};
            int deletar = JOptionPane.showOptionDialog(
                    rootPane,
                    "Tem certeza que deseja excluir?",
                    "Exclusão de aluno",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]
            );
            if (deletar == 0) {
                alunoList.remove(posicaoAluno);
                atualizarTabela();
            }else{
                tblAlunos.clearSelection();
            }
        }
    }
}
