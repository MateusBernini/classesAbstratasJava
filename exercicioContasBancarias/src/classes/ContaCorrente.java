/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.JOptionPane;

/**
 *
 * @author Mateus Bernini
 */
public class ContaCorrente extends ContaBancaria {

    private double taxaDeOperacao;

    public ContaCorrente(int numConta, double saldo, double taxaDeOperacao) {
        super(numConta, saldo);
        this.taxaDeOperacao = taxaDeOperacao;
    }

    public ContaCorrente() {
    }

    public ContaCorrente(double taxaDeOperacao) {
        this.taxaDeOperacao = taxaDeOperacao;
    }

    public ContaCorrente(ContaBancaria cc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getTaxaDeOperacao() {
        return taxaDeOperacao;
    }

    public void setTaxaDeOperacao(double taxaDeOperacao) {
        this.taxaDeOperacao = taxaDeOperacao;
    }

    @Override
    public void Mostrar() {
        super.Mostrar();
        JOptionPane.showMessageDialog(null, "Taxa de operação " + this.taxaDeOperacao);
    }

    @Override
    public boolean depositar(double deposito) {
        this.saldo = this.saldo + deposito;

        return true;

    }

    @Override
    public boolean sacar(double saque) {

        if (this.getSaldo() > saque) {
            this.setSaldo(this.getSaldo() - (saque - this.taxaDeOperacao));
            JOptionPane.showMessageDialog(null, "Saque efetuado!");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "O saque não pôde ser efetuado!");
            return false;

        }

    }

}
