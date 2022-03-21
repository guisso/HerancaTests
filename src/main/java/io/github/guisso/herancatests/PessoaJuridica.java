package io.github.guisso.herancatests;

/**
 * Classe PessoaJuridica
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.1, 21/03/2022
 */
public class PessoaJuridica {

    private Long cnpj;

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" + "cnpj=" + cnpj + '}';
    }

}
