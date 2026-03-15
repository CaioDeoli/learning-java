java.util.Scanner;

public class AircraftWeightControl2 {
  
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Peso máximo da aeronave: ");
    int pesoMaximo  = entrada.nextInt();

    int pesoTotalPassageiros = 0;

    boolean incluirNovoPassageiro = true;

    // enquanto o limite de peso não exedeu
    // while (true) {} -> gera looping infinito. cuidado
    // looping infinito ferra com a capacidade do computador
    while (pesoTotalPassageiros <= pesoMaximo && incluirNovoPassageiro) {
      System.out.print("Digite o peso do passageiro: ");
      int pesoPassageiro = entrada.nextInt();

      pesoTotalPassageiros += pesoPassageiro;

      System.out.print("Incluir novo passageiro? ");
      incluirNovoPassageiro = entrada.nextBoolean();

    }

    System.out.printf("Peso máximo da aeronave: %d kg%n", pesoMaximo);
    System.out.printf("Peso total dos passageiros: %d kg%n", pesoTotalPassageiros);
    System.out.printf("Situação da aeronave: %s%n",
      pesoTotalPassageiros > pesoMaximo ? "peso excedido" : "liberada");
  }

}