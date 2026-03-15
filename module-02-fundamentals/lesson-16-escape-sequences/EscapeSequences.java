public class EscapeSequences {

  public static void main(String[] args) {
    // confunde o compilator
    // System.out.println("Oi "Maria"");
    // Como escrever uma aspas como texto e não como delimitador de string literal
    // usando sequencia de escape (combinação de caracteres para representar caracteres "especiais" iniciando com contra barra)
    // sequencia de escape é \"
    System.out.println("Oii \"Maria\"");

    // new line - quebra de linha
    System.out.println("Seu nome:\nJoão");

    // para imprimir a barra utilizamos \\
    System.out.println("C:\\Windows");
  }

}