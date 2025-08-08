package br.com.etecia.myapp;

public class Produtos {
    private String titulo;

    private int imagem;

    //criando construtor

    public Produtos(String titulo, int imagem) {
        this.titulo = titulo;
        this.imagem = imagem;
    }

    // criando o getter and setter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
