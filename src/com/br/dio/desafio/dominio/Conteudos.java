package com.br.dio.desafio.dominio;



public abstract class Conteudos {
    private String titulo;
    private String descricao;
    protected static final double XP_PADRAO = 10d;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract double calcularXp();

    @Override
    public String toString() {
        return "Mentorias{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}