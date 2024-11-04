package com.consultorio;

import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDateTime;

public class AgendarConsultaTest {
    @Test
    public void testAgendarConsulta() {
        // Configuração do cenário de teste
        AgendarConsulta agendarConsulta = new AgendarConsulta();
        Paciente paciente = new Paciente("João", "123.456.789-00", "joao@example.com");
        Medico medico = new Medico("Dra. Maria", "987654", "Dermatologia");
        LocalDateTime dataHora = LocalDateTime.of(2024, 11, 10, 15, 30);

        // Execução do método a ser testado
        Consulta consulta = agendarConsulta.agendarConsulta(paciente, medico, dataHora);

        // Verificação do resultado
        assertNotNull(consulta);
        assertEquals(paciente, consulta.getPaciente());
        assertEquals(medico, consulta.getMedico());
        assertEquals(dataHora, consulta.getDataHora());
    }
}