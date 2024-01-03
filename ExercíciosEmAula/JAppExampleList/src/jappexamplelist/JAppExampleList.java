package jappexamplelist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JAppExampleList {

    public static void main(String[] args) {
        //* 1o. passo: definir a lista que vamos armazenar os nomes
        List<String> namesList = new ArrayList<>();

        //2o. passo: criar a variável que controla a parada da nossa aplicação.
        //* A opção que vai ser digitada pelo usuário
        int option = 0;

        //3°.passo: Criação do objeto "Keyboard" que vai capturar tudo o que for digitado
        Scanner Keyboard = new Scanner(System.in);

        //4° passo: criar a estrutura de repetição que vai manter nossa aplicação funcionando
        do {

            //5°passo: Exibir as opções para o usuário poder escolher
            System.out.println("\nTrabalhando com List\n");
            System.out.println("1.Inserir nome:");
            System.out.println("2.Verificar nome:");
            System.out.println("3.Remover nome:");
            System.out.println("4.Listar todos os nomes:");
            System.out.println("5.Sair:");

            //6°.passo: ler a opção digitada pelo usuário:
            System.out.println("Digite sua opção [1 a 5]: ");
            option = keyboard.nextInt();

            //7°passo: criar o seletor da opção digitada pelo usuário
            switch (option) {
                case 1:
                    //aqui iremos inserir um novo nome
                    System.out.println("\nINSERIR NOME\n");
                    /*Para inserir o nome na lista vamos recorrer ao método "add(String name)" 
                 passando como parâmetro a string digitada pelo usuário; como esse método 
                 retorna true " se inserido" e false "se não inserido". Vamos aproveitar
                 para emitir uma mensagem de inserido com sucesso ou não.
                 Para termos um certo padrão vamos deixar os nomes com todas as letras maíuscular usando o 
                 método toUppercase().
                     */
                    System.out.println("Digite o nome: ");
                    boolean itsInserted = nameList.add(keyboard.next().toUpperCase());
                    if (itsInserted) {
                        //se itsInserted = true
                        System.out.println("Nome inserido");
                    } else {
                        //se itsInserted =false
                        System.out.println("FALHA! Nome não inserido. ");
                    }
                    break;

                case 2:
                    //Aqui vamos buscar um nome na Lista;
                    System.out.println("\nVERIFICAR NOME\n");

                    /*Aqui vamos buscar por um nome na lista, mas é conveniente antesa de fazer isso, 
                 verificar se a lista está vazia. Para isso utilizaremos o método isEmpty() que retorna
                 true se a lista está vazia e false se contÊm 1 ou mais elementos.
                     */
                    if (namesList.isEmpty()) {
                        //se true exibe mensagem de lista vazia.
                        System.out.println("ATENÇÃO! Não há nomes na lista.");
                    } else {
                        /*se false, precisamos pedir para o usuário o nome a ser procurado na 
                     lista. Podemos utilizar 2 métodos: o contains (Object o) o equals(Object o).
                     Como nossa lista é uma lista de String nosso objeto é uma String;
                     Como armazenamos os nomes com todas as letras em maíuculos devemos procurar 
                     com as letrs todos em maíusculo. Aqui vamos criar uma variável para armazenar o nome a ser encontrado.*/
                        System.out.println("Digite o nome a ser localizado: ");
                        String name = keyboard.next().toUpperCase();

                        if (namesList.contains(name)) {
                            /*se true foi encontrado, 
                         podemos exibir o nome e a posição que foi foi encontrado, para isso utilizamos o método indexOfObject(Object o) que 
                         retorna a posição que o nome foi encontrado. Lembre-se que o nome está na variável name;*/

                            int position = namesList.indexOf(name);
                            System.out.println("Nome: " + name + " | Posição: " + position + "da lista");

                        } else {
                            //se false não fo encontrado
                            System.out.println("ATENÇÃO! Nome não encontrado na lista.");
                        }

                    }
                    break;
                case 3:

            }

        }
    }

}
