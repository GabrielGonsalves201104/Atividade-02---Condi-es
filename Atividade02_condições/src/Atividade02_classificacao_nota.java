import java.util.Scanner;

public class Atividade02_classificacao_nota {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota do aluno entre o e 10: ");
        double nota = scan.nextDouble();

        if (nota >= 9){
            System.out.println("Classificação: Exelente!");
        } else if (nota >= 7) {
            System.out.println("Classificação: Bom!");
        } else if (nota >= 5) {
            System.out.println("Classificação: Satisfatória!");
        } else {
            System.out.println("Classificação: Insatisfatória!");
        }

        scan.close();

    }

}
