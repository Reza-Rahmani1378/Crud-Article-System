package ir.maktab.hw5;

import ir.maktab.hw5.domain.Article;
import ir.maktab.hw5.domain.Category;
import ir.maktab.hw5.domain.Writer;
import ir.maktab.hw5.repository.DataBase;
import ir.maktab.hw5.util.ApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        Category[] categories = ApplicationContext.getDataBaseInitializer().getCategories();
        Writer[] writers = ApplicationContext.getDataBaseInitializer().getWriters();
        Article[] articles = ApplicationContext.getDataBaseInitializer().getArticles();
        DataBase dataBase = new DataBase(writers, categories, articles);

    }
}
