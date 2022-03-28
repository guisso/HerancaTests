package io.github.guisso.herancatests;

/**
 * Classe Despesa
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.1, 28/03/2022
 */
public class Despesa {

    private String descricao;
    private String comprovante;
    private Float valor;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Despesa() {
    }

    public Despesa(String descricao, String comprovante, Float valor) {
        this.descricao = descricao;
        this.comprovante = comprovante;
        this.valor = valor;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getComprovante() {
        return comprovante;
    }

    public void setComprovante(String comprovante) {
        this.comprovante = comprovante;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Despesa{" + "descricao=" + descricao + ", comprovante=" + comprovante + ", valor=" + valor + '}';
    }

}
