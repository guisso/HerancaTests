package io.github.guisso.herancatests;

/**
 * Classe Empregado
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.1, 21/03/2022
 */
public abstract class Empregado
        implements Comparable<Empregado> {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract Float calcularSalario();

    //<editor-fold defaultstate="collapsed" desc="toString/compareTo">
    @Override
    public String toString() {
        return "Empregado{"
                + "nome=" + nome
                + ", salário=R$ " + calcularSalario()
                + '}';
    }

    @Override
    public int compareTo(Empregado outro) {
        // Ascendente
        return getNome().compareTo(outro.getNome());
        // Descendente
//        return outro.getNome().compareTo(nome);
    }
    //</editor-fold>

}
