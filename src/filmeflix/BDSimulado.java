package filmeflix;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BDSimulado {
	
	private ArrayList<Filme> filmes;
	private ArrayList<Usuario> usuarios;
	

	//Metodo construtot
	public BDSimulado(){
		//instanciar o atributo filmes
		
		this.filmes = new ArrayList<Filme>();
		
		//instanciar objetos da classe Filme
		
		Filme f1= new Filme("Star Wars", "Marcos Vinicius", 1977, "Ficção cientifica");
		Filme f2= new Filme("Star Wars: O Despertar da força", "Marcos Vinicius", 2015, "Ficção cientifica");
		Filme f3= new Filme("Forrest Gump", "Robert Zemeckis", 1994, "Drama");
		Filme f4= new Filme("Clube da Luta", "David Finchet", 1999, "Drama");
		Filme f5= new Filme("Os Outros", "Alejandro Amenábar", 2001, "Suspense");
		Filme f6= new Filme("Titanic", "James Cameron", 2001, "Romance");
		
		//Colocar os filmes na lista
		this.filmes.add(f1);
		this.filmes.add(f2);
		this.filmes.add(f3);
		this.filmes.add(f4);
		this.filmes.add(f5);
		this.filmes.add(f6);
		
		
		//Instanciar o atributo usuario
		this.usuarios = new ArrayList<Usuario>();
		
		//instanciar objetos da classe Usuario
		
		Usuario u1= new Usuario("Joao", "Masculino", 55);
		Usuario u2= new Usuario("José", "Masculino", 15);
		Usuario u3= new Usuario("Adão", "Masculino", 24);
		Usuario u4= new Usuario("Maria", "Feminino", 25);
		Usuario u5= new Usuario("Isabela", "Feminino", 51);
		Usuario u6= new Usuario("Vanessa", "Feminino", 45);
		
		
		//Colocar os usuarios na lista
		
		this.usuarios.add(u1);
		this.usuarios.add(u2);
		this.usuarios.add(u3);
		this.usuarios.add(u4);
		this.usuarios.add(u5);
		this.usuarios.add(u6);
		
		
		
		
		
	}


	public ArrayList<Filme> getFilmes() {
		return filmes;
	}


	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	
	
	//Metodo que retorna a lista de filmes de um ano informado
	
	public ArrayList<Filme> getfilmesPorAno(int ano){
		
		ArrayList<Filme> resultado= new ArrayList<Filme>();
		
		
		//Percorrer a lista de filmes 
		
		for (int i = 0; i < this.filmes.size(); i++) {
			//verificar se o filme é do ano informado
			if(this.filmes.get(i).getAnolancamento() == ano){
				resultado.add(this.filmes.get(i));
			}
			
		}
		return resultado;
		
		
		
	}
	
	//Metodo que retorna a lista de filmes de um diretor informado 
	
	public ArrayList<Filme> getFilmesPorDiretor(String diretor){
		
		ArrayList<Filme> resultado = new ArrayList<Filme>();
		
		//Percorrer a lista de filmes
		for (int i = 0; i < this.filmes.size(); i++) {
			//verificar se o filme é do diretor 
			if (this.filmes.get(i).getDiretor().equals(diretor)){
				resultado.add(this.filmes.get(i));
			}
		}
		return resultado;
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
