public class CompoundOperators {

  public static void main(String[] args) {
    int quantidadeProdutos = 10;

    // Atribui o calculo a variável utilizando o valor anterior da variável
    quantidadeProdutos = quantidadeProdutos + 3;
    quantidadeProdutos += 3; // Abreviando

    // -=
    quantidadeProdutos -= 3;

    // *=
    quantidadeProdutos *= 3;

    // /=
    quantiadeProdutos /= 2;

    // %=
    quantidadeProdutos %= 4;

    System.out.println(quantidadeProdutos);
  }

}