# Api-Transporte

[![Build Status](https://travis-ci.com/vandersozc/api-transporte.svg?branch=master)](https://travis-ci.com/vandersozc/api-transporte)
[![SonarQube Coverage](https://sonarcloud.io/api/project_badges/measure?project=com.vandersoncamp%3Aapi-transporte&metric=coverage)](https://sonarcloud.io/dashboard?id=com.vandersoncamp%3Aapi-transporte)
[![SonarQube Code Smells](https://sonarcloud.io/api/project_badges/measure?project=com.vandersoncamp%3Aapi-transporte&metric=code_smells)](https://sonarcloud.io/dashboard?id=com.vandersoncamp%3Aapi-transporte) 


-------
<p align="center">
    <a href="#projeto">Projeto</a> &bull;
	<a href="#instalação">Instalação</a> &bull;
	<a href="#testes-e-cobertura">Testes e Cobertura</a> &bull;
	<a href="#build-e-análise">Build e Análise</a> &bull;
	<a href="#servicos">Servicos</a> &bull;
</p>
-------

## Projeto

Serviço Rest para integração de dados de linhas de transporte

## Instalação

Este projeto utiliza [Maven](https://maven.apache.org/) para build e gerenciamento das dependências e foi construído utilizando o Framework [Spring](https://spring.io/). Efetuar o download do projeto e executar o arquivo:
```
TransporteApplication.java
```
O banco de dados utilizado na api foi o [PostgreSQL](https://www.postgresql.org/), o banco pode ser alterado conforme necessidade do usuario. Para utilizar outro banco é necessário alterar as configurações no arquivo:
```
application.properties
```
O PostgreSql foi escolhido por se tratar de um banco de fácil acesso, se destaca por ser robusto e permitir realizar todos os comandos necessários para a exeecução da API. O banco pode ser criado atarvés do comando:
```
CREATE DATABASE "transporteDB" WITH OWNER = postgres ENCODING = 'UTF8' CONNECTION LIMIT = -1;
```

## Testes e Cobertura

Utiliza [JUnit 5](https://junit.org/junit5/) para testes unitários e testes de integração. Para os testes unitários foi utilizado o Framework [Mockito]([JUnit 5](https://junit.org/junit5/) para criação de objetos. Para os testes de integração da API foi utilizado o serviço [REST-assured](http://rest-assured.io/) para testar e validar os serviços.

## Build e Análise
- O build, execução dos testes, e geração de relatórios de cobertura pode ser visualizado remotamente através do: [Travis CI](https://travis-ci.com/vandersozc/api-transporte).
- A análise de código e relatório de cobertura de testes pode ser visualizada em: [SonarCLoud](https://travis-ci.com/vandersozc/api-transporte).