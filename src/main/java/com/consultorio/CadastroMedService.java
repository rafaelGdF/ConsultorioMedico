package com.consultorio;

import java.util.ArrayList;
import java.util.List;

public class CadastroMedService {
    private List<Medico> medicos = new ArrayList<>();

    public void cadastrarMedico(Medico medico) {
        medicos.add(medico);
    }

    public List<Medico> getMedicos() {
        return medicos;
    }
}
