package ir.maktab.hw5.database;

import ir.maktab.hw5.domain.Article;
import ir.maktab.hw5.domain.Category;
import ir.maktab.hw5.domain.Writer;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private Writer[] writers;
    private Writer onlineWriter;
    private Category[] categories;
    private Article[] articles;


    public DataBase(Writer[] writers , Writer onlineWriter , Category[] categories , Article[] articles) {
        this.writers = writers;
        this.onlineWriter = onlineWriter;
        this.categories = categories;
        this.articles = articles;
    }

    public DataBase(Writer[] writers , Category[] categories , Article[] articles) {
        this.writers = writers;
        this.categories = categories;
        this.articles = articles;
    }

    public Writer[] getWriters() {
        return writers;
    }

    public void setWriters(Writer[] writers) {
        this.writers = writers;
    }

    public Writer getOnlineWriter() {
        return onlineWriter;
    }

    public void setOnlineWriter(Writer onlineWriter) {
        this.onlineWriter = onlineWriter;
    }

    public Category[] getCategories() {
        return categories;
    }

    public void setCategories(Category[] categories) {
        this.categories = categories;
    }

    public Article[] getArticles() {
        return articles;
    }

    public void setArticles(Article[] articles) {
        this.articles = articles;
    }

    public String[] getArticlesByWriterId(int writerId) {
        ArrayList<String> articles = new ArrayList<>();
        for (Article article : this.articles) {
            if (article.getWriter().getId() == writerId)
                articles.add(article.getTitle());
        }
        return articles.toArray(new String[0]);
    }

    public String[] getArticlesTitles() {
        ArrayList<String> articles = new ArrayList<>();
        for (Article article : this.articles) {
            articles.add(article.getTitle());
        }
        return articles.toArray(new String[0]);
    }

    public String[] getCategoriesTitles() {
        ArrayList<String> categories = new ArrayList<>();
        for (Category category : this.categories) {
            categories.add(category.getTitle());
        }
        return categories.toArray(new String[0]);
    }

    public List<String> getUsernamesWriters() {
        List<String> usernames = new ArrayList<>();
        for (Writer writer : writers) {
            usernames.add(writer.getUsername());
        }
        return usernames;
    }

}
