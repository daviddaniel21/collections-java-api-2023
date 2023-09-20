package main.java.List.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
  //atributo
 private List<Livro> livroList;
 
 public CatalogoLivros(){
    this.livroList = new ArrayList<>();
 }

 public void adicionarLivro(String titulo, String autor, int anoPublicacao){
    livroList.add(new Livro(titulo, autor, anoPublicacao));
 }

 public List<Livro> pesquisarPorAutor(String autor){
    List <Livro> livrosPorAutor = new ArrayList<>();
      if(!livroList.isEmpty()) {
         for(Livro l : livroList){
            if(l.getAutor().equalsIgnoreCase(autor)){
                livrosPorAutor.add(l);
            }
         }
      }
      return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
         List <Livro> livrosPorIntevaloAnos = new ArrayList<>();
         if(!livroList.isEmpty()) {
            for (Livro l : livroList){
                if(l.getanoPublicacao() >= anoInicial && l.getanoPublicacao() <= anoFinal){
                    livrosPorIntevaloAnos.add(l);
                }
            }
         }
          return livrosPorIntevaloAnos;
     }
    
     public Livro pesquisarPorTitulo (String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
           for(Livro l : livroList){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                livroPorTitulo = l;
                break;
            }
           }
        }
        return livroPorTitulo;
     }

     public static void main(String[] args){
      CatalogoLivros catalogoLivros = new CatalogoLivros();
      catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2010);
      catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2000);
      catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2021);
      catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 1999);
      catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2005);

      System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
      System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2000, 2021));
      System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
     }
}
