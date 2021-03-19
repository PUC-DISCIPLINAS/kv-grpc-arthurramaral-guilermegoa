# Trabalho - Key-Value Store com gRPC

## Alunos

[Arthur Rocha Amaral](https://github.com/ArthurRAmaral)

[Guilherme Oliveira Antônio](https://github.com/guilhermegoa)

---

## Professor

Hugo Bastos De Paula

---

## Descrição

Esse trabalho irá desenvolver um Key-Value store in memory utilizando o gRPC.
As primitivas do Key-Value Store são:

- put(key, value)
- get(key) : value
- getAllKeys() : Key[]

Neste trabalho, vocês deverão utilizar o protocolo gRPC para permitir que o cliente adicione uma chave e valor. Neste trabalho não será necessário implementar buckets de dados para cada cliente. Ou seja, todos os clientes poderão acessar uma base de dados comum.

---

## Classes

**GRPCClient:** Classe na qual executa as ações do cliente.

**GRPCServer:** Classe que inciar o servidor, instacionando VaultService.

**VaultService:**: Classe que faz controle da requisicões entre client e server e controla a forma de salvar e enviar aos dados, sendo o responsável por armazenas as chaves e gerenciá-las.

**Vault.java e vaultGrcp.java:** Classes geradas staticamente a partir da compilação do arquivo `vault.proto`, responsável por definir as mensagens do protocolo gRPC. Essas classes são responsáveis por serializar os dados em Java para que possa se comunicar com o gRPC de forma de que outras implementaçõs gRPC também entendam a mesma menssagem.

---

## Pré-requisitos

- Java Development Kit 8 (JDK 8)
- Apache Maven 3.6.3

## Como usar

Com o Maven instalado execute as seguintes etapas:

### Compilar:

```sh
mvn clean compile
```

Após a compilação, você pode executar o Servidor ou o Client.

### Para executar o Servidor:

```sh
mvn exec:java@server
```

O Servidor GRPC irá se comunicar pela porta 9089.

### Para executart o Cliente

```sh
mvn exec:java@client
```

Os Clientes se concetam com o Servidor em localhost:9089.
