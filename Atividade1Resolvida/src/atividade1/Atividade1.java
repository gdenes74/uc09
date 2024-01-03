
package atividade1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Atividade1 {

    public static void main(String[] args) {      
          //criando Janela, 
          JFrame janela = new JFrame();
          janela.setSize(300, 100);
          janela.setTitle("MVP- Projeto");
          janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          janela.setLayout(new FlowLayout());
          
          //criando label-texto, textinho
          JLabel venda = new JLabel();
          venda.setText("Informe o valor da venda:");
          janela.add(venda);
                              
          //criando campo de entrada
          JTextField campoValor = new JTextField(10);
          janela.add(campoValor);
          
         //criando botão
         JButton botao = new JButton();
         botao.setText("Enviar");
         janela.add(botao);
          
           botao.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e) {
             double valor = Double.parseDouble(campoValor.getText());
             
             
             if (Double.parseDouble(campoValor.getText())>500){
              double porcentagem = Double.parseDouble(JOptionPane.showInputDialog("Informe um desconto em porcentagem"));
              
              double valorTotal = valor -(valor * porcentagem/100);
              JOptionPane.showMessageDialog(janela, "Valor da venda é de: R$ " + valorTotal);   
             }else{
                 JOptionPane.showMessageDialog(janela, "Valor da venda é de: R$ " + valor);
             }
             
             
             
      }
  });              
          
          
          janela.setVisible(true);
      }
  
              
    }
    

