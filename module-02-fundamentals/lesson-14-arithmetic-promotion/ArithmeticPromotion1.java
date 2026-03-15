public class ArithmeticPromotion1 {

  public static void main(String[] args) {
    int a = 10;
    int b = 5;
    int c = a * b; // também retorna um valor do mesmo tipos das variaveis

    long d = 10;
    long e = 5;
    // int f = d * e; // erro
    long f = d * e;

    int g = 10;
    long h = 5;
    // int i = g * h; // erro
    long i = g * h; //  o resultado sempre vai ser do tipo maior (promoção artimética), por isso sempre coloque o tipo maior
    // sempre priorizando os tipos com ponto flutuante
    // long * float -> float

  }

}