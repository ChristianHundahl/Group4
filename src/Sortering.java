import  java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Sortering {
    //Skriv en metode der indlæser 5 tekststrenge fra tastaturet og udskriver dem på skærmen i alfabetiskfaldende orden på skærmen

    public static void SorteringsMetode() {
        ArrayList<String> sortThisList = new ArrayList<>(); //Create ArrayList
        //TODO: add input from scanner to sortThisList
        Scanner userInput = new Scanner(System.in);
        System.out.println("Input 5 Strings to add to the list:");

        //TODO: Create loop to get 5 Strings from user
        for (int i = 0; i < 5; i++) {
             sortThisList.add(userInput.nextLine());
        }
        System.out.println("List before sorting in reverse alphabetical order: " + sortThisList);

        //TODO: Create 'for' loop to put items in alphabetical order
        sortThisList.sort(Comparator.reverseOrder());
        System.out.println("List after sorting in reverse alphabetical order: " + sortThisList);
    }
}
