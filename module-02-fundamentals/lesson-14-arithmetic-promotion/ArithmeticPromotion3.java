public class ArithmeticPromotion3 {

  public static void main(String[] args) {
    int x = 3;
    int y = 2;
    float z = x / y; // essa divisao entre inteiros vai ter resultado um inteiro, mas que vai virar float depois na hora da atribuição para z
    // uma das variaveis tem que ser float pelo menos

    int a = 3;
    float b = 2;
    float c = a / b; // promoção aritmética

    // quando nao tem possibilidade de ter uma variável do tipo float
    float d = (float) x / y; // converte x para float. pode ser y também convertido
  }
  
}