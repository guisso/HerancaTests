package io.github.guisso.herancatests;

import java.time.LocalDate;
import java.time.Period;

/**
 * Classe PessoaFisica
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.1, 21/03/2022
 */
public class PessoaFisica extends Pessoa {

    private Long cpf;
    private LocalDate nascimento;
    private Byte idade;

    public PessoaFisica() {
        super("Nome não definido",
                "ifnmg@ifnmg.edu.br", 3821044141L);
        this.cpf = 0L;
    }

    public PessoaFisica(Long cpf) {
        this();
        this.cpf = cpf;
    }

    public PessoaFisica(String nome,
            String email, Long telefone, Long cpf) {
        super(nome, email, telefone);
        this.cpf = cpf;
    }

    // Uma pessoa é mais jovem? Ou é mais idosa? Ou tem a mesma idade que outra?
    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.idade = (byte) (Period.between(
                nascimento, LocalDate.now()).getYears());
        this.nascimento = nascimento;
    }

    public Byte getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return super.toString()
                + " PessoaFisica{"
                + " cpf=" + cpf
                + ", nascimento=" + nascimento
                + ", idade=" + idade
                + '}';
    }

}
