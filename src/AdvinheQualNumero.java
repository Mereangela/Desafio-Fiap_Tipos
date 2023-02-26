import java.util.Random;
import java.util.Scanner;

public class AdvinheQualNumero {

	public static void main(String[] args) {

		System.out.println("##Advinhe o número ##\n");

		Scanner sc = new Scanner(System.in);
		System.out.println("Qual seu nome:");
		String nome = sc.nextLine();
		System.out.println("Olá ," + nome);

		Scanner input = new Scanner(System.in);
		int lifes = 0;
		
	

		/* passo 1 : Gerar números aleatórios entre 0 e 99 com classe random */

		Random rmd = new Random();
		int numeroOculto = rmd.nextInt(100);

		/*
		 * passo 2: Gerar a quantidade de vidas\tentativas com limites que o usuário
		 * pode tentar
		 */

		int [] attempsUsed = new int [3];


		/*
		 * passo 3 Faça um laço de repetição que solicite ao usuário digitar um número
		 */

		do {
			try {

				System.out.println("Digite o número entre 0 e 99");
				int attemps = input.nextInt();
				
				if (attemps <0 || attemps >99) {
					System.out.println("Digite um numero valido de 0 até 99");
					
					for (lifes, lifes<=attemps.Used.length,lifes++) {
						attempsUsed[lifes] = attemps;
					}
						
					}else if (attemps < numeroOculto) {
						System.out.println("\nO número digitado é MENOR que o número oculto");
						
						for (lifes, lifes<=attemps.Used.length,lifes++) {
							attempsUsed[lifes] = attemps;
							
					}
					
				} else if (attemps  > numeroOculto) {
					System.out.println("\nO número digitado é MAIOR que o número oculto");
					
					for (lifes, lifes<=attemps.Used.length,lifes++) {
						attempsUsed[lifes] = attemps;
						
					}
					
				}else {
					
					lifes ++;
					System.out.println("\n Parabéns você acertou o número " + lifes + "vidas");
					attempsUsed[lifes] = attemps;
					break;
				}
						
				
			 catch (Exception e) {
				System.out.println("Digite o número válido");
			}
	

		} while (lifes <=attempsUsed.length);

		System.out.println("Suas tentativas esgotaram ! o numero " + " oculto era" + numeroOculto + "mas você digitou");
	}

}
