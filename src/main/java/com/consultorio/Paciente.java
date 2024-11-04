package com.consultorio;

public class Paciente {
    private String nome;
    private String dataNascimento;
    private String email;

    public Paciente(String nome, String dataNascimento, String email) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
