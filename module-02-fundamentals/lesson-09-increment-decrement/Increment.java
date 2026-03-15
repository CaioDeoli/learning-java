public class Increment {

  public static void main(String[] args) {
    int totalDownloads = 10;

    // Tudo igual
    // totalDownloads = totalDownloads + 1;
    // totalDownloads += 1;
    totalDownloads++; // forma pós fixada
    
    System.out.println(" 1 - Total de downloads: " + totalDownloads);

    // Duas formas: pós fixada e pré fixada
    int novoTotalDownloads = totalDownloads++;
    // pós fixada: atribui o valor da variável antes do incremento

    System.out.println(" 2 - Total de downloads: " + totalDownloads); // 11
    System.out.println(" 3 - Novo total de downloads: " + novoTotalDownloads); // 10

    // pós fixada
    int novoTotalDownloads = --totalDownloads;

    System.out.println(" 4 - Total de downloads: " + totalDownloads); // 11
    System.out.println(" 5 - Novo total de downloads: " + novoTotalDownloads); // 11
  }

}