/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Mateus Bernini
 */
public class Banco {

    public ArrayList<ContaBancaria> getC() {
        return c;
    }

    public void setC(ArrayList<ContaBancaria> c) {
        this.c = c;
    }

    ArrayList<ContaBancaria> c = new ArrayList<>();

    public void inserir(ContaBancaria cb) {

        c.add(cb);

        JOptionPane.showMessageDialog(null, "Conta adicionada");

    }

    public void remover(ContaBancaria cb) {
        c.remove(cb);
    }

    public ContaBancaria procurar(int numConta) {
        for (ContaBancaria conta : c) {
            if (conta.getNumConta() == numConta) {
                return conta;
            }
        }
        return null;
    }

}
