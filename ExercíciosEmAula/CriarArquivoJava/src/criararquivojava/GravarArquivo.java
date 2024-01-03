
package criararquivojava;
//importando a classe FileWriter
import java.io.BufferedWriter;
      import java.io.FileWriter; 
        
      //Importe a classe IOException para lidar com erros
      import java.io.IOException; 
        
      public class GravarArquivo {
          public static void main(String[] args)
          {
              try {
                  //sobrescrever escreve em cima
                 /* FileWriter Writer = new FileWriter("D:\\teste.txt");
                  Writer.write("Gravando dados no arquivo!");
                  Writer.close();
                  System.out.println("Sucesso ao gravar no arquivo.");*/
                 
                 
                 //escrever no final
                 BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\teste.txt", true));
                 writer.append("Senac\n");
                 writer.close();
                 
              }
              catch (IOException e) {
                  System.out.println("Ocorreu algum erro.");
              }
          }
      }
                          