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
public abstract class ContaBancaria {

    protected int numConta;
    protected double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(int numConta, double saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public double getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract boolean sacar(double saque);

    public abstract boolean depositar(double deposito);

    public void Mostrar() {
        JOptionPane.showMessageDialog(null, "Número da conta: " + this.numConta + "\n Saldo: " + this.saldo);

    }

    public boolean transferir(double valor, ContaBancaria cb) {

        if (this.sacar(valor)) {
            cb.depositar(valor);
            return true;
        }
        return false;

    }

}
