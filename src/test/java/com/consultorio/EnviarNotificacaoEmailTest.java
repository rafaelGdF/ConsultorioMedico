package com.consultorio;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EnviarNotificacaoEmailTest {
    private EnviarNotificacaoEmail enviarNotificacaoEmail;
    private Paciente paciente;

    @Before
    public void setUp() {
        // Configuração do cenário de teste
        enviarNotificacaoEmail = new EnviarNotificacaoEmail();
        paciente = new Paciente("João", "123.456.789-00", "joao@example.com");
    }

    @Test
    public void testEnviarNotificacao() {
        // Execução do método a ser testado
        boolean resultado = enviarNotificacaoEmail.enviarNotificacao(paciente, "Sua consulta está agendada!");

        // Verificação do resultado
        assertTrue(resultado);
    }
}