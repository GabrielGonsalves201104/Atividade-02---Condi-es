import java.util.Scanner;

public class Atividade04_Verificação_Login  {

    public static void main(String[] args) {

        String usuarioCorreto = "Gabriel";
        String senhaCorreta = "123456789";

        Scanner scn = new Scanner(System.in);

        System.out.println("Digite seu nome de usuário: ");
        String usuarioDigitado = scn.nextLine();

        System.out.println("Digite sua senha: ");
        String senhaDigitada = scn.nextLine();

        if (usuarioDigitado.equals(usuarioCorreto) && senhaDigitada.equals(senhaCorreta)){
            System.out.println("Login efetuado com sucesso!");
        }else{
            System.out.println("Login ou senha incorreto!");
        }

        scn.close();

    }
}
