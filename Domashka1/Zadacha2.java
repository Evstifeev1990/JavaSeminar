//Вывести все простые числа от 1 до 1000
package Domashka1;
import java.util.Scanner;

public class Zadacha2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.printf("Введите число n от 1 до 1000: ");
        Integer num = in.nextInt();
        
        if (num > 1) {
            System.out.println("Все простые числа в диапазоне от 1 до " + num);
            for (int i = 2; i <= num; i++) {
                int a = 0;
                for (int j = 2; j <= i; j++) {
                    if (i%j == 0) a += 1;
                }
                if (a == 1) System.out.printf("%d %s", i, "");
            }    
        }
        else if (num == 1) System.out.println("Простых чисел нет");
        else System.out.println("Введено некорректное число");
    }
}
