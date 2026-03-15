import java.util.Scanner;

public class OperatingHours2 {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite um dia da semana: ");
    String diaSemana = entrada.nextLine();
    String horarioFuncionamento = switch (diaSemana) {
      case "seg" -> {
        "Fechado"; // isso aqui é retornado para a variável
      }
      case "ter", "qua", "qui", "sex" -> {
        "08:00 às 18:00";
      }
      case "sab", "dom" -> {
        horarioFuncionamennto = "08:00 às 12:00";
      }
      default -> { // obrigatório o default para switch expressions quando voce nao esta cobrindo todos os casos, strings são infinitas então precisa ter algo para atribuir
        "Dia inválido";
      };
    }

    // também da para fazer isso
    // não recomendado porque não fica muito legível
    // na maioria do uso do switch, é para retornos mais simples
    System.out.printlnf(switch (diaSemana) {
      case "seg" -> {
        "Fechado"; // isso aqui é retornado para a variável
      }
      case "ter", "qua", "qui", "sex" -> {
        "08:00 às 18:00";
      }
      case "sab", "dom" -> {
        horarioFuncionamennto = "08:00 às 12:00";
      }
      default -> { // obrigatório o default para switch expressions quando voce nao esta cobrindo todos os casos, strings são infinitas então precisa ter algo para atribuir
        "Dia inválido";
      }
    });
  }

}