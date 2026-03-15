public class Decrement {

  public static void main(String[] args) {
    int limiteTentativasLogin = 10;

    limiteTentativasLogin--;

    System.out.println(" 1 - Limite de tentativas de login: " + limiteTentativasLogin);

    int novoLimiteTentativasLogin = limiteTentativasLogin--;

    System.out.println(" 2 - Limite de tentativas de login: " + limiteTentativasLogin); // 9
    System.out.println(" 3 - Novo limite de tentativas de login: " + novoLimiteTentativasLogin); // 10

    novoLimiteTentativasLogin = --limiteTentativas;

    System.out.println(" 4 - Limite de tentativas de login: " + limiteTentativasLogin); // 9
    System.out.println(" 5 - Limite de tentativas de login: " + novoLimiteTentativasLogin); // 9
  }

}