package edu.dio.bootcamp.dominio;

public class Curso extends Conteudo {    
    private int cargaHoraria;
    
    @Override
    protected double calcularXp() {
        return XP_DEFAULT * getCargaHoraria();
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + getCargaHoraria() + "]";
    }
}