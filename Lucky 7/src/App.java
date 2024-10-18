import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        String input;
        int saldo;
        int yksipeli = 1;
        int yksioikein = 3;
        int kaksioikein = 5;
        int kolmeoikein = 10;

        //Peli alkaa
        System.out.println("TERVETULOA PELIIN!");
        System.out.println("Syötä rahamäärä");
        saldo = in.nextInt();
        in.nextLine();

        //Rahat on syötetty, peli näyttää saldon ja pyytää aloittamaan
        System.out.println("Saldosi: " + saldo + " euroa");
        System.out.println("Pelin hinta: 1 euro");
        System.out.println("Paina ENTER aloittaaksesi");

        in.nextLine();

        //WHILE-LOOP alkaa
        while (saldo > 1){

            saldo = saldo - yksipeli;
    
            int randomNumber1 = random.nextInt(10)+1;
            int randomNumber2 = random.nextInt(10)+1;
            int randomNumber3 = random.nextInt(10)+1;
    
            //Generoi numerot
            System.out.print("--" + randomNumber1 + "--");
            System.out.print(randomNumber2 + "--");
            System.out.println(randomNumber3 + "--");
    
    
            if (randomNumber1 == 7 | randomNumber2 == 7 | randomNumber3 == 7){
                System.out.println("Yksi oikein! Voitit 3 euroa!");
                saldo = saldo + yksioikein;
            }
    
            else if (randomNumber1 == 7 & randomNumber2 == 7 |randomNumber1 == 7 & randomNumber3 == 7 | randomNumber2 == 7 & randomNumber3 == 7){
                System.out.println("Kaksi oikein! Voitit 5 euroa!");
                saldo = saldo + kaksioikein;
            }
    
            else if (randomNumber1 == 7 & randomNumber2 == 7 & randomNumber3 == 7){
                System.out.println("KAIKKI OIKEIN! Voitit 10 euroa!");
                saldo = saldo + kolmeoikein;
            }
    
            else{
                System.out.println("Ei voittoa!");
            }
    
            //Pelikierros ohi, näyttää saldon ja kysyy pelataanko uudestaan
            System.out.println("Saldosi: " + saldo);
            System.out.println("Haluatko pelata uudestaan?");
            System.out.println("Jos haluat pelata, paina ENTER");
            System.out.println("Jos et halua pelata, kirjoita E ja paina ENTER");
            input = in.nextLine();
            if (input.equalsIgnoreCase("e")){
                break;
            }
            }
            
            //Loopista breakattu ulos ->
            System.out.println("Peli ohi!");

    }
}
