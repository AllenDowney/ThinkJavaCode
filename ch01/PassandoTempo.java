import java.util.Scanner;



public class PassandoTempo {

    

    public static int askAge() {
        Scanner in = new Scanner(System.in);
        int idade;
        
        System.out.print("Qual sua idade? ");
        idade = in.nextInt();

        return idade;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome;

        System.out.print("Qual o seu nome? ");
        nome = in.next();

        int idade = askAge();

        System.out.printf("nome: %s idade:  %d", nome, idade);
    }
}