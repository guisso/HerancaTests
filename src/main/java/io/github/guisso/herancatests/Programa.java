package io.github.guisso.herancatests;

import java.util.ArrayList;

/**
 * Classe Programa
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.1, 21/03/2022
 */
public class Programa {

    public static void main(String[] args) {

        //
        // Testes com herança
        //
        
        Pessoa p = new Pessoa();
        p.setNome("Ana Zaira");
        p.setEmail("ana@mail.com");

        System.out.println(">> " + p);

        Pessoa pf = new PessoaFisica();
        pf.setNome("Beatriz Yana");
        pf.setEmail("beatriz@mail.com");
        pf.setTelefone(3821044141L);
//        pf.setCpf(12345678901L);

        // Qual toString() é invocado????
        // O de Pessoa (o tipo da variável)?
        // Ou o de PessoaFisica (o objeto referenciado)?
        // O que se pode concluir?
        System.out.println("?? " + pf);

        PessoaFisica novaPf = (PessoaFisica) pf;
        novaPf.setCpf(789456123L);

        System.out.println(">> " + novaPf);

        PessoaJuridica pj = new PessoaJuridica();
        pj.setCnpj(1234567890123L);

        System.out.println(">> " + pj);

        //
        // Testes com herança e polimorfismo
        //
        
        EmpregadoMensalista em;
        EmpregadoHorista eh;
        EmpregadoComissionado ec;

        ArrayList<Empregado> empregados
                = new ArrayList<>();

        // 1.000,00
        em = new EmpregadoMensalista();
        em.setSalario(1000f);
        empregados.add(em);

        // 99,00
        eh = new EmpregadoHorista();
        eh.setHoras(99f);
        eh.setValorHora(1f);
        empregados.add(eh);

        // 2.000,00
        ec = new EmpregadoComissionado();
        ec.setSalario(1000f);
        ec.setVendas(10000f);
        ec.setTaxa(.1f);
        empregados.add(ec);

        // 90,00
        eh = new EmpregadoHorista();
        eh.setHoras(9f);
        eh.setValorHora(10f);
        empregados.add(eh);

        // 811,00
        em = new EmpregadoMensalista();
        em.setSalario(811f);
        empregados.add(em);

        float salarioTotal = 0f;
        for (Empregado e : empregados) {
            salarioTotal += e.calcularSalario();
        }
        System.out.println(">> Total da folha de pagamento: "
                + "R$ " + salarioTotal);

    }

}
