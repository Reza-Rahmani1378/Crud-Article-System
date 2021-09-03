package ir.maktab.hw5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        /*Date date = new Date(System.currentTimeMillis()-22222444449L);
        System.out.println(date);*/
        String[] names = new String[]{"ali", "reza", "milad", "mahdi"};
        List<String> namesList = new ArrayList<>(Arrays.asList(names));
        namesList.add("afsaneh");
        namesList.forEach(System.out::println);
    }
}
