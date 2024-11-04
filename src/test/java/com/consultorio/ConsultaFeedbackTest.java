package com.consultorio;

import org.junit.Before;
import org.junit.Test;
import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class ConsultaFeedbackTest {
    private Consulta consulta;
    private Paciente paciente;
    private Medico medico;

    @Before
    public void setUp() {
        // Configuração do cenário de teste
        paciente = new Paciente("João", "123.456.789-00", "joao@example.com");
        medico = new Medico("Dra. Maria", "987654", "Dermatologia");
        LocalDateTime dataHora = LocalDateTime.of(2024, 11, 10, 15, 30);
        consulta = new Consulta(paciente, medico, dataHora);
    }

    @Test
    public void testRegistrarFeedback() {
        // Definição do feedback
        String feedback = "O paciente apresentou boa evolução e seguirá com o tratamento.";

        // Execução do método para adicionar feedback
        consulta.registrarFeedback(feedback);

        // Verificação do resultado
        assertEquals(feedback, consulta.getFeedback());
    }

    @Test
    public void testRegistrarFeedbackVazio() {
        // Tenta adicionar um feedback vazio
        String feedback = "";
        consulta.registrarFeedback(feedback);

        // Verificação: feedback não deve ser aceito
        assertNull(consulta.getFeedback());
    }
}
