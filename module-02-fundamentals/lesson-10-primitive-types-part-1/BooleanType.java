public class BooleanType {

  public static void main(String[] args) {
    boolean compraAprovada = false;
    // valores literais: valores fixos no código fonte. Exemplo: false, true

    // boolean (tipo primitivo) != Boolean (classe)
    boolean clienteBloqueado = false;

    System.out.println(compraAprovada);
    System.out.println(clienteBloqueada);
    // tomar alguma decição baseada no valor de uma variável

    // pode receber uma expressão que veremos mais a frente
    int quantidadeEstoque = 10;
    int quantidadePedidoCompra = 15;
    boolean estoqueSuficiente = quantidadeEstoque >= quantidadePedidoCompra; // expressão booleana porque retorna true ou false
    // >= -> operador de comparação
    System.out.println("Estoque suficiente: " + estoqueSuficiente);
  }

}