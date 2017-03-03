/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex030317;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JBP1996 Atec
 */
public class Exer21 {
    ArrayList<Object> lista = new ArrayList<>();
    public Exer21(){
        lista.add('b');
        lista.add(3);
        lista.add("Carruagens");
        lista.add(8.56);
        lista.add("caixas de armazenamento");
    }
    
    public void mostrar(){
        for(int i=0;i<lista.size();System.out.println(lista.get(i)),i++);
    }
    
    public void inserir(String valor){
        lista.add(valor);
        System.out.println("Valor inserido com sucesso");
    }
}
