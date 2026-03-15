java.util.Scanner;

public class AircraftWeightControl1 {
  
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Peso máximo da aeronave: ");
    int pesoMaximo  = entrada.nextInt();

    System.out.print("Quantidade de passageiros: ");
    int totalPassageiros = entrada.nextInt();

    int pesoTotalPassageiros = 0;

    int passageiroAtual = 1;

    // mais indicado para for nesse caso
    while (passageiroAtual <= totalPassageiros) {
      System.out.printf("Digite o peso do passageiro #%d", passageiroAtual);
      int pesoPassageiro = entrada.nextInt();

      pesoTotalPassageiros += pesoPassageiro;
      passageiroAtual++; // adiciona incremento
    } // funcionando igual ao for do exercício passado
    // for foi feito para quando SABEMOS com antecedencia o valor de loopings
    // while serve para quando NAO SABEMOS
    // roda até quando uma expressão é verdadeira

    // 

    System.out.printf("Peso máximo da aeronave: %d kg%n", pesoMaximo);
    System.out.printf("Peso total dos passageiros: %d kg%n", pesoTotalPassageiros);
    System.out.printf("Situação da aeronave: %s%n",
      pesoTotalPassageiros > pesoMaximo ? "peso excedido" : "liberada");
  }

}