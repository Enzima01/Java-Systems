

import java.util.Scanner;

public class EnzimasVote {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int voto = 1;

        int votosMatrix = 0, votosSenhor = 0, votosInter = 0;
        float porMatrix = 0, porSenhor = 0, porInter = 0;
        int somaVotos = 0;


        System.out.println("               | ENZIMA'S VOTE |");
        System.out.println("---------- Vote em seu Filme favorito ----------");
        System.out.println("1) Matrix");
        System.out.println("2) O Senhor dos Anéis");
        System.out.println("3) Interestelar");
        System.out.println("0) Encerrar votação");
        System.out.println("------------------------------------------------");

        while (voto != 0) {

            System.out.print("Digite seu voto: ");
            voto = sc.nextInt();
            switch (voto) {
                case 1:
                    votosMatrix++;
                    somaVotos++;
                    break;
                case 2:
                    votosSenhor++;
                    somaVotos++;
                    break;
                case 3:
                    votosInter++;
                    somaVotos++;
                    break;
                case 0:

                    System.out.println("---------- RESULTADO ----------");
                    if (somaVotos == 0) {
                        System.out.println("Nenhum voto registrado.");
                        System.out.println("-----------------------------");
                    } else {
                        System.out.printf("Total de votos: %d%n\n", somaVotos);

                        porMatrix = (float) (votosMatrix * 100) / somaVotos;
                        System.out.printf("Matrix: %d voto(s) - %.2f%% %n", votosMatrix, porMatrix);
                        porSenhor = (float) (votosSenhor * 100) / somaVotos;
                        System.out.printf("Senhor dos Anéis: %d voto(s) - %.2f%% %n", votosSenhor, porSenhor);
                        porInter = (float) (votosInter * 100) / somaVotos;
                        System.out.printf("Interestelar: %d voto(s) - %.2f%% %n", votosInter, porInter);
                        if (votosMatrix > votosSenhor && votosMatrix > votosInter) {
                            System.out.println("\nFilme Vencedor: Matrix");
                        } else if (votosSenhor > votosMatrix && votosSenhor > votosInter) {
                            System.out.println("\nFilme Vencedor: Senhor dos Anéis");
                        } else if (votosInter > votosMatrix && votosInter > votosSenhor) {
                            System.out.println("\nFilme Vencedor: Interestelar");
                        } else {
                            System.out.println("\nEmpate");
                        }
                        System.out.println("-----------------------------");


                    }
                    break;
                default:
                    System.out.println("Voto inválido!");
                    break;
            }
        }
        sc.close();

    }
}