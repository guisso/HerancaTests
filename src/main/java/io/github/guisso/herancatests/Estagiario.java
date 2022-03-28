package io.github.guisso.herancatests;

/**
 * Classe Estagiario
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.1, 28/03/2022
 */
public class Estagiario 
        extends Empregado {

    private Float salarioFixo;
    private Float valeTransporte;
    private Float valeRefeicao;

    public Estagiario() {

    }

    public Estagiario(Float salarioFixo,
            Float valeTransporte, Float valeRefeicao) {
        setNome("Nome não definido");
        this.salarioFixo = salarioFixo;
        this.valeTransporte = valeTransporte;
        this.valeRefeicao = valeRefeicao;
    }

    public Estagiario(String nome, Float salarioFixo,
            Float valeTransporte, Float valeRefeicao) {
        this(salarioFixo, valeTransporte, valeRefeicao);
//        this.salarioFixo = salarioFixo;
//        this.valeTransporte = valeTransporte;
//        this.valeRefeicao = valeRefeicao;
        setNome(nome);
    }

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Float getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(Float salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public Float getValeTransporte() {
        return valeTransporte;
    }

    public void setValeTransporte(Float valeTransporte) {
        this.valeTransporte = valeTransporte;
    }

    public Float getValeRefeicao() {
        return valeRefeicao;
    }

    public void setValeRefeicao(Float valeRefeicao) {
        this.valeRefeicao = valeRefeicao;
    }
    //</editor-fold>

    @Override
    public Float calcularSalario() {
        return salarioFixo
                + valeTransporte
                + valeRefeicao;
    }

    @Override
    public String toString() {
        return super.toString()
                + " Estagiario{"
                + "salarioFixo=" + salarioFixo
                + ", valeTransporte=" + valeTransporte
                + ", valeRefeicao=" + valeRefeicao
                + '}';
    }

}
