## Singleton com MultiThreads até 10/05

Diagrama: [Link](https://drive.google.com/file/d/1Br5MW7l0oqrp5SX0CuTF65AxLy9YOVUe/view?usp=sharing)

Aberto: quarta, 10 abr 2024, 00:00

Vencimento: sexta, 10 mai 2024, 00:00

Criar uma aplicação para simular o acesso a um banco de dados por meio de multiplas threads. 

Para isso Suponha uma classe DatabaseConnectionManager que representa um gerenciador de conexão com um banco de dados. Como é comum em ambientes de aplicativos web, queremos garantir que apenas uma instância do gerenciador de conexão seja criada para evitar problemas de concorrência ao acessar o banco de dados.

Suponha uma classe DatabaseAccessThread que representa threads que buscam acessar o banco de dados. Esta classe será responsável por solicitar a conexão com o banco de dados através do gerenciador de conexão.

O Objetivo da aplicação é garantir que apenas uma instância do DatabaseConnectionManager seja criada e compartilhada por todas as threads de acesso ao banco de dados, evitando assim problemas de concorrência ao manipular a conexão com o banco de dados.

Devem ser criadas pelo menos 5 Threads para acessar o Banco de dados. 