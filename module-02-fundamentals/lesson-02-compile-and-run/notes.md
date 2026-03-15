# Compilando e executando um programa Java
## Compilar
- `javac OlaMergulhador.java` -> programa compilador java que possui no JDK
- comandos command prompt windows / linux
  - dir / ls
  - cd
  - cls / clear

```java
public class OlaMergulhador {

  public static void main(String[] args) {
    System.out.println("Olá, mergulhador!");
  }

}
```

- OlaMergulhador.class, arquivo de bytecode, é gerado pelo javac. Que pode ser executado pelo JVM de qualquer máquina

- Erro de compilação
```
C:\Users\caiod\Documents\GitHub\learning-java\exercicios>javac OlaMergulhador.java
OlaMergulhador.java:14: error: ';' expected
    System.out.println("Olá, mergulhador!")
                                           ^
1 error

C:\Users\caiod\Documents\GitHub\learning-java\exercicios>
```

## Executar
- `java OlaMergulhador`
- `del` - deleta arquivos no windows
- Facilidade a partir do Java 11: não precisamos compilar antes para executar, o java já compila e executar sem gerar um arquivo código fonte na sua máquina
- `java OlaMergulhador.java`