package com.consultorio;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CadastroServiceTest {

    private CadastroService cadastroService;

    @Before
    public void setUp() {
        cadastroService = new CadastroService();
    }

    @Test
    public void deveCadastrarPacienteComDadosValidos() {
        // Dado um paciente com nome e contato válidos
        Paciente paciente = new Paciente("João Silva", "1990-05-10", "joao@email.com");

        // Quando cadastramos o paciente
        boolean cadastroRealizado = cadastroService.cadastrarPaciente(paciente);

        // Então o paciente deve ser salvo com sucesso
        assertTrue("Paciente deveria ser cadastrado com sucesso", cadastroRealizado);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCadastrarPacienteComNomeVazio() {
        // Dado um paciente com nome vazio
        Paciente paciente = new Paciente("", "1990-05-10", "joao@email.com");

        // Quando tentamos cadastrar o paciente
        cadastroService.cadastrarPaciente(paciente);
    }
}
