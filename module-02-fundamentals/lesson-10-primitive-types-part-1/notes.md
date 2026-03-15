# Tipos primitivos - boolean, char, byte e short
- Cada variável tem uma capacidade de armazenamento
- Escolhementos o mais adequado

|  Tipo   | Tamanho (bits) | Menor valor | Maior valor |
| :-----: | :------------: | :---------: | :---------: |
| boolean |       1        |    false    |    true     |
|  char   |       16       |      0      |  2^16^ - 1  |
|  byte   |       8        |    -2^7^    |   2^7^-1    |
|  short  |       16       |   -2^15^    |  2^15^ - 1  |
|   int   |       32       |   -2^31^    |  2^31^ - 1  |
|  long   |       64       |   -2^63^    |  2^63^ - 1  |
|  float  |       32       |      -      |      -      |
| double  |       64       |      -      |      -      |

[BooleanExample.java](BooleanExample.java)
[CharExample.java](CharExample.java)
[ByteExample.java](ByteShortExample.java)
[ShortExample.java](ShortExample.java)

## Boolean
- Verdadeiro (true) ou falso (false)

## Char
- Representa um caractere (letra ou dígito)
- Equivale a 2 bytes

## Byte e Short
- Inteiros com capacidade de tamanho menor cada um
- Byte (-128 até 127)
- Short (-32768 até 32767)
- Avalie sempre qual vai usar
- Geralmente se usa mais o int ou o byte