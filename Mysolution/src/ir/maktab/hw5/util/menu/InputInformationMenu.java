package ir.maktab.hw5.util.menu;


import ir.maktab.hw5.util.ApplicationContext;
import ir.maktab.hw5.util.input.Input;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class InputInformationMenu {
    //   EntityManager entityManager =  HibernateUtil.getEntityManagerFactory().createEntityManager();
//    private static final TeacherService teacherService;
//    private static final StudentService studentService;
//    private static final AddressService addressService ;
    private static final CheckMenu check;
    private static final String FIRSTNAME_REGEX = "(?i)(^[a-z]+)[a-z .,-]((?! .,-)$){1,25}$";
    private static final String LASTNAME_REGEX = "(?i)(^[a-z]+)[a-z .,-]((?! .,-)$){1,25}$";
    private static final String BIRTH_DAY_REGEX = "^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$";
    private static final String CODE_REGEX = "^\\d{10}$";
    private static final String PHONE_NUMBER_REGEX = "(0/91)?[7-9][0-9]{9}";
    private static final String USER_NAME_REGEX = "^(?=.{8,30}$)(?![_.])(?!.*[_.]{2})[a-zA-Z0-9._]+(?<![_.])$";
    private static final String FIRSTNAME_WARNING =
            "The first name is between 1 and 25 characters.\n" +
                    "The first name can only start with an a-z (ignore case) character.\n" +
                    "After that the first name can contain a-z (ignore case) and [ '-,.].\n" +
                    "The first name can only end with an a-z (ignore case) character.";
    private static final String LASTNAME_WARNING =
            "The last name is between 1 and 25 characters.\n" +
                    "The last name can only start with an a-z (ignore case) character.\n" +
                    "After that the last name can contain a-z (ignore case) and [ '-,.].\n" +
                    "The last name can only end with an a-z (ignore case) character.";
    private static final String BIRTH_DAY_WARNING = "Your BirthDay is Wrong.";
    private static final String CODE_WARNING =
            "Your national code must be 10 digit, at least one letter and one number.";
    private static final String PHONE_NUMBER_WARNING =
            "Your mobile number must be country specific.";
    private static final String USER_NAME_WARNING = "use 8 to 30 alpha and numeric and characters for Username\n " +
            "Maybe This Username is taken by other writers.";
    private static final String FIRSTNAME_MESSAGE = "Enter your firstName :";
    private static final String LASTNAME_MESSAGE = "Enter your lastName :";
    private static final String BIRTH_DAY_MESSAGE = "Enter Your BirthDay in This format(2010-3-24) :";
    private static final String CODE_MESSAGE = "Enter your national code :";
    private static final String SALARY_MESSAGE = "Enter your salary :";
    private static final String PHONE_NUMBER_MESSAGE = "Enter your phone number :";
    private static final String STATE_MESSAGE = "Enter your state :";
    private static final String CITY_MESSAGE = "Enter your city :";
    private static final String POSTAL_ADDRESS_MESSAGE = "Enter your postal address :";
    private static final String POSTAL_CODE_MESSAGE = "Enter your postal code :";
    private static final String USER_NAME_MESSAGE = "Enter your username :";
    private static final String PASS_WORD_MESSAGE = "Enter your password :";
    private static List<String> availableUsernames = new ArrayList<>();

    static {
        check = new CheckMenu();
       /* teacherService = ApplicationContext.getTeacherService();
        studentService = ApplicationContext.getStudentService();
        addressService = ApplicationContext.getAddressService();*/
    }



    /*public static String getCode() {

        try {
            availableUsernames.addAll(Arrays.asList(teacherService.getTeacherCodes()));
            availableUsernames.addAll(Arrays.asList(studentService.getStudentCodes()));
            return new Input(
                    CODE_MESSAGE,
                    CODE_WARNING,
                    CODE_REGEX,
                    availableUsernames
            ).getInputString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new Input(
                CODE_MESSAGE,
                CODE_WARNING,
                CODE_REGEX,
                availableUsernames
        ).getInputString();

    }*/

    public static String getUsername() {
        availableUsernames.addAll(ApplicationContext.getDataBase().getUsernamesWriters());
        return new Input(
                USER_NAME_MESSAGE,
                USER_NAME_WARNING,
                USER_NAME_REGEX,
                availableUsernames
        ).getInputString();

    }

    public static String getFirstName() {
        return new Input(
                FIRSTNAME_MESSAGE,
                FIRSTNAME_WARNING,
                FIRSTNAME_REGEX,
                null).getInputString();
    }

    public static String getLastName() {
        return new Input(
                LASTNAME_MESSAGE,
                LASTNAME_WARNING,
                LASTNAME_REGEX,
                null).getInputString();
    }

    public static Date getBirthDay() {
        String birthday = new Input(
                BIRTH_DAY_MESSAGE,
                BIRTH_DAY_WARNING,
                BIRTH_DAY_REGEX,
                null).getInputString();
        return Date.valueOf(birthday);
    }

    public static Double getSalary() {
        return new Input(
                SALARY_MESSAGE,
                Double.MAX_VALUE,
                0.0,
                null).getInputDouble();
    }

    public static String getPhoneNumber() {
        return new Input(
                PHONE_NUMBER_MESSAGE,
                PHONE_NUMBER_WARNING,
                PHONE_NUMBER_REGEX,
                null
        ).getInputString();
    }

    public static String getState() {
        return new Input(
                STATE_MESSAGE
        ).getInputString();
    }

    public static String getCity() {
        return new Input(
                CITY_MESSAGE
        ).getInputString();
    }

    public static String getPostalAddress() {
        return new Input(
                POSTAL_ADDRESS_MESSAGE
        ).getInputString();
    }

    public static String getPostalCode() {
        return new Input(
                POSTAL_CODE_MESSAGE
        ).getInputString();
    }

    public static String getPassword() {
        return new Input(
                PASS_WORD_MESSAGE
        ).getInputString();
    }
}
