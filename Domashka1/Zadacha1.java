//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
package Domashka1;
import java.util.Scanner;


public class Zadacha1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.printf("Введите положительное число n: ");
        Integer num = in.nextInt();
        if (num >= 0) {
            int sumNum = 0;
            for (int i = 1; i <= num; i++) {
            sumNum += i;
            }
            System.out.println("Сумма чисел от 1 до n = "+sumNum);
            int nfuc = 1;
            if ((num == 0) | (num == 1)) System.out.println("n факториал = 1");
            else {
                for (int j = 1; j <= num; j++) nfuc *= j;
                System.out.println("n факториал = " + nfuc);
            }
        }
        else System.out.println("Введено некорректное число");
    }
}
