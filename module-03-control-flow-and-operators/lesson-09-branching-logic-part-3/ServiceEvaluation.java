import java.util.Scanner;

public class ServiceEvaluation {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(Sytem.in);

    System.out.print("Avalie o nosso atendimento (1 a 5): ");
    int nota = entrada.nextInt();
    // long nota = entrada.nextLong(); // o long e double não funciona com switch
    // char, byte, short, int funciona
    // enum também funciona
    // tipo String também funciona a partir do Java 7

    String descricaoNota;

    switch (nota) { // baseado no valor da nota
      case 1: // caso o valor da nota seja igual a 1
        descricaoNota = "Muito ruim";
      case 2:
        descricaoNota = "Ruim";
      case 3: // caso encontre algum valor verdadeiro, e não tiver o break, todas as instruções abaixo são executadas
        descricaoNota = "Razoável";
      case 4:
        descricaonota = "Muito bom";
      case 5:
        descricaoNota = "Excelente";
      default: // caso nenhuma opção for válida, entra no default
        descricaoNota = "Opção inválida"
    }
  }

}