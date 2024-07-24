package br.com.java.poo.Bootcamp;

import java.util.*;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
    private Certificado certificado;
    private int aproveitamento;

    public Dev() {

    }
    public Dev(String nome, Set<Conteudo> conteudosInscritos, Set<Conteudo> conteudosConcluidos) {
        this.nome = nome;
        this.conteudosInscritos = conteudosInscritos;
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
            Set<Conteudo> finalizados = new LinkedHashSet<>();
            finalizados.add(conteudo.get());
            this.aproveitamento += 20;
            System.out.println("Você concluiu " + this.aproveitamento + "% do bootcamp");
            if(this.conteudosConcluidos.containsAll(finalizados)) {
                if(this.certificado == null) {
                    this.certificado = new Certificado();
                    this.certificado.setAproveitamento(this.aproveitamento);
                    this.certificado.setNomeDoAluno(this.nome);
                    this.certificado.setMateriasConcluidas(new LinkedHashSet<>(this.conteudosConcluidos));
                }
                printCertificado();
            }
        }else {
            System.out.println("Você concluiu o bootcamp!");
        }
    }

    public void printCertificado() {
        System.out.println("==========================");
        System.out.println("CERTIFICADO DE CONCLUSÃO");
        System.out.println("==========================");
        System.out.println("Nome do aluno: " + this.certificado.getNomeDoAluno());
        System.out.println("Aproveitamento: " + this.certificado.getAproveitamento());
        for(Conteudo c : getConteudosConcluidos()) {
            System.out.println("- " + c.getTitulo());
        }
        System.out.println("Xp Total: " + calcularTotalXp());
        System.out.println("Conclusão: " + this.certificado.getTermino());
        System.out.println("=============================");
        System.out.println(" ");
    }

    public double calcularTotalXp() {
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }
}
