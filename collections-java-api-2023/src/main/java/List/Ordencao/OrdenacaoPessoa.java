package main.java.List.Ordencao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    //atributo

    private List<Pessoa> pessoaList;

   
    public OrdenacaoPessoa(){
        this.pessoaList = new ArrayList<>(); 
    }

    public void adicionarPessoa(String nome, int idade, double altura){
         pessoaList.add(new Pessoa(nome, idade, altura));
    }
   

    public List<Pessoa> ordenarPorIdade(){
      List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
      Collections.sort(pessoasPorIdade);
      return pessoasPorIdade;
    }

    public List<Pessoa> ordenarporAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Miguel", 17, 1.50);
        ordenacaoPessoa.adicionarPessoa("Carlos", 12, 1.70);
        ordenacaoPessoa.adicionarPessoa("Rafael", 14, 1.80);
        ordenacaoPessoa.adicionarPessoa("Daniel", 15, 1.85);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarporAltura());
    }
}
