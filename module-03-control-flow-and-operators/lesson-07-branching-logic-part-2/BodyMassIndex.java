import java.util.Scanner

public class BodyMassIndex {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Peso: ");
    int peso = entrada.nextInt();

    System.out.print("Altura: ");
    double altura = entrada.nextDouble();

    double imc = peso / (altura * altura);

    if (imc < 18.5) {
      System.out.println("Está abaixo do peso.");
    } else { // vai ser executada caso as instrucoes ifs (if e else if) não forem verdadeiras
    // caso contrário
      System.out.println("Não está abaixo do peso.");
    }

    /*
    jeito nao legivel de fluxo oposto
    if (imc >= 18.5) {
      System.out.println("Está acima do peso");
    }
    ou
    if (imc < 18.5) {}
    */

     if (imc < 18.5) { // se
      System.out.println("Está abaixo do peso.");
    } else if (imc < 25) { // caso contrário, se for maior ou igual a 18.5 E imc < 25
      System.out.println("Peso ideal");
    } else if (imc < 30) { // ele encadeia, por isso não precisa colocar a expressão completa
      System.out.println("Acimado do peso");
    } else if (imc < 35) {
      System.out.println("Obesidade grau I");
    } else if (imc < 40) {
      System.out.println("Obesidade grau II");
    } else {
      System.out.println("Obesidade grau III");
    }

    System.out.println("Fim do programa");
    // sempre coloque else para ter um "default". quando caso nenhuma condição for necessária
    // da pra fazer com ifs e elses apenas, mas cria muito blocos de códigos, um dentro do outro, porque fica não legivel
    // a partir de 3 blocos, repense em refatorar seu código
  }

}