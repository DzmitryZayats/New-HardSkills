package by.zayats.AdditionalLessons;

import java.util.Scanner;

public class ClassWhile {
    public static void main(String[] args) {


        //Напишите класс, который принимает с клавиатуры целое число и выводит на экран:
        //•в первой строке - все четные (по значению) цифры этого числа, через пробел;
        // •во второй строке - все нечетные (по значению) цифры этого числа, через пробел.
        // Например, для числа 765873 в первой строке будет выведена серия 6 8, а во второй строке -7 5 7 3.


//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int num = number;
//
//        while (num > 0) {
//            int ewen = num % 10;
//            if (ewen % 2 == 0) {
//                System.out.print(ewen + " ");
//            }
//            num = num / 10;
//        }
//        System.out.println();
//        while (number > 0) {
//            int odd = number % 10;
//            if (odd % 2 == 1) {
//                System.out.print(odd + " ");
//            }
//            number = number / 10;
//
//        }


        //Напишите класс, который принимает с клавиатуры целое положительное число, а затем генерирует случайную цифру.
        //Класс должен определить, встречается ли во введенном с клавиатуры числе сгенерированная цифра, и вывести на
        //экран соответствующее сообщение.

//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int numbRandom = (int) (Math.random() * 9);
//        boolean tr = false;
//
//        while (number > 0) {
//            int a = number % 10;
//            if (a == numbRandom)
//                tr = true;
//            number = number / 10;
//        }
//        if (tr == true){
//            System.out.println("Есть совпадение!");
//        }else {
//            System.out.println("Нет совпадения!");
//        }


        //Напишите класс, который принимает с клавиатуры серию целых чисел до тех пор,
        //пока количество четных чисел в серии остается меньше 5.


//        int a = 0;
//        while (a < 5){
//            Scanner sc = new Scanner(System.in);
//            int b = sc.nextInt();
//            if (b % 2 == 0) {
//                a++;
//            }
//        }


        //Напишите класс, который принимает с клавиатуры целое число (для переменной х)
        //и выводит на экран серию значений: х, х 2 , х 3 ••• х 0 до тех пор, пока очередное значение остается меньше 1000.

//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        int num = 0;
//        int i = 1;
//        while (num < 999){
//            System.out.println(x * i);
//            i++;
//            num = x * i;
//        }


        //Напишите класс, который принимает с клавиатуры целое положительное число и находит его наименьший делитель,
        //отличный от 1.


//        Scanner sn = new Scanner(System.in);
//        int num = sn.nextInt();
//        if (num >= 2) {
//            int x = 2;
//            while (x < 9999) {
//                if (num % x == 0) {
//                    break;
//                } else {
//                    x++;
//                }
//            }
//            System.out.print(x);
//        }


        //В инструкции по пользованию лифтом в торговом центре написано:
        //«Не более 6 человек или не более 450 кг». Перед входом в лифт установлен прибор, который подсчитывает входящих
        //в лифт и определяет вес до входа в лифт.
        //Прибор автоматически прекращает доступ к лифту, если вход очередного человека может нарушить инструкцию.
        //Напишите класс, который принимает с клавиатуры значения, каждое из которых - вес очередного человека, входящего в лифт.
        //Ввод данных продолжается до тех пор, пока соблюдается требование, указанное в инструкции.
        //Класс должен выводить на экран следующую итоговую информацию:
        //•количество людей, вошедших в лифт;
        //•общий их вес;
        //•причина, по которой прекращен вход людей в лифт.


    }
}