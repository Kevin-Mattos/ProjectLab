/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1lab;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author PICHAU
 */
public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Angelo", 45);
        Pessoa p2 = new Pessoa("Kevin", 22);
        Pessoa p3 = new Pessoa("Lazaro Ramos", 33);
        
        PessoaDao dao = new PessoaDao();
        dao.adicionarPessoa(p1);
        dao.adicionarPessoa(p2);
        dao.adicionarPessoa(p3);
       
        dao.ordenarPessoassss();
       
        Iterator<Pessoa> iterador = dao.iterator();
       
        
        while(iterador.hasNext()) {
            System.out.println(iterador.next());
        }
        
     
    }
    
  
    
    
}
