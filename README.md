# [DIO](www.dio.me) - Trilha Java B�sico

## Professor
- [Gleyson Sampaio](https://github.com/glysns)

## Aluno
- Alef Vinicius


## POO - Desafio

### Modelagem e Diagrama��o de um Componente iPhone

Neste desafio, voc� ser� respons�vel por modelar e diagramar a representa��o UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telef�nico e Navegador na Internet.

#### Contexto
Com base no v�deo de lan�amento do iPhone de 2007 (link abaixo), voc� deve elaborar a diagrama��o das classes e interfaces utilizando uma ferramenta UML de sua prefer�ncia. Em seguida, implemente as classes e interfaces no formato de arquivos `.java`.

[Lan�amento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)
- Minutos relevantes: 00:15 at� 00:55

#### Funcionalidades a Modelar
1. **Reprodutor Musical**
   - M�todos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telef�nico**
   - M�todos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   - M�todos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

### Objetivo
1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java (Opcional).

### Exemplo de Diagrama UML (Mermaid)
```mermaid
classDiagram
    class ReprodutorMusical {
        +exemploMetodo1()
        +exemploMetodo2(String exemplo)
    }

    class AparelhoTelefonico {
        +exemploMetodo1()
        +exemploMetodo2(String exemplo)
    }

    class NavegadorInternet {
        +exemploMetodo1()
        +exemploMetodo2(String exemplo)
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```

### Instru��es
1. Assista ao v�deo do lan�amento do iPhone para entender as funcionalidades principais.
2. Utilize uma ferramenta UML de sua prefer�ncia para criar o diagrama das classes e interfaces. Voc� pode utilizar o modelo acima (criado na sintaxe [Mermaid](https://mermaid.js.org/)), uma alternativa open-source e compat�vel com arquivos Markdown como este.
3. Opcionalmente, caso esteja cheio(a) de confian�a, pode implementar as classes Java representadas em seu diagrama UML.
4. Submeta seu reposit�rio GitHub conforme as orienta��es da plataforma DIO. Por exemplo:

```bash
https://github.com/glysns/trilha-java-basico/desafios/poo/README.md
```` 