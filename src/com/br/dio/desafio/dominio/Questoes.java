package com.br.dio.desafio.dominio;

import java.util.Objects;

public class Questoes {
    private String titulo;
    private String enunciado;
    private int nivel;
    private String codigo;

    public Questoes() {
    }

    public Questoes(String titulo, int nivel) {
        this.titulo = titulo;
        this.nivel = nivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Questoes)) return false;
        Questoes questoes = (Questoes) o;
        return getNivel() == questoes.getNivel() && Objects.equals(getTitulo(), questoes.getTitulo()) && Objects.equals(getEnunciado(), questoes.getEnunciado()) && Objects.equals(getCodigo(), questoes.getCodigo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitulo(), getEnunciado(), getNivel(), getCodigo());
    }

    @Override
    public String toString() {
        return "Questoes{" +
                "titulo='" + titulo + '\'' +
                ", enunciado='" + enunciado + '\'' +
                ", nivel=" + nivel +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}
