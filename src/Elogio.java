import java.util.Scanner;

public class Elogio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String nome;
		int opcao = 0;
		
		System.out.println("Digite o nome da pessoa: ");
		nome = sc.nextLine();
		
		System.out.println("Digite a opção deseja: ");
		opcao = sc.nextInt();
				
		
		switch(opcao) {
		case 1:
			System.out.println(nome +", Você é tão atencioso (a).");
			break;
		case 2:
			System.out.println(nome +" , Você é muito bonito (a). ");
			break;
		case 3:
			System.out.println(nome + ", Você é bondoso (a).");
			break;
		default:
			System.out.print("\nOpção inválida, elogio não encontrado :(");
					
		}
		
		sc.close();
	}

}
