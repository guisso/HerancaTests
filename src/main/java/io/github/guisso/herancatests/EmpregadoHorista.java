package io.github.guisso.herancatests;

/**
 * Classe EmpregadoHorista
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.1, 21/03/2022
 */
public class EmpregadoHorista extends Empregado {

    private Float horas;
    private Float valorHora;

    public Float getHoras() {
        return horas;
    }

    public void setHoras(Float horas) {
        this.horas = horas;
    }

    public Float getValorHora() {
        return valorHora;
    }

    public void setValorHora(Float valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public Float calcularSalario() {
        return horas * valorHora;
    }

}
