package com.consultorio;

import java.util.ArrayList;
import java.util.List;

public class ProntuarioPaciente {
    private Paciente paciente;
    private List<String> observacoes;

    public ProntuarioPaciente(Paciente paciente) {
        this.paciente = paciente;
        this.observacoes = new ArrayList<>();
    }

    public void adicionarObservacao(String observacao) {
        if (!observacoes.contains(observacao)) {
            observacoes.add(observacao);
        }
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public List<String> getObservacoes() {
        return observacoes;
    }
}
