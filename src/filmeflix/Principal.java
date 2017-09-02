package filmeflix;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		
		ArrayList<Filme> filmesPorAno = bds.getfilmesPorAno(2001);
		
        //imprimir 
		for (int i = 0; i < filmesPorAno.size(); i++) {
			System.out.println(filmesPorAno.get(i).getTitulo());
		}
		
		ArrayList<Filme> filmesPorDiretor = bds.getFilmesPorDiretor("Marcos Vinicius");
		
		for (int i = 0; i < filmesPorDiretor.size(); i++) {
			System.out.println(filmesPorDiretor.get(i).getTitulo());
		}
		

	}

}
