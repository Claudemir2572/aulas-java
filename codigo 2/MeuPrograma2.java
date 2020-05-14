import java.util.Scanner;

public class MeuPrograma2 {
	public static void main(String[] args) {
        // Scaner é o tipo de variavél
		//Scanner é uma classe da biblioteca JAVAUtil que pega dados digitados
		//scanner é uma variavel / atributo
		// new estancia uma variavel com tipo
		Scanner scanner = new Scanner(System.in);
		
		int idade;
		 
		// System é uma classe do java.
		// pintln mostra na tela e pula para linha de baixo
		System.out.println("Digite a sua idade ");
		
		//scanner.next() pega o conteudo digitado e grava na nomeDaPessoa
		// nomeDaPessoa é uma 
		idade = scanner.nextInt();
		
		System.out.println("Sua idade eh  " + idade);
		
		//if(condicao)
		if( idade>=18 ){
			//caso verdadeiro
			System.out.println("e voce pode dirigir");
		} else {
			System.out.println("e voce nao pode dirigir");
			//caso falso
		}
		
	}
}