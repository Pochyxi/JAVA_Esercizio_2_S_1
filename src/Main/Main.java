package Main;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         System.out.println(stringControll("cia"));
         System.out.println(stringControll("ciao"));
         stampa(0);
         stampa(100);

         plays();
         counter();
    }

    static void plays() {
        String str = "";

        while (!str.equals(":p")) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Scrivi qualcosa");

            String userInput = myObj.nextLine();
            str = userInput;
            String[] good = str.split("");

            System.out.println("Username is: " + Arrays.toString(good));

        }
    }
    static void counter() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("dammi un numero");

        int numero = Integer.parseInt(myObj.nextLine());

        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }
        myObj.close();
    }
    private static boolean stringControll(String str) {
         boolean res = false;
         if( str.length() % 2 == 0) {
             res = true;
         }
         return res;
    }

    static void stampa (int num) {
         switch (num) {
             case 0:
                 System.out.println("zero");
                 break;
             case 1:
                 System.out.println("uno");
                 break;
             case 2:
                 System.out.println("due");
                 break;
             case 3:
                 System.out.println("tre");
             default:
                 System.out.println("Inserire un numero da 0 a 3!");
         }
    }
    static void play() {

    }
}
