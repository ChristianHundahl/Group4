import  java.util.ArrayList;
import java.util.Scanner;

public class Sortering {
    String problemDescription = "Skriv en metode der indlæser 5 tekststrenge fra tastaturet og udskriver dem på skærmen i alfabetiskfaldende orden på skærmen";

    public static void Sortering() {
        ArrayList<String> sortThisList = new ArrayList<>(); //Create ArrayList
        //TODO: add input from scanner to sortThisList
        Scanner userInput = new Scanner(System.in);
        userInput.nextLine();
        //TODO: Create loop to get 5 Strings from user

        //TODO: Create 'for' loop to put items in alphabetical order
        for (int i = 0; i < sortThisList.size(); i++) //Create loop to print sortThisList in original order
            System.out.println(sortThisList.get(i)); //Print sortThisList in original order

        System.out.println(); //Linebreak

        for (int i = sortThisList.size() -1; i >= 0; i--) //Create loop to print sortThisList in reverse order
            System.out.println(sortThisList.get(i)); //Print sortThisList in reverse order
    }
}
