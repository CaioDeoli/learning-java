# Trabalhando com variáveis
- Armazena valores na memória do computador
- Nomes simbólicos dados a informações armazenadas no computador
- Definidas, atribuidas, acessadas e calculadas através do código fonte
- Os conteúdos das variáveis podem mudar um comportamento assim como mudar seu conteúdo

```
public class AulaVariaveis {
  
  public static void main(String[] args) {
    // declarando variável
    // 1. que tipo de informação? -> visto todos em outras aulas
    // tipo inteiro (inteiros positivos e negativos. -2, -1, 0, 1, 2, 3)
    int minhaIdade; // apenas declara uma variável
    // java é fortemente tipada, então as variáveis não podem ser alteradas para outro tipo

    minhaIdade = 40; // "=" operador de atribuição

    System.out.println(minhaIdade);
    // Se o parametro enviado para println "" ou número, seria um valor/numero/texto literal

    // Você pode declarar e atribuir com um valor inicial
    int outraVariavel = 30;

    // Você pode alterar
    outraVariavel = 31; // a partir dessa linha é 31
    System.out.println(outraVariavel);'

    // Podemos calcular
    int suaIdade = 25
    int totalIdades = minhaIdade + suaIdade; // "+" operador aritmétrico de adição

    // Concatenação juntar um texto com outro texto
    System.out.println("Total das idades: " + totalIdades); // "+" função de concatenação

    // Tecnicamente voce pode fazer isso aqui
    // nao recomendado:
    int numeroUm = 1, numeroDois = 2;
    // boa prática -> declarar uma variável por linha

    // lowerCamelCase -> a primeira letra minuscula, a inicial das outras maiúsculas
    // padrão para variáveis
    // use as palavras completas, evite ao máximo nomes abreviados
    // exemplo: tIdades, msg, ...
    // variaveis não podem iniciar com um número/caractere especial
  }

}
```