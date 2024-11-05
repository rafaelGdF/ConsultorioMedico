Feature: Emitir Receita Médica

  Scenario: Emitir receita médica para um paciente
    Given um paciente "João" com prontuário criado
    And um médico "Dra. Maria" que realizou a consulta
    When a receita médica é emitida
    Then a receita deve incluir as informações do paciente
    And deve incluir a lista de medicamentos prescritos