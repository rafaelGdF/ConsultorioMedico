Feature: Cadastro de Paciente

  Scenario: Cadastrar paciente com dados válidos
    Given um paciente com nome "João Silva", data de nascimento "1990-05-10" e e-mail "joao@email.com"
    When o paciente e cadastrado
    Then o cadastro deve ser realizado com sucesso