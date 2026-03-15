public class StringClass {
  
  public static void main(String[] args) {
    System.out.println("Olá, mundo!"); // valor literal do tipo string quando tem aspas duplas

    int x = 10;
    int y = 5;
    int z = x + y;

    System.out.println("Resultado: " + z); // concatenar

    System.out.println("Resultado: " + x + y); // Resultado: 105 // compilador verificou que tem um texto sendo concatenado primeiro, e ai ele concatenar tudo

    System.out.println(x + y + "foi o resultado"); // Ele faz a operação aritmetica primeiro e depois concatena
    // O compilador só começa a fazer concatenação a partir do momento que encontra um texto

    System.out.println("Resultado: " + (x + y)); // () muda a presendencia das operações

    // Declarando variáveis do tipo string -> String com letra maiuscula. String não é um tipo primitivo
    // Tipo String é uma classe
    String nome = "Maria";
    int idade = 30;

    System.out.println(nome + " tem " + idade + " anos");
  }

}