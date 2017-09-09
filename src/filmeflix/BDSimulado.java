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
		
		Usuario u1= new Usuario("123456","Joao", "Masculino", 55);
		Usuario u2= new Usuario("852177","José", "Masculino", 15);
		Usuario u3= new Usuario("132546","Adão", "Masculino", 24);
		Usuario u4= new Usuario("645616","Maria", "Feminino", 25);
		Usuario u5= new Usuario("641651","Isabela", "Feminino", 51);
		Usuario u6= new Usuario("254691","Vanessa", "Feminino", 45);
		
		
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
	
	//Metodo que retorna a lista de filmes de um genero informado 
	
	public ArrayList<Filme> getFilmesPorGenero(String genero){
		
		ArrayList<Filme> resultado= new ArrayList<Filme>();
		
		//Percorrer a lista de filmes
		
		//this.filmes* é para fazer a contagem na lista de filme (como ver na linha  16)
		for (int i = 0; i < this.filmes.size(); i++) {
			//verificar se o filme é do genero
			// .equals ou == * são a mesma coisa 
			if (this.filmes.get(i).getGenero().equals(genero)) {
				resultado.add(this.filmes.get(i));
			}
		}
		return resultado;
		
	}
	
	//Metodo que retorna a lista de filmes de nomes informado
	
	public ArrayList<Filme> getFilmesPorNomes(String nome){
		
		ArrayList<Filme> resultado= new ArrayList<Filme>();
		
		for (int i = 0; i < this.filmes.size(); i++) {
			if (this.filmes.get(i).getTitulo() == nome) {
				resultado.add(this.filmes.get(i));
			}
			
		}
		return resultado;
				
	}
	
	//Metodo que retorna o usuario de acordo com CPF
	
	public Usuario getUsuarioPorCPF (String CPF){
		
		Usuario resultado = null;
		
		//Percorrer a lista de usuarios 
		for (int i = 0; i < this.usuarios.size(); i++) {
			//verificar se o CPF corresponde ao CPF informado
			if (this.usuarios.get(i).getCPF().equals(CPF));{
				resultado = this.usuarios.get(i);
			}
			
		}
		return resultado;
		
	}
	
	// metodo que dá avaliaçao a um filme
	public void AddAvaliacaoFilme(String tituloFilme, String CPFUsuario, int notaFilme){
		//Declarar um objeto de avaliçao
		
		Avaliacao avaliaçao = new Avaliacao (getUsuarioPorCPF(CPFUsuario), notaFilme);
		
		//Percorrer a lista de filmes 
		for (int i = 0; i < this.filmes.size(); i++) {
			//verificar se é o filme com aquele nome
			if (this.filmes.get(i).getTitulo().equals(tituloFilme)){
				this.filmes.get(i).getAvaliacoes().add(avaliaçao);
			}
			
		}
	}
	
	
	//Metodo 
	
	public ArrayList<Filme> getBuscaNota(int notaDoFilme){
		
		ArrayList<Filme> resultado = new ArrayList<Filme>();
		
		for (int i = 0; i < this.filmes.size(); i++) {
			for (int j = 0; j < this.filmes.get(i).getAvaliacoes().size(); j++) {
				if (this.filmes.get(i).getAvaliacoes().get(j).getNota() >= 4){
					resultado.add(this.filmes.get(i));
			}
			
			}
		}
		return resultado;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
