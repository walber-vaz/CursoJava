## Estudos Java

<!-- Conceita da linguagem java -->

### Conceito da linguagem java

Java é uma linguagem de programação de alto nível, orientada a objetos, que foi desenvolvida na década de 1990 pela Sun Microsystems (agora propriedade da Oracle Corporation). A linguagem Java é uma das linguagens de programação mais populares do mundo e é amplamente usada em uma variedade de aplicativos de software, desde sistemas operacionais até aplicativos móveis.

Algumas das principais características da linguagem Java incluem:

- Orientação a objetos: Java é uma linguagem de programação orientada a objetos, o que significa que os programas são construídos a partir de "objetos" que possuem propriedades e comportamentos específicos.

- Portabilidade: Uma das principais características do Java é sua portabilidade, o que significa que os programas Java podem ser executados em qualquer plataforma que possua um ambiente Java instalado.

- Segurança: Java é considerada uma linguagem de programação segura, pois possui recursos de segurança incorporados que ajudam a proteger contra ameaças cibernéticas, como ataques de vírus ou malwares.

- Garbage Collection: Java possui um sistema de gerenciamento de memória automático, conhecido como "garbage collection", que ajuda a liberar a memória não utilizada pelos programas.

- Multiplataforma: Java pode ser usado em vários tipos de dispositivos, como desktops, laptops, servidores, smartphones, tablets, etc.

- Facilidade de aprendizado: A sintaxe do Java é relativamente fácil de aprender, especialmente para programadores que já possuem experiência em outras linguagens de programação.

- Biblioteca padrão: Java possui uma biblioteca padrão rica em recursos que oferece uma ampla gama de classes e métodos para lidar com tarefas comuns de programação.

Essas características tornam Java uma linguagem de programação popular e útil para uma ampla gama de aplicativos de software.

<!-- Conceito de orientação a objetos -->

### Conceito de orientação a objetos

Orientação a Objetos (OO) é um paradigma de programação que se concentra na criação de "objetos" que possuem dados e comportamentos específicos. Em Java, a OO é um conceito fundamental, e a maioria dos programas Java são escritos usando os princípios da OO.

A OO em Java é baseada em quatro conceitos principais: encapsulamento, herança, polimorfismo e abstração. Esses conceitos são explicados abaixo:

- Encapsulamento: Encapsulamento é a prática de ocultar os detalhes de implementação de um objeto, permitindo apenas que os usuários interajam com ele por meio de uma interface bem definida. Em Java, a encapsulação é implementada por meio de classes e seus membros, que podem ser declarados como públicos, privados ou protegidos.

- Herança: Herança é a prática de criar novas classes que são baseadas em classes existentes. As classes que são estendidas são chamadas de "classes pai" ou "superclasses", enquanto as classes que as estendem são chamadas de "classes filhas" ou "subclasses". Em Java, a herança é implementada usando a palavra-chave "extends".

- Polimorfismo: Polimorfismo é a capacidade de um objeto de assumir muitas formas diferentes. Em Java, o polimorfismo é implementado usando sobrecarga de métodos e polimorfismo de subtipo.

- Abstração: Abstração é a prática de criar um modelo de objetos que represente as características essenciais dos objetos, ignorando os detalhes não essenciais. Em Java, a abstração é implementada por meio de interfaces e classes abstratas.

Esses conceitos permitem que os programadores em Java criem programas robustos e flexíveis, que possam ser facilmente mantidos e estendidos ao longo do tempo.

**Variáveis tem regras serem seguidas e são**

- 1 - Não pode começar com número
- 2 - Não pode conter caracteres especiais
- 3 - Não pode ser uma palavra reservada
- 4 - Não pode conter espaços
- 5 - Não pode conter acentos
- 6 - Não pode começar com letra maiúscula
- 7 - Palavras compostas devem ser separadas por letra maiúscula

## Palavras reservadas

<!-- Conceito palavras reservada -->

### Conceito palavras reservada

Palavras reservadas são palavras que já estão reservadas para uso exclusivo da linguagem Java. Não é possível usar palavras reservadas como nomes de variáveis, classes, métodos, etc.

<!-- Tabela palavras reservadas -->

### Tabela palavras reservadas

| abstract | assert | boolean | break | byte | case | catch | char | class | const | continue | default | do | double | else | enum | extends | final | finally | float | for | goto | if | implements | import | instanceof | int | interface | long | native | new | package | private | protected | public | return | short | static | strictfp | super | switch | synchronized | this | throw | throws | transient | try | void | volatile | while |

## Tipos de dados

<!-- Conceito -->

### Conceito

Tipos de dados são usados para armazenar valores em variáveis. Tipos de dados são divididos em 2 tipos:

<!-- Tipos primitivos -->

### Tipos primitivos

<!-- Conceito tipo primitivos -->

Tipos primitivos são tipos de dados que não são objetos. Tipos primitivos são divididos em 8 tipos:

**Casting**

Cast é a conversão de um tipo de dado para outro. Para fazer um cast, basta colocar o tipo de dado entre parênteses antes do valor.

```java
int x = 4;
double y = x; // casting implicito
System.out.println(y); // 4.0

double a = 5.5;
int b = (int) a; // casting explicito
System.out.println(b); // 5
```

- Tipos primitivos são divididos em 8 tipos:
  - byte
  - short
  - int
  - long
  - float
  - double
  - boolean
  - char

<!-- Tamanho numérico dos tipos primitivos -->

#### Tamanho numérico dos tipos primitivos

- byte: 8 bits
- short: 16 bits
- int: 32 bits
- long: 64 bits
- float: 32 bits
- double: 64 bits
- boolean: 1 bit
- char: 16 bits

<!-- Tamanho range dos tipos primitivos -->

#### Tamanho range dos tipos primitivos

- byte: -128 a 127
- short: -32.768 a 32.767
- int: -2.147.483.648 a 2.147.483.647
- long: -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
- float: 3.402.823.5 E+38 a 1.4 E-45
- double: 1.797.693.134.862.315.7 E+308 a 4.9 E-324
- boolean: true ou false
- char: 0 a 65.535

<!-- Default values -->

#### Default values

- byte: 0
- short: 0
- int: 0
- long: 0
- float: 0.0
- double: 0.0
- boolean: false
- char: '\u0000'

### Tipos de referência

Tipos de referência são tipos de dados que são objetos. Tipos de referência são divididos em 3 tipos:

- String
- Arrays
- Classes

## Tipo String

Em Java, o tipo String é uma classe que representa uma sequência de caracteres. O tipo String é muito comum em programas Java, e é usado para representar texto e outras informações baseadas em caracteres. A classe String é parte da biblioteca padrão do Java, e oferece uma variedade de métodos para manipular strings.

A classe String em Java é imutável, o que significa que, uma vez criada, uma string não pode ser modificada. Em vez disso, sempre que você faz uma operação que modifica uma string, como concatenação, substituição de caracteres ou conversão de caixa, uma nova string é criada. Isso pode ser ineficiente em algumas situações, mas garante a integridade dos dados e evita problemas de concorrência em ambientes multithread.

Para criar uma string em Java, você pode simplesmente declarar uma variável do tipo String e atribuir um valor de string a ela, usando aspas duplas. Por exemplo:

```java
String s = "Hello World";
```

Em Java, as strings são comparadas usando o método equals(). Esse método retorna true se duas strings tiverem o mesmo conteúdo, ou seja, os mesmos caracteres na mesma ordem. Por exemplo:

```java
String s1 = "hello";
String s2 = "HELLO".toLowerCase();

if (s1.equals(s2)) {
    System.out.println("As strings são iguais.");
} else {
    System.out.println("As strings são diferentes.");
}
```

Este código irá imprimir "As strings são iguais", porque as duas strings têm o mesmo conteúdo.

A classe String em Java também oferece muitos outros métodos úteis para trabalhar com strings, como length(), substring(), replace(), indexOf() e split(). Com esses métodos, você pode realizar muitas operações comuns em strings, como encontrar substrings, substituir caracteres, dividir uma string em partes e muito mais.

## Operadores aritméticos

Os operadores aritméticos em Java são símbolos usados para realizar operações matemáticas em expressões numéricas. Eles incluem:

- Adição (+): usada para adicionar dois valores
- Subtração (-): usada para subtrair dois valores
- Multiplicação (\*): usada para multiplicar dois valores
- Divisão (/): usada para dividir dois valores
- Módulo (%): usado para obter o resto da divisão de dois valores
- Incremento (++) : usado para incrementar um valor
- Decremento (--): usado para decrementar um valor

Esses operadores podem ser usados ​​em expressões matemáticas simples ou complexas e também podem ser combinados com outros operadores e funções matemáticas para executar cálculos mais avançados. Além disso, é importante lembrar que em Java, a ordem de precedência dos operadores aritméticos segue a mesma ordem da matemática convencional, ou seja, parênteses, multiplicação e divisão e, em seguida, adição e subtração.

### Conograma de estudos

Aqui estão algumas dicas que podem ajudá-lo a estudar Java e seguir um cronograma:

- 1 Defina seus objetivos: Antes de começar a estudar Java, defina seus objetivos. Pergunte a si mesmo: "Por que quero aprender Java?" e "O que quero ser capaz de fazer com Java?" Ter objetivos claros pode ajudá-lo a manter o foco e o interesse enquanto estuda.

- 2 Escolha um bom livro ou curso online: Existem muitos livros e cursos online disponíveis que podem ajudá-lo a aprender Java. Escolha um recurso que seja adequado para o seu nível de habilidade e que se adapte à sua maneira de aprender.

- 3 Defina um cronograma de estudos: Defina um cronograma de estudos realista e prático para o seu tempo disponível. Estabeleça horários regulares de estudo e tente seguir o cronograma o máximo possível.

- 4 Pratique programação: A prática é fundamental para aprender Java. Além de estudar a teoria, tente resolver problemas de programação e construir pequenos projetos para aplicar o que aprendeu.

- 5 Participe de fóruns e comunidades: Participe de fóruns de discussão, grupos de estudos e comunidades de programadores de Java. Isso pode ajudá-lo a obter respostas para suas dúvidas e a compartilhar conhecimento com outras pessoas.

- 6 Use ferramentas e recursos: Use ferramentas e recursos como IDEs (Integrated Development Environments) para programação em Java, documentação oficial da linguagem Java e outras bibliotecas e frameworks para acelerar seu processo de aprendizado.

- 7 Aprenda com projetos de código aberto: Analisar projetos de código aberto em Java pode ajudá-lo a aprender técnicas avançadas de programação e padrões de design.

Seguir essas dicas pode ajudá-lo a aprender Java de maneira eficiente e eficaz, enquanto segue um cronograma de estudos para alcançar seus objetivos.
