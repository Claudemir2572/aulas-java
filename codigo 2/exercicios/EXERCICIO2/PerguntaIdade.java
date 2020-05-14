import java.util.Scanner;

public class PerguntaIdade{
		public static void main(String[] args){
		
			Scanner scanner = new Scanner(System.in);
		
			int idade;
		
			System.out.println(" Digite a Sua Idade..: ");
		
			idade = scanner.nextInt();
		
			System.out.println(" A Sau Idade e..: " + idade);
		
			if ( idade >= 18 ){
			
				System.out.println(" Voce Pode Dirigir !!");
				
			} else{
				
				System.out.println(" Voce Nao Pode Dirigir !!!");
				
				}
		
		}
}