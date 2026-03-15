import java.util.Scanner;

public class Bet {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    int quantidade = 0;
    
    do {
      System.out.print("Quantidade de números: ");
      quantidadeNumeros = entrada.nextInt();
      if (quantidaddNumeros < 6 || quantidadeNumeros > 15) {
        System.out.println("Quantidade de números deve ser entre 6 e 15");
      }
    } while (quantidadeNumeros < 6 || quantidadeNumeros > 15);
    
    int numeroAtualizado = 1;
    String numerosEscolhidos = "";
    
    do {
System.out.printf("Número %d/%d", numeroAtual, quantidadeNumeros);
int numeroEscolhido = entrada.nextInt;
if (numeroEscolhido < 1 || numeroEscolhido > 60) {
System.out.println("Nao pode");
} else {
numerosEscolhidos += numeroEscolhido + " ";
      numeroAtual++;
      }
    } while (númeroAtual <= quantidadeNumeros);
    
System.out.printf("Números escolhidos: %s%n", numerosEscolhidos);
  }

}