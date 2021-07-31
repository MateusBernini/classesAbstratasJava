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
public class ContaPoupanca extends ContaBancaria {

    private double limite;

    public ContaPoupanca(int numConta, double saldo, double limite) {
        super(numConta, saldo);
        this.limite = limite;
    }

    public ContaPoupanca() {
    }

    public ContaPoupanca(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void Mostrar() {
        super.Mostrar();
        JOptionPane.showMessageDialog(null, "\n Limite: " + this.limite);

    }

    @Override
    public boolean sacar(double saque) {

        if ((this.getSaldo() + limite) > saque) {
            this.setSaldo(this.getSaldo() - saque);
            JOptionPane.showMessageDialog(null, "Saque efetuado!");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Saldo e/ou conta inválido!");
            return false;
        }

    }

    @Override
    public boolean depositar(double deposito) {
        this.saldo = this.saldo + deposito;
        JOptionPane.showMessageDialog(null, "Depósito realizado");
        return true;

    }

}
