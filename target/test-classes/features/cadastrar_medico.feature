Feature: Cadastro de Médico

  Scenario: Cadastrar um médico
    Given um médico com nome "Dr. João", CRM "123456" e especialidade "Cardiologia"
    When o médico é cadastrado
    Then o médico deve estar registrado na lista de médicos