/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex030317;

import java.util.ArrayList;

/**
 *
 * @author JBP1996 Atec
 */
public class Aluno {
    private String nome;
    private int nota;
    private String contacto;
    ArrayList[][] aluno;

    public Aluno() {
           aluno[0][0].add("Joaquim");
           aluno[0][1].add(15);
           aluno[0][2].add("915245415");
           
           aluno[1][0].add("Filipa");
           aluno[1][1].add(10);
           aluno[1][2].add("9124587963");
           
           aluno[2][0].add("Ruben");
           aluno[2][1].add(17);
           aluno[2][2].add("926524112");
           
           aluno[3][0].add("Raquel");
           aluno[3][1].add(14);
           aluno[3][2].add("9542147458");
           
           aluno[4][0].add("Mariana");
           aluno[4][1].add(9);
           aluno[4][2].add("123689643");
    }
    
    public void ordenar(){
        ArrayList temp = new ArrayList();
        for(int i=0;i<aluno[i].length;i++){
            System.out.println(i);
        }
    }
    
}
