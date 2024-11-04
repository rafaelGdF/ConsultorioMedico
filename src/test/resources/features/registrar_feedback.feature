Feature: Registrar Feedback da Consulta

  Scenario: Registrar feedback da consulta
    Given uma consulta realizada para o paciente "João"
    When o feedback "O paciente está se recuperando bem" é registrado
    Then o feedback deve ser associado à consulta