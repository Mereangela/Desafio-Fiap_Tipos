import java.util.Scanner;

public class Enquanto {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int op = 0;
		
		do {
			
			System.out.println("Cadastrei!");
			
			System.out.println("Deseja cadastrar outro? 1 - SIM - 2 - NÃO");
			op = leitor.nextInt();
		
		}while (op == 1);
		
		System.out.println("Cadastro realizado com sucesso!\nEncerrando o programa");
		
		leitor.close();

	}

}
