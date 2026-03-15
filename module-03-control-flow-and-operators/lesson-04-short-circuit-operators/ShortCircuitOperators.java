public class ShortCircuitOperators {

  public static void main(String[] args) {
    int x = 10;
    int y = 20;

    boolean resultado = x == 15 && y++ == 20; // y++ == 20 é verdadeiro. nao recomendado

    System.out.println(resultado);
    System.out.println(y); // 20 -> nao aconteceu o incremento
    // Quando a avaliação de uma expressão lógica já tem um resultado final, as outras condições não são realizadas
    // entao comparou x == 15 , deu false, e nao precisou ir pra proxima por isso não incrementou
    // acontece o mesmo com o || quando uma é verdadeira já antecipa o resultado
    /*
    boolean resultado = x == 10 && y++ == 20; // da verdadeiro e incrementa (efeito colateral)
    */

    boolean resultado2 = x == 10 || y++ == 20;
    System.out.println(resultado); // true
    System.out.println(y); // 20

    // por isso que o && e || são conhecidas como operações curto circuito
    // porque elas "cortam a instrucao"
    // o JVM faz isso, ele que processa
  }

}