# Api-Transporte

[![Build Status](https://travis-ci.com/vandersozc/api-transporte.svg?branch=master)](https://travis-ci.com/vandersozc/api-transporte)
[![SonarQube Coverage](https://sonarcloud.io/api/project_badges/measure?project=com.vandersoncamp%3Aapi-transporte&metric=coverage)](https://sonarcloud.io/dashboard?id=com.vandersoncamp%3Aapi-transporte)
[![SonarQube Code Smells](https://sonarcloud.io/api/project_badges/measure?project=com.vandersoncamp%3Aapi-transporte&metric=code_smells)](https://sonarcloud.io/dashboard?id=com.vandersoncamp%3Aapi-transporte) 


## Projeto

Serviço Rest para integração de dados de linhas de transporte

## Instalação

Este projeto utiliza [Maven](https://maven.apache.org/) para build e gerenciamento das dependências e foi construído utilizando o Framework [Spring](https://spring.io/). Efetuar o download do projeto e executar o arquivo:

```sql
TransporteApplication.java
```
O banco de dados utilizado na api foi o [PostgreSQL](https://www.postgresql.org/), o banco pode ser alterado conforme necessidade do usuario. Para utilizar outro banco é necessário alterar as configurações no arquivo:

```sql
application.properties
```
O PostgreSql foi escolhido por se tratar de um banco de fácil acesso, se destaca por ser robusto e permitir realizar todos os comandos necessários para a exeecução da API. O banco pode ser criado atarvés do comando:

```sql
CREATE DATABASE "transporteDB" WITH OWNER = postgres ENCODING = 'UTF8' CONNECTION LIMIT = -1;
```

## Testes e Cobertura

Utiliza [JUnit 5](https://junit.org/junit5/) para testes unitários e testes de integração, foi utilizado devido a utilização em grande escala pelas empresas e em sua última versão trouxe melhorias e tornou os teste e asserts mais simplificados devido ao uso de expressões lambdas. Para os testes unitários foi utilizado o Framework [Mockito](https://site.mockito.org/) para criação de objetos em escopo de teste. Para os testes de integração da API foi utilizado o serviço [REST-assured](http://rest-assured.io/) para testar e validar os serviços, proporciona um real acesso externo aos endpoints da API.

Para os testes de integração da API foi utilizado o banco de dados [HSQLDB](http://hsqldb.org/). Foi utilizado por ser consideravelmente pequeno e eficiente na execução de testes, simula e execução real dos serviços de persistência em bancos relacionais comuns, alem de ter uma configuração simples.

## Build e Análise
- O build, execução dos testes, e geração de relatórios de cobertura pode ser visualizado remotamente através do: [Travis CI](https://travis-ci.com/vandersozc/api-transporte).
- A análise de código e relatório de cobertura de testes pode ser visualizada em: [SonarCLoud](https://sonarcloud.io/dashboard?id=com.vandersoncamp%3Aapi-transporte).

## Serviços

Serviços disponíveis para utilização da API.

```json
Criar cliente: 
POST: http://localhost:8080/clientes

{
   "nome": "Luis Carlos da Silva",
   "documento":"70678646821",
   "telefone":"48339828609",
   "email":"luis.carlos_@gmail.com"
}
```

```json
Listar clientes: 
GET: http://localhost:8080/clientes

[
	{
		"id": 1,
		"nome": "Luis Carlos da Silva",
		"documento": "70678646821",
		"telefone": 48339828609,
		"email": "luis.carlos_@gmail.com"
	},
	{
		"id": 2,
		"nome": "Maria de Paula",
		"documento": "99044019260",
		"telefone": 4834369822,
		"email": "maria_p_@gmail.com"
	}
]
```

```json
Buscar cliente: 
GET: http://localhost:8080/clientes/{id}

{
    "id": 1,
    "nome": "Luis Carlos da Silva",
    "documento": "70678646821",
    "telefone": 48339828609,
    "email": "luis.carlos_@gmail.com"
}
```

```json
Atualizar um cliente: 
PUT: http://localhost:8080/clientes/{id}

{
	"id": 2,
	"nome": "Maria de Paula Freitas",
	"documento": "99044019260",
	"telefone": 4834369822,
	"email": "maria_p_@gmail.com"
}
```

```json
Remover um cliente: 
DELETE: http://localhost:8080/clientes/{id}
```

```json
Integrar dados de linhas de Ônibus: 
POST: http://localhost:8080/linha-onibus/integrar
```

```json
Integrar dados de linhas de Lotações: 
POST: http://localhost:8080/linha-lotacao/integrar
```

```json
Listar as linhas de ônibus: 
GET: http://localhost:8080/linha-onibus/consultar
```

```json
Filtrar a lista de ônibus pelo nome: 
GET: http://localhost:8080/linha-onibus/filter?nome=agostinho
```

```json
Listar as linhas de Lotações: 
GET: http://localhost:8080/linha-lotacao/consultar
```

```json
Incluir linhas de Ônibus ou Lotações para um cliente: 
POST: http://localhost:8080/cliente-linha

{
   "cliente":{
      "id":"1"
   },
   "linhasOnibus":[
      {
         "id":"5527",
         "codigo":"250-1",
         "nome":"1 DE MAIO"
      },
      {
         "id":"5037",
         "codigo":"214-1",
         "nome":"5ª UNIDADE\/ESCOLAR"
      }
   ],
   "linhasLotacoes":[
      {
         "id":"34",
         "codigo":"20.5-1",
         "nome":"ALTO TERESOPOLIS - VIA PRAIA DE BELAS"
      },
      {
         "id":"35",
         "codigo":"20.5-2",
         "nome":"ALTO TERESOPOLIS - VIA PRAIA DE BELAS"
      }
   ]
}
```

```json
Listar todas as linhas cadastradas para o cliente: 
GET: http://localhost:8080/cliente-linha/cliente/{id}
```
