public class EqualityOperators {

  public static void main(String[] args) {
    // equals ==
    // not equals !=

                            // expressao booleana
    boolean numerosIguais = 10 == 10;
    // boolean numerosIguais = (4 + 6) == (5 * 2);

    System.out.printf("Números iguais: %b%n", numerosIguais);

    int numero1 = 10;
    int numero2 = 11;
    boolean numerosIguais2 = numero1 == 10;
    boolean numerosIguais3 = numero1 == numero2;

    System.out.printf("Números iguais: %b%n", numero1 == numero2);
    System.out.printf("Números diferentes: %b%n", numero1 != numero2);

    // Comparação entre strings
    // Cuidado com comparacao de Strings porque nao é tipo primitivo
    // As vezes acontece dessa comparação dar errado, existe forma melhor
    String nome1 = "Caio";
    String nome2 = "Ana";

    boolean nomesIguais = nome1 == nome2;

    System.out.printf("Nomes iguais: %b%n", nomes iguais);
  }

}