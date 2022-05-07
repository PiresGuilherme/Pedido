/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software;

/**
 *
 * @author CEDUP06
 */
public class Colaborador {

    String nome;
    String cargo;
    String CPF;
    int cadastro;
    boolean status;
    double salario;

    public Colaborador(int cadastro, String nome, String cpf, String cargo, double salario) {
        this.cadastro = cadastro;
        this.nome = nome;
        this.CPF = cpf;
        this.cargo = cargo;
        this.salario = salario;
    }
}
