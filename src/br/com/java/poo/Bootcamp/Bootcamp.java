package br.com.java.poo.Bootcamp;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {

    private String nome;
    private String descricao;
    private final LocalDate inicio = LocalDate.now();
    private final LocalDate fim = inicio.plusDays(45);
    private Set<Dev> inscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public Bootcamp() {

    }

    public Bootcamp(String nome, String descricao, Set<Dev> inscritos, Set<Conteudo> conteudos) {
        this.nome = nome;
        this.descricao = descricao;
        this.inscritos = inscritos;
        this.conteudos = conteudos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Dev> getInscritos() {
        return inscritos;
    }

    public void setInscritos(Set<Dev> inscritos) {
        this.inscritos = inscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public LocalDate getFim() {
        return fim;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bootcamp bootcamp)) return false;
        return Objects.equals(getNome(), bootcamp.getNome()) && Objects.equals(getDescricao(), bootcamp.getDescricao()) && Objects.equals(getInicio(), bootcamp.getInicio()) && Objects.equals(getFim(), bootcamp.getFim()) && Objects.equals(getInscritos(), bootcamp.getInscritos()) && Objects.equals(getConteudos(), bootcamp.getConteudos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDescricao(), getInicio(), getFim(), getInscritos(), getConteudos());
    }
}
