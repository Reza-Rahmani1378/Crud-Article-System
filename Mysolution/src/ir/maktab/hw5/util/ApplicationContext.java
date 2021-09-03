package ir.maktab.hw5.util;

import ir.maktab.hw5.repository.DataBase;
import ir.maktab.hw5.service.ArticleService;
import ir.maktab.hw5.service.CategoryService;
import ir.maktab.hw5.service.WriterService;

public class ApplicationContext {
    private static final DataBaseInitializer dataBaseInitializer = new DataBaseInitializer();

    private static final DataBase dataBase = new DataBase();
    private static final WriterService writerService = new WriterService();
    private static final ArticleService articleService = new ArticleService();
    private static final CategoryService categoryService = new CategoryService();


    public static DataBaseInitializer getDataBaseInitializer() {
        return dataBaseInitializer;
    }

    public static WriterService getWriterService() {
        return writerService;
    }

    public static ArticleService getArticleService() {
        return articleService;
    }

    public static CategoryService getCategoryService() {
        return categoryService;
    }

    public static DataBase getDataBase() {
        return dataBase;
    }


}
