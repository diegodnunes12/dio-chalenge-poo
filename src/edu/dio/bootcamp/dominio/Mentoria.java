package edu.dio.bootcamp.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;

    @Override
    protected double calcularXp() {
        return XP_DEFAULT + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria [getTitulo()=" + getTitulo() + ", getDescricao()=" + getDescricao() + ", getData()="
                + getData() + "]";
    }
}
