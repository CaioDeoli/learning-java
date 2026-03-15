public class FormattingOutput {

  public static void main(String[] args) {
    String nome1 = "Thiago";
    
    System.out.println("Olá " + nome);
    System.out.printf("Olá, %s%n", nome1); // %s é um placeholder de uma string, um local onde vai ser substituido. %n quebra de linha
    // println tem quebra de linha
    // printf precisa deixar explicito
    // podem ter mais argumentos se tiveren mais referencias
    // fica mais facil de ler e programar
    
    int quantidade = 48;
    System.out.printf("Quantidade: %d itens%n",); // %d é pra numeros inteiros (short, int, long)
    
    double peso = 937.22;
    System.out.printf("Peso: %f%n", peso); // 938.220000 // ele adiciona casas decimais por padrao
    System.out.printf("Peso: %.2f%n", peso); // 938.22
    
    // controlar a quantidade de caracteres mínimos na formatação dessa String
    System.out.printf("%10.2f%n", peso); // no mínimo 10 caracteres // vai incluir espaços em branco a direita do numero
  }
  // Em alguns casos ficam com , no printf. porque depende das configs de linguagem do SO a formatação da saída depende do idioma
  
  // para definir precisamos de uma classe localy que veremos futuramente
  // existem outras regras de formatação que veremos futuramente
  
}