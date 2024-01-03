package telas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Consulta;

public class TelaPrincipal extends javax.swing.JFrame {

    public static TelaPrincipal telaPrincipal = new TelaPrincipal();
    //1 passo, criacao da tabela dinamica 
    private final String[] tableColumns = {"Nome", "CPF", "Telefone", " Data", " Já é Paciente?", "Consulta Realizada"};
    /* Passo  2
      * Definição do table model que vai conter a nossa lista de alunos
      * o primeiro parâmetro é nosso vetor com os títulos das colunas
      * e o segundo parâmetro é o índice da linha que se quer exibir os
      * títulos. Nesse caso na primeira linha.
     */
    DefaultTableModel tableModel = new DefaultTableModel(tableColumns, 0);
    /*
      * Passo 3.
      * Definição do vetor com os títulos de cada coluna da tabela
     */
    private List<Consulta> consultaList = new ArrayList<>();

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsulta = new javax.swing.JTable();
        btnConsulta = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Boas inds ao sistema de agendamento ");

        tblConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Telefone", "Data", "Já é paciente?", "Consulta Realizada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblConsulta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
        );

        btnConsulta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConsulta.setText("Nova Consulta");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExcluir.setText("Excluir Consulta");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnFinalizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnFinalizar.setText("Finalizar Consulta");
        btnFinalizar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        //inicia a variavel detalhes e deixa a tela visivel Detalhes da Consulta quando clicar em telaPrincipal em finalizar consulta
        DetalhesConsulta detalhes = new DetalhesConsulta();

        if (jaRealizada() == 1) {
            //consulta já foi realizada
            detalhes.checkConsultaOff();
            detalhes.mostrarObs(mostrarObs());
            detalhes.setVisible(true);
        } else if (jaRealizada() == 2) {
            //ainda não foi realizada
            detalhes.checkConsultaOn();
            detalhes.mostrarObs(mostrarObs());
            detalhes.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma consulta para ser finalizada!");
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        Cadastro cadastro = new Cadastro();
        cadastro.setVisible(true);


    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (pegarPosicao()<0){
            JOptionPane.showMessageDialog(rootPane, "Selecione uma consulta para ser excluída:");
        }else{
            excluirConsulta(pegarPosicao());
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                telaPrincipal.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblConsulta;
    // End of variables declaration//GEN-END:variables

    public void inserirConsulta(Consulta consulta) {
        consultaList.add(consulta);

        atualizarTabela();
    }

    private void atualizarTabela() {

        /*
     * antes de atualizar a tabela é uma boa prática
     * verificar se a lista de alunos NÃO está vazia, pois,
     * se estiver vazia não precisamos atualizar.
         */
        if (!consultaList.isEmpty()) {

            /*
         * Como não está vazia, vamos criar um Aluno que será
         * será instanciado em cada ocorrência de aluno na lista,
         * isso dentro de um laço de repetição "for".
             */
            Consulta consulta;

            /*
         * Também é necessário recriar o tableModel, para limpar
         * os dados anteriores
             */
            tableModel = new DefaultTableModel(tableColumns, 0);

            /*
         * Agora vamos criar o for que vai repetir
         * até o tamanho da lista de alunos
             */
            for (int i = 0; i < consultaList.size(); i++) {

                /*
             * Instância de Aluno com os dados do aluno
             * de cada posição da lista
                 */
                consulta = consultaList.get(i);

                /*
             * Agora vamos criar um vetor de String com cada um
             * dos valores dos atributos do aluno encontrado.
             * Vamos chamar de "rowData".
                 */
                String[] rowData = {consulta.getNome(), consulta.getCPF(), consulta.getTelefone(), consulta.getDataConsulta(), consulta.getEhPaciente(), consulta.getDetalhes().getConsultaRealizada()};

                /*
             * Agora adicionamos o vetor de dados na tableModel
                 */
                tableModel.addRow(rowData);
            }

            /*
         * Após concluído o for e com isso colocar todos os
         * dados antigos e os novos no tableModel, é hora de
         * setar o modelo na tabela.
             */
            tblConsulta.setModel(tableModel);
        } else {
            /*
         * No caso de excluirmos o último aluno da lista
         * teremos de criar uma tableModel nova para "limpar
         * a tabela" e setar na tblAlunos.
             */
            tableModel = new DefaultTableModel(tableColumns, 0);
            tblConsulta.setModel(tableModel);
        }
    }

    public int pegarPosicao() {
        int posicao = tblConsulta.getSelectedRow();
        return posicao;
    }

    public int jaRealizada() {
        int resposta = 0;
        if (tblConsulta.getSelectedRow() >= 0) {
            Consulta consulta = consultaList.get(tblConsulta.getSelectedRow());
            if (consulta.getDetalhes().getConsultaRealizada().equals("Consulta Realizada")) {
                resposta = 1;
            } else {
                resposta = 2;
            }
        }
        return resposta;
    }

    public void atualizarJaRealizada(String jaRealizada, int posicao) {
        Consulta consulta = consultaList.get(posicao);
        consulta.getDetalhes().setConsultaRealizada(jaRealizada);

        tblConsulta.setValueAt(jaRealizada, posicao, 5);
        tblConsulta.clearSelection();
    }

    public void guardarObs(String mensagem, int posicao) {
        Consulta consulta = consultaList.get(posicao);
        consulta.getDetalhes().setReceitaEObservacao(mensagem);
        tblConsulta.clearSelection();
    }

    public String mostrarObs() {
        String mensagem;
        Consulta consulta = consultaList.get(pegarPosicao());
        mensagem = consulta.getDetalhes().getReceitaEObservacao();

        return mensagem;
    }
    private void excluirConsulta(int posConsulta){
     
     /*
     * Antes de realizar a exclusão precisamos ter certeza que a posição
     * é válida, ou seja, maior ou igual a zero;
     */
     if(posConsulta >= 0){
        
         /*
         * Agora vamos pedir ao usuário a confirmação de exclusão.
         * Utilizaremos o método showOptionDialog() que permite
         * uma melhor customização se o usuário clicar "sim" o retorno
         * é 0. Se clicar em "Não" o retorno é 1. Posição do vetor "options";
         */
         
         String[] options = { "Sim", "Não" };
         
         int deletar = JOptionPane.showOptionDialog(
                 rootPane,
                 "Tem certeza que deseja excluir?", 
                 "Exclusão da consulta", 
                 JOptionPane.DEFAULT_OPTION, 
                 JOptionPane.QUESTION_MESSAGE, 
                 null, 
                 options, 
                 options[0]
         );
         
         
         /*
         * Se a variável deletar for 0 vamos deletar. Caso contrário
         * vamos limpar a seleção na tabela
         */
         if(deletar == 0){
                /*
                * Agora removemos a ocorrência dessa consulta
                * de consultaList por meio do método, remove(int index)
                */
                 consultaList.remove(posConsulta);

                 /*
                 * Depois de removido da lista precisamos atualizar a 
                 * tabela. Basta chamar o método atualizarTabela() já
                 * construído anteriormente
                 */
                 atualizarTabela();
                 JOptionPane.showMessageDialog(rootPane, "Consulta excluída com sucesso!");
                 
         }else{
             /*
             * Limpar a seleção pois o usuário cancelou a exclusão.
             */
            tblConsulta.clearSelection();             
         }
     }  
  }

    static class telaPrincipal {

        static void inserirConsulta(Consulta consulta) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public telaPrincipal() {
        }
    }

}
