package filmeflix;
import java.util.ArrayList;

public class Filme {
	
	private String titulo;
	private String diretor;
	private int anolancamento;
	private String genero;
	private ArrayList<Avaliacao> avaliacoes; 
	
	
	
	//Metodo construtor
	
	public Filme(String titulo, String diretor, int anolancamento, String genero) {
		this.titulo = titulo;
		this.diretor = diretor;
		this.anolancamento = anolancamento;
		this.genero = genero;
		this.avaliacoes = new ArrayList<>();
	}



	//Metodo Get e set
	
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public int getAnolancamento() {
		return anolancamento;
	}
	public void setAnolancamento(int anolancamento) {
		this.anolancamento = anolancamento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public ArrayList<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}
	public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
