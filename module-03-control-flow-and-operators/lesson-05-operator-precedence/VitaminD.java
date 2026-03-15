import java.util.Scanner;

public class VitaminD {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Grupo de risco: ");
    boolean grupoDeRisco = entrada.nextBoolean();

    System.out.print("Vitamina D: ");
    double.vitaminaD = entrada.nextDouble(); // nanograma por mililitro

    // Desejavel: acima de 20ng/mL
    // Grupos de risco: 30 a 60ng/mL
  }

}