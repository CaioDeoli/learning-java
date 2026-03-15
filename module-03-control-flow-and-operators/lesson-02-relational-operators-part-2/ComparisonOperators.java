public class ComparisonOperators {

  public static void main(String[] args) {
    int pesoProdutos = 900;
    int limitePesoCaminhao = 1000;

    boolean cargaExcedida = pesoProdutos > limitePesoCaminhao;
    // boolean cargaLiberada = pesoProdutos < limitePesoCaminhao;
    // boolean cargaLiberada = pesoProdutos <= limitePesoCaminhao; // correto
    boolean cargaLiberada = limitePesoCaminhao >= pesoProdutos; // correto

    System.out.printf("Carga excedida: %b%n", cargaExcedida);
    System.out.printf("Carga liberada: %b%n", cargaLiberada);
  }

}