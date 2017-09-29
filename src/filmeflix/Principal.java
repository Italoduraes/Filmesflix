package filmeflix;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
	
		// Instanciar o BDSimulado
		
		BDSimulado bds= new BDSimulado();
		
		//Instanciar a lista de filmes e usuarios
		ArrayList<Filme> filmes = bds.getFilmes();
		ArrayList<Usuario> usuarios = bds.getUsuarios();
		
		//Exibindo filmes que foram feitos depois do ano 2000
		
		for ( int i=0; i<filmes.size();i++) {
			if (filmes.get(i).getAnolancamento() > 2000){
				//System.out.println(filmes.get(i).getTitulo() + " / " + filmes.get(i).getGenero() + "\n");
			}
		}
		
		
		
		// Exibindo filmes por ano específico 
		
		ArrayList<Filme> filmesPorAno = bds.getfilmesPorAno(2001);
		
        //imprimir 
		for (int i = 0; i < filmesPorAno.size(); i++) {
			//System.out.println(filmesPorAno.get(i).getTitulo() + "\n");
		}
		
		// Exinbindo filmes por diretor informado
		
		ArrayList<Filme> filmesPorDiretor = bds.getFilmesPorDiretor("Marcos Vinicius");
		
		//imprimir
		
		for (int i = 0; i < filmesPorDiretor.size(); i++) {
		//	System.out.println(filmesPorDiretor.get(i).getTitulo() + "\n");
		}
		

		//Exinbindo filmes por genero informado
		
		 
		//o bds.* é uma instacia da clas *BDSimulado  	
		
		ArrayList<Filme> filmesPorGenero = bds.getFilmesPorGenero("Drama");
		
		//Imprimir 
		
	    for (int i = 0; i < filmesPorGenero.size(); i++) {
			//System.out.println(filmesPorGenero.get(i).getTitulo() + "\n");
		}
	    
	    
	    //Exinbindo filmes por nomes 
	    
	    ArrayList<Filme> filmesPorNomes = bds.getFilmesPorNomes("Star Wars");
	    
	    // Imprimir
	    
	    for (int i = 0; i < filmesPorNomes.size(); i++) {
			//System.out.println(filmesPorNomes.get(i).getDiretor() + " - " + filmesPorNomes.get(i).getGenero() + " - " + 
			//		filmesPorNomes.get(i).getAnolancamento());
		}
	    
	    
	    //Usuario por CPF
	    
	    Usuario usuario= bds.getUsuarioPorCPF("132546");
	    
	    System.out.println(usuario);
  
	    
	    //criar 5 avaliacoes para os filmes 
	    
	    
	    bds.AddAvaliacaoFilme("Os Outros", "123456", 2);
	    bds.AddAvaliacaoFilme("Titanic", "852177", 5);
	    bds.AddAvaliacaoFilme("Forrest Gump", "132546", 3);
	    bds.AddAvaliacaoFilme("Star Wars", "645616", 5);
	    bds.AddAvaliacaoFilme("Clube da Luta", "641651", 1);
	    
	    
	    
	    //imprimir titulo dos filmes  com avaliacao >=4
	    
	    ArrayList<Filme> NotasMaiores = bds.getBuscaNota(4);
	    
	    
	     for (int i = 0; i < NotasMaiores.size(); i++) {
			// System.out.println(NotasMaiores.get(i).getTitulo());
		}
	     
	     
	   
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
