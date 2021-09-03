package ir.maktab.hw5;

import ir.maktab.hw5.domain.Article;
import ir.maktab.hw5.domain.Category;
import ir.maktab.hw5.domain.Writer;

import java.sql.Date;

public class DataBaseInitializer {
    private final Category[] categories = {
            new Category(1, "Health"),
            new Category(2, "Sport"),
            new Category(3, "Technology"),
            new Category(4, "News"),
            new Category(5, "Scientific")};

    private final Writer[] writers = {
            new Writer(3,"Reza","Rahmani","Anonymous1378","12344567"),
            new Writer(4,"Ali","Noori","noori-ali","1234567890"),
            new Writer(5,"Alireza","Goli","h-all100","979697")
    };

   private final Article[] articles = {
            new Article(45,"Math is god","in 1895 gous is borned in the world.",
                    new Date(System.currentTimeMillis()-22222444449L),
                    new Date(System.currentTimeMillis()-22222444449L),
                    categories[4],
                    writers[0]),
            new Article(46 , "Computers","A computer is a programmable machine" +
                    " designed to automatically carry out a sequence" +
                    " of arithmetic or logical operations. ",
                    new Date(System.currentTimeMillis()-22222444449L),
                    new Date(System.currentTimeMillis()-2222244494L),
                    categories[2],
                    writers[1]),
            new Article(47,"What is physics?",
                    "\n" +
                            "Physics is one of the most ancient sciences about nature. " +
                            "The word \"physics\" takes its origin from the Greek word " +
                            "\"phewsis\" meaning nature. \n" +
                            "\n" +
                            "The development of other sciences depends " +
                            "in many respects on the knowledge of physical phenomena.",
                    new Date(System.currentTimeMillis() - 22222444449L),
                    new Date(System.currentTimeMillis()-22222444449L),
                    categories[4],
                    writers[2]),
            new Article(45,"mental health",
                    "Job satisfaction is an" +
                            " individual attitude towards" +
                            " the job and is one of the important factors in" +
                            " job success that increases efficiency, creativity and\n" +
                            "Feels individual satisfaction.",
                    new Date(System.currentTimeMillis()-22222444449L),
                    new Date(System.currentTimeMillis()-2222444489L),
                    categories[0],
                    writers[0])
    };

    public Category[] getCategories() {
        return categories;
    }

    public Writer[] getWriters() {
        return writers;
    }

    public Article[] getArticles() {
        return articles;
    }
}
