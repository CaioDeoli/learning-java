import java.util.Scanner;

public class AircraftWeightControl {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Peso máximo da aeronave: ");
    int pesoMaximo = entrada.nextInt();

    int pesoTotalPassageiros = 0;

    // sempre recorra ao que for mais legivel para utilizar expressao ou break ou ambos
    while (true) {
      System.out.print("Peso do passageiro: ");
      int pesoPassageiro = entrada.nextInt();
      if ((pesoTotalPassageiros + pessoPassageiro) > pesoMaximo) {
        System.out.println("Não pode incluir passageiro. Peso excederia o máximo.");
        continue; // interrompe a interação
      }

      pesoTotalPassageiros += pesoPassageiro;

      System.out.print("Incluir novo passageiro? ");
      if (!entrada.nextBoolean()) {
        break;
      }

      // outra forma sem continue
      /*
      if ((pesoTotalPassageiros + pessoPassageiro) > pesoMaximo) {
        System.out.println("Não pode incluir passageiro. Peso excederia o máximo.");
      } else {
        pesoTotalPassageiros += pesoPassageiro;

        System.out.print("Incluir novo passageiro? ");
        if (!entrada.nextBoolean()) {
          break;
        }
      }
      */
    }
    // continua aqui

    while (true) {
      for (;;) {
        break; // só abandona o for, não o while
        continue; // só passa para a próxima iteração
        // não é bom colocar um looping infinito dentro de looping infinito
        // clausulas break e continue -> não é recomendado, ele pula uma iteração especifica por exemplo o while
      }
    }

    System.out.printf("Peso máximo da aeronave: %d kg%n", pesoMaximo);
    System.out.printf("Peso total dos passageiros: %d kg%n", pesoTotalPassageiros);
    System.out.print("Situação da aeronave: %s%n",
      pesoTotalPassageiros > pesoMaximo ? "peso excedido" : "liberada");
  }

}