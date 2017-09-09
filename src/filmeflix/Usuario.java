package filmeflix;

public class Usuario {
	private String CPF;
	private String nome;
	private String sexo;
	private int idade;
	
	//Metodo construtor
	public Usuario(String CPF, String nome, String sexo, int idade) {
		this.CPF = CPF;
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}

	// sobreescrever metodo toString
	
	public String toString(){
		return "CPF: " + this.CPF + "\n" + 
				"Nome: " + this.nome + "\n" +
	           "Sexo: " + this.sexo + "\n" +
				"Idade: " + this.idade + "\n" ;
	}
	 
	
	//Metodo get e set
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	

}
