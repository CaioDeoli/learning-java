public class LongToInt {

  public static void main(String[] args) {
    // long x = 10;

    // int y = x; // Dar erro por que o compilador não consegue identificar que o long 10 cabe em int 10
    // Uma informação poderia ser perdida
    // long sempre ocupa todas as 64 caixas na memória (bits)
    // int sempre ocupa todas as 32 caixas na memória (bits)
    // o compilador não sabe que um valor consegue caber em outro, ele não analisa isso sozinho
    // se voce precisar converter e ter certeza que consegue, voce força um casting (riscos)

    long x = 10;

    int y = (int) x; // casting -> pode fazer a conversão mas existem riscos
    // TOME CUIDADO: voce pode perder informações (bits) se os bits forem importantes

    System.out.println(x);
    System.out.println(y);

    // Exemplo de problema
    long a = 9_325_000_585_835L;

    int b = (int) a;
    System.out.println(a); // 9_325_000_585_835L
    System.out.println(b); // 710_065_443
    // Por que mudou totalmente o valor?
    // por o compilar cortou o valor em 32 bits, a informção que ultrapassou foi jogado fora
    // os bits foram truncados EVITE A TODO CUSTO

  }

}