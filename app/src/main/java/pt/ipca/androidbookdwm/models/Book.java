package pt.ipca.androidbookdwm.models;

import androidx.annotation.IdRes;

public class Book {

    private String title;
    private String author;
    private int pages;
    @IdRes
    private int imagem;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public Book(String title, String author, int pages, int imagem) {

    }
}
