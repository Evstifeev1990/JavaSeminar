package Domashka_itog;


public class Zadacha1 {
    public static void main(String[] args) {

        Noutbook tip1 = new Noutbook(001, 512, 500, "Samsung", "SAE-1000", "Windows");
        Noutbook tip2 = new Noutbook(002, 512, 500, "ASUS", "ASD-5", "Windows");
        Noutbook tip3 = new Noutbook(003, 3000, 1000, "Lenovo", "Mod003", "Windows");
        Noutbook tip4 = new Noutbook(004, 16000, 600, "Apple", "M1", "MacOS");
        Noutbook tip5 = new Noutbook(005, 8000, 600, "HP", "MORE", "Lenux");

        

        Noutbook[] noutbook = new Noutbook[]{tip1, tip2, tip3, tip4, tip5};

        System.out.println(Noutbook.getNoutbookRam(noutbook, 512));
        System.out.println(Noutbook.getNoutbookModel(noutbook, "MORE"));

        
    }
}
