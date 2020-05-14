import java.util.Scanner;

public class MeuPrograma {
	public static void main(String[] args) {
        // Scaner é o tipo de variavél
		//Scanner é uma classe da biblioteca JAVAUtil que pega dados digitados
		//scanner é uma variavel / atributo
		// new estancia uma variavel com tipo
		Scanner scanner = new Scanner(System.in);
		
		String nomeDaPessoa;
		
		// System é uma classe do java.
		// pintln mostra na tela e pula para linha de baixo
		System.out.println("Digite seu nome");
		
		//scanner.next() pega o conteudo digitado e grava na nomeDaPessoa
		// nomeDaPessoa é uma 
		nomeDaPessoa = scanner.next();
		
		System.out.println("Seu nome eh " + nomeDaPessoa);
	}
}