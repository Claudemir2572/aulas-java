import java.util.Scanner;

public class ContadorIdade{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int idade;
		System.out.println("DIGITE A SUA IDADE.: !! ");
		
		for (int i = 0; i<= 100; i++){
			System.out.print("SUA IDADE E..: !!! " + i);
			
			if(i >= 18){
					System.out.println(" Voce Pode Dirigir !!! ");
			} else {
					System.out.println(" Voce Nao Pode Dirigir !!! ");
			}
		}
	}
}