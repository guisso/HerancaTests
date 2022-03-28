package io.github.guisso.herancatests;

/**
 * Classe EmpregadoMensalista
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.1, 21/03/2022
 */
public class EmpregadoMensalista extends Empregado {

    private Float salario;

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    @Override
    public Float calcularSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return super.toString()
                + " EmpregadoMensalista{"
                + "salario=" + salario
                + '}';
    }
    
}
