// Задание 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
package Domashka3;
import java.util.Arrays;
import java.util.ArrayList;

public class Zadacha3 {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(3, 2, 4, 2, 5, 6, 1, 8, 7, 1));
        Arrays.sort(new ArrayList[] { ints });
        System.out.println(ints);
        System.out.println("Minimum is " + ints.get(0));
        System.out.println("Maximum is " + ints.get(ints.size() - 1));
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        System.out.println("Average is = " + sum / ints.size());
    }
}
