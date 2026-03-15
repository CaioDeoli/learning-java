public class ArithmeticOperators {

  public static void main(String[] args) {
    int minhaIdade = 40;
    int suaIdade = 25;

    // Adição
    int totalIdades = minhaIdade + suaIdade;

    System.out.println("Total das idades: " + totalIdades);

    // Subtração
    int diferencaIdades = minhaIdade - suaIdade;

    System.out.println("Diferença das idades: " + diferencaIdades);

    // Multiplicação
    int dobroDaIdade = 2 * suaIdade;

    System.out.println("Dobro da idade: " + dobroDaIdade);

    // Divisão
    int metadeDaIdade = suaIdade / 2;

    System.out.println("Metade da sua idade: " + metadeDaIdade); // 12

    // Módulo: resto da divisão entre dois números
    int restoDaDivisao = 7 % 2;
    
    System.out.println("Resto da divisão (módulo): " + restoDaDivisao);
  }

}