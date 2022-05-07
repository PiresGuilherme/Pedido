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
public class Empresa {

    public static void main(String[] args) {

    }
    String EmpresaNome;
    ArrayList<Colaborador> colaboradores = new ArrayList<>();
    ArrayList<Vaga> vagas = new ArrayList<>();

    public Empresa(String EmpresaNome) {
        this.EmpresaNome = EmpresaNome;
    }

    void NovaVaga(String nomevaga, boolean status, double salario) {
        Vaga vaga = new Vaga(nomevaga, status, salario);
        vagas.add(vaga);
    }

    int NovoCadastro() {
        int cadastro = colaboradores.size() + 1;
        return cadastro;
    }

    void AtivacaoColab(int cadastro, String nome, String cpf, String cargo, String oficio, double salario) {
        Colaborador colaborador = new Colaborador(NovoCadastro(), nome, cpf, cargo, salario);
        colaboradores.add(colaborador);
    }

    void DemitirColab(String colaborador) {
        Colaborador removerColaborador = null;
        for (int i = 0; i < colaboradores.size(); i++) {
            if (colaboradores.get(i).nome.equals(colaborador)) {
                removerColaborador = colaboradores.get(i);
            }
        }
        colaboradores.remove(removerColaborador);
    }

}
