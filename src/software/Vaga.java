/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software;

import java.util.ArrayList;

/**
 *
 * @author CEDUP06
 */
public final class Vaga {

    int CodVaga;
    boolean status;
    String tipo;
    String nomevaga;
    double salario;
    ArrayList<Colaborador> candidatos = new ArrayList<>();

    public Vaga(String nome_vaga, Boolean status, double salario) {
        this.CodVaga = CodVaga;
        this.nomevaga = nomevaga;
        this.status = status;
        this.salario = salario;
    }

    void Candidatar(Colaborador nomeDoColaborador) {
        this.candidatos.add(nomeDoColaborador);
    }

    void VerificarCandidatos() {
        for (int i = 0; i < candidatos.size(); i++) {
            System.out.println(candidatos.get(i).nome);
        }
    }

}
