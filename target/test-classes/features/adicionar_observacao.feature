Feature: Adicionar Observação no Prontuário

  Scenario: Adicionar uma observação ao prontuário do paciente
    Given um prontuário existente para o paciente "João"
    When uma observação "Paciente apresenta alergia a penicilina" é adicionada
    Then a observação deve ser registrada no prontuário do paciente