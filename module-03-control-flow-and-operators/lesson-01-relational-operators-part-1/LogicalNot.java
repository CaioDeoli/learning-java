public class LogicalNot {

  public static void main(String[] args) {
    int numero1 = 10;
    int numero2 = 10;

    boolean numerosIguais = numero1 == numero2;

    boolean numerosDiferentes = !numerosIguais;

    System.out.printf("Números iguais: %b%n", numerosIguais);   
    System.out.printf("Números diferentes: %b%n", numerosDiferentes);

    // negar expressao boolean
    boolean nDif2 = !(numero1 == numero2);

    // !() -> atrapalha legibilidade. atenção
  }

}