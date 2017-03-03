/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex030317;

import java.util.Scanner;

/**
 *
 * @author JBP1996 Atec
 */
public class Ex030317 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //https://hackmd.io/s/S1i3EvV5e
        
        int opcao;
        String opcao2;
        Exer21 ex21 = new Exer21();
        Aluno al = new Aluno();
        do{
            System.out.println("Escolha qual o exercicio que deseja inserindo um valor:");
            System.out.println(" 1- Exercicio 1 Mostrar valores\n 2- Exercicio 1 - Inserir valores");
            System.out.println(" 3- Exercicio 2-\n 4- Exercicio 1 -\n");
            opcao = new Scanner(System.in).nextInt();
            System.out.println();
            switch(opcao){
                case 1: 
                    System.out.println("Os valores dentro da lista sao:");
                    ex21.mostrar();
                    break;
                case 2:
                    System.out.println("Insira o valor que deseja:");
                    String valor = new Scanner(System.in).nextLine();
                    ex21.inserir(valor);
                    break;
                case 3:
                    al.ordenar();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcao invalida, Tente navamente:");
                    break;
            }
            
            System.out.println("\n Deseja continuar ou sair?\n 1- Continuar\n outro valor- Sair");
            opcao2 = new Scanner(System.in).nextLine();
            System.out.println();
        }while(opcao2.equals("1"));
    }
}
