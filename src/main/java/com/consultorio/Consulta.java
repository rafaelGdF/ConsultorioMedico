package com.consultorio;

import java.time.LocalDateTime;

public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private LocalDateTime dataHora;
    private String feedback;
    private double valorPago;
    private boolean pago;

    public Consulta(Paciente paciente, Medico medico, LocalDateTime dataHora) {
        this.paciente = paciente;
        this.medico = medico;
        this.dataHora = dataHora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getFeedback() {
        return feedback;
    }

    public double getValorPago() {
        return valorPago;
    }

    public boolean isPago() {
        return pago;
    }

    public void registrarFeedback(String feedback) {
        if (feedback != null && !feedback.isEmpty()) {
            this.feedback = feedback;
        }
    }

    public String gerarRelatorio() {
        StringBuilder relatorio = new StringBuilder();
        relatorio.append("Relatório da Consulta:\n");
        relatorio.append("Paciente: ").append(paciente.getNome()).append("\n");
        relatorio.append("Médico: ").append(medico.getNome()).append("\n");
        relatorio.append("Data/Hora: ").append(dataHora.toString()).append("\n");
        relatorio.append("Feedback: ").append(feedback != null ? feedback : "Nenhum feedback registrado.").append("\n");
        relatorio.append("Valor Pago: ").append(valorPago).append("\n");
        relatorio.append("Pagamento Realizado: ").append(pago ? "Sim" : "Não");

        return relatorio.toString();
    }

    public void registrarPagamento(double valor) {
        if (valor > 0) {
            this.valorPago = valor;
            this.pago = true;
        }
    }
}
