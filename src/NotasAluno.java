import java.util.Scanner;

public class NotasAluno {

	public static void main(String[] args) {
	
	Scanner leitor = new Scanner(System.in);
		
		float nota = 0;
		
		boolean continuar = false;
		
		int i= 0;
		
	do {
		System.out.println(" Informe a nota do " + (i+1) + "º aluno: ");
		
		nota = nota +leitor.nextFloat();
		
		i++;
		
		System.out.print("Deseja cadastar mais uma nota? true = SIM false = NÃO");
		continuar = leitor.nextBoolean();
	
	}while (continuar);
	
		System.out.println("A média da sala é: " +(float) (nota/i));
		
		leitor.close();


	}

}
