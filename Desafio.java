package tipos;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o seu nome: ");
		
		String nome = sc.nextLine();
		
		System.out.println("Digite o ano do seu nascimento:  ");
		
		int nascimento = sc.nextInt();
		
		System.out.println("Boa Noite, " + nome + "! Seu ano de nascimento é: " + nascimento);
		
		float anoNascimento = (float) 2023-nascimento;		

		System.out.println("Sua idade é  " + anoNascimento);		
		
		sc.close();		

	}

}
