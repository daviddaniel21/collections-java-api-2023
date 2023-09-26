package main.java.set.OperacoesBasicas.OpercoesBasiccas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
  //atributo
private Set<Convidado> convidadoSet;

public ConjuntoConvidados(Set<Convidado> convidadoSet){
    this.convidadoSet = new HashSet<>();
}

public void adicionarConvidado(String nome, int codigoConvite){
    convidadoSet.add(new Convidado(nome, codigoConvite));
}

public void removerConvidadoporCodigoConvite(int codigoConvite){
    Convidado convidadoParaRemover = null;
    for(Convidado c : convidadoSet){
        if(c.getCodigoConvite() == codigoConvite){
            convidadoParaRemover = c;
            break;
        }
    }
    convidadoSet.remove(convidadoParaRemover);
}

public int contarConvidados(){
    return convidadoSet.size();
}

public void exibirConvidados(){
    System.out.println(convidadoSet);
}

public static void main(String[] args){
    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados(null);
    System.out.println("Existem "  + conjuntoConvidados.contarConvidados()  + " convidados dentro do Set de Convidados");

  conjuntoConvidados.adicionarConvidado("Convidado 1" , 1589);
  conjuntoConvidados.adicionarConvidado("Convidado 2" , 1589);
  conjuntoConvidados.adicionarConvidado("Convidado 3" , 1452);
  conjuntoConvidados.adicionarConvidado("Convidado 4" , 1025);

  System.out.println("Existem "  + conjuntoConvidados.contarConvidados()  + " convidados dentro do Set de Convidados");

 conjuntoConvidados.removerConvidadoporCodigoConvite(1452);
 System.out.println("Existem "  + conjuntoConvidados.contarConvidados()  + " convidados dentro do Set de Convidados");

 conjuntoConvidados.exibirConvidados();

  }
}
