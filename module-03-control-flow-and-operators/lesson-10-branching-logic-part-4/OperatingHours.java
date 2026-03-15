import java.util.Scanner;

public class OperatingHours {
  Scanner entrada = new Scanner(System.in);
  
  System.out.print("Digite um dia da semana (exemplo: seg, ter, qua, etc): ");
  String diaSemana = entrada.nextLine();
  String horarioFuncionamento;
  
  // switch aqui
  switch (diaSemana) {
     case "seg":
       horarioFuncionamento = "Fechado";
       break;
     case "ter":
     case "qua":
     case "qui":
     case "sex":
       horarioFuncionamento = "08:00 às 18:00"
       break;
     case "sab":
     case "dom":
       horario...
       break;
     default:
       horário Funcionamento = "Dia inválido";
       // nao precisa de break
  }
  
  System.out.println("Horário de funcionamento: %s%n", horarioFuncionamento);
}