public class DoubleToInt {

  public static void main(String[] args) {
    double largura = 100;

    // int tamanho = largura; // não compila porque largura é ponto flutuante

    int tamanho = (int) largura; // instrução de casting - NÃO RECOMENDADO

    System.out.println(largura);
    System.out.println(tamanho);
    
    double largura2 = 100.37;

    int tamanho2 = (int) largura2; // ponto flutuante -> inteiro. sempre perde os pontos flutuantes
  }

}