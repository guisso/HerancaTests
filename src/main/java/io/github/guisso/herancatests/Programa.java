package io.github.guisso.herancatests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Classe Programa
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.1, 21/03/2022
 */
public class Programa {

    public static void main(String[] args) {

        //
        // Testes com herança e polimorfismo
        //
        
        EmpregadoMensalista em;
        EmpregadoHorista eh;
        EmpregadoComissionado ec;
        //Empregado e = new Empregado();
        Estagiario estagiario;
        Voluntario voluntario;

        List<Empregado> empregados = new ArrayList<>();
        
        // 100.00
        voluntario = new Voluntario();
        voluntario.setNome("Jorge Ruiz");
        voluntario.adicionarDespesa(new Despesa("Café", 
                "http://drive.google.com/123", 57.0f));
        voluntario.adicionarDespesa(new Despesa("Maçã", 
                "http://drive.google.com/456", 3.0f));
        voluntario.adicionarDespesa(new Despesa("Táxi", 
                "http://drive.google.com/789", 40.0f));
        empregados.add(voluntario);
        
        // 3.000,00
        estagiario = new Estagiario();
        estagiario.setNome("Phill Reinold");
        estagiario.setSalarioFixo(1000f);
        estagiario.setValeTransporte(1000f);
        estagiario.setValeRefeicao(1000f);
        empregados.add(estagiario);

        // 1.000,00
        em = new EmpregadoMensalista();
        em.setNome("Beatriz Yana");
        em.setSalario(1000f);
        empregados.add(em);

        // 99,00
        eh = new EmpregadoHorista();
        eh.setNome("Zélia Anamaria");
        eh.setHoras(99f);
        eh.setValorHora(1f);
        empregados.add(eh);

        // 2.000,00
        ec = new EmpregadoComissionado();
        ec.setNome("Cecília Xerxes");
        ec.setSalario(1000f);
        ec.setVendas(10000f);
        ec.setTaxa(.1f);
        empregados.add(ec);

        // 90,00
        eh = new EmpregadoHorista();
        eh.setNome("Ana Zaira");
        eh.setHoras(9f);
        eh.setValorHora(10f);
        empregados.add(eh);

        // 811,00
        em = new EmpregadoMensalista();
        em.setNome("Denise Wendel");
        em.setSalario(811f);
        empregados.add(em);
        
        // Cálculo da folha de pagamento

        float totalFolhaPagto = 0f;
        for (Empregado e : empregados) {
            totalFolhaPagto += e.calcularSalario();
        }
        // Total: 7.100,00
        System.out.println(">> Total da folha de pagamento: "
                + "R$ " + totalFolhaPagto);
        
//        return;

        //
        // Testes com ordenação (comparação)
        //
        
        // Dados iniciais
        System.out.println("\n>>Arranjo inicial:\n" + empregados);

        // Ordenação padrão implementada na classe Empregado:
        // (alfabética por nome)
        Collections.sort(empregados);
        System.out.println("\n>> Após ordenação padrão:\n" 
                + empregados);

        // Definição de comparação por salário
        Comparator<Empregado> porSalario
                = Comparator.comparing(Empregado::calcularSalario);

        // Ascendente
        Collections.sort(empregados, porSalario);
        System.out.println("\n>> Após ordenação ASC por salário:\n" 
                + empregados);

        // Descendente
        Collections.sort(empregados, porSalario.reversed());
        System.out.println("\n>> Após ordenação DESC por salário:\n" 
                + empregados);

//        //
//        // Teste com PessoaFisica
//        //
//        
//        PessoaFisica ana = new PessoaFisica("Ana Zaira", "ana@mail.com", 12345678901L, 3821044141L);
//        ana.setNascimento(LocalDate.of(2002, 3, 25));
//        System.out.println(">> " + ana);
//
//        //
//        // Testes com herança
//        //
//        
//        //Pessoa p = new Pessoa(); // Abstrata...
////        p.setNome("Ana Zaira");
////        p.setEmail("ana@mail.com");
////        System.out.println(">> " + p);
//
//        Pessoa pf = new PessoaFisica();
//        pf.setNome("Beatriz Yana");
//        pf.setEmail("beatriz@mail.com");
//        pf.setTelefone(3821044141L);
////        pf.setCpf(12345678901L);
//
//        // Qual toString() é invocado????
//        // O de Pessoa (o tipo da variável)?
//        // Ou o de PessoaFisica (o objeto referenciado)?
//        // O que se pode concluir?
//        System.out.println("?? " + pf);
//
//        PessoaFisica novaPf = (PessoaFisica) pf;
//        novaPf.setCpf(789456123L);
//
//        System.out.println("**** " + novaPf);
//
//        PessoaJuridica pj = new PessoaJuridica();
//        pj.setCnpj(1234567890123L);
//
//        System.out.println(">> " + pj);
    }

}
