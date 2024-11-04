package com.consultorio;

import org.junit.Before;
import org.junit.Test;
import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class RelatorioConsultaTest {
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
    public void testGerarRelatorioConsulta() {
        // Definindo feedback para a consulta
        String feedback = "O paciente apresentou boa evolução e seguirá com o tratamento.";
        consulta.registrarFeedback(feedback);

        // Execução do método para gerar o relatório
        String relatorio = consulta.gerarRelatorio();

        // Verificação do resultado
        String esperado = "Relatório da Consulta:\n" +
                "Paciente: João\n" +
                "Médico: Dra. Maria\n" +
                "Data/Hora: 2024-11-10T15:30\n" +
                "Feedback: O paciente apresentou boa evolução e seguirá com o tratamento.";
        assertEquals(esperado, relatorio);
    }
}
