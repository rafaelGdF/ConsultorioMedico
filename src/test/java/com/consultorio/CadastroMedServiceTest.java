package com.consultorio;

import org.junit.Test;
import static org.junit.Assert.*;

public class CadastroMedServiceTest {
    @Test
    public void testCadastrarMedico() {
        // Configuração do cenário de teste
        CadastroMedService cadastroMedService = new CadastroMedService();
        Medico medico = new Medico("Dr. João", "123456", "Cardiologia");

        // Execução do método a ser testado
        cadastroMedService.cadastrarMedico(medico);

        // Verificação do resultado
        assertTrue(cadastroMedService.getMedicos().contains(medico));
    }
}
