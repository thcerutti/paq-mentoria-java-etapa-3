## Objetivo do projeto

O objetivo sdo projeto é criar telas de inclusão, pesquisa e listagem com opção de explusão de registros de educandos do PAQ.

## Estruturas de dados

```sql
EDUCANADO
  ID: int
  NOME: varchar(255)
  ETAPA: ETAPA_ID
  UNIDADE: UNIDADE_ID

ETAPA
  ID: int
  NOME: varchar(255)

UNIDADE
  ID: int
  NOME: varchar(255)
```

## Mockup das telas

![Cadastro de educando](./doc/cadastro.png)

![Busca de educando](./doc/busca.png)

![Listagem de educando](./doc/lista.png)

## Conceitos utilizados: DTO e DAO

**DTO** significa "Data Transfer Object". É um objeto que contém dados que serão transferidos entre diferentes partes de um programa. Por exemplo, se você tem um programa que precisa enviar informações de um usuário para um servidor, você pode usar um DTO para encapsular essas informações em um objeto simples e fácil de enviar pela rede.

Um exemplo de DTO em Java seria um objeto UsuarioDTO que contém os campos nome, email e idade. Esse objeto pode ser facilmente serializado e enviado pela rede para outro componente do programa.

Já o **DAO** significa "Data Access Object". É um objeto que fornece uma interface para acessar um banco de dados ou outra fonte de dados. O objetivo do DAO é abstrair o acesso aos dados para que outras partes do programa possam interagir com os dados sem precisar conhecer os detalhes de como eles são armazenados ou recuperados.

Um exemplo de DAO em Java seria um objeto UsuarioDAO que contém métodos para criar, ler, atualizar e excluir objetos de usuário em um banco de dados. Por exemplo, o método criarUsuario(UsuarioDTO usuario) pode ser usado para criar um novo usuário no banco de dados com base nas informações contidas no objeto UsuarioDTO.

---

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
