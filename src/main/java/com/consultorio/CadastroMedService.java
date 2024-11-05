package com.consultorio;

import java.util.ArrayList;
import java.util.List;

public class CadastroMedService {
    private List<Medico> medicos = new ArrayList<>();

    public void cadastrarMedico(Medico medico) {
        // Validação dos dados obrigatórios do médico
        if (medico == null || medico.getNome() == null || medico.getNome().isEmpty() ||
                medico.getCrm() == null || medico.getCrm().isEmpty() ||
                medico.getEspecialidade() == null || medico.getEspecialidade().isEmpty()) {
            throw new IllegalArgumentException("Dados obrigatórios ausentes para cadastrar o médico.");
        }

        medicos.add(medico);
    }

    public List<Medico> getMedicos() {
        return medicos;
    }
}
