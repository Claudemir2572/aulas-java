import java.util.Scanner;

public class VerSePodeDirigir{
	public static void main(String[] args){
		for (int i = 0; i<=100; i++){
			verificaSePodeDirigir(i);
		}
	}
	
	public static void verificaSePodeDirigir(int idade){
			if( idade>=18){
					System.out.println(" Sua Idade e..: " + idade + " E Voce Pode Dirigir");
			} else{
					System.out.println(" Sua Idade e...: " + idade + " E Voce Nao Pode Dirigir ");
			}
				
	
	}
}

