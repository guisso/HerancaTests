package io.github.guisso.herancatests;

/**
 * Classe EmpregadoComissionado
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.1, 21/03/2022
 */
public class EmpregadoComissionado extends Empregado {

    private Float salario;
    private Float vendas;
    private Float taxa;

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public Float getVendas() {
        return vendas;
    }

    public void setVendas(Float vendas) {
        this.vendas = vendas;
    }

    public Float getTaxa() {
        return taxa;
    }

    public void setTaxa(Float taxa) {
        this.taxa = taxa;
    }

    @Override
    public Float calcularSalario() {
        return salario + vendas * taxa;
    }

    @Override
    public String toString() {
        return super.toString()
                + " EmpregadoComissionado{"
                + "salario=" + salario
                + ", vendas=" + vendas
                + ", taxa=" + taxa
                + '}';
    }

}
