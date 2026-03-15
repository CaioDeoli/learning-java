import java.util.Scanner;

public class OperatingHours1 {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite um dia da semana: ");
    String diaSemana = entrada.nextLine();
    String horarioFuncionamento;

    switch (diaSemana) {
      case "seg" -> {
        horarioFuncionamento = "Fechado";
      }
        // não precisa do break
      case "ter", "qua", "qui", "sex" -> {
        horarioFuncionamento = "08:00 às 18:00";
      }
      case "sab", "dom" -> {
        horarioFuncionamennto = "08:00 às 12:00";
      }
      default -> horarioFuncionamento = "Dia inválido"; // pode ser assim
    }
  }

}