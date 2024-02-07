import java.util.Scanner;

public class Main {
    private static final String VALID = "((([A-я]+)|([A-я-]+))\\s){2}(([A-я]+)|([A-я-]+))";
    public static void main(String[] args) {
        //todo ФИО
        System.out.println("vvedite fio");
        String fio = new Scanner(System.in).nextLine();

        if (fio.matches(VALID)) {
            String[] split = fio.split("\\s+");
            System.out.println("familia - " + split[0]);
            System.out.println("imy - " + split[1]);
            System.out.println("otchestvo - " + split[2]);
        } else {
            System.out.println("ne verno!!!");
        }
    }
}