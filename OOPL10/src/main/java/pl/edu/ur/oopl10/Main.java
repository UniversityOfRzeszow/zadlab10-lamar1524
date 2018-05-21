package pl.edu.ur.oopl10;

import java.util.Random;
/**
 *
 * @author LamaR
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Zadanie 5");
        WprowadzZKonsoli.wprowadzInt();
        WprowadzZKonsoli.wprowadzChar();
        WprowadzZKonsoli.wprowadzString();
        WprowadzZKonsoli.wprowadzFloat();
        WprowadzZKonsoli.wprowadzLong();
        WprowadzZKonsoli.wprowadzShort();
        WprowadzZKonsoli.wprowadzDouble();

        System.out.println("Zadanie 4");
        Random rand = new Random();
        int licznik  = 0;
        while(licznik != 3) {
            int randomNum1 = -10 + rand.nextInt((10 - -10) + 1);
            int randomNum2 = -10 + rand.nextInt((10 - -10) + 1);
            if(randomNum2 == 0) {
                licznik++;
                System.out.println("Dzielnie przez zero jest niemożliwe " + licznik);
            } else {
              double divide = randomNum1/randomNum2; 
              System.out.println("Wynik dzielenia" + divide);
            }
        }
        if(licznik == 3) {
            System.out.println("Dzielenie przez 0 wystapilo juz 3 razy");
            throw new ArithmeticException();
        }
    }

}