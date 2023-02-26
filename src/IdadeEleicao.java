import java.util.Scanner;

public class IdadeEleicao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite sua idade:");
		
		int idade = sc.nextInt();
		
		if (idade<16){
			if (idade  >=18 && idade < 65) {
				System.out.println("Você tem que votar e embarcar");
			}
			else {
				System.out.println("Você pode votar se desejar (Pode embarcar)");
			}
		}
		else {
				System.out.println("Você ainda não pode votar!");
			}
		
		
		
		sc.close();

	}

}
