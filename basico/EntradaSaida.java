package cursoJava.basico;

import java.util.Scanner;

// para mostrar os comandos digite as letras iniciais e depois
// clique em control + space
public class EntradaSaida {

	public static void main(String[] args) {
		String nome,a;
		int  idade;
		double altura;
		Scanner leitor= new Scanner(System.in);
		// para importar o Scanner precione control + shift + O 
		 System.out.println("digite seu nome:");
		 // como é uma String a gente usa 
		 nome =leitor.nextLine();
		 
		 System.out.println("digite sua idade:");
		 idade = leitor.nextInt();
		 
		 
		 System.out.println("digite sua altura:");
		 altura =leitor.nextDouble();
		 

		 System.out.println("Seu nome: "+nome);
		 System.out.println("Sua idade: "+idade);
		 System.out.println("Sua altura: "+altura);
		 
		System.out.printf("Nome %s \nIdade %d \nAltura %f", nome, idade, altura);

	}

}
