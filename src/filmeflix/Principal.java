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
				System.out.println(filmes.get(i).getTitulo() + " / " + filmes.get(i).getGenero() + "\n");
			}
		}
		
		
		
		// Exibindo filmes por ano específico 
		
		ArrayList<Filme> filmesPorAno = bds.getfilmesPorAno(2001);
		
        //imprimir 
		for (int i = 0; i < filmesPorAno.size(); i++) {
			System.out.println(filmesPorAno.get(i).getTitulo() + "\n");
		}
		
		// Exinbindo filmes por diretor específico
		
		ArrayList<Filme> filmesPorDiretor = bds.getFilmesPorDiretor("Marcos Vinicius");
		
		//imprimir
		
		for (int i = 0; i < filmesPorDiretor.size(); i++) {
			System.out.println(filmesPorDiretor.get(i).getTitulo() + "\n");
		}
		
		//Filmes por genero e por nomes 
	
		
		
		//Exinbindo filmes por genero específico
		
		
		//o bds.* é uma instacia da clas *BDSimulado  	
		
		ArrayList<Filme> filmesPorGenero = bds.getFilmesPorGenero("Drama");
		
		//Imprimir 
		
	    for (int i = 0; i < filmesPorGenero.size(); i++) {
			System.out.println(filmesPorGenero.get(i).getTitulo() + "\n");
		}
	    
	    
	    //Exinbindo filmes por nomes 
	    
	    ArrayList<Filme> filmesPorNomes = bds.getFilmesPorNomes("Clube da Luta");
	    
	    // Imprimir
	    
	    for (int i = 0; i < filmesPorNomes.size(); i++) {
			System.out.println(filmesPorNomes.get(i).getDiretor() + " - " + filmesPorNomes.get(i).getGenero() + " - " + 
					filmesPorNomes.get(i).getAnolancamento());
		}
	    
	    
	    
	    
	    
  
	    
	    

	}

}
