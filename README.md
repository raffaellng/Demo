# Demo

- Um simples sistema que calcula a taxa de juros com o EndPoint chamado "/calcula-juros" feito no Swagger
- Ela faz um cálculo em memória, de juros compostos, conforme abaixo: Valor Final = Valor Inicial * (1 + juros) ^ Tempo
- Ele consome um WebService via Rest (o projeto demo1) para trazer qual e a tacha de juros que está sendo atualizada.

# Tecnologias usada
- springBoot
- Lombok
- Flyway
- Java 17
- hibernate
- Swagger


-----------------------------------------
Link da página
http://localhost:8081/swagger-ui/index.html


-----------------------------------------
Os dois sistemas como "Demo" e "Demo1" tem que está rodando simultaneamente, para que a aplicação e o cálculo traga a informação correta.

Exemplo de entrada
valorinicial=100
meses=5 
Resultado esperado: 105,10
