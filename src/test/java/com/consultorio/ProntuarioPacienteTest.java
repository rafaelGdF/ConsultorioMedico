package com.consultorio;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProntuarioPacienteTest {
    private ProntuarioPaciente prontuario;
    private Paciente paciente;

    @Before
    public void setUp() {
        // Configuração do cenário de teste
        paciente = new Paciente("João", "123.456.789-00", "joao@example.com");
        prontuario = new ProntuarioPaciente(paciente);
    }

    @Test
    public void testAdicionarObservacao() {
        // Execução do método a ser testado
        String observacao = "Paciente apresentou melhora nos sintomas.";
        prontuario.adicionarObservacao(observacao);

        // Verificação do resultado
        assertTrue(prontuario.getObservacoes().contains(observacao));
    }

    @Test
    public void testGetPaciente() {
        // Verificação do paciente associado ao prontuário
        assertEquals(paciente, prontuario.getPaciente());
    }

    @Test
    public void testAdicionarObservacaoNaoDuplicada() {
        // Adiciona a mesma observação duas vezes
        String observacao = "Paciente retornou para nova consulta.";
        prontuario.adicionarObservacao(observacao);
        prontuario.adicionarObservacao(observacao);

        // Verificação: deve ter apenas uma ocorrência da observação
        long count = prontuario.getObservacoes().stream()
                .filter(obs -> obs.equals(observacao))
                .count();
        assertEquals(1, count);
    }

    @Test
    public void testGetObservacoes() {
        // Testa se as observações estão vazias inicialmente
        assertTrue(prontuario.getObservacoes().isEmpty());
    }
}