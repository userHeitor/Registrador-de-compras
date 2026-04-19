spring boot + postgre

crie seu banco de compras antes de rodar o código

modelo:

CREATE TABLE compras (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    valor NUMERIC
);

ajustar senha e usuário, padrao:
postgres
carro123.

para acessar: http://localhost:8080

