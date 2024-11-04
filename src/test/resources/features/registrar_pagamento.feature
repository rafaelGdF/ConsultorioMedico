Feature: Registrar Pagamento da Consulta

  Scenario: Registrar um pagamento para a consulta
    Given uma consulta realizada para o paciente "João"
    And o valor da consulta é 150.00
    When o pagamento de 150.00 é registrado
    Then o valor pago deve ser 150.00
    And o pagamento deve ser marcado como realizado