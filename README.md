# Atividades Senac
<h2>Atividade do curso Tecnico em Desenvolvimento de Sistemas</h2>

Exercícios propostos!


  A empresa de desenvolvimento retorna ao projeto de desenvolvimento de sistema para uma agência de viagens.
  Esse sistema precisa registrar pacotes de viagens e registrar dados de uma venda. Cada pacote de viagens é formado pelo meio de           transporte e pela hospedagem – cada meio de transporte tem tipo e valor e cada hospedagem tem tipo e valor. Os valores de pacote de       viagem são formados pelos valores do transporte e
  hospedagem somados a uma margem de lucro e taxas adicionais.

A venda inclui dados do cliente, forma de pagamento, data, pacote sendo vendido e precisa ser capaz de converter o valor do pacote em reais
para dólar e vice versa.
Sua tarefa será aplicar orientação a objetos para desenvolver um módulo em Java desse sistema.


Atividade
No NetBeans crie um projeto Java (tipo console) com os seguintes itens:</h3>

<h3>Classe para transporte, com o tipo (aéreo, rodoviário, marítimo etc) e valor;</h3>

<h3>Classe para hospedagem, com descrição e valor de diária;</h3>

<h3>Classe para pacote de viagem, com transporte, hospedagem, destino (texto),   quantidade de dias. Essa classe ainda deve ser capaz de:</h3>
  
  - Calcular o total de hospedagem a partir do número de dias e o valor da diária.
  - Calcular valor de lucro a partir de uma margem informada (porcentagem) e valor      informado. O resultado retornado deve
  ser o valor + margem aplicada ao valor.
  - Calcular e retornar o total do pacote, somando o transporte, o total da             hospedagem e valores adicionais informados –
  margem de lucro (porcentagem) e taxas adicionais (valor monetário).
  - Observação: Os valores nesta classe serão considerados em dólar.


<h3>Classe para venda, que possui o nome do cliente, forma de pagamento e pacote de viagem. A classe deve ser capaz de:</h3>
  
  - Converter um valor em reais a partir de um valor informado em dólar e da cotação    da moeda, também informada.
  - Mostrar na tela o total do pacote de viagem em dólar e em reais.

<h3>Na classe principal, elabore código para interação com o usuário em que seja possível “cadastrar” uma venda:</h3>


Entrega
No espaço dedicado a entregas da atividade, envie um arquivo compactado (ZIP, RAR ou 7z) contendo o projeto NetBeans criado para a
atividade e uma imagem com o diagrama UML desenvolvido.


# English

# Activities Senac
<h2>Course activity Technician in Systems Development</h2>

Proposed exercises!


   The development company returns to the system development project for a travel agency.
   This system needs to register travel packages and record data for a sale. Each travel package is made up of the means of transport and accommodation – each means of transport has a type and value and each accommodation has a type and value. The values of the travel package are formed by the values of the transport and
   hosting plus a profit margin and additional fees.

The sale includes customer data, payment method, date, package being sold and needs to be able to convert the package value into reais
to dollar and vice versa.
Your task will be to apply object orientation to develop a Java module of this system.


Activity
In NetBeans create a Java project (console type) with the following items:</h3>

<h3>Class for transport, with type (air, road, sea, etc) and value;</h3>

<h3>Class for accommodation, with description and daily rate;</h3>

<h3>Class for travel package, with transport, accommodation, destination (text), number of days. This class should still be able to:</h3>
  
   - Calculate the total accommodation from the number of days and the daily rate.
   - Calculate profit value from an informed margin (percentage) and informed value. The returned result must
   be the value + margin applied to the value.
   - Calculate and return the total of the package, adding the transport, the total of the accommodation and additional values informed –
   profit margin (percentage) and additional fees (monetary value).
   - Note: The values in this class will be considered in dollars.


<h3>Class for sale, which has the name of the customer, payment method and travel package. The class must be able to:</h3>
  
   - Convert a value in reais from a value informed in dollar and the quotation of the currency, also informed.
   - Show on the screen the total of the travel package in dollars and reais.

<h3>In the main class, write code for interaction with the user in which it is possible to “register” a sale:</h3>


Delivery
In the space dedicated to activity deliveries, send a compressed file (ZIP, RAR or 7z) containing the NetBeans project created for the
activity and an image with the developed UML diagram.
