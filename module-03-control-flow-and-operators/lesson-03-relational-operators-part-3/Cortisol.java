import java.util.Scanner;

public class Cortisol {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Cortisol: ");
    double cortisol = entrada.nextDouble();

    // Operador AND
    // Cortisol ideal é de 6 a 18.4
    boolean resultadoNormal = cortisol >= 6.0 && cortisol <= 18.4; // && -> "and" // só da true quando ambos são true // e pode colocar mais condições
    // dica: boa pratica colocar qubra de linha assim quando o o valor que esta sendo atribuido é uma linha muito grande
    /*
    boolean resultadoNormal = cortisol >= 6.0 && cortisol <= 18.4
      && outra expressao;
    */
   // para retornar verdadeiro, todas condições precisao ser verdadeiras

   System.out.printf("Cortisol normal: %b%n", resultadoNormal);
   // 21 -> true false -> false
   // 3 -> false true -> false
   // 12 -> true true -> true

   // Operador OR
   boolean resultadoAnormal = cortisol < 6.0 || cortisol > 18.4;
   // qualquer uma das condições sendo verdadeira para o resultado ser verdadeiro
   // quando uma da verdadeira, o resultado é verdadeiro
   // true false -> true
   // false true -> true
   // false false -> false
  }

}