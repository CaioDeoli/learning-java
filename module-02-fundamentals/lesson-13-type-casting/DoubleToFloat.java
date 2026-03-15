public class DoubleToFloat {

  public static void main(String[] args) {
    double peso1 = 20.5;

    float peso2 = peso1; // NAO COMPILA
    float peso2 = (float) peso1; // riscos de perder informação

    System.out.println(peso1);
    System.out.println(peso2);
  }

}