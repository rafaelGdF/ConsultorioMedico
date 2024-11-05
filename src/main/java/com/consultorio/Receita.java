package com.consultorio;

public class Receita {
    private Medico medico;
    private Paciente paciente;
    private String medicamentos;
    private String instrucoes;

    public Receita(Medico medico, Paciente paciente, String medicamentos, String instrucoes) {
        if (medico == null || paciente == null ||
                medico.getNome().isEmpty() || paciente.getNome().isEmpty() ||
                medico.getCrm().isEmpty() || paciente.getEmail().isEmpty()) {
            throw new IllegalArgumentException("Todos os dados do médico e paciente devem ser fornecidos com dados válidos.");
        }
        this.medico = medico;
        this.paciente = paciente;
        this.medicamentos = medicamentos;
        this.instrucoes = instrucoes;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public String getInstrucoes() {
        return instrucoes;
    }

    @Override
    public String toString() {
        return "Receita Médica:\n" +
                "Médico: " + medico.getNome() + "\n" +
                "Paciente: " + paciente.getNome() + "\n" +
                "Medicamentos: " + medicamentos + "\n" +
                "Instruções: " + instrucoes;
    }
}
