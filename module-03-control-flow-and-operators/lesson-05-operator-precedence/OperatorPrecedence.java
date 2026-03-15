public class OperatorPrecedence {

  public static void main(String[] args) {
    int x = 10;
    int y = 20;

    boolean resultado =  x == 13 && x == 15 || y == 20;

    System.out.println(resultado); // true
    // && é avaliado primeiro, depois o ||
    // como se tivesse assim
    // boolean resultado = (x == 13 && x == 15) || y == 20;
    // dica: sempre coloque parenteses para ter uma legibilidade melhor mesmo que já faça por padroa
    // o parentese altera essa precedencia
  }

}