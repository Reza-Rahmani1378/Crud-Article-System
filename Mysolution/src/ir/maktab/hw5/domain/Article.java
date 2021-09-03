package ir.maktab.hw5.domain;

import java.sql.Date;

public class Article {
    private int id;
    private String title;
    private String textArticle;
    private Date createArticle;
    private Date lastUpdateArticle;
    private Category category;
    private Writer writer;

    public Article(int id, String title, String textArticle, Date createArticle, Date lastUpdateArticle,
                   Category category, Writer writer) {
        this.id = id;
        this.title = title;
        this.textArticle = textArticle;
        this.createArticle = createArticle;
        this.lastUpdateArticle = lastUpdateArticle;
        this.category = category;
        this.writer = writer;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTextArticle() {
        return textArticle;
    }

    public void setTextArticle(String textArticle) {
        this.textArticle = textArticle;
    }

    public Date getCreateArticle() {
        return createArticle;
    }

    public void setCreateArticle(Date createArticle) {
        this.createArticle = createArticle;
    }

    public Date getLastUpdateArticle() {
        return lastUpdateArticle;
    }

    public void setLastUpdateArticle(Date lastUpdateArticle) {
        this.lastUpdateArticle = lastUpdateArticle;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }
}
