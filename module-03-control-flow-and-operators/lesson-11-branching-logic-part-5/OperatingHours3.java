import java.util.Scanner;

public class OperatingHours3 {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite um dia da semana: ");
    String diaSemana = entrada.nextLine();

    System.out.print("Mês: ");
    Int mes = entrada.nextInt();

    String horarioFuncionamento = switch (diaSemana) {
      case "seg" -> {
        if (mes == 12) {
          yield "08:00 às 16:00"; // yield significa produzir, só usado aqui no switch
        }
        yield "Fechado"; // nao usamos return, utilizamos yield, são coisas diferentes
      }
      case "ter", "qua", "qui", "sex" -> {
        "08:00 às 18:00"; // yield aqui é implícito
      }
      case "sab", "dom" -> {
        "08:00 às 12:00";
      }
      default -> {
        "Dia inválido";
      }
    }
  }

}