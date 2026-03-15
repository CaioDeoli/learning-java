// Precisamos importar
import java.util.Scanner;

public class UserInput {

  public static void main(String[] args) {
    // Criamos um novo scanner que ele é capaz de capturar o que o usuário digitar e atribuimos a variável entrada
    // Nao precisa entender por enquanto
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o seu nome");
    // Queremos escutar algo do usuário
    // Queremos obter alguma entrada do usuário

    // nextLine() é um método/função do objeto Scanner
    // Solicitamos do usuário uma entrada de dados e aperte enter
    String nome = entrada.nextLine();

    System.out.printf("Oi, %s%n", nome);
  }

} 