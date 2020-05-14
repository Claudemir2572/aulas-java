import dominio.Aluno;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

// Scanner é uma classe
public class Programa {
	public static void main(String[] args) {
		
		int opcaoEscolhida = 0;
		
		// Este é um modelo de encapsulamento de dados ( que é o conceito de não expor diretamente os 
		// atributos para manipulação isso é chamado de encapsulamento)
				
		// Aluno alunoEntidade =  null está dizendo que a classe alunoEntidade é nula neste momento
		Aluno alunoEntidade =  null;

		List <Aluno> listaDeAlunos = new ArrayList<Aluno>();
		
		//a classe alunoEntidade está receb (instanciando)o construtor Aluno("sem nome",0,Sem cidade")
		alunoEntidade = new Aluno( "Sem nome", 0, "Sem cidade" );
		// System.in é passado como argumento (paramentro) que diz para classe que ira ler os 
		// dados de entrada
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			System.out.print("Escolha uma opcao:" +
								" [1] cadastrar" +
								" [2] exibir" +
								" [3] cidade" +
								" [0] sair" +
								" ==> ");
								
			opcaoEscolhida = scanner.nextInt();
			//System.out.println("    ### A opcao atual eh: " + opcaoEscolhida + " ### ");
			
			if ( opcaoEscolhida == 1 ) {
					System.out.print("Digite um nome: ");
					alunoEntidade = new Aluno (scanner.next());
				
					//System.out.print("Digite um nome: ");
					//alunoEntidade.setNome(scanner.next());
					System.out.print("Digite sua idade: ");
					alunoEntidade.setIdade(scanner.nextInt());
					System.out.print("Digite sua cidade: ");
					alunoEntidade.setCidade(scanner.next());
					
					listaDeAlunos.add(alunoEntidade);
					
					//alunoEntidade = new Aluno (scanner.next(), scanner.nextInt(), scanner.next());
					
					
			} else if ( opcaoEscolhida == 2) {
					//System.out.println(alunoEntidade.getNome());
					//System.out.println(alunoEntidade.getIdade());
					//System.out.println(alunoEntidade.getCidade());
					
					for(Aluno cadaAlunoDaLista : listaDeAlunos) {
						System.out.println(cadaAlunoDaLista.toString());
						//System.out.println(cadaAlunoDaLista.getNome());
					}
			} 

			
		}while(opcaoEscolhida!=0);
		
	}
}


