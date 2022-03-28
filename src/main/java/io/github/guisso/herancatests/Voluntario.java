package io.github.guisso.herancatests;

import java.util.ArrayList;

/**
 * Classe Voluntario
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.1, 28/03/2022
 */
public class Voluntario
        extends Empregado {

    // Voluntario v = new Voluntario();
    // v.getDespesas().add(new Despesa(...)); <-- XXXX
    private ArrayList<Despesa> despesas;

    public Voluntario() {
        despesas = new ArrayList<>();
    }

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public ArrayList<Despesa> getDespesas() {
        return despesas;
    }

    public void setDespesas(ArrayList<Despesa> despesas) {
        this.despesas = despesas;
    }
    //</editor-fold>

    // v.adicionarDespesa(new Despesa(...));  <-- !!!!
    public void adicionarDespesa(Despesa d) {
        despesas.add(d);
    }

    @Override
    public Float calcularSalario() {
        float total = 0.0f;
        for (Despesa despesa : despesas) {
            total += despesa.getValor();
        }
        return total;
    }

    @Override
    public String toString() {
        return super.toString()
                + " Voluntario{"
                + "despesas=" + despesas
                + '}';
    }

}
