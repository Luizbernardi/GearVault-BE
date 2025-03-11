API - Projeto Spring Boot
Este é um projeto de demonstração construído com Spring Boot e configurado para usar o banco de dados PostgreSQL . Abaixo estão as instruções para configurar e executar o projeto localmente.

Pré-requisitos
Antes de começar, certifique-se de que você tenha os seguintes itens instalados em sua máquina:

Java 17 : O projeto foi desenvolvido usando Java 17. Certifique-se de que a versão correta esteja instalada.
Verifique a versão instalada:
bash
Copiar
1
java --version
Maven : O gerenciador de dependências Maven é usado para construir o projeto.
Verifique a versão instalada:
bash
Copiar
1
mvn -v
PostgreSQL : O projeto utiliza o PostgreSQL como banco de dados. Certifique-se de que o PostgreSQL esteja instalado e rodando na sua máquina.
Verifique se o serviço do PostgreSQL está ativo:
bash
Copiar
1
sudo service postgresql status
Git : Para clonar o repositório, você precisará do Git instalado.
Verifique a versão instalada:
bash
Copiar
1
git --version
Configuração do Banco de Dados
O projeto está configurado para conectar-se a um banco de dados PostgreSQL com as seguintes configurações:

URL do banco de dados : jdbc:postgresql://localhost:5432/postgres
Usuário : postgres
Senha : abc123
Passos para configurar o PostgreSQL:
Crie um banco de dados chamado postgres (ou use outro nome, mas atualize a propriedade spring.datasource.url no arquivo application.properties).
sql
Copiar
1
CREATE DATABASE postgres;
Certifique-se de que o usuário postgres tenha permissão para acessar o banco de dados. Caso contrário, crie um novo usuário ou altere as credenciais no arquivo application.properties.
Clonando o Repositório
Para clonar o repositório, execute o seguinte comando:

bash
Copiar
1
2
git clone https://github.com/seu-usuario/seu-repositorio.git
cd api
Configurando o Projeto
Instale as dependências :
Execute o seguinte comando para baixar todas as dependências necessárias:
bash
Copiar
1
mvn clean install
Verifique o arquivo application.properties :
O arquivo src/main/resources/application.properties já está configurado com as propriedades abaixo. Se necessário, ajuste-as conforme o seu ambiente:
properties
Copiar
1
2
3
4
5
6
7
8
9
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.datasource.username=postgres
spring.datasource.password=abc123
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
Executando o Projeto
Inicie a aplicação :
Use o seguinte comando para iniciar o servidor Spring Boot:
bash
Copiar
1
mvn spring-boot:run
Acesse a API :
Após a inicialização, a API estará disponível em:
Copiar
1
http://localhost:8080
Estrutura do Projeto
Aqui está uma visão geral da estrutura do projeto:

Copiar
1
2
3
4
5
6
7
8
9
10
11
12
13
api/
├── src/
│   ├── main/
│   │   ├── java/com/gearvault/api/
│   │   │   ├── controllers/       # Controladores REST
│   │   │   ├── models/            # Modelos de entidade
│   │   │   ├── repositories/      # Interfaces de repositório JPA
│   │   │   └── ApiApplication.java # Classe principal do Spring Boot
│   │   └── resources/
│   │       ├── application.properties # Configurações do projeto
│   │       └── ...
│   └── test/                      # Testes unitários
└── pom.xml                        # Arquivo de configuração do Maven
Testando o Projeto
Para executar os testes unitários, use o seguinte comando:

bash
Copiar
1
mvn test
Contribuições
Se você deseja contribuir para este projeto, siga os passos abaixo:

Faça um fork do repositório.
Crie uma branch para sua feature:
bash
Copiar
1
git checkout -b feature/nome-da-feature
Faça commit das suas alterações:
bash
Copiar
1
git commit -m "Adiciona descrição da mudança"
Envie as alterações para o repositório remoto:
bash
Copiar
1
git push origin feature/nome-da-feature
Abra um Pull Request no GitHub.
Licença
Este projeto está licenciado sob a MIT License .

Com esse README.md, você fornece todas as informações necessárias para que outros desenvolvedores possam configurar e executar o projeto sem problemas. Certifique-se de ajustar os detalhes específicos, como o URL do repositório e outras configurações, conforme necessário.
