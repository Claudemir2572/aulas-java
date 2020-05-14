import java.util.Scanner;

public class MeuPrograma4 {
	public static void main(String[] args) {
		for (int i =0; i<=100; i++){
			verificaSePodeDirigir(i);
		}
	}
	
	//obs:  em orientado a objeto:
	// arquivo chamamos de de classe
	// função de método
	// variavel de atributo
	
	// verificaSePodeDirigir(int idade) é um método
	// um metodo seria a mesma coisa que uma função
	public static void verificaSePodeDirigir(int idade){
		if( idade>=18 ){
			System.out.println("Sua idade eh " + idade + " e voce pode dirigir");
		} else {
			System.out.println("Sua idade eh " + idade + " e voce nao pode dirigir");
		}
	}
	
}