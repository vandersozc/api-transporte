INSERT INTO CLIENTES (NOME, DOCUMENTO, TELEFONE, EMAIL, OBSERVACAO)     VALUES ('Cliente válido', '69999118518', '478479931','cliente01.teste@gmail.com', current_date);INSERT INTO CLIENTES (NOME, DOCUMENTO, TELEFONE, EMAIL, OBSERVACAO)     VALUES ('Cliente inválido', '88888888888', '7239874', 'cliente02.teste@gmail.com', current_date    );INSERT INTO CLIENTES_LINHA (I_CLIENTE, TIPO_TRANSPORTE)     VALUES ((SELECT ID FROM CLIENTES WHERE DOCUMENTO = '69999118518'), '0');INSERT INTO CLIENTES_LINHA (I_CLIENTE, TIPO_TRANSPORTE)     VALUES ((SELECT ID FROM CLIENTES WHERE DOCUMENTO = '69999118518'), '1');INSERT INTO LINHA_ONIBUS (ID, NOME, CODIGO)     VALUES ('1', 'Transporte urbano', '123-8');