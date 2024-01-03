
package criararquivojava;

import java.io.File;
import java.io.IOException;


public class CriarArquivoJava {

    //ou criar um metodo criarArquivo() para colocar no objeto recebido
    // private static String caminho = "D:\\teste.txt";
    public static void main(String[] args) {
        try{
            File obj = new File("D:\\teste.txt");
            if (obj.createNewFile()){
                System.out.println("Arquivo criado: " + obj.getName());
            }else{
                System.out.println("Arquivo já existe: ");
            }
        }catch(IOException e ){
            System.out.println("Ocorreu um erro. " + e.getMessage());
        }
    }
    
}
