package com.consultorio;

public class EnviarNotificacaoEmail {

    public boolean enviarNotificacao(Paciente paciente, String mensagem) {
        // Aqui, você pode implementar a lógica real de envio de e-mail.
        // Para fins de teste, vamos apenas simular que o e-mail foi enviado com sucesso.
        if (paciente == null || paciente.getEmail() == null) {
            return false; // Não envia se o paciente ou e-mail não estiverem válidos
        }
        System.out.println("Enviando e-mail para " + paciente.getEmail() + ": " + mensagem);
        return true; // Simula que o e-mail foi enviado com sucesso
    }
}