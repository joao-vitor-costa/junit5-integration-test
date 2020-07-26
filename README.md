## Caso de estudo para JUnit 5: Teste de unidade Spring MVC com JUnit 5

##### Teste de unidade de um serviço Spring MVC, controlador e repositório com JUnit 5, Mockito, MockMvc e DBUnit

O Spring MVC é uma das estruturas Java mais populares para a construção de aplicativos Java corporativos e se presta muito bem a testes. Por design, o Spring MVC promove a separação de preocupações e incentiva a codificação contra interfaces. Essas qualidades, juntamente com a implementação da injeção de dependência do Spring, tornam os aplicativos do Spring muito testáveis.

JUnit 5
O framework JUnit 5 é composto do JUnit Platform + JUnit Jupiter + JUnit Vintage
- JUnit Platform — Para poder acionar os testes unitários as IDEs, ferramentas de build ou plugins precisam incluir e estender APIs da plataforma do JUnit5. JUnit5 Plataform define a API TestEngine para desenvolver novas estruturas de teste que são executadas na plataforma, ele também fornece um console para iniciar a plataforma a partir da linha de comando e criar plugins para Gradle e Maven.
- JUnit Jupiter — Inclui novos modelos de programação e extensão para escrever testes. Possui todas as novas anotações junit e a implementação TestEngine para executar testes escritos com essas anotações.
- JUnit Vintage — Seu principal objetivo é oferecer suporte à execução de testes escritos JUnit 3 e JUnit 4 na plataforma JUnit5. Há compatibilidade com versões anteriores.

#### Teste de Integração
Segundo o autor Somerville há basicamente três fases de testes: de unidade, de integração e de sistema.

Os testes de unidade são testes de componentes individuais. Os testes do sistema resultam dos testes da união dos componentes de hardware e de software. Os testes de integração são os testes das interações entre componentes de software, ou seja, é o caminho no qual o teste é conduzido para integrar componentes no sistema. O teste de integração é o processo de verificar se os componentes do sistema, juntos, trabalham conforme descrito nas especificações do sistema e do projeto do programa.

Na fase de teste de integração, o objetivo é encontrar falhas provenientes da integração interna dos componentes de um sistema. Geralmente os tipos de falhas encontradas são de transmissão de dados. Por exemplo, um componente A pode estar aguardando o retorno de um valor X ao executar um método do componente B; porém, B pode retornar um valor Y, gerando uma falha. Não faz parte do escopo dessa fase de teste o tratamento de interfaces com outros sistemas (integração entre sistemas). Essas interfaces são testadas na fase de teste de sistema e não teste de integração.

Referencia: https://www.infoworld.com/article/3543268/junit-5-tutorial-part-2-unit-testing-spring-mvc-with-junit-5.html