package com.consultorio;

public class CadastroService {

    public boolean cadastrarPaciente(Paciente paciente) {
        if (paciente.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode estar vazio");
        }
        // Suponha que aqui haja lógica para salvar o paciente
        // Retornando true para simular um cadastro bem-sucedido
        return true;
    }
}
