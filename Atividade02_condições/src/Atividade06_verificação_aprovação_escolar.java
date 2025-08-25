import java.util.Scanner;

public class Atividade06_verificação_aprovação_escolar {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Digite a média final do aluno: ");
        double media = scn.nextDouble();

        if (media >= 7) {
            System.out.println("Aluno aprovado");
        } else if (media >= 5 && media < 7) {
            System.out.println("Aluno em recuperação");
        } else {
            System.out.println("Aluno reprovado");
        }

        scn.close();
    }
}
