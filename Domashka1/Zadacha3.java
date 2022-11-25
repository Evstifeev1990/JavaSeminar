
// Реализовать простой калькулятор (операции + - / * )
package Domashka1;
import java.util.Scanner;


public class Zadacha3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите первое число ");
        Integer num1 = in.nextInt();
        System.out.printf("Введите операцию ");
        String num2 = in.next();
        char num3 = num2.charAt(0);
        System.out.printf("Введите второе число ");
        Integer num4 = in.nextInt();

        char a = '+';
        char b = '-';
        char c = '*';
        char d = '/';

        if (num3 == a) System.out.println("="+(num1+num4)); 
        if (num3 == b) System.out.println("="+(num1-num4)); 
        if (num3 == c) System.out.println("="+(num1*num4)); 
        if (num3 == d) System.out.println("="+(num1/num4));        
    }
}
