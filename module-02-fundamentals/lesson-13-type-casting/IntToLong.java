public class IntToLong {

  public static void main(String[] args) {
    int y = 102_344;

    long x = y; // COMPILA
    // aconteceu um casting automático. conversão implícita
    // acontece quando queremos fazer um casting de uma variavel menor para maior - o compilador faz isso pra gente
    // long x = (long) y; // instrucao de casting é opcional
    // não corre risco de perder informações

    System.out.println(y); // 102344
    System.out.println(x); // 102344
  }

}