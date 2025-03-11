# APIRESTFULL - GEARVAULT

Este é o Gearvault construído com **Spring Boot** e configurado para usar o banco de dados **PostgreSQL**. Abaixo estão as instruções para configurar e executar o projeto localmente.

---

## Pré-requisitos

Antes de começar, certifique-se de que você tenha os seguintes itens instalados em sua máquina:

1. **Java 17**: O projeto foi desenvolvido usando Java 17. Certifique-se de que a versão correta esteja instalada.
   ```bash
   java --version
   
2. **Maven** : O gerenciador de dependências Maven é usado para construir o projeto.
    ```bash
    mvn -v
   
3. **PostgreSQL** : O projeto utiliza o PostgreSQL como banco de dados. Certifique-se de que o PostgreSQL esteja.


4. **Git** : Para clonar o repositório, você precisará do Git instalado.
    ```bash
    git --version 

5. ## Configuração do Banco de Dados

O projeto está configurado para conectar-se a um banco de dados PostgreSQL com as seguintes configurações:

URL do banco de dados : jdbc:postgresql://localhost:5432/postgres

Usuário : postgres

Senha : abc123

#### Lembrando que se você quiser utilizar outra senha ou usuario do postgress basta
#### configurar o arquivo aplication.properties

## Clonando o Repositório

6. ### Para clonar o repositório, execute o seguinte comando:
    ```bash
    git clone https://github.com/Luizbernardi/GearVault-BE
    cd GearVault-BE

## Configurando o Projeto

7. Instale as dependências :

   Execute o seguinte comando para baixar todas as dependências necessárias:
    ```bash
    mvn clean install

## Configurando o Projeto

8. Inicie a aplicação :

   Use o seguinte comando para iniciar o servidor Spring Boot:
    ```bash
    mvn spring-boot:run                      
.




   


   



 
