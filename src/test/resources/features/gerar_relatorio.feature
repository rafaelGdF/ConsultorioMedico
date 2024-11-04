Feature: Gerar Relatório de Consulta

  Scenario: Gerar relatório de consulta
    Given uma consulta realizada para o paciente "João"
    And com feedback "O paciente apresentou boa evolução"
    When o relatório da consulta é gerado
    Then o relatório deve incluir o nome do paciente
    And o nome do médico
    And a data e hora da consulta
    And o feedback registrado