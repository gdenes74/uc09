
package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Paciente;
import model.ListaPaciente;

public class TelaPrincipal extends javax.swing.JFrame {
    //criando uma tela inicial estatica para 
    public static TelaPrincipal telaPrincipal = new TelaPrincipal(); 
    //1 passo, criacao da tabela dinamica 
    private final String[] tableColumns = {"Paciente", "CPF", "Telefone"," Data", " Já é Paciente", "Consulta Realizada"};
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
    private List<Paciente> listaPacientes = ListaPaciente.Listar();   
    
   
    public TelaPrincipal() {
        initComponents();
    }
     /*
    * Metodo getPosicaoAluno(), vai retornar um valor inteiro maior ou igual
    * a zero, caso algum aluno esteja selecionado ou -1 caso não haja seleção.
  */
  private int getPosicaoPaciente(){
     
     /*
     * Criação da variável posAluno do tipo inteiro que vai receber 
     * o retorno do método getSelectedRow() da tblAlunos
     */
     int posPaciente = tblPacientes.getSelectedRow();
     
     
     /*
     * Caso o valor seja -1 vamos informar ao usuário para ele
     * selecionar o aluno
     */
     if(posPaciente == -1){
         JOptionPane.showMessageDialog(rootPane, "Selecione um paciente");
     }
     
     
     /*
     * Aqui retornamos a variável posAluno;  
     */
     return posPaciente;
  }
  //criando metodo para finalizar uma consulta
  private void finalizarConsulta(int posPaciente){
     //testando para ver se imprimiu,  System.out.println("posPaciente");
     if(posPaciente>=0){
         //chamar a tela de finalizar a consulta
          Detalhes detalhes = new  Detalhes();
          detalhes.MostraTela(this, posPaciente);
     
     }
  }
  /*
    * Metodo sem retorno excluirAluno(int posAluno), vai pedir confirmação
    * para excluir o aluno da posição informada.
  */
  
    private void excluirPaciente(int posPaciente) {

        /*
     * Antes de realizar a exclusão precisamos ter certeza que a posição
     * é válida, ou seja, maior ou igual a zero;
         */
        if (posPaciente >= 0) {

            /*
         * Agora vamos pedir ao usuário a confirmação de exclusão.
         * Utilizaremos o método showOptionDialog() que permite
         * uma melhor customização se o usuário clicar "sim" o retorno
         * é 0. Se clicar em "Não" o retorno é 1. Posição do vetor "options";
             */
            String[] options = {"Sim", "Não"};

            int deletar = JOptionPane.showOptionDialog(
                    rootPane,
                    "Tem certeza que deseja excluir?",
                    "Exclusão do paciente",
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
            if (deletar == 0) {
                /*
                * Agora removemos a ocorrência desse aluno
                * de alunosList por meio do método, remove(int index)
                *volta-se a lista de Pacientes
                 */
                listaPacientes.remove(posPaciente);

                /*
                 * Depois de removido da lista precisamos atualizar a 
                 * tabela. Basta chamar o método atualizarTabela() já
                 * construído anteriormente
                 */
                atualizarTabela();
            } else {
                /*
             * Limpar a seleção pois o usuário cancelou a exclusão.
                 */
                tblPacientes.clearSelection();
            }
        }
    }

    /*
  * Metodo atualizarTabela(), vai atualizar a tabela toda vez
  * que inserido, removido ou alterado dados de um aluno;
  */
  public void atualizarTabela(){
     
     /*
     * antes de atualizar a tabela é uma boa prática
     * verificar se a lista de alunos NÃO está vazia, pois,
     * se estiver vazia não precisamos atualizar.
     */     
     if(!listaPacientes.isEmpty()){
         
         /*
         * Como não está vazia, vamos criar um Aluno que será
         * será instanciado em cada ocorrência de aluno na lista,
         * isso dentro de um laço de repetição "for".
         */
         Paciente paciente;
         
         /*
         * Também é necessário recriar o tableModel, para limpar
         * os dados anteriores
         */
         tableModel = new DefaultTableModel(tableColumns, 0);
         
         /*
         * Agora vamos criar o for que vai repetir
         * até o tamanho da lista de alunos
         */
         for (int i = 0; i < listaPacientes.size(); i++) {
             
             /*
             * Instância de Aluno com os dados do aluno
             * de cada posição da lista
             */
             paciente = listaPacientes.get(i);
             
             /*
             * Agora vamos criar um vetor de String com cada um
             * dos valores dos atributos do aluno encontrado.
             * Vamos chamar de "rowData".
             */
             String[] rowData = {paciente.getNome(), paciente.getCpf(), paciente.getTelefone(), paciente.getData(), paciente.getEhPaciente(), paciente.getConsultaRealizada()};
             
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
         tblPacientes.setModel(tableModel);
     }else{
         /*
         * No caso de excluirmos o último aluno da lista
         * teremos de criar uma tableModel nova para "limpar
         * a tabela" e setar na tblAlunos.
         */
         tableModel = new DefaultTableModel(tableColumns, 0);
         tblPacientes.setModel(tableModel);
     }     
  }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPacientes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Paciente", "CPF", "Telefone", "Data", "Já é paciente", "Consulta Realizada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPacientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
        );

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Atualizar Tabela");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Finalizar consulta");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addGap(30, 30, 30)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(39, 39, 39)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        excluirPaciente(getPosicaoPaciente());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Cadastro telaCadastro = new Cadastro();
        telaCadastro.MostraTela(this);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.out.println(ListaPaciente.Listar().size()); 
        atualizarTabela();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        finalizarConsulta(getPosicaoPaciente());
    }//GEN-LAST:event_jButton4ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPacientes;
    // End of variables declaration//GEN-END:variables
}
