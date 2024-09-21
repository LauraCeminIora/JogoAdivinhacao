import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int numeroSorteado = aleatorio.nextInt(100);
        System.out.println("Bem-vindo(a) ao Jogo de Adivinhação!");
        int tentativasMaximas = 7;
        System.out.println("Tente adivinhar o número de 1 até 100.");
        int tentativas = 0;
        System.err.println("Você possui " + tentativasMaximas + " tentativas.");

        for (tentativas = 0; tentativas < tentativasMaximas; tentativas ++) {
            System.out.println("Digite o seu palpite:"); 
            int palpite = lerTeclado.nextInt();
            
        if (palpite < numeroSorteado) {
            System.out.println("O número é maior que " + palpite);
        } else if (palpite > numeroSorteado) {
            System.out.println("O número é menor que " + palpite);
        } else {
            break;
        }
     }
        if (tentativas < tentativasMaximas) {
            System.out.println("Parabéns! Você adivinhou o número " + numeroSorteado + " em " + (tentativas + 1)
            + " tentativas.");
        } else {
            System.out.println("Você esgotou suas tentativas. O número era " + numeroSorteado);
        }
            
        }
        }
        
        

    

