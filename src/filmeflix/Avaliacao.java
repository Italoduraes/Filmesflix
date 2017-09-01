package filmeflix;

public class Avaliacao {
	private Usuario usuario;
	private int nota;
	
	//Metodo construtor
	public Avaliacao(Usuario usuario, int nota) {
		this.usuario = usuario;
		this.nota = nota;
	}

	
	//Metodo get e set
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	
	

}
