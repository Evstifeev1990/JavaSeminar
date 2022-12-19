package Domashka_itog;

public class Noutbook {
    int id, RAM, HD;
    String manufacturer, model, OS;

    public Noutbook(int id, int RAM, int HD, String manufacturer, String model, String OS) {
        this.id = id;
        this.RAM = RAM;
        this.HD = HD;
        this.manufacturer = manufacturer;
        this.model = model;
        this.OS = OS;
    }

    public String toString(int number) {
        return "Номер id: " + number + "\n" +
        "RAM: " + RAM + "\n" +
        "Объём HD: " + HD + "\n" +
        "Производитель: " + manufacturer + "\n" +
        "Название модели: " + model + "\n" +
        "Операционная система: " + OS + "\n";

    }

    public static String getNoutbookRam(Noutbook[] noutbook, int ram) {
        String result = new String();
        for (Noutbook c: noutbook) {
            if (c.RAM==ram) {
                result = result + "\n" + "Номер id: " + c.id + "\n" +
                "RAM: " + c.RAM + "\n" +
                "Объём HD: " + c.HD + "\n" +
                "Производитель: " + c.manufacturer + "\n" +
                "Название модели: " + c.model + "\n" +
                "Операционная система: " + c.OS + "\n";             
            }
        }
        return result;
    }

    public static String getNoutbookModel(Noutbook[] noutbook, String mod) {
        String result = new String();
        for (Noutbook c: noutbook) {
            if (c.model==mod) {
                result = result + "\n" + "Номер id: " + c.id + "\n" +
                "RAM: " + c.RAM + "\n" +
                "Объём HD: " + c.HD + "\n" +
                "Производитель: " + c.manufacturer + "\n" +
                "Название модели: " + c.model + "\n" +
                "Операционная система: " + c.OS + "\n";             
            }
        }
        return result;
    }
    
}
