package com.consultorio;

import org.junit.Before;
import org.junit.Test;
import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class RegistroPagamentoTest {
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
    public void testRegistrarPagamento() {
        // Definição do valor do pagamento
        double valorPagamento = 150.00;

        // Execução do método para registrar o pagamento
        consulta.registrarPagamento(valorPagamento);

        // Verificação do resultado
        assertEquals(valorPagamento, consulta.getValorPago(), 0.01);
        assertTrue(consulta.isPago());
    }

    @Test
    public void testRegistrarPagamentoNegativo() {
        // Tenta registrar um pagamento negativo
        double valorPagamento = -150.00;
        consulta.registrarPagamento(valorPagamento);

        // Verificação: o pagamento não deve ser registrado
        assertEquals(0.0, consulta.getValorPago(), 0.01);
        assertFalse(consulta.isPago());
    }
}