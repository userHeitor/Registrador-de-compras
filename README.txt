spring boot + postgre
##################################################################
necessario ter jdk e maven instalado e configurado no path
##################################################################
crie seu banco de compras antes de rodar o código

modelo:

CREATE TABLE compras (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    valor NUMERIC
);
##################################################################
ajustar senha e usuário, padrao:
postgres
carro123.
##################################################################
para rodar:
mvn spring-boot:run
##################################################################
para acessar: http://localhost:8080
##################################################################

