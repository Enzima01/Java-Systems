import java.util.Scanner;

public class EnzimasFit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cadastrado = 0;
		float somaIMC = 0;
		int op = 0;

		while (op != 3) {
			System.out.printf("\n             | ENZIMA'S FIT | %n\n");
			System.out.printf("------------------ MENU ----------------------%n\n");
			System.out.println("1) Cadastrar novo Aluno");
			System.out.println("2) Ver estatisticas");
			System.out.println("3) Sair");
			System.out.printf("%n----------------------------------------------%n");
			System.out.print("Digite o numero (1-3) da opcao desejada: ");
			op = sc.nextInt();

			switch (op) {
			case 1:

				System.out.printf("%n---------------- Cadastro Aluno ------------------%n");

				sc.nextLine();

				System.out.print("Digite o nome: ");
				String nome = sc.nextLine();

				System.out.print("Digite a idade: ");
				int idade = sc.nextInt();

				System.out.print("Digite a altura (M): ");
				float altura = sc.nextFloat();

				System.out.print("Digite o peso(KG): ");
				float peso = sc.nextFloat();

				float imc = peso / (altura * altura);

				if (idade <= 0 || peso <= 0 || altura <= 0) {
					System.out.println("Informações Inválidas!");
				}
				else {

					System.out.println("----------------------------------------------");
					System.out.printf("Indice de Massa Corporal (IMC): %.2f%n", imc);

					if (imc < 18.5) {
						System.out.println("Classificação: Abaixo do peso");
					}
					else if (imc >= 18.5 && imc <= 24.9) {
						System.out.println("Classificação: Peso Normal");
					}
					else if (imc >= 25 && imc <= 29.9) {
						System.out.println("Classificação: Sobrepeso");
					}
					else {
						System.out.println("Classificação: Obesidade");
					}

					if (idade <= 25 && imc < 25) {
						System.out.println("Plano de treino: Plano Jovem - Leve");
					}
					else if (idade <= 25 && imc >= 25) {
						System.out.println("Plano de treino: Plano Jovem - Intensivo");
					}

					if (idade >= 26 && idade <= 40 && imc < 25) {
						System.out.println("Plano de treino: Plano Adulto - Moderado");
					}
					else if (idade >= 26 && idade <= 40 && imc >= 25) {
						System.out.println("Plano de treino: Plano Adulto - Intensivo");
					}
					if (idade > 40 && imc < 25) {
						System.out.println("Plano de treino: Plano Master - Cuidadoso");
					}
					else if (idade > 40 && imc >= 25) {
						System.out.println("Plano de treino: Plano Master - Especial");
					}
					System.out.println("----------------------------------------------");
					System.out.print("Deseja se cadastra? (S/N): ");
					char cadastrar = sc.next().charAt(0);
					while (cadastrar != 'S' && cadastrar != 's' && cadastrar != 'N' && cadastrar != 'n') {
						System.out.println("Resposta Invalida! Digite novamente");
						System.out.print("Deseja se cadastrar? (S/N): ");
						cadastrar = sc.next().charAt(0);
					}
					if (cadastrar != 'S' && cadastrar != 's') {
						System.out.println("----------------------------------------------");
						System.out.println("          Usuário não cadastrado.");
						System.out.println("----------------------------------------------");
						System.out.println("Pressione Enter para continuar...");
						sc.nextLine();
						sc.nextLine();

					}
					else {
						System.out.println("----------------------------------------------");
						System.out.println("Cadastro finalizado! " + nome + " foi adicionado ao sistema.");
						System.out.println("----------------------------------------------");
						cadastrado++;
						somaIMC += imc;
						System.out.println("Pressione Enter para continuar...");
						sc.nextLine();
						sc.nextLine();

					}

				}

				break;

			case 2:
				System.out.printf("%n---------------- Estatísticas --------------------%n");
				System.out.println("Alunos Cadastrados: " + cadastrado);
				if (cadastrado > 0) {
					float mediaIMC = somaIMC / cadastrado;
					System.out.printf("Média dos IMCs: %.2f%n", mediaIMC);
					System.out.println("----------------------------------------------");
					System.out.println("Pressione Enter para continuar...");
					sc.nextLine();
					sc.nextLine();

				}
				else {
					System.out.println("Nenhum usuário cadastrado!");
					System.out.println("----------------------------------------------");
					System.out.println("Pressione Enter para continuar...");
					sc.nextLine();
					sc.nextLine();

				}
				break;

			case 3:
				System.out.println("Saindo do Sistema...");
				sc.close(); 
				return;

			default:
				System.out.println("Opção Inválida!");

			}

		}
		sc.close(); 
	}
}
