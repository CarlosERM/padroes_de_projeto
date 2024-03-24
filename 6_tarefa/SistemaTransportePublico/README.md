### Atividade em Classe (UML e Código)

Problema: Sistema de Gerenciamento de Transporte Público (UML e Código)

O objetivo é projetar um sistema que gerencie os veículos de transporte público, como ônibus e metrô, em uma cidade. Cada tipo de veículo (ônibus e metrô) tem características específicas, como capacidade de passageiros, velocidade média, e método de cobrança de tarifas.

1.Características dos Veículos:

-Ônibus:

     - Capacidade de passageiros.

     - Método de pagamento (dinheiro, cartão, etc.).

     - Rotas (pontos de partida e destino).



 - Metrô:

     - Capacidade de passageiros.

     - Velocidade média.

     - Linhas (estações de partida e destino).

2. Funcionalidades do Sistema:

   - Criação de veículos de transporte.

   - Geração de rotas para os veículos.

   - Gestão de passageiros embarcando e desembarcando.

   - Monitoramento da capacidade dos veículos.

Para resolver esse problema, você pode usar o padrão Abstract Factory para criar famílias de objetos relacionados (veículos de transporte) e o padrão Factory Method para criar instâncias específicas desses objetos.

Implementação com Abstract Factory e Factory Method:

- Abstract Factory:

  - `TransportationFactory`: Fábrica abstrata para criar diferentes tipos de veículos de transporte (ônibus, metrô).

  - `BusFactory`: Fábrica concreta para criar ônibus.

  - `SubwayFactory`: Fábrica concreta para criar metrôs.

- Factory Method:

  - `Transport`: Interface para representar um veículo de transporte.

  - `Bus` e `Subway`: Implementações concretas de veículos de transporte.

  - `TransportFactory`: Interface para a criação de veículos de transporte.

  - `BusFactory` e `SubwayFactory`: Implementações concretas para criar instâncias específicas de ônibus e metrôs.

- Exemplo de Utilização:

  - O sistema cria uma instância da `TransportationFactory` para um determinado tipo de transporte público (ônibus ou metrô).

  - A fábrica cria instâncias específicas de veículos de transporte (ônibus ou metrô) usando o Factory Method.o