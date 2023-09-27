package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atrtibuto
    private Map<String, Integer> agendaConatoMap;

    public AgendaContatos(){
        this.agendaConatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaConatoMap.put(nome, telefone);
    }


    public void removerContato(String nome){
        if(agendaConatoMap.isEmpty()){
            agendaConatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaConatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaConatoMap.isEmpty()){
           numeroPorNome = agendaConatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();


        agendaContatos.exibirContatos();

         agendaContatos.adicionarContato("David", 87114589);
         agendaContatos.adicionarContato("David", 78521575);
         agendaContatos.adicionarContato("David Daniel", 87595140);
         agendaContatos.adicionarContato("Daniel", 45549812);
         agendaContatos.adicionarContato("Maria de Lourdes", 86656547);

         agendaContatos.exibirContatos();

         agendaContatos.removerContato("David Daniel");
         agendaContatos.exibirContatos();

         System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Maria de Lourdes"));
    }
}
