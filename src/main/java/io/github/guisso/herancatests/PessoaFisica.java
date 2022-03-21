package io.github.guisso.herancatests;

/**
 * Classe PessoaFisica
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.1, 21/03/2022
 */
public class PessoaFisica extends Pessoa {

    private Long cpf;

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" 
                + "nome=" + getNome()
                + ", email=" + getEmail()
                + ", telefone=" + telefone
                + ", cpf=" + cpf + '}';
    }

}
