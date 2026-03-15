import java.util.Scanner;

public class BodyMassIndex2 {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Peso: ");
    int peso = entrada.nextInt(); // captura o que o usuario digitou, e ele precisa digitar um inteiro

    System.out.print("Altura: ");
    double altura = entrada.nextDouble();

    entrada.nextLine(); // isso aqui soluciona (work around) // isso consome as quebras de linha nao consumidas do nextInt e Double

    System.out.print("Nome: ");
    String nome = entrada.nextLine(); // esse nextLine da um problema que ele lê a quebra de linha que nao é consumido pelos outros

    double imc = peso / (altura * altura);

    System.out.printf("IMC de %s: %.2f%n", nome, imc);

    // Dica: aprenda a ler erros, eles sempre acontecem
  }

}