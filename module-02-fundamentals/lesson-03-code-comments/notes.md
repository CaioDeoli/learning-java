# Escrevendo comentários ao código
- Textos para descrever como um determinado programa ou bloco de código funciona
- Ignorados pelo compilador
- Escrever coisas óbvias não é bem visto nas empresas
- Não deixe código comentados

## Comentário de linha
```java
// Você pode comentar uma linha inteira
public class OlaMergulhador { // ou na frente de uma declaração ou instrução
  
    public static void main(String[] args) {
      // Imprime a mensagem na saída padrão (exemplo de comentário óbvio)
      // Também pode ser usado para comentar linhas de código e impedir que ele execute
      // System.out.println("Olá, mergulhador!");
    }
}
```

## Bloco de comentário
- Geralmente se faz um comentário de bloco para descrever classes ou métodos
```java
public class OlaMergulhador {

  /*
  Método principal do programa
  Ao executar o programa, esse método será chamado automaticamente
  */
  /*
  public static void main(String[] args) {
    System.out.println("Teste");
  }
  */

}
```