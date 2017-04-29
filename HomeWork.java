package modul1.home.work;
import java.util.*;

/**
 * Created by Оля on 29.04.2017.
 */
public class HomeWork {
    public static void main(String[] args) {
        //Создать консольное приложение, которое запрашивает имя пользователя.
        // После ввода имени выводит строку: Hello, <введённое имя>

        Scanner in = new Scanner(System.in);
        String name = "Hello, ваше имя: ";

        System.out.println("Введите пожалуйста ваше имя ");
        String input_names = in.next();

        System.out.println(name + input_names + ".");


        Scanner it = new Scanner(System.in);

        System.out.println("Enter number 1:");
        int number0 = in.nextInt();

        System.out.println("Enter number 2:");
        int number1 = in.nextInt();

        System.out.println("Enter number 3:");
        int number2 = in.nextInt();


        System.out.println("Enter number 4:");
        int number3 = in.nextInt();

        System.out.println("Enter number 5:");
        int number4 = in.nextInt();


        int[] mas = {number0, number1, number2, number3, number4};


        System.out.print("Initial array:  ");


        for (int i = 0; i < mas.length; i++) {


            System.out.println(Arrays.toString(mas));

            for (int w = 0; w < mas.length; w++) {
                for (int j = 0; j < mas.length - w - 1; j++) {
                    if (mas[j] > mas[j + 1]) {
                        int temp = mas[j];
                        mas[j] = mas[j + 1];
                        mas[j + 1] = temp;
                    }
                }
            }
            System.out.println("Sorted array:   " + Arrays.toString(mas));
            break;

        }
    }
}

