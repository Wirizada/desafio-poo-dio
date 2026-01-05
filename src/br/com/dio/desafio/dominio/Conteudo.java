package br.com.dio.desafio.dominio;

// classes abstratas não podem ser instanciadas, servem como modelo para outras classes
// podem conter métodos abstratos (sem corpo) que obrigam as classes filhas a implementá-los

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private  String titulo;
    private String descricao;

    public abstract double calcularXp();

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
}
