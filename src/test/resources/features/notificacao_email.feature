Feature: Enviar Notificação por E-mail

  Scenario: Enviar notificação de consulta agendada
    Given um paciente com e-mail "joao@example.com"
    And um médico "Dra. Maria"
    And uma consulta agendada para "2024-11-10 15:30"
    When a notificação é enviada para o paciente
    Then o paciente deve receber um e-mail com a confirmação da consulta