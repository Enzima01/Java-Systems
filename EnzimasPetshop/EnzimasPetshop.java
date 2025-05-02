import java.util.Scanner;

public class EnzimasPetshop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char resp = 'S';
		System.out.println("==== ENZIMA'S PETSHOP ====");
		do {
			Animal a1 = new Animal();
			System.out.print("Digite o nome de seu animal: ");
			a1.nome = sc.nextLine();
			System.out.print("Digite o tipo de seu animal: ");
			a1.tipo = sc.nextLine();
			System.out.print("Digite a idade de seu animal: ");
			a1.idade = sc.nextInt();
			sc.nextLine();

			a1.exibirDados();
			a1.falar();
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
