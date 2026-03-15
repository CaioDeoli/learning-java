public class IntType {

  public static void main(String[] args) {
    int populacaoRecife = 1488920;

    // A partir do java 7 é possível melhorar a legibilidade da seguinte forma
    int populacaoRecifeComUnderscore = 1_488_920;

    // int valorMaximo = 2_147_483_648; // não compila

    System.out.println(populacaoRecifeComUnderscore);
  }

}