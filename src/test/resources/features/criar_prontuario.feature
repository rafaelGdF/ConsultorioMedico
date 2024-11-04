Feature: Criar Prontuário do Paciente

  Scenario: Criar um prontuário para um paciente
    Given um paciente com nome "João" e CPF "123.456.789-00"
    When o prontuário do paciente é criado
    Then o prontuário deve estar disponível para consultas
    And deve conter as informações do paciente