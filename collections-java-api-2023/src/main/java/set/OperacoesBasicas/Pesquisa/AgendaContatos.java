package main.java.set.OperacoesBasicas.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributos
    private Set<Contato> contatoSet;

    public AgendaContatos(Set<Contato> contatoSet){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
       Set<Contato> contatosPorNome = new HashSet<>();
       for(Contato c : contatoSet){
        if(c.getNome() .startsWith(nome)){
            contatosPorNome.add(c);
        }
       }
       return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
               c.setNumero(novoNumero);
               contatoAtualizado = c;
               break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args){
        AgendaContatos agendaContatos = new AgendaContatos(null);


        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("David", 87114589);
         agendaContatos.adicionarContato("David", 0);
         agendaContatos.adicionarContato("David Daniel", 87595140);
         agendaContatos.adicionarContato("Daniel", 45549812);
         agendaContatos.adicionarContato("Maria de Lourdes", 86656547);

         agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("David Daniel"));

        System.out.println("Contato atualizado" + agendaContatos.atualizarNumeroContato("Maria de Lourdes", 44444444));

        agendaContatos.exibirContatos();
    }

    
}
