package Domashka5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Zadacha1  {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNum);
        } else {
            ArrayList<Integer> values = new ArrayList<>();
            values.add(phoneNum);
            phoneBook.put(name, values);
        }
    }

    public ArrayList<Integer> find(String name) {
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        }
        return new ArrayList<Integer>();
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", 123456);
        phoneBook.add("Ivanov", 654321);
        phoneBook.add("Petrov", 654321);
        System.out.println(phoneBook.find("Ivanov"));
        System.out.println(PhoneBook.getPhoneBook());
        System.out.println(phoneBook.find("Me"));
    }}