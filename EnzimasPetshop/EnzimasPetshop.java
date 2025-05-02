import java.util.Scanner;

public class EnzimasPetshop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char resp = 'S';
		System.out.println("==== ENZIMA'S PETSHOP ====");
		do {
			Animal x = new Animal();
			System.out.print("Digite o nome de seu animal: ");
			x.nome = sc.nextLine();
			System.out.print("Digite o tipo de seu animal: ");
			x.tipo = sc.nextLine();
			System.out.print("Digite a idade de seu animal: ");
			x.idade = sc.nextInt();
			sc.nextLine();

			x.exibirDados();
			x.falar();
			System.out.print("Deseja repetir?(S/N): ");
			resp = sc.nextLine().charAt(0);
			while(resp != 'S' && resp != 'N') {
				System.out.println("Resposta invalida! Digite novamente...");
				System.out.print("Deseja repetir?(S/N): ");
				resp = sc.nextLine().charAt(0);
			}
			System.out.println("===========================");
			
		} while (resp != 'N');
		System.out.println("Fim do programa...");
		sc.close();
	}

}
