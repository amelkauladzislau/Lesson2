import java.util.Scanner;

public class Homework {


    private static void aboutMe(){
        String name = "Uladzislau";
        String secondName = "Amelka";
        String profession = "QA engineer";
        System.out.println("Информация:" + secondName + " " + name + " " + profession);
    }

    private static void printAllTypes(){

        int intVar = 1;
        short shortVar = 2;
        long longVar = 3;
        byte byteVar = 4;
        double doubleVar = 1.1;
        float floatVar = 2.2F;
        char charVar = 64;
        boolean booleanVar = true;

        System.out.println("Переменная типа int: " + intVar);
        System.out.println("Переменная типа short: " + shortVar);
        System.out.println("Переменная типа long: " + longVar);
        System.out.println("Переменная типа byte: " + byteVar);
        System.out.println("Переменная типа double: " + doubleVar);
        System.out.println("Переменная типа float: " + floatVar);
        System.out.println("Переменная типа char: " + charVar);
        System.out.println("Переменная типа boolean: " + booleanVar);

    }
    public static void inputString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите произвольное значение с клавиатуры");
        String s = scanner.nextLine();
        System.out.println(s);

        aboutMe();

        printAllTypes();

    }
}
