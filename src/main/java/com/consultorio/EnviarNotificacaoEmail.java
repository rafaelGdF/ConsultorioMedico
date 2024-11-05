package com.consultorio;

public class EnviarNotificacaoEmail {

    public boolean enviarNotificacao(Paciente paciente, String mensagem) {
        // Verifica se o paciente, o e-mail e a mensagem são válidos
        if (paciente == null || paciente.getEmail().isEmpty() || mensagem.isEmpty()) {
            return false; // Não envia se o paciente, e-mail ou mensagem não forem válidos
        }
        System.out.println("Enviando e-mail para " + paciente.getEmail() + ": " + mensagem);
        return true; // Simula que o e-mail foi enviado com sucesso
    }
}
