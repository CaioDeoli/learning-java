import java.util.Scanner;

public class StoreCashier {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Preço do produtos: ");
    double precoProdutos = entrada.nextDouble();

    System.out.print("Cobrar frete? ");
    boolean cobrarFrete = entrada.nextBoolean();

    /*
    if (cobrarFrete) {
      System.out.print("Valor do frete: ");
      double valorFrete = entrada.nextDouble();
    }

    double valorTotal = precoProdutos + valorFrete;
    // isso aqui da erro porque nao encontra a variavel valorFrete
    // porque declaramos a variavel dentro de um bloco, só conseguimos usar a variavel dentro do bloco
    // o tempo de vida dela é muito curta
    */

    double valorFreteFuncional; // o valor esta "undefined", então se nao tiver cobrança de frete o valor nunca inicializa, por isso que o compilador da erro. Quando é variavel primitiva, precisa ter valor
    // o compilador prevê um erro

    if (cobrarFrete) {
      System.out.print("Valor do frete: ");
      valorFrete = entrada.nextDouble();  
    } else {
      valorFrete = 0;
    }
    // ou apenas inicializar
    // double valorFrete = 0; -> dessa forma fica mais legivel

    System.out.printf("Valor total: R$%.2f%n", valorTotal);
  }

}