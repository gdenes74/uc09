
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainScreen extends javax.swing.JFrame {
    
    /**
     * Creates new form MianScreen
     */
  /**
   * Passo A.1
   * Definição do vetor com os títulos de cada coluna da tabela
   */
    private final String[] tableColumns = {"Nome","Email", "Idade"};
    
    /**
     * Passo A.2
     * Definição do table model que vai conter a nossa lista de alunos
     * o primeiro parâmetro é nosso vetor com os títulos das colunas
     * e o segundo parâmetro é o índice da linha que se quer exibir os títulos
     * Nesse caso na primeira linha.
     */
    DefaultTableModel tableModel = new DefaultTableModel(tableColumns, 0);
    
    /**
     * Passo c.
     * Definição do vetor com os títulos de cada coluna da tabela
    */
    private List <Aluno> alunosList = new ArrayList<>();
    
    public MainScreen() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlEntrada = new javax.swing.JPanel();
        lblEntNome = new javax.swing.JLabel();
        lblEntEmail = new javax.swing.JLabel();
        lblEntIdade = new javax.swing.JLabel();
        txtEntNome = new javax.swing.JTextField();
        txtEntEmail = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnEntIdade = new javax.swing.JFormattedTextField();
        btnExcluir = new javax.swing.JButton();
        pnlSaida = new javax.swing.JPanel();
        jspTabela = new javax.swing.JScrollPane();
        tblAlunos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlEntrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Entrada de Dados"));

        lblEntNome.setText("Nome:");

        lblEntEmail.setText("Email:");

        lblEntIdade.setText("Idade:");

        txtEntEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntEmailActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnEntIdade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEntradaLayout = new javax.swing.GroupLayout(pnlEntrada);
        pnlEntrada.setLayout(pnlEntradaLayout);
        pnlEntradaLayout.setHorizontalGroup(
            pnlEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEntradaLayout.createSequentialGroup()
                        .addComponent(lblEntNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEntNome))
                    .addGroup(pnlEntradaLayout.createSequentialGroup()
                        .addComponent(lblEntIdade)
                        .addGap(18, 18, 18)
                        .addComponent(btnEntIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlEntradaLayout.createSequentialGroup()
                        .addComponent(lblEntEmail)
                        .addGap(18, 18, 18)
                        .addComponent(txtEntEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)))
                .addGap(12, 12, 12)
                .addGroup(pnlEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir))
                .addGap(99, 99, 99))
        );
        pnlEntradaLayout.setVerticalGroup(
            pnlEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlEntradaLayout.createSequentialGroup()
                        .addGroup(pnlEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEntNome)
                            .addComponent(txtEntNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEntEmail))
                    .addGroup(pnlEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEntEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExcluir)))
                .addGap(9, 9, 9)
                .addGroup(pnlEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEntIdade)
                    .addComponent(btnEntIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pnlSaida.setBorder(javax.swing.BorderFactory.createTitledBorder("Saída"));

        tblAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Email", "Idade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jspTabela.setViewportView(tblAlunos);

        javax.swing.GroupLayout pnlSaidaLayout = new javax.swing.GroupLayout(pnlSaida);
        pnlSaida.setLayout(pnlSaidaLayout);
        pnlSaidaLayout.setHorizontalGroup(
            pnlSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSaidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlSaidaLayout.setVerticalGroup(
            pnlSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSaidaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jspTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(pnlEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEntEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntEmailActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        {//GEN-FIRST:event_btnSalvarActionPerformed
      // TODO add your handling code here:
      
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
      if(!emptyFields()){
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
          txtEntNome.setText("");
          txtEntEmail.setText("");
          btnEntIdade.setText("");
          
          txtEntNome.requestFocus(); 
      }
   
    }//GEN-LAST:event_btnSalvarActionPerformed
    }
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluirAluno(getPosicaoAluno());
    }//GEN-LAST:event_btnExcluirActionPerformed


    public static void main(String args[]) {

    
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
   
           }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField btnEntIdade;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JScrollPane jspTabela;
    private javax.swing.JLabel lblEntEmail;
    private javax.swing.JLabel lblEntIdade;
    private javax.swing.JLabel lblEntNome;
    private javax.swing.JPanel pnlEntrada;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlSaida;
    private javax.swing.JTable tblAlunos;
    private javax.swing.JTextField txtEntEmail;
    private javax.swing.JTextField txtEntNome;
    // End of variables declaration//GEN-END:variables
/*
    * Metodo emptyFields(), retorna "true" quando qualquer um dos campos
    * estiver vazio e "false" quando todos estiverem preenchidos.   
  */
  private boolean emptyFields(){
     /*
      * Variável empty assume “true” por padrão e só vai mudar o seu estado
      * após verificarmos se todos os campos estão preenchidos. É ela que
      * retornamos ao final do método.
     */
     boolean empty = true; 
     
     /*
     * Agora vamos testar campo a campo e exibir avisos caso encontre
     * algum campo vazio.
     */
     
     if(txtEntNome.getText().trim().isEmpty()){
         /*
         * se o campo txtNome estiver vazio exibimos a mensagem
         * de campo vazio. Caso contrário testamos o próximo
         */
         JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Nome não pode ser vazio.");
     } else if(txtEntEmail.getText().trim().isEmpty()){
         /*
         * se o campo txtEmail estiver vazio exibimos a mensagem de campo
         * vazio. Caso contrário testamos o próximo campo.
         */
          JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Email não pode ser vazio.");
     } else if(btnEntIdade.getText().trim().isEmpty()){
         /*
          * se o campo txtIdade estiver vazio exibimos a mensagem de campo
          * vazio. Caso contrário testamos o próximo campo.
         */
          JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Idade não pode ser vazio.");
     } else{
         /*
         * se cairmos nessa condição é porque não existem campos vazios,
         * logo, a variável "empty" deve mudar seu valor para "false".
         */
         empty = false;
     }
     
     
     /*
      * Aqui retornamos a variável "empty"  
     */
     return empty;
  }
  
  
  /*
  * Metodo getAluno(), retorna um aluno
  * com valor em todos os atributos
  */
  private Aluno getAluno(){
     
     /*
     * Criação de objeto Auno, ou seja, uma instância de Aluno
     */
     Aluno aluno = new Aluno();
     
     /*
     * Agora que temos um objeto aluno, vamos atribuir os valores
     * que foram digitados nos campos de texto. Nome, email e idade.
     * Para "nome", vamos deixar todas as letras em maiúsculo. Para
     * "email", vamos deixar todas as letras em minúsculo. Para idade, é
     * preciso, converter para inteiro;
     */
     aluno.setNome(txtEntNome.getText().toUpperCase());
     aluno.setEmail(txtEntEmail.getText().toLowerCase());
     aluno.setIdade(Integer.parseInt(btnEntIdade.getText()));
     
     /*
      * Aqui retornamos o objeto "aluno"  
     */
     return aluno;
  }
  
  
   /*
  * Metodo inserirAluno(Aluno aluno), insere o aluno
  * na lista de alunos
  */
  private void inserirAluno(Aluno aluno){
     
     /*
     * Inserir o aluno na lista
     */
     alunosList.add(aluno);
     
  }

  /*
  * Metodo atualizarTabela(), vai atualizar a tabela toda vez
  * que inserido, removido ou alterado dados de um aluno;
  */
  private void atualizarTabela(){
     
     /*
     * antes de atualizar a tabela é uma boa prática
     * verificar se a lista de alunos NÃO está vazia, pois,
     * se estiver vazia não precisamos atualizar.
     */     
     if(!alunosList.isEmpty()){
         
         /*
         * Como não está vazia, vamos criar um Aluno que será
         * será instanciado em cada ocorrência de aluno na lista,
         * isso dentro de um laço de repetição "for".
         */
         Aluno aluno;
         
         /*
         * Também é necessário recriar o tableModel, para limpar
         * os dados anteriores
         */
         tableModel = new DefaultTableModel(tableColumns, 0);
         
         /*
         * Agora vamos criar o for que vai repetir
         * até o tamanho da lista de alunos
         */
         for (int i = 0; i < alunosList.size(); i++) {
             
             /*
             * Instância de Aluno com os dados do aluno
             * de cada posição da lista
             */
             aluno = alunosList.get(i);
             
             /*
             * Agora vamos criar um vetor de String com cada um
             * dos valores dos atributos do aluno encontrado.
             * Vamos chamar de "rowData".
             */
             String[] rowData = {aluno.getNome(), aluno.getEmail(), String.valueOf(aluno.getIdade())};
             
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
         tblAlunos.setModel(tableModel);
     }else{
         /*
         * No caso de excluirmos o último aluno da lista
         * teremos de criar uma tableModel nova para "limpar
         * a tabela" e setar na tblAlunos.
         */
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
        if (posicaoAluno >= 0) {
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
                alunosList.remove(posicaoAluno);
                atualizarTabela();
            }else{
                tblAlunos.clearSelection();
            }
        }
    }             
                
                
}