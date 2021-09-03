package ir.maktab.hw5.util.menu;

import ir.maktab.hw5.util.ApplicationContext;

public class ShowAndRunMenu extends Menu {
    public ShowAndRunMenu() {
        super(new String[]{"Longin", "Sign Up"});
    }


    public void runMenu() {
        while (true) {
            printMenu();
            switch (chooseOperation()) {
                case 1:
                    ApplicationContext.getWriterService().login();
                    break;
            }
        }
    }
}
