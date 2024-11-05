package com.consultorio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AgendarConsulta {
    private List<Medico> medicos = new ArrayList<>();
    private List<Paciente> pacientes = new ArrayList<>();
    private List<Consulta> consultas = new ArrayList<>();

    public void cadastrarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void cadastrarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public Consulta agendarConsulta(Paciente paciente, Medico medico, LocalDateTime dataHora) {
        // Validação dos dados obrigatórios
        if (paciente == null || paciente.getNome() == null || paciente.getNome().isEmpty() ||
                medico == null || medico.getCrm() == null || medico.getCrm().isEmpty() ||
                dataHora == null) {
            throw new IllegalArgumentException("Dados obrigatórios ausentes para agendar a consulta.");
        }

        Consulta consulta = new Consulta(paciente, medico, dataHora);
        consultas.add(consulta);
        return consulta;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }
}
