# CadastroBD - Projeto de Cadastro com Conexão a Banco de Dados

Este projeto é um sistema de cadastro implementado em Java com conexão a um banco de dados SQL Server. Ele demonstra a utilização de Programação Orientada a Objetos (POO), JDBC e padrão DAO (Data Access Object). Ele permite o cadastro e gerenciamento de pessoas físicas e jurídicas, utilizando classes, herança, interfaces e persistência em banco de dados.


## Estrutura do Projeto
PROCEDIMENTO 1 :[Clique aqui ](Procedimento1.pdf)para baixar o arquivo PDF explicando o procedimento 1, com o primeiro teste, repostas de perguntas do aprendizado.<br><br>
PROCEDIMENTO 2 : [Clique aqui ](Procedimento2.pdf)para baixar o arquivo PDF explicando o procedimento 2 main FINAL, e com as respostas das perguntas do aprendizado que tive neste nivel.<br><br>
O projeto está estruturado da seguinte forma:<br>
- Pacote `cadastrobd`:
  - `CadastroBD.java`: Classe principal do projeto que contém o método main para interagir com o usuário através do console.
  - `CadastroBDTest.java`: Classe secundária de primeiro teste onde foi testados os métodos CRUD antes de serem adicionados na interface da classe principal.
- Pacote `cadastrobd.model`:
  - `Pessoa.java`: Classe abstrata que representa uma pessoa, com atributos como `id`, `nome`, `logradouro`, `cidade`, `estado`, `telefone` e `email`.
  - `PessoaFisica.java`: classe que herda de `Pessoa` e adiciona os atributos `cpf`.
  - `PessoaJuridica.java`: classe que herda de `Pessoa` e adiciona o atributo `cnpj`.
- Pacote `cadastro.model.util` :
  - `ConectorBD.java`: Classe de utilidade para estabelecer conexão com o banco de dados, criar PreparedStatement e executar consultas ResultSet.
  - `SequenceManager.java`: Classe para gerenciar a obtenção de valores de sequência do banco de dados.
- Pacote `cadastro.modelDAO` :
  - `PessoaFisicaDAO.java`:  Classe que implementa o padrão DAO para operações relacionadas a pessoas físicas no banco de dados.
  - `PessoaJuridicaDAO.java`: Classe que implementa o padrão DAO para operações relacionadas a pessoas jurídicas no banco de dados.
  
## Utilização do Projeto

O projeto CadastroBD oferece um menu interativo para o usuário, com as seguintes opções:

1. Incluir: permite incluir uma nova pessoa física ou jurídica.
2. Alterar: permite alterar os dados de uma pessoa física ou jurídica existente.
3. Excluir: permite excluir uma pessoa física ou jurídica existente.
4. Exibir por ID: exibe os dados de uma pessoa física ou jurídica pelo seu ID.
5. Exibir todos: exibe os dados de todas as pessoas físicas ou jurídicas cadastradas.
6. Sair: finaliza a execução do sistema.

Ao selecionar uma opção, o sistema solicita os dados necessários e realiza a operação correspondente no banco de dados.

## Como Executar o Projeto
1. Certifique-se de que as bibliotecas do driver JDBC para SQL Server estejam configuradas no projeto.
2. Configure a conexão com o banco de dados na classe ConectorBD utilizando as informações apropriadas (URL, usuário e senha) que você configurou no SQL Server.
3. Execute a classe CadastroBD.java Programa usado NetBeans.
4. Siga as instruções do menu para interagir com o sistema.

## Considerações Finais

O projeto CadastroBD exemplifica a aplicação de conceitos de Programação Orientada a Objetos e persistência em banco de dados utilizando Java e o padrão DAO. Ele oferece uma visão prática de como criar um sistema de cadastro com interação com banco de dados SQL Server. Sinta-se à vontade para explorar o código e adaptá-lo conforme suas necessidades ou para estender suas funcionalidades.