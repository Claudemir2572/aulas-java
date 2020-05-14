import java.util.Scanner;
public class PerguntaNome{
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	String nomeDaPessoa;
	
	System.out.println("Digite o Seu Nome.: ");
	nomeDaPessoa = scanner.next();
	System.out.println("Seu nome e..: " + nomeDaPessoa);
	}
}