package ir.maktab.hw5.util;

public class ApplicationContext {
    private static final DataBaseInitializer dataBaseInitializer = new DataBaseInitializer();

    public static DataBaseInitializer getDataBaseInitializer() {
        return dataBaseInitializer;
    }
}
