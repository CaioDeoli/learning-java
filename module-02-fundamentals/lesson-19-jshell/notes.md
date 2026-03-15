# Usando JShell - REPL do Java
- Terminal interativo presente em muitas outras linguagens também
- A partir do Java 9
- Podemos rodar instruções sem precisar criar toda a base e um arquivo
- Testes de recursos e demonstrações é interessante
- Não precisa de ;
- Para limpar Ctrl + L
- /var -> retorna as variaveis declaradas no contexto
- /list -> as instrucoes que rodei
- /4 -> roda novamente a 4 uma instrução
- /reset -> para resetar tudo
- /exit -> sai

```
PS C:\GitHub\learning-java\module-02-fundamentals\lesson-19-jshell> jshell
|  Welcome to JShell -- Version 25.0.2
|  For an introduction type: /help intro

jshell> int x = 10;
x ==> 10

jshell> int y = 20
y ==> 20

jshell> int z = x + y
z ==> 30

jshell> /vars
|    int x = 10
|    int y = 20
|    int z = 30

jshell> System.out.println(z);
30

jshell> 10 * 20 // altomaticamente ele cria uma variavel com $
$6 ==> 200

jshell> 

```