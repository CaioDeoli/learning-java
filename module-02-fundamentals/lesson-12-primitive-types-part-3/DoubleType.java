public class DoubleType {

  public static void main(String[] args) {
    double peso = 84.0;
    // double != Double
    peso = 71.4;
    peso = 84.9d; // D ou d para deixar explicito
    // Apesar que o "." já deixa explicito que é um valor double. É totalmente opcional
    // O padrão americano é o "."

    System.out.println(peso);
  }
  
}