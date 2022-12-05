package Domashka2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.sql.Array;



public class Zadacha1 {
    public static void main(String[] args) {
        // Читаем выражение из файла Dano.json
        String inputString = getDataFromFile("/Users/aroslavevstifeev/Desktop/GeekBrains/JAVA/Java_seminar/Domashka2/Dano.json");
        // System.out.println("Given the equation: " + inputString);
        // Вывод результата
        // System.out.println(inputString);
        StringBuilder list = new StringBuilder(inputString);
        int a = list.length();
        list.delete(0, 3);
        // System.out.println(list);
        list.delete(a-6, a-1);
        // System.out.println(list);
        String list1 = list.toString();
        String list2 = list1.replaceAll("\":\"", " = ");
        // System.out.println(list2);
        String list3 = list2.replaceAll("\", \"", " And ");
        System.out.println(list3);
        // ArrayList<String> list4 = new ArrayList<>(List.of(list3.split(" ")));
        System.out.println("select * from students where "+list3);



    // public static void main(String[] args) {
    //     String paramsNew = PARAMS.replace('{', ' ').replace('}', ' ');
    //     String[] params = paramsNew.split(",");
    //     StringBuilder stringBuilder = new StringBuilder(QUERY);
    //     for (int i = 0; i < params.length; i++) {
    //         String[] elements = params[i].replace('"', ' ').split(":");
    //         if (!"null".equals(elements[1].trim())) {
    //             stringBuilder.append(elements[0].trim()).append("=").append("'").append(elements[1].trim()).append("'");
    //             if (i < params.length - 2)
    //                 stringBuilder.append(" and ");
    //         }
    //     }
    //     System.out.println(stringBuilder);
    // }
}        

    public static String getDataFromFile(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
            return "";
        }
    }
}
