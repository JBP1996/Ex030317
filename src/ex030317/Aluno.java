/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex030317;

import java.util.ArrayList;
import java.util.Stack;
import java.util.TreeSet;

/**
 *
 * @author JBP1996 Atec
 */
public class Aluno {
    
    private String nome;
    private int nota;
    private String contacto;
    
    public Aluno(){
        setAluno("Ruben",16,"9154254652");
        setAluno("Fred",17,"915441652");
        setAluno("Maria",12,"965214252");
        setAluno("Filipa",14,"911234652");
        setAluno("Rafael",18,"925488244");
    }
    
    public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }

    public String getContacto() {
        return contacto;
    }

    public void setAluno(String nome,int nota,String contacto){
        this.nome=nome;
        this.nota=nota;
        this.contacto=contacto;
        nAluno.add(getNome()+" "+getNota()+" "+getContacto());
    }
    
    ArrayList<Object> nAluno= new ArrayList<>();    
    
    public void ordenar(){
        Stack a = new Stack();
   
        for(int i=0;i<nAluno.size();i++){
            System.out.println(nAluno.get(i));
        }
        
        for(int i=0;i<nAluno.size();i++){
            int numero=Integer.parseInt(String.valueOf(nAluno.get(i)).substring(String.valueOf(nAluno.get(i)).indexOf(" ")+1,String.valueOf(nAluno.get(i)).lastIndexOf(" ")));
            if(i==0){
               a.push(numero); 
            }else{
                //System.out.println("aa"+Integer.parseInt(String.valueOf(a.get(i-1))));
                int nTroca=Integer.parseInt(String.valueOf(a.get(i-1)));
                if(nTroca<numero){
                    for(int x=i;x<a.size();x++){

                    }
                    a.add(0,numero);
                }else{
                    a.add(numero);
                }
            }
            
            //a.push(Integer.parseInt(String.valueOf(nAluno.get(i)).substring(String.valueOf(nAluno.get(i)).indexOf(" ")+1,String.valueOf(nAluno.get(i)).lastIndexOf(" "))));
            
        }
        
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
        
        /*
        for(int i=0;i<nAluno.size();i++){
            System.out.println(nAluno.get(i));
        }
        */
    }
    
}
