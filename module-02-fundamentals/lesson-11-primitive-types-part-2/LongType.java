public class LongType {

  public static void main(String[] args) {
    long populacaoRecife = 699_097; // Irá ocupar mais memória do que um int

    // long populacaoRecife2 = 2_147_483_648; // Não compila
    // Um número inteiro literal em Java ele sempre vai ser um inteiro
    // Estamos atribuindo um valor int em um long porque o Java faz uma conversão implicita

    // Truque para dizer ao compilador Java que o valor literal é um tipo long e não int
    long populacaoRecife2 = 2_147_483_648L;
    // Adicione L ou l no final

    // Esse L popde ser usado em outras situações por exemplo:
    // System.out.println(2_147_483_648); // Não compila por ser um literal inteiro automaticamente
    System.out.prinln(2_147_483_648L);
  }

}