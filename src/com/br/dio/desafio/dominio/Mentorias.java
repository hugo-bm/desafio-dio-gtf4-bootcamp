package com.br.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentorias extends Conteudos {

    private LocalDate data;

    public Mentorias() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 22d;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + this.getTitulo() + '\'' +
                ", descricao='" + this.getDescricao() + '\'' +
                ", data=" + this.data +
                '}';
    }
}
