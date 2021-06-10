/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author PICHAU
 */
public class PessoaDao implements Iterable<Pessoa> {
    
      private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public void adicionarPessoa(Pessoa p) {
        pessoas.add(p);
    }

    public ArrayList<Pessoa> getPessoa(String nome) {

        ArrayList<Pessoa> resultado = new ArrayList<Pessoa>();
        for (Pessoa pessoa : pessoas) {
            if(pessoa.getNome().toUpperCase().
                    contains(nome.toUpperCase())){
                resultado.add(pessoa);
            }
        }
        return resultado;

    }
    
    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }   
    
    public void ordenarPessoas() {
        Collections.sort(pessoas);
    }

    @Override
    public Iterator<Pessoa> iterator() {
        return pessoas.iterator();
    }
    
    
}
