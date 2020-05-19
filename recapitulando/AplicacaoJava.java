import dominio.Aluno;
import java.util.Scanner;

public class AplicacaoJava {
	
	public static void main(String[] args){
		
		Aluno alunos = null;
		alunos = new Aluno("Sem Nome",0,"Sem Cidade");
		Scanner scanner = new Scanner(System.in);
		int opcEscolhida =0;
		
		do {
				System.out.print("Escolha Uma Opçao.: "+
								"[1] Cadastrar: "+
								"[2] Exibir: "+
								"[3] Cidade: "+
								"[0] Sair: "+
								" ==>");
								
				opcEscolhida = scanner.nextInt();

				if (opcEscolhida == 1 ) {
					
					System.out.print("Digite Um Nome..: ");
					alunos = new Aluno (scanner.next());
					System.out.print("Digite Sua Idade..: ");
					alunos.setIdade(scanner.nextInt());
					System.out.print("Digite Sua Cidade.: ");
					alunos.setCidade(scanner.next());
					
		} else if ( opcEscolhida == 2 ){
			
					System.out.println(alunos.getNome());
					System.out.println(alunos.getIdade());
					System.out.println(alunos.getCidade());
			}
		}while (opcEscolhida != 0);
	}

}
	
