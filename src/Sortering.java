import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Sortering {
    public static void SorteringsMetode() {
        System.out.println();
        String problemStatement = "Skriv en metode der indlæser 5 tekststrenge fra tastaturet og udskriver dem på skærmen i alfabetiskfaldende orden på skærmen";
        System.out.println(problemStatement);
        ArrayList<String> sortThisList = new ArrayList<>(); //Create ArrayList
        //TODO: add input from scanner to sortThisList
        Scanner userInput = new Scanner(System.in);
        System.out.println("Skriv fem tekststrenge her:");

        //TODO: Create loop to get 5 Strings from user
        for (int i = 0; i < 5; i++) {
             sortThisList.add(userInput.nextLine());
        }
        System.out.println("Listen før den kommer i bagvendt alfabetisk orden: " + sortThisList);

        //TODO: Create 'for' loop to put items in alphabetical order
        sortThisList.sort(Comparator.reverseOrder());
        System.out.println("Listen efter den kommer i bagvendt alfabetisk orden: " + sortThisList);
        System.out.println();
    }
}