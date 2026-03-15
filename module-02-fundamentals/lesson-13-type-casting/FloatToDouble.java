public class FloatToDouble {

  public static void main(String[] args) {
    float taxa1 = 934.5f;
    double taxa2 = taxa1; // o compilador vai fazer a compillação implícita
    // double taxa2 = (double) taxa1; // instrucao opcional

    System.out.println(taxa1);
    System.out.println(taxa2);
  }

}