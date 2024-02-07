import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String info = "Молоко: 56, Масло: 190, Печенье: 144";

        int price1 = Integer.parseInt(info.substring(info.indexOf(' '), info.indexOf(',')).trim());
        int price3 = Integer.parseInt(info.substring(info.lastIndexOf(' ')).trim());
        System.out.println(price1 + price3);


        String infoNew = "Молоко: 56, Масло: 190, Печенье: 144, Шоколад: 110";
        //if (infoNew.matches());
        //      \\s - заменяет все пробелы
        //      \\d - заменяет все цифры
        //      \\w - заменяет цифры и английские буквы (русские буквы не трогает)
        //      \\S - заглавная заменит все
        //      \\D - ззаглавная заменит все кроме цифр
        //      \\W - заглавная заменит все кроме латинских букв и цифр
        //      \\ [А - яё:,] - а вот тут все русские буквы и знаки
        //      \\ [А - яё:,]*      - квантеры (сам изучай)
        //      \\ [А - яё:,]+      - квантеры (сам изучай)
        //  для проверки квантеров есть сайт REGEX101.COM

        System.out.println(infoNew.replaceAll("\\D", "*"));


        System.out.println("Введите текст на английском:");
        String text = new Scanner(System.in).nextLine();

        System.out.println(metod(text));


    }

    public static String metod (String text){
        text = text.replaceAll("[,.!?;:+-]","");
        return text.replaceAll("\\s+","\n");
    }


}