Feature: Agendar Consulta

  Scenario: Agendar uma consulta
    Given um paciente com nome "João", CPF "123.456.789-00" e e-mail "joao@example.com"
    And um médico "Dra. Maria", CRM "987654" e especialidade "Dermatologia"
    And uma data e hora "2024-11-10 15:30"
    When a consulta é agendada
    Then a consulta deve ser criada
    And o paciente da consulta deve ser "João"
    And o médico da consulta deve ser "Dra. Maria"
    And a data e hora da consulta deve ser "2024-11-10 15:30"