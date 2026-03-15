public class AverageAgeCalculator {

  public static void main(String[] args) {
    int minhaIdade = 40;
    int suaIdade = 20;
    int joaoIdade = 50;
    // Agrupamos a soma para alterar a ordem de precedência
    int mediaIdade = (minhaIdade + suaIdade + joaoIdade) / 3;

    System.out.println("A média das idades é: " + mediaIdade);
  }

}