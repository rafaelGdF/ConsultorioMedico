package com.consultorio;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmitirReceitaTest {
    private Medico medico;
    private Paciente paciente;
    private Receita receita;

    @Before
    public void setUp() {
        // Configuração do cenário de teste
        medico = new Medico("Dra. Maria", "987654", "Dermatologia");
        paciente = new Paciente("João", "123.456.789-00", "joao@example.com");
    }

    @Test
    public void testEmitirReceita() {
        // Dados da receita
        String medicamentos = "Ibuprofeno 400mg - 2x ao dia por 5 dias";
        String instrucoes = "Tomar após as refeições.";

        // Execução do método de emissão de receita
        receita = new Receita(medico, paciente, medicamentos, instrucoes);

        // Verificação do resultado
        assertEquals(medico, receita.getMedico());
        assertEquals(paciente, receita.getPaciente());
        assertEquals(medicamentos, receita.getMedicamentos());
        assertEquals(instrucoes, receita.getInstrucoes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmitirReceitaComMedicamentosNulos() {
        // Dados da receita
        String medicamentos = null;
        String instrucoes = "Tomar após as refeições.";

        // Execução do método de emissão de receita
        receita = new Receita(medico, paciente, medicamentos, instrucoes);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testEmitirReceitaComPacienteNulo() {
        // Dados da receita
        String medicamentos = "Ibuprofeno 400mg - 2x ao dia por 5 dias";
        String instrucoes = "Tomar após as refeições.";

        // Execução do método de emissão de receita com paciente nulo
        receita = new Receita(medico, null, medicamentos, instrucoes);
    }
}
