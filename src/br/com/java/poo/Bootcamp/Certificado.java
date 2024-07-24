package br.com.java.poo.Bootcamp;

import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Collectors;

public class Certificado {

    private String nomeDoAluno;
    private int aproveitamento;
    private Set<Conteudo> materiasConcluidas;


    public Certificado() {

    }

    @Override
    public String toString() {

        return "Certificado{" +
                "nomeDoAluno='" + nomeDoAluno + '\'' +
                ", aproveitamento=" + aproveitamento +
                ", materiasConcluidas=" + materiasConcluidas +
                '}';
    }

    public String getNomeDoAluno() {
        return nomeDoAluno;
    }

    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
    }

    public int getAproveitamento() {
        return aproveitamento;
    }

    public void setAproveitamento(int aproveitamento) {
        this.aproveitamento = aproveitamento;
    }

    public Set<Conteudo> getMateriasConcluidas() {
        return materiasConcluidas;
    }

    public void setMateriasConcluidas(Set<Conteudo> materiasConcluidas) {
        this.materiasConcluidas = materiasConcluidas;
    }


}
