# lumini-api

O projeto foi desenvolvido com intuito de apresentar alguns conceitos e tecnologias como por exemplo:
- Aplicação de microservices;
- Chamada dos microservices dentro de uma aplicação angular; 
- Dados mocados para demostração de tratamentos de erros; 
- Testes unitários na camada service e resource; 
- Efetuar conteinerização dos projetos com Docker/Docker-compose; 

Obs: Coloquei de forma mocada o CNPJ *80331355000100*, qualquer outro informado será INVÁLIDO, feito dessa forma para demostrar os tratamentos de erros dentro da aplicação. 

# Passos para executar o projeto: 

1 - Entrar na pasta raiz e executar o comando do docker para subir o backend:
```
docker-compose up --build
```

2 - Entrar na pasta front-app e executar o comando: 
```
ng serve
```

3 - Após subir todo o ambiente, poderá acessar as URLS: 

- API-Endereço: http://localhost:8080/endereco-api/swagger-ui.html (Usar o CNPJ 80331355000100 como válido)
- API-Calculo: http://localhost:8081/calculo-api/swagger-ui.html
- Frontend: http://localhost:4200
