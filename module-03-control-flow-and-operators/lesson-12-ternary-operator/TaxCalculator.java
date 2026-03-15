java.util.Scanner;

public class TaxCalculator {

  public static void main(String[] args) {
    char tipoNotaFiscal = 'P';
    double total Faturado = 1200.30;
    
    double valorImpostos;
    // 16% do total faturado se for serviço
    // 35% do total se for produto
    if (tipoNotaFiscal == 'S') {
      valorImpostos = total Faturado * 0.16;
    } else {
      valorImpostos = totalFaturado * 0 35;
    }
    
    // forma alternativa - operador ternário
    double valorImpostos = tipoNotaFiscal == 'S'
      ? totalFaturado * 0.16
      : totalFaturado * 0.35;
      
      // tem possibilidade de colocar um ternário dentro de um ternário só não é recomendado pela legibilidade. aninhar ternario nao é recomendado 
      // evite usar ternario em cálculos muito complexos e grandes. Mais de 80 caracteres nao fica legal. Use para casos simples, evite cálculos dentro de ternario
      
      double taxaImpostos = tipiNotaFiscal == 'S' ? 0.16 : 0.35;
      double valorImpostos = tipoFaturado * taxaImpostos
      

    
    
    System.out.print("Total faturado: R$%.2f%n", valorImpostos);
  }

}